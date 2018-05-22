class GestorDePaquetesDeProyectores {
  private List<PaqueteProyectores> paquetes;
  private String nombreEmpresa;
  
  public GestorDePaquetesDeProyectores(String nombreEmpresa) {
    this.paquetes = new ArrayList<>();
    this.nombreEmpresa = nombreEmpresa;
  }
  public void setNombreEmpresa(nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
  }
  public String getNombreEmpresa() {
    return this.nombreEmpresa;
  }
  
  public List<PaqueteProyectores> getPaquetes() {
    return this.paquetes;
  }
  
  // Implementá acá tu solución
  
}