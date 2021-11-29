public class Ejercicio5 {
public static void main(String[] args){
  int[] numeros = new int[10];
  int maximo=Integer.MIN_VALUE;
  int minimo=Integer.MAX_VALUE;
System.out.println("Introduce 10 números: ");
  for (int i = 0; i < 10; i++){
      numeros[i] = Integer.parseInt(System.console().readLine());
      if (numeros[i]>maximo){
        maximo=numeros[i];
      }
      if (numeros[i]<minimo){
        minimo=numeros[i];
      }
  }
System.out.println();
  for (int i = 0; i < 10; i++){
      System.out.print(numeros[i]);
      if (numeros[i]==minimo){
      System.out.print(" mínimo");
      }
      if (numeros[i]==maximo){
      System.out.print(" máximo");
      }
      System.out.println();
  }
}
}
