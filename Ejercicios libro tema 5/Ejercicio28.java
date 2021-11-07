public class Ejercicio28 {
public static void main(String[] args) {
// Escribe un programa que calcule el factorial de un número entero leído por
// teclado.
 System.out.print("Introduzca un número para calcular su factorial: ");
 int numeroIntroducido = Integer.parseInt(System.console().readLine());
int i=1;
int factorial=1;
if (numeroIntroducido<0){
  System.out.println("El número no es válido.");
}
if (numeroIntroducido==0){
  System.out.println("El factorial del " + numeroIntroducido + " es 0.");
}
if (numeroIntroducido > 0){
 while (i <= numeroIntroducido){
   factorial*=i;
   i++;
}
 System.out.print(numeroIntroducido+"! = "+factorial);
}
}
}
