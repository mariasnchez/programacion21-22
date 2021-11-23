public class Ejercicio26 {
public static void main(String[] args){
  System.out.print("Introduzca la anchura de la tableta: ");
  int anchura = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca la altura de la tableta: ");
  int altura = Integer.parseInt(System.console().readLine());
  int posicion=0;
  int interior=(altura-2)*(anchura-2);
  int borde=(altura*anchura)-interior;
  int posicionAleatoria=(int)(Math.random()*borde);

  //pintamos la primera línea
  for (int i = 1; i <=anchura; i++){
    if (posicion==posicionAleatoria){
      System.out.print(" ");
    }else{
      System.out.print("*");
    }
      posicion++;
  }
  System.out.println();
  
  
  for (int j = 1; j <=altura-2; j++){
    if (posicion==posicionAleatoria){
      System.out.print(" ");
    }else{
      System.out.print("*");
    }
      posicion++;
  //pintamos el interior del chocolate
  for (int i = 1; i <=anchura-2; i++){
    System.out.print("*");
  }
  if (posicion==posicionAleatoria){
      System.out.print(" ");
    }else{
      System.out.print("*");
    }
      posicion++;
  System.out.println();
}
  //pintamos la base 
for (int i = 1; i <=anchura; i++){
    if (posicion==posicionAleatoria){
      System.out.print(" ");
    }else{
      System.out.print("*");
    }
      posicion++;
  }
}
}
