public class Ejercicio9{
    public static void main (String [] args) {
      long numeroDeDigitos = 1, n, numeroIntroducido;
    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    numeroIntroducido = Long.parseLong(System.console().readLine());
    n = numeroIntroducido;
    
    do {n /= 10;
    numeroDeDigitos++;
    } while (n > 10);
    
  System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
}
}
