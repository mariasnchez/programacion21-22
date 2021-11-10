public class Ejercicio27 {
public static void main(String[] args) {
  // 27. Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un
  // número leído por teclado.

  System.out.print("Introduzca un número entero mayor que 1: ");
int numeroIntroducido = Integer.parseInt(System.console().readLine());
int i = 1;
int contadorMultiplos=0;
int suma=0;
System.out.println();
System.out.print("Los múltiplos de 3 son: ");
 while (i <= numeroIntroducido){
   if (i % 3 == 0){
   System.out.print(i+" ");
   contadorMultiplos++;
   suma+=i;
   }
  i++;
 }
System.out.println();
System.out.println();
System.out.println("Hay "+contadorMultiplos+" múltiplos de 3.");
System.out.println();
System.out.println("La suma de los múltiplos es "+suma);

 
}
}
