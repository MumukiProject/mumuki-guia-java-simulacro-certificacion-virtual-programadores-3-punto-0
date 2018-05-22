PaqueteProyectores pp = new PaqueteProyectores(1, "Martin", "Mendoza", 2);

@Test
public void declara_cod_paquete_de_proyectores() {
  try {
    Assert.assertEquals(pp.getClass().getField("codPaqueteDeProyectores").getName(), "codPaqueteDeProyectores");  
  } catch {
    
  }
  
}