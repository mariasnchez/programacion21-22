public class Ejercicio22{
public static void main (String [] args) {
  System.out.println("Se muestran todos los números primos entre 2 y 100: ");

boolean esPrimo = true;
int n = 1;
while (n <= 99) {
// comprueba si n es primo
esPrimo = true;
n++;
for (int i = 2; i < n; i++) {
if (n % i == 0) {
esPrimo = false;
}
}

// si n es primo, se muestra por pantalla
if (esPrimo) {
System.out.print(n + " ");
}
}
System.out.println();
}
}

