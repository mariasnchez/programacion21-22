public class Ejercicio24 {
public static void main(String[] args) {
  System.out.println("Este programa pintará una pirámide de números: ");
  System.out.print("Introduce la altura de la pirámide: ");
  int alturaIntroducida = Integer.parseInt(System.console().readLine());
  
  int altura=1;
  int i=0;
int espacios = alturaIntroducida;
do {
  // insertar los espacios
  i=1;
  while(i <= espacios){
    System.out.print(" ");
    i++;
  }
 // línea de números
 for (i = 1; i < altura; i++) {
System.out.print(i);
}
for (i = altura; i > 0; i--) {
System.out.print(i);
}

System.out.println();
espacios--;
altura++;
} while(altura <= alturaIntroducida);
}
}
