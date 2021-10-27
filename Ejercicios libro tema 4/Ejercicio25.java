public class Ejercicio25{
    public static void main (String [] args) {
    System.out.print("Introduzca la altura de la bandera en cm: ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.print("Ahora introduzca la anchura: ");
    double anchura = Double.parseDouble(System.console().readLine());
    
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    String escudo = System.console().readLine();
    
    System.out.println("Gracias. Aquí tiene el desglose de su compra. ");
    
    double precioBase= (altura*anchura)/100;
    System.out.println("Bandera de "+(altura*anchura)+" cm2:     "+precioBase+" €");
    
    double precioEscudo = 2.5;
    if (escudo.equals("s")) {
    System.out.println("Con escudo:              "+precioEscudo+" €");
    }
    if (escudo.equals("n")) {
    System.out.println("Sin escudo:              0.0 €");
    }
        
    double gastosEnvio = 3.25;
    System.out.println("Gastos de envío:         "+gastosEnvio+" €");

    if (escudo.equals("s")) {
    System.out.println("Total:                   "+(precioEscudo+gastosEnvio+precioBase)+" €");
    }
    if (escudo.equals("n")) {
    System.out.println("Total:                   "+(gastosEnvio+precioBase)+" €");
    }
    }
    }
