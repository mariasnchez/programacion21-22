public class Ejercicio29 {
public static void main(String[] args) {

// 29. Escribe un programa que muestre por pantalla todos los números enteros positivos menores
//  a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.

System.out.print("Introduzca el número que quiere mostrar sus enteros positivos menores: ");
int numeroIntroducido = Integer.parseInt(System.console().readLine());
System.out.print("Introduzca el número del que se va a descubrir sus múltiplos: ");
int numeroDivisible = Integer.parseInt(System.console().readLine());
System.out.print("Los números enteros positivos menores que " + numeroIntroducido );
System.out.println(" que no son divisibles entre " + numeroDivisible + " son los siguientes: ");

int i=0;
 while (i <= numeroIntroducido){
   if ((i % numeroDivisible) != 0){
   System.out.print(i+" ");
   }

   i++;

 
}
}
}
