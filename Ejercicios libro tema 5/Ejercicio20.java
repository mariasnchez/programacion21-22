public class Ejercicio20 {
public static void main(String[] args) {
  System.out.println("Este programa pintará una pirámide hueca según la altura que desee: ");
  System.out.print("Introduce la altura de la pirámide: ");
  int alturaIntroducida = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce el carácter con el que desea pintar la pirámide: ");
  String caracter = System.console().readLine();
  
  int altura = 1;
  int i = 0;
  int espaciosInternos = -1;
  int espaciosDelante = alturaIntroducida-1;
do {
  //espacios por delante
  for (i = 1; i <=espaciosDelante; i++){
    System.out.print(" ");
  }
 // pinta la línea
     System.out.print(caracter);
 for (i = 1; i <=espaciosInternos; i++){
    System.out.print(" ");
  }
  if (altura>1) {
System.out.print(caracter);
}

  System.out.println();
altura++;
espaciosDelante--;
espaciosInternos+=2;
} while(altura < alturaIntroducida);

for (i = 1; i < altura*2; i++) {
System.out.print(caracter);

}
}
}
