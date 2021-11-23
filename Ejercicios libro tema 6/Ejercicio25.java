public class Ejercicio25 {
public static void main(String[] args){
  boolean esPrimo=true;
  int numAleatorio;
  for (int i = 1; i <=100; i++){
  numAleatorio=((int)(Math.random()*191)+10);
  
  //comprobamos si el numero aleatorio es primo
  esPrimo=true;
    for (int j = 2; j < numAleatorio; j++) {
      if (numAleatorio % j == 0) {
      esPrimo = false;
      }
    }

  //mostramos los números por pantalla
  if(esPrimo){
    System.out.print("#"+numAleatorio+"# ");
  }else if(numAleatorio%5==0){
  System.out.print("["+numAleatorio+"] ");
  }else{
    System.out.print(numAleatorio+" ");
  }

}
}
}
