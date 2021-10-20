public class Ejercicio1 {
public static void main(String[] args) {
String dia;
System.out.println ("Introduce un día de la semana (lunes, martes, miércoles, jueves, viernes, sábado, domingo) ");
dia = (System.console().readLine());
switch(dia) {
case "lunes":
System.out.println("Base de datos");
break;
case "martes":
case "miércoles":
System.out.println("Programación");
break;
case "jueves":
System.out.println("Lenguaje de marcas");
break;
case "viernes":
System.out.println("Bases de Datos");
break;
case "sábado":
case "domingo":
System.out.println("No hay clases");
break;
default:
System.out.println("El día introducido no es correcto.");
}
}
}
