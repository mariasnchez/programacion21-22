public class Ejercicio17 {
public static void main(String[] args){ 
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int altura =  Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int anchura =  Integer.parseInt(System.console().readLine());
    int espacios= (anchura-2);
    int numeroEspacios=(anchura-2)*(altura-2);
    int pezAleatorio=((int)(Math.random()*numeroEspacios));
    int posicion=0;
        System.out.println();

//pintamos las líneas
for (int i = 1; i <= anchura; i++){
  System.out.print("*");
}
  System.out.println();

//pintamos las líneas con espacios
do{
  System.out.print("*");
  for (int i = 1; i <= espacios; i++){
    if (posicion==pezAleatorio){
      System.out.print("&");
    } else{
 System.out.print(" ");
}
posicion++;
}
System.out.print("*");
System.out.println();
altura--;
}while(altura>2);

//pintamos la base
for (int i = 1; i <= anchura; i++){
  System.out.print("*");
}
  System.out.println();
}
}
