public class Ejercicio31 {
public static void main(String[] args) {
//  Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
// programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
// mitad (división entera entre 2) de la altura más uno.
System.out.print("Introduce la altura de la L: ");
int altura=Integer.parseInt(System.console().readLine());

int i=1;
//pintar la altura
while (i < altura){
  System.out.println("*");
  i++;
}
//pintar la base
for (i = 0; i < (altura/2)+1; i++) {
System.out.print("*");
}
}
}
