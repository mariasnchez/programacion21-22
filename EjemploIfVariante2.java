public class EjemploIfVariante2 {
public static void main (String [] args) {
System.out.print("¿Cuñal es la capital de Kiribati? ");
String respuesta = System.console().readLine();
if (respuesta.equals("Tarawa")) {
System.out.println("¡La respuesta es correcta!");
} else {
if (respuesta.equals("tarawa")) {
System.out.println("¡La respuesta es correcta!");
} else {
System.out.println("Lo siento, la respuesta es incorrecta");

}
}
}
}
