public class Ejercicio5 {
public static void main(String[] args) {
//Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
//separados por espacios. Muestra también el máximo, el mínimo y la media
//de esos números.
int numAleatorio;
int contador=0;
int maximo=0;
int minimo=199;
System.out.print("Los números aleatorios son: ");
for (int i = 1; i <= 50; i++) {
  numAleatorio=((int)(Math.random()*100)+100);
  System.out.print(numAleatorio+" ");
  contador+=numAleatorio;
 if (numAleatorio<minimo){
minimo=numAleatorio;}
  if (numAleatorio>maximo){
maximo=numAleatorio;}

}

  System.out.println();
  System.out.println();
  System.out.println("La media es: "+contador/50);
  System.out.println();
  System.out.println("El máximo de los números es: "+maximo);
  System.out.println();
  System.out.println("El mínimo de los números es: "+minimo);
}
}
