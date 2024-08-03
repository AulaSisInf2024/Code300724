public class Miembro{

  private int codigoMiembro;
  private String nombreCompleto;
  private char nivel; //'A' = mayor descuento 'B' 'C' = menor descuento
  
  public Miembro(int codigoMiembro, String nombreCompleto, char nivel){
    this.codigoMiembro = codigoMiembro;
    this.nombreCompleto = nombreCompleto;
    this.nivel = nivel;
  }

  public void setCodigo(int codigo){
    codigoMiembro = codigo;
  }

  public void setNombreC(String nombreC){
    nombreCompleto = nombreC;
  }

  public void setNivel(char nivel){
    this.nivel = nivel;
  }

  public int getCodigo(){
    return codigoMiembro;
  }

  public String getNombreCompleto(){
    return nombreCompleto;
  }

  public char getNivel(){
    return nivel;
  }
}
