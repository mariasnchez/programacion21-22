public class Ejercicio19{
    public static void main (String [] args) {
      System.out.println("Introduce un número de máximo 5 cifras (puede ser negativo)");
      int num = Math.abs(Integer.parseInt(System.console().readLine()));
      int digitos =0;
      
      if (num < 10) {
       digitos = 1;
      }
      if ((num >=10) && (num < 100)){
      digitos = 2;
      }
      if ((num >=100) && (num < 1000)){
      digitos = 3;
      }
      if ((num >=1000) && (num < 10000)){
      digitos = 4;
      }
      if ((num >=10000) && (num < 100000)){
      digitos = 5;
      }
      System.out.println("En el número hay "+ digitos + " dígitos." );
    }
}
