public class Ejercicio20 {
public static void main(String[] args){ 
    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    int capacidad = Integer.parseInt(System.console().readLine());
    System.out.println();
    int capacidadAdmitida=capacidad+1;
    int litros=((int)(Math.random()*capacidadAdmitida));
    int capacidadLitros=litros+1;
    int sinLlenar=(capacidad-litros);
    //pintamos las líneas no rellenadas
    if(sinLlenar!=0){
    do{
          System.out.print("*");
          
          for (int i = 1; i <= 4; i++){
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        sinLlenar--;
    }while (sinLlenar>0);
  }
    //pintamos las líneas rellenadas
    if (litros!=0){
      do{
          System.out.print("*");
          
          for (int i = 1; i <= 4; i++){
            System.out.print("=");
        }
        System.out.print("*");
        System.out.println();
        capacidadLitros--;
    }while (capacidadLitros>1);
  }
  //pintamos la base
  for (int i = 1; i <= 6; i++) {
  System.out.print("*");
  }
  
  System.out.println();
  System.out.print("La cuba tiene una capacidad de "+capacidad+" litros y contiene "+litros+" litros de agua.");
  
}
}
