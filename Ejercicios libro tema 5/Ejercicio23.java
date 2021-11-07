// Escribe un programa que permita ir introduciendo una serie indeterminada
// de números mientras su suma no supere el valor 10000. Cuando esto último
// ocurra, se debe mostrar el total acumulado, el contador de los números
// introducidos y la media.

public class Ejercicio23 {
public static void main(String[] args) {
  int introducidos;
  int maximo= 10000;
  int contador=0;
  int suma=0;
  System.out.println("Ve introduciendo números hasta que su suma supere 10000. ");
  do {
    introducidos = Integer.parseInt(System.console().readLine());
    suma+=introducidos;
    contador++;
  } while(suma<=maximo);
  
  System.out.println("El total acumulado es "+suma);
  System.out.println("Se han introducido "+contador+ " números");
  System.out.println("La media es "+((suma)/( contador)));
  
}
}
