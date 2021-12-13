public class Ejercicio19 {
public static void main(String[] args){
int[] valor = new int[12];

for (int i = 0; i <= 11; i++){
    valor[i] = (int)(Math.random()*201);
  }
  
  System.out.println("Array original");
  System.out.print("Indice");
  for (int i = 0; i <= 11; i++){
      System.out.printf("%4d ", i);
    }

  System.out.print("\nValor ");
  for (int i = 0; i <= 11; i++){
      System.out.printf("%4d ", valor[i]);
    }
    
  System.out.print("\n\nIntroduzca el número que quiere insertar: ");
  int num =Integer.parseInt(System.console().readLine());
  
  System.out.print("\nIntroduzca la posición donde lo quiere insertar (0 – 11): ");
  int posicion =Integer.parseInt(System.console().readLine());
  
  
  for (int i = 11; i > posicion; i--) {
    valor[i] = valor[i-1];
    }
  valor[posicion]=num;
  
  System.out.println("Array nuevo");
  System.out.print("Indice");
  for (int i = 0; i <= 11; i++){
      System.out.printf("%4d ", i);
    }

  System.out.print("\nValor ");
  for (int i = 0; i <= 11; i++){
      System.out.printf("%4d ", valor[i]);
    }
}
}

