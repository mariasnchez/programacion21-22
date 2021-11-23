public class Ejercicio18 {
public static void main(String[] args){ 
      System.out.println("Colores para los dormitorios: ");
      int dormitorio1;
      int dormitorio2;
      int dormitorio3;
      do{
      dormitorio1=((int)(Math.random()*6));
      dormitorio2=((int)(Math.random()*6));
      dormitorio3=((int)(Math.random()*6));
      }while((dormitorio1==dormitorio2)||(dormitorio2==dormitorio3)||(dormitorio1==dormitorio3));
    
      String color1="";
      String color2="";
      String color3="";
      
      switch (dormitorio1){
        case 0:
      color1 = "Rojo";
      break;
      case 1:
      color1 = "Azul";
      break;
      case 2:
      color1 = "Verde";
      break;
      case 3:
      color1 = "Amarillo";
      break;
      case 4:
      color1 = "Violeta";
      break;
      case 5:
      color1 = "Naranja";
      break;
    }
    
    switch (dormitorio2){
        case 0:
      color2 = "Rojo";
      break;
      case 1:
      color2 = "Azul";
      break;
      case 2:
      color2 = "Verde";
      break;
      case 3:
      color2 = "Amarillo";
      break;
      case 4:
      color2 = "Violeta";
      break;
      case 5:
      color2 = "Naranja";
      break;
    }
    
    switch (dormitorio3){
        case 0:
      color3 = "Rojo";
      break;
      case 1:
      color3 = "Azul";
      break;
      case 2:
      color3 = "Verde";
      break;
      case 3:
      color3 = "Amarillo";
      break;
      case 4:
      color3 = "Violeta";
      break;
      case 5:
      color3 = "Naranja";
      break;
    }
    
     System.out.println(color1+" "+color2+" "+color3);

}
}
