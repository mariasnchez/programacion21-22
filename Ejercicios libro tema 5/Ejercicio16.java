public class Ejercicio16 {
public static void main(String[] args) {
System.out.print("Introduzca un número entero y le diré si es primo: ");
int numeroIntroducido = Integer.parseInt(System.console().readLine());
boolean primo = true;
int contador = 2;
if (numeroIntroducido == 0 || numeroIntroducido == 1 || numeroIntroducido == 4) {
    primo=false;
  }
  
  while (contador < numeroIntroducido/2) {
    if (numeroIntroducido % contador == 0){
      primo=false;
    }
    contador++;
    }

if (primo){
        System.out.println("El número "+numeroIntroducido+" es primo");
      } else{
        System.out.println("El número "+numeroIntroducido+" no es primo");

      }

}
}
