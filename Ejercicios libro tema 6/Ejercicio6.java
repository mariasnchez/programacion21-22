public class Ejercicio6 {
public static void main(String[] args) {
// Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe 
// adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
// el programa dirá cuántas oportunidades quedan y si el número introducido es
// menor o mayor que el número secreto.
int numAleatorio;
int intentos=5;
int numIntroducido;
boolean correcto = true;
System.out.println("Intenta adivinar el número aletorio. Tienes 5 oportunidades. ");
do{
  for (int i = 1; i <= 1; i++) {
  System.out.print("Introduce un número: ");
  numIntroducido= Integer.parseInt(System.console().readLine());
  numAleatorio=((int)(Math.random()*101));
  if (numIntroducido==numAleatorio){
    correcto=false;
  System.out.println("¡Enhorabuena, el número aleatorio es "+numAleatorio+"!");
  }else{
  System.out.println("Lo siento, el número aleatorio es: "+numAleatorio);
  intentos--;
}
}
}while((intentos>0)&&(correcto));

}
}
