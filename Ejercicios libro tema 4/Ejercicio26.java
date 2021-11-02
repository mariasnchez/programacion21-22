public class Ejercicio26{
    public static void main (String [] args) {
      System.out.println("Venta de entradas CineCampa");
      System.out.print("Número de entradas: ");
      int entradas = Integer.parseInt(System.console().readLine());
      System.out.print("Día de la semana: ");
      String dia = System.console().readLine();
      System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
      String tarjeta = System.console().readLine();
      
      System.out.println("");
      System.out.println("Aquí tiene sus entradas. Gracias por su compra.");

      int entradasIndividuales = entradas;
      double precioEntradaIndividual = 8;
      int entradasDePareja = 0;
      double total = 0;
      double descuento = 0;
      double aPagar = 0;

      switch (dia) {
      case "miercoles":
      case "miércoles":
      precioEntradaIndividual = 5;    
      break;
      case "jueves":
        entradasDePareja = entradas / 2;
        entradasIndividuales = entradas % 2;
        break;
      default:
    }
    total = precioEntradaIndividual * entradasIndividuales;
    total += 11 * entradasDePareja;

    if (tarjeta.equals("s")) {
      descuento = total * 0.1;    }
    
    aPagar = total - descuento;
    
    if (entradasDePareja > 0) {
    System.out.println("Entradas de pareja                 "+ entradasDePareja+ " €");
    System.out.println("Precio por entrada de pareja       11.0 €" );
    }
    if (entradasIndividuales > 0) {
    System.out.println("Entradas individuales              "+ entradasIndividuales+ " €");
    System.out.println("Precio por entrada individual      "+ precioEntradaIndividual+" €");
    }
    
    System.out.println("Total                              "+ total+" €");
    System.out.println("Descuento                          "+ descuento+ " €");
    System.out.println("A pagar                            "+ aPagar+" €");
    }
  }
