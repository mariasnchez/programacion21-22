public class Ejercicio16 {
public static void main(String[] args){ 
  int numAleatorio1=((int)(Math.random()*5)+1);
  int numAleatorio2=((int)(Math.random()*5)+1);
  int numAleatorio3=((int)(Math.random()*5)+1);
  String figura1="";
  String figura2="";
  String figura3="";

  switch(numAleatorio1) {
    case 1:
    figura1 = "corazón";
    break;
    case 2:
    figura1 = "diamante";
    break;
    case 3:
    figura1 = "herradura";
    break;
    case 4:
    figura1 = "campana";
    break;
    case 5:
    figura1 = "limón";
    break;
  }
  switch(numAleatorio2) {
    case 1:
    figura2 = "corazón";
    break;
    case 2:
    figura2 = "diamante";
    break;
    case 3:
    figura2 = "herradura";
    break;
    case 4:
    figura2 = "campana";
    break;
    case 5:
    figura2 = "limón";
    break;
  }
  switch(numAleatorio3) {
    case 1:
    figura3 = "corazón";
    break;
    case 2:
    figura3 = "diamante";
    break;
    case 3:
    figura3 = "herradura";
    break;
    case 4:
    figura3 = "campana";
    break;
    case 5:
    figura3 = "limón";
    break;
  }
  
  System.out.println(figura1+" "+figura2+" "+figura3);
  
  if (((numAleatorio1==numAleatorio2)||(numAleatorio2==numAleatorio3))||(numAleatorio1==numAleatorio3)){
     System.out.println("Bien, ha recuperado su moneda");
  }else  if ((numAleatorio1==numAleatorio2)&&(numAleatorio1==numAleatorio3)){
         System.out.println("Enhorabuena, ha ganado 10 monedas");

  } else {
        System.out.println("Lo siento, ha perdido");

  }
}
}
