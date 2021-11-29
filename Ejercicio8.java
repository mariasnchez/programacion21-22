public class Ejercicio8 {
public static void main(String[] args){

  System.out.println("Introduzca la temperatura media de cada mes: ");
   String[] mes = {
  "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
  "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
  };
  int[] numero = new int[12];
  
    for (int i = 0; i < 12; i++){
      System.out.print(mes[i]+": ");
      numero[i] = Integer.parseInt(System.console().readLine());
    }
            System.out.println();
    for (int i = 0; i < 12; i++){
      System.out.printf("%11s ", mes[i]);
      for (int j = 0; j < numero[i]; j++){
        System.out.print("*");
    } 
      System.out.print(" "+numero[i]+"ºC");
        System.out.println();
  }
}
}
