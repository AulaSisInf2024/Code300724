import java.util.*;

public class Libro{

  String nombre, autor, editorial;
  int id, cantPaginas;
  Date fechaImpresion;
  boolean ilustrado;

  public Libro(String[] palabras, int[] numeros, boolean ilustrado) {//numeros ingresa [cantPag, año, mes, dia]
    id = numeros[0];
    nombre = palabras[0];
    autor = palabras[1];
    editorial = palabras[2];
    cantPaginas = numeros[1];
    fechaImpresion = new Date(numeros[2], numeros[3], numeros[4]);
    this.ilustrado = ilustrado;
  }
  
}
