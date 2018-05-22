GestorDePaquetesDeProyectores gp;
PaqueteProyectores pp = new PaqueteProyectores(2, "marta", "mendoza", 2);

@Before
public void before() {
  gp = new GestorDePaquetesDeProyectores("Correo Argentino");  
}


@Test
public void el_gestor_no_tiene_paquetes_y_devuelve_null() {
  Assert.assertEquals(null, gp.buscarPaqueteDeProyectores(1));
}

@Test
public void el_gestor_tiene_1_paquete_y_lo_busca_correctamente() {
  gp.agregarPaquete(pp);
  Assert.assertEquals(2, gp.buscarPaqueteDeProyectores(2).getCodPaquete(), 0.5);
}