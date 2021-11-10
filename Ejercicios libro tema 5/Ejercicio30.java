public class Ejercicio30 {
public static void main(String[] args) {
//  Realiza una programa que calcule las horas transcurridas entre dos horas de
// dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
// El día de la semana se puede pedir como un número (del 1 al 7) o como una
// cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
// los datos correctamente y que el segundo día es posterior al primero.
System.out.print("Introduce el primer día de la semana anterior al segundo: (puede ser introducido como un número del 1 al 7 o en palabras de lunes a domingo): ");
String dia1 = System.console().readLine();
System.out.print("Introduce la hora del día sin minutos ni segundos: ");
int hora1=Integer.parseInt(System.console().readLine());
System.out.print("Introduce el segundo día de la semana posterior al primero: (puede ser introducido como un número del 1 al 7 o en palabras de lunes a domingo): ");
String dia2 = System.console().readLine();
System.out.print("Introduce la hora del día sin minutos ni segundos: ");
int hora2=Integer.parseInt(System.console().readLine());

int diaNumerico1=0;
int diaNumerico2=0;

switch(dia1) {
case "1":
case "lunes":
diaNumerico1 = 0;
break;
case "2":
case "martes":
diaNumerico1 = 24;
break;
case "3":
case "miércoles":
case "miercoles":
diaNumerico1 = 48;
break;
case "4":
case "jueves":
diaNumerico1 = 72;
break;
case "5":
case "viernes":
diaNumerico1 = 96;
break;
case "6":
case "sábado":
case "sabado":
diaNumerico1 = 120;
case "domingo":
diaNumerico1 = 144;
break;
default:
System.out.print("El día introducido no es correcto.");
}

switch(dia2) {
case "1":
case "lunes":
diaNumerico2 = 0;
break;
case "2":
case "martes":
diaNumerico2 = 24;
break;
case "3":
case "miércoles":
case "miercoles":
diaNumerico2 = 48;
break;
case "4":
case "jueves":
diaNumerico2 = 72;
break;
case "5":
case "viernes":
diaNumerico2 = 96;
break;
case "6":
case "sábado":
case "sabado":
diaNumerico2 = 120;
case "domingo":
diaNumerico2 = 144;
break;
default:
System.out.print("El día introducido no es correcto.");
}

if ((diaNumerico1>diaNumerico2) && (hora1>hora2)){
  System.out.print("La primera fecha tiene que ser anterior a la segunda");

}else{

int horasDia1 = (diaNumerico1+hora1);
int horasDia2= (diaNumerico2+hora2);
int horasTranscurridas = (horasDia2-horasDia1);

System.out.print("Entre las dos fechas han transcurrido "+horasTranscurridas+" horas.");
}
}
}
