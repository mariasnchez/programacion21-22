public class Ejercicio17{
    public static void main (String [] args) {
      System.out.println("Introduce un número");
      int num = Integer.parseInt(System.console().readLine());
      System.out.println ("La última cifra del número introducido es el " + (num % 10));
    }
    
    }
