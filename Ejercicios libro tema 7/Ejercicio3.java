public class Ejercicio3 {
public static void main(String[] args){
int[] numeros = new int[10];
System.out.println("Introduce 10 números: ");
for (int i = 0; i < 10; i++){
numeros[i] = Integer.parseInt(System.console().readLine());
}
System.out.print("Los números introducidos a la inversa son ");
for (int i = 9; i >= 0; i--){
System.out.print(numeros[i]+ " ");
}
}
}
