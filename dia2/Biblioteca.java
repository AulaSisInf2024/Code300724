import java.util.*;


public class Biblioteca{
  
  Scanner sc = new Scanner(System.in);

  ArrayList<Miembro> miembros; 
  ArrayList<ArrayList<Libro>> libros;
  String nombre;
  double fondos = 1000;

  int limiteCopias = 5;

  //constructores
  public Biblioteca(String nombre){
    this.nombre = nombre;
    initArrays();
  }

  public Biblioteca(String nombre, double fondos){
    this.nombre = nombre;
    this.fondos = fondos;
    initArrays();
  }

  private void initArrays(){
    miembros = new ArrayList<Miembro>();
    libros = new ArrayList<ArrayList<Libro>>();
  }

  public void accion1(String[] datosLib, int[] datosNLib, boolean ilustrado, int copias){
    ArrayList<Libro> duplicados = new ArrayList<Libro>();

    while(accion2(datosNLib[0])){
      System.out.print("Ingrese otro dato: "); //reconocer el dato ingresado
      datosNLib[0] = sc.nextInt();
    }

    Libro aux = new Libro(datosLib, datosNLib, ilustrado);

    copias = accion3(copias);

    for(int i = 0; i < copias; i++){
      duplicados.add(aux);
    }

    libros.add(duplicados);
  }

  public boolean accion2(int id){
    boolean res = false;

    for(int i=0;i<libros.size();i++){
      if(libros.get(i).get(0).id == id){
        res = true;
        i = libros.size();
      }
    }
    return res;
  }

  public int accion3(int copias){
    int res = copias;
    if(copias > limiteCopias){
      res = limiteCopias;
    }else if(copias < 1){
      res = 1;
    }
    return res;
  }
}
