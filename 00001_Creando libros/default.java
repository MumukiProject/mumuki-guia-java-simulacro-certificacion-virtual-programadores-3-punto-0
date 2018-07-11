class Biblioteca {
  private String localidad;
  private List<Libro> libros;
  
  public Biblioteca(String localidad, List<Libro> libros) {
    this.localidad = localidad;
    this.libros = libros;
  }
  
  public String getLocalidad() {
    return this.localidad;
  }
  
  public void setLocalidad(String localidad) {
    this.localidad = localidad;
  }
  
  public List<Libro> getLibros() {
    return this.libros;
  }
  
  public void setLibros(List<Libro> libros) {
    this.libros = libros;
  }
}