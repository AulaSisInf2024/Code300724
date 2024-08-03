import java.util.ArrayList;

public class Aula{

  private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
  
  public ArrayList accion4(){
    ArrayList<Estudiante> nuevoArreglo = new ArrayList<Estudiante>();
    while(estudiantes.size() != 0) {
      int marcadoParaBorrar = 0;
      Estudiante e = estudiantes.get(marcadoParaBorrar);
      for(int i=1; i < estudiantes.size(); i++){
        Estudiante auxiliar = estudiantes.get(i);
        if(e.nombres.charAt(0) > auxiliar.nombres.charAt(0)){
          marcadoParaBorrar = i;
          e = auxiliar;
        }
      }
      estudiantes.remove(marcadoParaBorrar);
      nuevoArreglo.add(e);
    }
    return nuevoArreglo;
  }

  public int accion1(char letraMayuscula){
    int respuesta = 0;
    for(Estudiante e: estudiantes){
      if(e.apellido_paterno.charAt(0) == letraMayuscula){
        respuesta += 1;
      }
    }
    return respuesta;
  }

  public String accion2(){
    Estudiante auxiliar = estudiantes.get(0);
    for(Estudiante e: estudiantes){
      if (e.estatura > auxiliar.estatura) {
        auxiliar = e;
      }
    }
    return "" + auxiliar.estatura;
  }
}
