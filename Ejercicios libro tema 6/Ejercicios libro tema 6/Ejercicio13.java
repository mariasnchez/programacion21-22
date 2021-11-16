public class Ejercicio13 {
public static void main(String[] args){ 
//Escribe un programa que simule la tirada de dos dados. El programa deberá
//continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
//dados tengan el mismo valor.
int numeroTirada=1;
int tirada1=0;
int tirada2=0;
do{
for (int i = 1; i <= 1; i++) {
    System.out.println("Tirada "+numeroTirada+"->");
  System.out.print("Dado 1: ");
  tirada1=((int)(Math.random()*6+1));
System.out.println(tirada1);
System.out.print("Dado 2: ");
tirada2=((int)(Math.random()*6+1));
System.out.println(tirada2);
numeroTirada++;
System.out.println();
}
}while(tirada1!=tirada2);


}
}
