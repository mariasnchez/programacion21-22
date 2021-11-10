public class Ejercicio33 {
public static void main(String[] args) {
System.out.print("Introduce la altura de la U: ");
int altura=Integer.parseInt(System.console().readLine());

//pintar la altura
for (int i = 1; i < altura; i++) {
System.out.print("*");
for (int j = 2; j < altura; j++) {
System.out.print(" ");
}
System.out.println("*");
}

System.out.print(" ");
//pintar la base
for (int i = 0; i < altura-2; i++) {
System.out.print("*");
}
}
}
