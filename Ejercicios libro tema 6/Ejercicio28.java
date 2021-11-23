import java.util.Scanner;
public class Ejercicio28 {
public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  System.out.print("Introduzca el tamaño del array: ");
  int array = Integer.parseInt(s.nextLine());
int[] valor = new int[array];
for (int i = 0; i < array; i++) {
valor[i] = (int) (Math.random() * 201);
}
System.out.println();

System.out.println("Array original:");
System.out.print("Índice");
for (int i = 0; i < valor.length; i++) {
System.out.printf("%5d", i);
}
System.out.println();
System.out.print("Valor ");
for (int i = 0; i < valor.length; i++) {
System.out.printf("%5d", valor[i]);
}
int[] r = new int[array];
int izquierda = 0;
int derecha = array - 1;
for (int i = 0; i < array; i++) {
if (i % 2 == 0) {
r[izquierda++] = valor[i];
} else {
r[derecha--] = valor[i];
}
}
System.out.println();
System.out.println();
System.out.println("Array resultado:");
System.out.print("Índice");
for (int i = 0; i < r.length; i++) {
System.out.printf("%5d", i);
}
System.out.println();
System.out.print("Valor ");
for (int i = 0; i < r.length; i++) {
System.out.printf("%5d", r[i]);
}
}
}
