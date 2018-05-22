GestorDePaquetesDeProyectores gp;

@Before
public void before() {
  gp = new GestorDePaquetesDeProyectores("Correo Argentino");  
}


@Test
public void el_gestor_no_tiene_paquetes() {
  Assert.assertEquals(0, gp.getPaquetes().size(), 0.5);
}

@Test
public void el_gestor_tiene_1_paquetes() {
  gp.agregarPaquete(new PaqueteProyectores(1, "marta", "mendoza", 2));
  Assert.assertEquals(1, gp.getPaquetes().size(), 0.5);
}