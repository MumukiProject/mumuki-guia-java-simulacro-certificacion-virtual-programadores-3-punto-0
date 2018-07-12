/*...solution[2]...*/

class Novela extends Libro {
  int cantidadDePaginas;
  
  Novela(String titulo, String autor, int cantidadDeReservas) { 
    super(titulo, autor, cantidadDeReservas);
  }
  
  int getCantidadDePaginas() {
    return this.cantidadDePaginas;
  }
  
  void setCantidadDePaginas(int cantidadDePaginas) {
    this.cantidadDePaginas = cantidadDePaginas;
  }
  
  boolean esDificilDeLeer() {
    //Completa este método
  }
}

class Divulgacion extends Libro {
  String tematica;
  
  Divulgacion(String titulo, String autor, int cantidadDeReservas) { 
    super(titulo, autor, cantidadDeReservas);
  }
  
  String getTematica() {
    return this.tematica;
  }
  
  void setTematica(String tematica) {
    this.tematica = tematica;
  }
  
  boolean esDificilDeLeer() {
    //Completa este método
  }
}

class LibroDeCuentos extends Libro {
  
  LibroDeCuentos(String titulo, String autor, int cantidadDeReservas) { 
    super(titulo, autor, cantidadDeReservas);
  }
  
  boolean esDificilDeLeer() {
    //Completa este método
  }
}