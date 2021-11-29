public class Ejercicio10 {
public static void main(String[] args){
  int[] numero = new int[20];
  int[] par = new int[20];
  int[] impar = new int [20];
  int i;
  int pares=0;
  int impares=0;
  System.out.println("Array original:");
  for (i = 0; i < 20; i++){
  numero[i] = (int)(Math.random()*101);
  System.out.print(numero[i]+" ");
  if (numero[i]%2==0){
    par[pares++]=numero[i];
  }
  if (numero[i]%2!=0){
    impar[impares++]=numero[i];
  }
  }
   System.out.println();
    System.out.println();
  for (i = 0; i < pares; i++){
    numero[i]=par[i];
  }
   for (i = pares; i < 20; i++){
    numero[i]=impar[i-pares];
  }
  
System.out.println("Array con pares delante:");
for (i = 0; i < 20; i++) {
System.out.print(numero[i] + " ");
}
}
}
