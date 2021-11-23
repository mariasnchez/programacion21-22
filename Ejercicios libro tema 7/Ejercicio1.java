public class Ejercicio1 {
public static void main(String[] args){
int[] num = new int[12];
num[0] = 39;
num[1] = -2;
num[4] = 0;
num[6] = 14;
num[8] = 5;
num[9] = 120;
System.out.print("Índice");
for (int i = 0; i <= 11; i++) {
System.out.printf("%5d", i);
}
System.out.print("\nValor ");
for (int i = 0; i <= 11; i++) {
System.out.printf("%5d", num[i]);
}
}
}
