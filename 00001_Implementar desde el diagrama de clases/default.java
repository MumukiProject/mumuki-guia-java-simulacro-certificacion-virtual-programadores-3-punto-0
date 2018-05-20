class PaqueteProyectores {
  private String destinatario;
  private String destino;
  // Declará las variables acá
  
  public PaqueteProyectores(int codPaqueteDeProyectores, String destinatario, String destino, float costoEnvio) {
    this.codPaqueteDeProyectores = codPaqueteDeProyectores;
    this.destinatario = destinatario;
    this.destino = destino;
    this.costoEnvio = costoEnvio;
    this.enTransito = true;
  }
  
  public void setDestinatario(String destinatario) {
    this.destinatario = destinatario;
  }
  public String getDestinatario() {
    return this.destinatario;
  }
  public void setDestino(String destino) {
    this.destino = destino;
  }
  public String getDestino() {
    return this.destino
  }
  public void setCostoEnvio(float costoEnvio) {
    this.costoEnvio = costoEnvio;
  }
  public float getCostoEnvio() {
    return this.costoEnvio;
  }
}