public class Ejercicio23{
    public static void main (String [] args) {
      double baseImp;
      String tipoIva;
      String codigo;

      System.out.print("Introduzca la base imponible: ");
      baseImp = Double.parseDouble(System.console().readLine());
      System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
      tipoIva = System.console().readLine();
      System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
      codigo = System.console().readLine();
      
      int tipoIVANumerico=0;
      
      switch (tipoIva) {
      case "general":
        tipoIVANumerico=21;
        break;
      case "reducido":
        tipoIVANumerico=10;
        break;
      case "superreducido":
        tipoIVANumerico=4;
        break;
      default:
      System.out.println("El tipo de IVA introducido no es correcto.");
    }
      double iva = baseImp* tipoIVANumerico / 100;
double precioSinDescuento = baseImp + iva;
double descuento = 0;
      
      switch (codigo) {
      case "nopro":
        tipoIVANumerico=21;
        break;
      case "mitad":
        descuento=precioSinDescuento / 2;
        break;
      case "meno5":
        descuento = 5;
        break;
      default:
      System.out.println("El tipo de IVA introducido no es correcto.");
      }
      
      double total = precioSinDescuento - descuento;
System.out.println("Base imponible........"+ baseImp);
System.out.printf("IVA (%2d%%)............ %1.2f\n", tipoIVANumerico, iva);
System.out.println("Precio con IVA........"+ precioSinDescuento);
System.out.println("Cód. promo............"+ descuento);
System.out.println("TOTAL................."+ total);
        
     
    }
  }
