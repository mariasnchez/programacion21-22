public class Ejercicio23 {
public static void main(String[] args){
  String dado="";
  int dadoAleatorio;
  for (int i = 1; i <= 5; i++) {
    dadoAleatorio=(int)(Math.random()*6);
 switch (dadoAleatorio){
        case 0:
      dado= "As";
      break;
      case 1:
      dado = "K";
      break;
      case 2:
      dado = "Q";
      break;
      case 3:
      dado = "J";
      break;
      case 4:
      dado = "7";
      break;
      case 5:
      dado = "8";
      break;
        }
         System.out.print(dado+" ");
      }
}
}
