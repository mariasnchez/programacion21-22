public class Ejercicio14 {
public static void main(String[] args){ 
//Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
//programa intentará adivinar el número que estás pensando - un número entre 0
//y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
//debe preguntar si el número que estás pensando es mayor o menor que el que
//te acaba de decir.
System.out.println("Piensa un número del 0 al 100. Intentaré adivinarlo en 5 intentos.");
System.out.println("Pulsa la tecla INTRO cuando estés preparado.");
System.console().readLine();


int numAleatorio;
int intentos=5;
int minimo=0;
int maximo=100;
boolean correcto = false;
int mayorOMenor;

do{
    numAleatorio=((int)(Math.random()*(maximo-minimo)+minimo));
    System.out.println();
    System.out.println("Creo que el número es el "+numAleatorio);
    System.out.println("El número es: 1) mayor 2) menor 3) igual");
    mayorOMenor = Integer.parseInt(System.console().readLine());
    intentos--;
     
  if ((mayorOMenor==1)&&(intentos >0)){
    minimo=numAleatorio+1;
    }
  if ((mayorOMenor==2)&&(intentos >0)){
    maximo=numAleatorio-1;
    }
  if (mayorOMenor==3){
    correcto=true;
    System.out.println("¡He acertado el número!");
    }
}while((intentos>0)&&(!correcto));

if(!correcto){  
System.out.println("Lo siento, no he acertado el número.");
}
}
}
