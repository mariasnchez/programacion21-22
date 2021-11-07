public class Ejercicio19 {
public static void main(String[] args) {
  System.out.println("Este programa pintará una pirámide según la altura que desee: ");
  System.out.print("Introduce la altura de la pirámide: ");
  int altura = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce el carácter con el que desea pintar la pirámide: ");
  String caracter = System.console().readLine();
  
  int planta = 1;
int longitudDeLinea = 1;
int espacios = altura;
do {
  // insertar los espacios
  int i = 1;
  while(i <= espacios){
    System.out.print(" ");
    i++;
  }
 // pinta la línea
 for (i = 1; i <= longitudDeLinea; i++) {
System.out.print(caracter);
}
System.out.println();
planta++;
espacios--;
longitudDeLinea += 2;

} while(planta <= altura);
}
}
