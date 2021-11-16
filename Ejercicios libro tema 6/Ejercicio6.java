public class Ejercicio6 {
public static void main(String[] args) {
// Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe 
// adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
// el programa dirá cuántas oportunidades quedan y si el número introducido es
// menor o mayor que el número secreto.

int numAleatorio=((int)(Math.random()*101));
int intentos=5;
int numIntroducido;
boolean correcto = true;
System.out.println("Intenta adivinar el número aletorio. Tienes 5 oportunidades. ");
do{
  for (int i = 1; i <= 1; i++) {
  System.out.print("Introduce un número: ");
  numIntroducido= Integer.parseInt(System.console().readLine());
  if (numIntroducido==numAleatorio){
    correcto=false;
    System.out.println("¡Enhorabuena, has acertado el número!");
  }else{
  intentos--; 
  System.out.println("Lo siento, te quedan: "+intentos+" oportunidades. ");

  if(numIntroducido>numAleatorio){
    System.out.println("El número que tienes que adivinar es menor.");
  }
  if(numIntroducido<numAleatorio){
    System.out.println("El número que tienes que adivinar es mayor.");
  }
  
}
}
}while((intentos>0)&&(correcto));

    System.out.println("No has adivinado el número. El número era "+numAleatorio);

}
}

