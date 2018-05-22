PaqueteProyectores pp = new PaqueteProyectores();

@Test
public void declara_cod_paquete_de_proyectores() {
  Assert.assertTrue(pp.getClass().getDeclaredFields("codPaqueteDeProyectores"));
}