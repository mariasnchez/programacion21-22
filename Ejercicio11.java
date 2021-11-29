public class Ejercicio11 {
public static void main(String[] args){
  System.out.println("Introduzca 10 números: ");
  int[] num = new int[10];
  int[] primo = new int[10];
  int[] noPrimo = new int [10];
  int i;
  int j;
  int primos=0;
  int noPrimos=0;
  boolean esPrimo = false;

  for (i = 0; i < 10; i++){
      num[i] = Integer.parseInt(System.console().readLine());
      esPrimo = true;
    for (j = 2; j < num[i] - 1; j++) {
    if (num[i] % j == 0) {
    esPrimo = false;
  }
  }
   if (esPrimo) {
    primo[primos++] = num[i];
    } else {
    noPrimo[noPrimos++] = num[i];
    }
    }
    
  System.out.println("\nArray inicial:");
  System.out.print("Índice");
  for (i = 0; i < 10; i++){
      System.out.printf("%4d ", i);
    }

  System.out.print("\nValor ");
  for (i = 0; i < 10; i++){
      System.out.printf("%4d ", num[i]);
    }


  for (i = 0; i < primos; i++){
    num[i]=primo[i];
  }
   for (i = primos; i < primos + noPrimos; i++){
    num[i]=noPrimo[i-primos];
  }
    
System.out.println("\n\nArray final:");
  System.out.print("Índice");
  for (i = 0; i < 10; i++){
      System.out.printf("%4d ", i);
    }

  System.out.print("\nValor ");
  for (i = 0; i < 10; i++){
      System.out.printf("%4d ", num[i]);
    }
}
}

