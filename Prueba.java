public class Prueba {
public static void main (String [] args) {
  
  int nota1, nota2, nota3;
  String entrada;
  
System.out.println("Holaaa");
System.out.println("Introduzca  un valor entero:");
entrada = System.console().readLine(); 
System.out.print("El valor de la cadena es: ");
System.out.println(entrada);
nota1 = Integer.parseInt(entrada);
System.out.print("El numero introducido es: ");
System.out.println(nota1);
}
}
