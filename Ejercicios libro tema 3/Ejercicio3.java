public class Ejercicio3{
    public static void main (String [] args) {

        

      float pesetas;

      System.out.println("Introduzca el valor de pesetas que quiere convertir a euros.");
      pesetas = Integer.parseInt(System.console().readLine());


      float valoreneuros= pesetas / 166.386f;
      
      System.out.println("El valor en euros es: " +valoreneuros);

        
    }
    }
