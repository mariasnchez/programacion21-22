public class Ejercicio18 {
public static void main(String[] args) {
  System.out.println("Este programa mostrará de 7 en 7 los números enteros entre dos números empezando por el menor: ");
  System.out.print("Introduce el primer número: ");
  int num1 = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce el segundo número: ");
  int num2 = Integer.parseInt(System.console().readLine());
  int menor=0;
  int mayor=0;
  
  if (num2 < num1){
    menor=num2;
    mayor=num1;
  }
  if (num2 > num1){
    menor=num1;
    mayor=num2;
  }
  if(num1 == num2) {
  System.out.println("Los números introducidos no son válidos, deben ser distintos.");
  }else {
  do{
    System.out.print(menor+ " ");
    menor+=7;
  }while(menor <= mayor);
  }
}
}
