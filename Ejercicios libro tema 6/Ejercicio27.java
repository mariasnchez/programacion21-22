public class Ejercicio27 {
public static void main(String[] args){
  int tiradaJugador=0;

System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
String jugador = System.console().readLine();
switch (jugador){
        case "piedra":
      tiradaJugador= 0;
      break;
      case "papel":
      tiradaJugador = 1;
      break;
      case "tijera":
      tiradaJugador = 2;
      break;
        }

int ordenador=(int)(Math.random()*3);
String tiradaOrdenador="";
switch (ordenador){
        case 0:
      tiradaOrdenador= "piedra";
      System.out.println("Turno del ordenador: "+tiradaOrdenador);
        
        if (tiradaJugador==0){
        System.out.print("Empate");
        }
        if (tiradaJugador==1){
        System.out.print("Gana el jugador");
        }
        if (tiradaJugador==2){
        System.out.print("Gana el ordenador");
        }
      break;
      case 1:
      tiradaOrdenador = "papel";
      System.out.println("Turno del ordenador: "+tiradaOrdenador);
      if (tiradaJugador==0){
        System.out.print("Gana el ordenador");
        }
        if (tiradaJugador==1){
        System.out.print("Empate");
        }
        if (tiradaJugador==2){
        System.out.print("Gana el jugador");
        }
      break;
      case 2:
      tiradaOrdenador = "tijera";
      System.out.println("Turno del ordenador: "+tiradaOrdenador);
      if (tiradaJugador==0){
        System.out.print("Gana el jugador");
        }
        if (tiradaJugador==1){
        System.out.print("Gana el ordenador");
        }
        if (tiradaJugador==2){
        System.out.print("Empate");
        }
      break;
    }


}
}
