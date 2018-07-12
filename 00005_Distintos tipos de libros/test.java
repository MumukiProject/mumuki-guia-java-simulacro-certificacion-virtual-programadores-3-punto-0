Novela novelaFacil;
Novela novelaDificil;
Divulgacion divulgacionFacil;
Divulgacion divulgacionMatematica;
Divulgacion divulgacionAstronomia;
LibroDeCuentos cuentos;
Biblioteca biblioteca;

@Before
public void before() {
  novelaFacil = new Novela();
  novelaDificil = new Novela();
  divulgacionFacil = new Divulgacion();
  divulgacionMatematica = new Divulgacion();
  divulgacionAstronomia = new Divulgacion();
  cuentos = new LibroDeCuentos();
  
  novelaFacil.setCantidadDePaginas(200);
  novelaDificil.setCantidadDePaginas(1000);
  
  divulgacionFacil.setTematica("anatomia");
  divulgacionMatematica.setTematica("matematica");
  divulgacionAstronomia.setTematica("astronomia");
  
  ArrayList<Libro> libros = new List<Libro>();
  libros.add(novelaFacil);
  libros.add(novelaDificil);
  libros.add(divulgacionFacil);
  libros.add(divulgacionMatematica);
  libros.add(divulgacionAstronomia);
  libros.add(cuentos);
  biblioteca = new Biblioteca("Villa Mercedes", libros);
}

@Test
public void la_novelaFacil_no_es_dificil_de_leer() {
  Assert.assertFalse(novelaFacil.esDificilDeLeer());
}

@Test
public void la_novelaDificil_es_dificil_de_leer() {
  Assert.assertTrue(novelaDificil.esDificilDeLeer());
}

@Test
public void la_divulgacionFacil_no_es_dificil_de_leer() {
  Assert.assertFalse(divulgacionFacil.esDificilDeLeer());
}

@Test
public void la_divulgacionMatematica_es_dificil_de_leer() {
  Assert.assertTrue(divulgacionMatematica.esDificilDeLeer());
}

@Test
public void la_divulgacionAstronomia_es_dificil_de_leer() {
  Assert.assertTrue(divulgacionAstronomia.esDificilDeLeer());
}

@Test
public void el_libro_de_cuentos_no_es_dificil_de_leer() {
  Assert.assertFalse(cuentos.esDificilDeLeer());
}

@Test
public void la_biblioteca_puede_decirme_sus_libros_dificiles() {
  ArrayList<Libro> librosDificiles = new List<Libro>(Arrays.asList(biblioteca.librosDificiles()));
  ArrayList<Libro> expected = new List<Libro>();
  expected.add(novelaFacil);
  expected.add(divulgacionFacil);
  expected.add(cuentos);
  Assert.assertEquals(expected, librosDificiles);
}