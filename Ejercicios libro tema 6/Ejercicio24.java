public class Ejercicio24 {
public static void main(String[] args){
int num;
do {
System.out.print("Por favor, introduzca un número entero positivo: ");
num = Integer.parseInt(System.console().readLine());
} while (num < 1);


// Cuenta los números y calcula el reves
int aux = num;
int numDig = 0;
int numReves = 0;
while (aux > 0){
numReves = ((numReves*10) + (aux % 10));
aux /=10;
numDig++;
}
//numeros aleatorios entre los digitos que hay
int numAleatorioDigito=((int)(Math.random()*numDig)+1);

int cifra = 0;
int posicionCifra=0;
// Separa las cifras
for (int i = 0; i < numDig; i++){
cifra = numReves%10;
numReves /= 10;
posicionCifra++;
 //mostramos una cifra aleatoria
  if (posicionCifra==numAleatorioDigito){
    System.out.print(cifra);
  }
}



}
}
