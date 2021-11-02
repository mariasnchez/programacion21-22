public class Ejercicio27{
    public static void main (String [] args) {
      System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
      String sabor = System.console().readLine();
      
      double ValorNata = 0;
      double ValorEscritura = 0;
      double ValorTarta = 0;
      String tipoChocolate = "";

      
      switch (sabor) {
      case "manzana":
      ValorTarta = 18;
      break;
      case "fresa":
      ValorTarta = 16;
      break;
      case "chocolate":
        System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
        tipoChocolate = System.console().readLine();
        if (tipoChocolate.equals("negro")){
          ValorTarta = 14;
        }
        if (tipoChocolate.equals("blanco")){
          ValorTarta = 15;
        }
      break;
      default:
    }
    System.out.print("¿Quiere nata? (si o no): ");
      String nata = System.console().readLine();
      System.out.print("¿Quiere ponerle un nombre? (si o no): ");
      String escritura = System.console().readLine();
      
    System.out.print("Tarta de "+sabor);
    
      if (sabor.equals("chocolate")) {
    System.out.print(" " + tipoChocolate);
    }
    
    System.out.println(": "+ValorTarta+" €");
    
    
      if (nata.equals("si")){
        ValorNata = 2.5;
        System.out.println("Con nata: "+ValorNata+" €");
      }
       if (escritura.equals("si")){
        ValorEscritura = 2.75;
        System.out.println("Con nombre: "+ValorEscritura+" €");
      }
      
      double total= (ValorNata+ValorEscritura+ValorTarta);

      System.out.println("Total: "+total+" €");

      
      }
      }
