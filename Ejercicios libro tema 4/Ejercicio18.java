public class Ejercicio18{
    public static void main (String [] args) {
    System.out.println("Introduce un número de máximo 5 cifras");
      int num = Integer.parseInt(System.console().readLine());
      int primero = 0;
      
      if (num < 10) {
       primero = num;
      }
      if ((num >=10) && (num < 100)){
      primero = num /10;
      }
      if ((num >=100) && (num < 1000)){
      primero = num /100;
      }
      if ((num >=1000) && (num < 10000)){
      primero = num /1000;
      }
      if ((num >=10000) && (num < 100000)){
      primero = num /10000;
      }
      
      System.out.println("La primera cifra del número introducido es el "+ primero );
    }
  }
