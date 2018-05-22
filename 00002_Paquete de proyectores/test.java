PaqueteProyectores pp;

@Before
public void before() {
  pp = new PaqueteProyectores(1, "Martina", "Mendoza", 2);  
}


@Test
public void el_paquete_esta_en_transito() {
  pp.setEnTransito(true);
  Assert.assertTrue(pp.getEnTransito());
}

@Test
public void el_paquete_tiene_codigo_1() {
  Assert.assertEquals(1, pp.getCodPaquete(), 0.5);
}

@Test
public void el_paquete_tiene_codigo_5() {
  pp.setCodPaquete(5);    
  Assert.assertEquals(5, pp.getCodPaquete(), 0.5);
}