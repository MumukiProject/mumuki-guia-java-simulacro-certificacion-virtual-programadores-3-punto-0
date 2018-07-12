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
  
  List<Libro> libros = new ArrayList<Libro>();
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
public void la_biblioteca_puede_cuantos_libros_dificiles_tiene() {
  Assert.assertEquals(3, biblioteca.cantidadDeLibrosDificiles());
}