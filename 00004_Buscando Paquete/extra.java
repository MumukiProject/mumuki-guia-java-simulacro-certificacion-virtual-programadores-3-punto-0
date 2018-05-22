class PaqueteProyectores {
  private String destinatario;
  private String destino;
  private int codPaqueteDeProyectores;
  private float costoEnvio;
  private boolean enTransito;
  
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
    return this.destino;
  }
  public void setCostoEnvio(float costoEnvio) {
    this.costoEnvio = costoEnvio;
  }
  public float getCostoEnvio() {
    return this.costoEnvio;
  }
  public boolean getEnTransito() {
    return this.enTransito;
  }
  public void setEnTransito(boolean enTransito) {
    this.enTransito = enTransito;
  }
  public int getCodPaquete() {
    return this.codPaqueteDeProyectores;
  }
  public void setCodPaquete(int codPaquete) {
    this.codPaqueteDeProyectores = codPaquete;
  }
} 