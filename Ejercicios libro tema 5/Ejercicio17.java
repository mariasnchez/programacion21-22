public class Ejercicio17 {
public static void main(String[] args) {
  int contador = 100;
  System.out.print("Introduce un número entero positivo y se sumarán los 100 siguientes: ");
  int numIntroducido = Integer.parseInt(System.console().readLine());
  int numIntroducidoInicial = numIntroducido;
  int suma=0;
  if(numIntroducido < 0) {
  System.out.println("El número introducido no es correcto, debe introducir un número positivo.");
  }else{ do {
    suma += numIntroducido;
    numIntroducido++;
    contador--;
  }while (contador > 0) ;
    System.out.print("La suma de los 100 números siguientes desde el "+numIntroducidoInicial+ " es "+suma);
}
}
}
