public class Estudiante {
  String nombres, apellido_paterno, apellido_materno;
  int edad;
  double estatura;

  public Estudiante(String[] datos, int edad, double estatura){
    nombres = datos[0].toUpperCase();
    apellido_paterno = datos[1].toUpperCase();
    apellido_materno = datos[2].toUpperCase();
    this.edad = edad;
    this.estatura = estatura;
  }

  @Override
  public String toString(){
    String res = ("Hola soy " + nombres + " " + apellido_paterno + " " + apellido_materno + " tengo " + edad + " y mido " + estatura);
    return res;  
  }
}
