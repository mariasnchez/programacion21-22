public class Ejercicio2 {
public static void main(String[] args) {
System.out.println ("Dime que hora es (sin los minutos) ");
int hora =  Integer.parseInt(System.console().readLine());

if ((hora>=6) && (hora<=12)){
System.out.println("¡Buenos días!");
}
if ((hora>=13) && (hora<=20)){
System.out.println("¡Buenas tardes!");
}
if ((hora>=21) &&  (hora<=24) ||  (hora >=0) && (hora <=5)){
System.out.println("¡Buenas noches!");
}
}
}
