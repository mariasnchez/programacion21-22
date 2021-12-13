public class Ejercicio20 {
public static void main(String[] args){
System.out.print("Introduzca el número total de nombres de reyes: ");
int num = Integer.parseInt(System.console().readLine());
String[] reyes = new String[num];
System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
for (int i = 0; i < num; i++) {
reyes[i] = System.console().readLine();
}
for (int i = 0; i < num; i++) {
int orden = 1;
for (int j = 0; j < i; j++) {
  if (reyes[i].equals(reyes[j])) {
  orden++;
}
}
System.out.println(reyes[i] + " " + orden + "º");
}
}
}
