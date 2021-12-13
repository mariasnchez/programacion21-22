public class Ejercicio18 {
public static void main(String[] args){

int[] valor = new int[10];
int[] mayor100 = new int [10];
int[] menorigual100 = new int [10];
int menores=0;
int mayores=0;

  for (int i = 0; i <= 9; i++){
    valor[i] = (int)(Math.random()*201);
    if (valor[i]>100){
      mayor100[mayores++]=valor[i];
    }else{
      menorigual100[menores++]=valor[i];
    }
  }
   System.out.println("Array original");

  System.out.print("Indice");
  for (int i = 0; i <= 9; i++){
      System.out.printf("%4d ", i);
    }

  System.out.print("\nValor ");
  for (int i = 0; i <= 9; i++){
      System.out.printf("%4d ", valor[i]);
    }
    
  System.out.println();
  int[] resultado = new int[10];
  int menoresColocados = 0;
  int mayoresColocados = 0;
  int j = 0;
  do {
    if (menoresColocados < menores) {
    resultado[j++] = menorigual100[menoresColocados++];
    }
    if (mayoresColocados < mayores) {
    resultado[j++] = mayor100[mayoresColocados++];
    }
  } while (j < 10);



System.out.println("\nArray nuevo");

  System.out.print("Indice");
  for (int i = 0; i <= 9; i++){
      System.out.printf("%4d ", i);
    }

  System.out.print("\nValor ");
  for (int i = 0; i <= 9; i++){
      System.out.printf("%4d ", resultado[i]);
    }

}
}
