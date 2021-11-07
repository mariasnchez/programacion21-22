public class Ejercicio13{
    public static void main (String [] args) {
      int lista = 10;
      int numIntroducidos;
      int contadorPositivos=0;
      int contadorNegativos=0;
      
      System.out.println("Introduce 10 numeros que pueden ser positivos y negativos: ");
      do {
      numIntroducidos = Integer.parseInt(System.console().readLine());
      lista--;
      if (numIntroducidos > 0){
      contadorPositivos++;
      }
      if (numIntroducidos  < 0) {
      contadorNegativos++;
      }
      } while (lista >0);
      
      System.out.println("Has introducido "+contadorPositivos+" números positivos y "+contadorNegativos+" números negativos.");

    }
    }
