public class Ejercicio9 {
public static void main(String[] args){
System.out.println("Introduzca 8 números y diré si son pares o impares: ");
int[] numero = new int[8];
  for (int i = 0; i < 8; i++){
      numero[i] = Integer.parseInt(System.console().readLine());
    }
        System.out.println();
  for (int i = 0; i < 8; i++){
    System.out.print(numero[i]+" ");
    if (numero[i]%2==0){
    System.out.println("par");
    }
    if (numero[i]%2!=0){
    System.out.println("impar");
    }
  }
}
}
