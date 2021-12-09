public class Ejercicio12 {
public static void main(String[] args){
  System.out.println("Introduzca 10 números: ");
  int[] num = new int[10];
  int[]resultado=new int[10];
  int inicial;
  int Final;
  int i;

  for (i = 0; i < 10; i++){
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
// mostrar array inicial
  System.out.println("\nArray inicial:");
  System.out.print("Índice");
  for (i = 0; i < 10; i++){
      System.out.printf("%4d ", i);
    }

  System.out.print("\nValor ");
  for (i = 0; i < 10; i++){
      System.out.printf("%4d ", num[i]);
    }
    
//introducir las posiciones
  do{
  System.out.println("\n\nIntroduzca una posición inicial (entre 0-9): ");
    inicial= Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca una posición final (entre 0-9 y mayor que el final): ");
    Final= Integer.parseInt(System.console().readLine());
  }while ((inicial>=Final)||(inicial<0)||(inicial>9) ||(Final<0) ||(Final>9));
  
//array resultado
  for (i = 0; i < 10; i++) {
  resultado[i] = num[i];
  }
  resultado[Final]=num[inicial];
  for (i = Final + 1; i < 10; i++)
  resultado[i] = num[i - 1];
  resultado[0] = num[9];
  for (i = 0; i < inicial; i++)
  resultado[i + 1] = num[i];

//mostrar resultado
  System.out.println("\nArray final:");
  System.out.print("Índice");
  for (i = 0; i < 10; i++){
      System.out.printf("%4d ", i);
    }

  System.out.print("\nValor ");
  for (i = 0; i < 10; i++){
      System.out.printf("%4d ", resultado[i]);
    }
}
}
