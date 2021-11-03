public class Ejercicio7{
    public static void main (String [] args) {
    int intentos = 4;
    int combinacion;
    boolean acertado = false;
    
      do {
      System.out.println("Introduce la combinación");
      combinacion = Integer.parseInt(System.console().readLine());
      
      if (combinacion == 1111){
        acertado=true;
      }else{
      System.out.println("Lo siento, esa no es la combinación");
      }
      intentos--;
      
      
      } while ((intentos >0) && (!acertado));
      
      if (acertado){
        System.out.println("“La caja fuerte se ha abierto satisfactoriamente”.");
      } else {
      System.out.println("Lo siento, ha agotado las 4 oportunidades.");
      }
    }
    }

    
    
