public class Ejercicio1 {
public static void main(String[] args) {
//Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
//también la suma total (los puntos que suman entre los tres dados).
int dado=1;
int tirada;
int contador=0;
for (int i = 1; i <= 3; i++) {
  System.out.print("Dado "+dado+": ");
  tirada=((int)(Math.random()*6+1));
System.out.println(tirada);
contador+=tirada;
dado++;
}
  System.out.println("Los suma de los 3 dados es: "+contador);

}
}
