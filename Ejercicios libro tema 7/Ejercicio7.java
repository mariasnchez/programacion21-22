public class Ejercicio7 {
public static void main(String[] args){
  int[] numero = new int[100];
  System.out.println("Los números aleatorios son: ");
  for (int i = 0; i < 100; i++){
  numero[i] = (int)(Math.random()*21);
  System.out.print(numero[i]+" ");
}

System.out.println();
System.out.println();
System.out.print("Introduce el número de los que se han mostrado que desea cambiar: ");
int primerNum = Integer.parseInt(System.console().readLine());
System.out.print("Introduce el valor por el que lo desea cambiar: ");
int segundoNum = Integer.parseInt(System.console().readLine());

for (int i = 0; i < 100; i++){
  if (numero[i]==primerNum){
    System.out.print("\"" +segundoNum+"\" ");
  }else {
    System.out.print(numero[i]+" ");

  }
}

}
}
