public class Ejercicio9 {
public static void main(String[] args) {
//Realiza un programa que vaya generando números aleatorios pares entre 0
//y 100 y que no termine de generar números hasta que no saque el 24. El
//programa deberá decir al final cuántos números se han generado.
int numAleatorio;
int contador=0;
do {
  numAleatorio=((int)(Math.random()*100)+1);
  System.out.print(numAleatorio+" ");
  contador++;
  }while(numAleatorio!=24);
    System.out.println();
  System.out.print("Se han generado "+contador+" números.");
}
}

