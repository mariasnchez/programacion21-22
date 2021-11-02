public class Ejercicio28{
    public static void main (String [] args) {
      System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
      String jugador1 = System.console().readLine();
      System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
      String jugador2 = System.console().readLine();
     
     switch (jugador1) {
      case "piedra":
        if (jugador2.equals("piedra")){
          System.out.print("Empate");
        }  
        if (jugador2.equals("papel")){
          System.out.print("Gana el jugador 2");
        }     
        if (jugador2.equals("tijera")){
          System.out.print("Gana el jugador 1");
        }    
         break;
      case "papel":
        if (jugador2.equals("piedra")){
          System.out.print("Gana el jugador 1");
        }  
        if (jugador2.equals("papel")){
          System.out.print("Empate");
        }     
        if (jugador2.equals("tijera")){
          System.out.print("Gana el jugador 2");
        }    
      break;
      case "tijera":
        
        if (jugador2.equals("piedra")){
          System.out.print("Gana el jugador 2");
        }  
        if (jugador2.equals("papel")){
          System.out.print("Gana el jugador 1");
        }     
        if (jugador2.equals("tijera")){
          System.out.print("Empate");
        }      
        
      break;
      default:
            System.out.println("No has introducido una opción correcta.");
    } 
      }
      }
