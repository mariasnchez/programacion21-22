public class EjemploIf {
public static void main (String [] args) {
  int n;
  int resto;
  
  System.out.print("Introduzca un entero: ");
  n = Integer.parseInt(System.console().readLine());
  
  resto = n % 2;
  
  if (resto == 0) {
    System.out.println("El número introducido es par.");
  } else {
    System.out.println("El número introducido es impar");
  }
}
}
