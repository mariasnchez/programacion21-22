public class Ejercicio22 {
public static void main(String[] args){ 
System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
int longitud = Integer.parseInt(System.console().readLine());
if (longitud<=0){
  System.out.println(" ");
}else{
System.out.println("            @");
int espacios=12;
int posicionAleatoria;

for (int i = 2; i <= longitud; i++) {
 posicionAleatoria=(int)(Math.random()*3);
  switch (posicionAleatoria){
        case 0:
        espacios--;
        for (int j = 1; j <= espacios; j++) {
         System.out.print(" ");
        }
        System.out.print("*");
      break;
      case 1:
      espacios++;
      for (int j = 1; j <= espacios; j++) {
         System.out.print(" ");
        }
        System.out.print("*");
      break;
      case 2:
      for (int j = 1; j <= espacios; j++) {
         System.out.print(" ");
        }
        System.out.print("*");
      break;
    }
    System.out.println();
}
}
}
}
