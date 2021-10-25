public class Ejercicio22{
    public static void main (String [] args) {
      
    System.out.println("¿Cuántos minutos quedan para el fin de semana (Viernes a las 15.00h)?");
    System.out.print("Introduce el día de la semana que es: ");
    String dia = System.console().readLine();
    int numeroDelDia = 0;
    
    switch (dia) {
      case "lunes":
        numeroDelDia= 0;
        break;
      case "martes":
        numeroDelDia= 1;
        break;
      case "miércoles":
      case "miercoles":
        numeroDelDia= 2;
        break;
      case "jueves":
        numeroDelDia= 3;
        break;
      case "viernes":
        numeroDelDia= 4;
        break;
      default:
        System.out.println("El día introducido no es correcto.");
    }
        System.out.println("A continuación introduce la hora (hora y minutos)");
        System.out.print("Horas: ");
        int hora = Integer.parseInt(System.console().readLine());
        System.out.print("Minutos: ");
        int minuto = Integer.parseInt(System.console().readLine());

        int minutostotales = (24*4*60)+(15*60);
        int minutosactuales = (numeroDelDia*24*60)+(hora*60)+minuto;
        
        System.out.println("Faltan "+(minutostotales-minutosactuales)+ " minutos hasta el fin de semana");

    }
    }
