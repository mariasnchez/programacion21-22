public class Ejercicio8{
    public static void main (String [] args) {
      System.out.println("Introduce un numero y mostrarĂ© su tabla: ");
      int tabla = Integer.parseInt(System.console().readLine());
      int i = 1;
      System.out.println("TABLA DEL "+tabla);
do {
System.out.println(tabla+"x"+i+"="+(tabla*i));
i++;
} while (i <= 10);
}
}
