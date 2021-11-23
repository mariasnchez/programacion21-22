public class Ejercicio29 {
public static void main(String[] args){
  System.out.println("1. Primavera \n2. Verano\n3. Otoño \n4. Invierno");
  System.out.print("Seleccione la estación del año (1-4): ");
  int estacion = Integer.parseInt(System.console().readLine());
  int temperaturaMin;
  int temperaturaMax;
  String cielo="";
  System.out.println("\nPrevisión del tiempo para mañana");
  System.out.println("--------------------------------");
  if (estacion==1){
    temperaturaMin=((int)(Math.random()*16)+15);
    do{
    temperaturaMax=((int)(Math.random()*16)+15);
    }while (temperaturaMin>temperaturaMax);
      System.out.println("Temperatura mínima: "+temperaturaMin);
      System.out.println("Temperatura máxima: "+temperaturaMax);
  cielo = Math.random() <= 0.6 ? "Soleado" : "Nublado";
  System.out.println(cielo);
}
  if (estacion==2){
    temperaturaMin=((int)(Math.random()*21)+25);
    do{
    temperaturaMax=((int)(Math.random()*21)+25);
    }while (temperaturaMin>temperaturaMax);
      System.out.println("Temperatura mínima: "+temperaturaMin);
      System.out.println("Temperatura máxima: "+temperaturaMax);
    cielo = Math.random() <= 0.8 ? "Soleado" : "Nublado";
  System.out.println(cielo);
}
  if (estacion==3){
    temperaturaMin=((int)(Math.random()*11)+20);
    do{
    temperaturaMax=((int)(Math.random()*11)+20);
    }while (temperaturaMin>temperaturaMax);
      System.out.println("Temperatura mínima: "+temperaturaMin);
      System.out.println("Temperatura máxima: "+temperaturaMax);
  cielo = Math.random() <= 0.4 ? "Soleado" : "Nublado";
  System.out.println(cielo);
}
  if (estacion==4){
    temperaturaMin=(int)(Math.random()*26);
    do{
    temperaturaMax=(int)(Math.random()*26);
    }while (temperaturaMin>temperaturaMax);
      System.out.println("Temperatura mínima: "+temperaturaMin);
      System.out.println("Temperatura máxima: "+temperaturaMax);
  cielo = Math.random() <= 0.2 ? "Soleado" : "Nublado";
  System.out.println(cielo);
  }
}
}
