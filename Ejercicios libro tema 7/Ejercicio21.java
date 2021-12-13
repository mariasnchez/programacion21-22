public class Ejercicio21 {
public static void main(String[] args){
  
int[] num = new int[15];
  for (int i = 0; i < 15; i++) {
  num[i] = (int)(Math.random() * 501);
  }
System.out.println("Array original:");
for (int i = 0; i < 15; i++) {
System.out.print(num[i] + " ");
}
//array nuevo
for (int i = 0; i < 15; i++) {
  while (num[i] % 5 != 0) {
  num[i]++;
  }
}

System.out.println("\n\nArray resultado:");
for (int i = 0; i < 15; i++) {
System.out.print(num[i] + " ");
}
}

}

