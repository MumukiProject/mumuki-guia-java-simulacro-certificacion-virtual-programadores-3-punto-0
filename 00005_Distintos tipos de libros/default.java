/*...solution[2]...*/

public class Novela extends Libro {
  private int cantidadDePaginas;
  
  public int getCantidadDePaginas() {
    return this.cantidadDePaginas;
  }
  
  public void setCantidadDePaginas(int cantidadDePaginas) {
    this.cantidadDePaginas = cantidadDePaginas;
  }
  
  public boolean esDificilDeLeer() {
    //Completa este método
  }
}

public class Divulgacion extends Libro {
  private String tematica;
  
  public String getTematica() {
    return this.tematica;
  }
  
  public void setTematica(String tematica) {
    this.tematica = tematica;
  }
  
  public boolean esDificilDeLeer() {
    //Completa este método
  }
}

public class LibroDeCuentos extends Libro {
  public boolean esDificilDeLeer() {
    //Completa este método
  }
}