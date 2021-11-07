public class Ejercicio14{
    public static void main (String [] args) {
      int base;
      int exponente;
      System.out.print("Introduce la base de la potencia: ");
      base = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce el exponente de la potencia: ");
      exponente = Integer.parseInt(System.console().readLine());
      int potencia=1;
      
      do {
        potencia *= base; 
        exponente--;
      }while (exponente >0);
              System.out.println(potencia);  


    }
    }
