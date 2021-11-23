public class Ejercicio30 {
public static void main(String[] args){
  int altura;
  int anchura;
  
    do{
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    altura = Integer.parseInt(System.console().readLine());
    }while (altura<4);
    do{
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    anchura = Integer.parseInt(System.console().readLine());
    }while (anchura<4);
    
    int espacios=(altura-2)*(anchura-2);
    int posicion=0;
    int posicionCaracola;
    int posicionPez;
    int posicionCaballo=(int)(Math.random()*espacios);
    do{
      posicionCaracola=(int)(Math.random()*espacios);
    }while(posicionCaballo==posicionCaracola);
    do{
      posicionPez=(int)(Math.random()*espacios);
    }while((posicionPez==posicionCaballo)||(posicionCaballo==posicionCaracola)||(posicionPez==posicionCaracola));
  //pintamos la primera línea
  for (int i = 0; i < anchura; i++) {
    System.out.print("*");
  }
   System.out.println();
   for (int i = 0; i < altura-2; i++) {
    System.out.print("*");
    for (int j = 0; j < anchura-2; j++) {
          if (posicion==posicionPez){
              System.out.print("&");
          }else if (posicion==posicionCaracola){
              System.out.print("@");
          } else if (posicion==posicionCaballo){
              System.out.print("$");
          }else{
              System.out.print(" ");
          }
          posicion++;
    }
    System.out.print("*");
    System.out.println();
  }
  //pintamos la base
  for (int i = 0; i < anchura; i++) {
    System.out.print("*");
  }
}
}
