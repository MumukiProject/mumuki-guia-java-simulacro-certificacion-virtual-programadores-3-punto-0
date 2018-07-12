/*...solution[2]...*/

class Novela extends Libro {
  int cantidadDePaginas;
  
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
  boolean esDificilDeLeer() {
    //Completa este método
  }
}