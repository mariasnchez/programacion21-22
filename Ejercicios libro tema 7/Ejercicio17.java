public class Ejercicio17 {
public static void main(String[] args){
  int[] num = new int[10];

  for (int i = 0; i < 10; i++){
    num[i] = (int)(Math.random()*101);
    System.out.print(num[i]+" ");
    }
    
  boolean existeNumero = false;
  int numIntroducido;

  do{
  System.out.print("\nIntroduce un número de los que se han mostrado: ");
  numIntroducido =Integer.parseInt(System.console().readLine());
  
  for (int i=0; i< 10; i++){
    if (num[i] == numIntroducido) {
  existeNumero = true;
  }
  }
 }while(!existeNumero);
 
 
 do{
    int aux = num[9];
    
    for (int i = 9; i > 0; i--) {
    num[i] = num[i-1];
    }
    num[0] = aux;
  }while (num[0] != numIntroducido) ;

 System.out.print("\nNuevo Array: ");
 for (int i = 0; i < 10; i++){
    System.out.print(num[i]+" ");
    }

}
}

