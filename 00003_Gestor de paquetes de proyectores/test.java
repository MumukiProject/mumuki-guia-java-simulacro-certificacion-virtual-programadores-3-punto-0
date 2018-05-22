GestorDePaquetesDeProyectores gp;

@Before
public void before() {
  gp = new GestorDePaquetesDeProyectores("Correo Argentino");  
}


@Test
public void el_gestor_no_tiene_paquetes() {
  Assert.assertEquals(0, gp.());
}

@Test
public void el_paquete_tiene_codigo_1() {
  Assert.assertEquals(1, gp.getCodPaquete(), 0.5);
}

@Test
public void el_paquete_tiene_codigo_5() {
  gp.setCodPaquete(5);    
  Assert.assertEquals(5, gp.getCodPaquete(), 0.5);
}