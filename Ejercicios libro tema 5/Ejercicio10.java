public class Ejercicio10{
    public static void main (String [] args) {
      double introducidos;
      double contador = 0;
      double suma =0;
      
      System.out.println("Introduce números y para terminar calculando la media introduce uno negativo.");
      do {
      introducidos = Double.parseDouble(System.console().readLine());
      contador ++;
      suma += introducidos;
      }while (introducidos >= 0); 
      System.out.println("suma "+ suma );
      System.out.println("introducidos "+ introducidos );
      System.out.println( "contador "+contador );
      System.out.println("suma-introducidos "+ (suma-introducidos) );
      System.out.println( "contador- "+(contador-1));


            System.out.println("La media de los números introducidos es " +(suma-introducidos)/(contador -1));

    }
    }
    
