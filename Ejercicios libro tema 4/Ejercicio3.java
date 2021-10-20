public class Ejercicio3 {
public static void main(String[] args) {
System.out.print("Introduce un número del 1 al 7: ");
int dia = Integer.parseInt(System.console().readLine());
String diadelasemana;
switch(dia) {
case 1:
diadelasemana = "Lunes";
break;
case 2:
diadelasemana = "Martes";
break;
case 3:
diadelasemana = "Miércoles";
break;
case 4:
diadelasemana = "Jueves";
break;
case 5:
diadelasemana = "Viernes";
break;
case 6:
diadelasemana = "Sábado";
break;
case 7:
diadelasemana = "Domingo";
break;
default:
diadelasemana= "No has introducido un número correcto";
}
System.out.println("Día " + dia + ": " + diadelasemana);
}
}
