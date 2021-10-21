public class Ejercicio11 {
public static void main(String[] args) {
  System.out.print("Introduce la hora: ");
  int hora = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce los minutos: ");
  int minutos = Integer.parseInt(System.console().readLine());

  int segundos;
  segundos = (hora*60*60 + minutos*60);
  int hastaMediaNoche;
  hastaMediaNoche= (86400-segundos);

  if ((hora==0) && (minutos==0)){
  System.out.print("¡Ya es medianoche!");
  }else {
  System.out.print("Quedan "+hastaMediaNoche+" segundos hasta medianoche.");
  }
}
}
