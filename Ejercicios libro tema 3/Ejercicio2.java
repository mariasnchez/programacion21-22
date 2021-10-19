
public class Ejercicio2{
    public static void main (String [] args) {


      int euros;

      System.out.println("Introduzca el valor de euros que quiere convertir a pesetas.");
      euros = Integer.parseInt(System.console().readLine());

      float valorenpesetas= euros * 166.386f;
      
      System.out.println("El valor en pesetas es: " +valorenpesetas);


        
    }
    }
    
