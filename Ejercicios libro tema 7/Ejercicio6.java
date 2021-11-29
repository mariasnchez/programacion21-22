public class Ejercicio6 {
public static void main(String[] args){
  int[] numeros = new int[15];
  int i;
System.out.println("Introduce 15 números: ");
for ( i = 0; i < 15; i++){
numeros[i] = Integer.parseInt(System.console().readLine());
}

System.out.println("Array original: ");
for ( i = 0; i < 15; i++) {
System.out.printf("|%3d ", i);
}
System.out.println("|");
for ( i = 0; i < 15; i++) {
System.out.printf("|%3d ", numeros[i]);
}
System.out.println("|");

//movemos los números
int ultimoNum=numeros[14];
for ( i=14; i>0; i--){
  numeros[i]=numeros[i-1];
}
numeros[0]=ultimoNum;
 
//array rotado
System.out.println("Array rotado: ");
for ( i = 0; i < 15; i++) {
System.out.printf("|%3d ", i);
}
System.out.println("|");
for ( i = 0; i < 15; i++) {
System.out.printf("|%3d ", numeros[i]);
}
System.out.println("|");
}
}

