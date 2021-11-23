public class Ejercicio19 {
public static void main(String[] args){ 
  int maxPares=-100;
  int minImp=200;
  int contador=0;
for (int i = 1; i <= 50; i++) {
int numAleatorio=((int)(Math.random()*301)-100);
System.out.print(numAleatorio+" ");
contador+=numAleatorio;
if((numAleatorio%2==0)&&(numAleatorio>maxPares)){
  maxPares=numAleatorio;
}
if((numAleatorio%2!=0)&&(numAleatorio<minImp)){
  minImp=numAleatorio;
}
}

int mediaNumeros=(contador/50);
System.out.println();
System.out.println("El máximo de los pares es: "+maxPares);
System.out.println();
System.out.println("El mínimo de los impares es: "+minImp);
System.out.println();
System.out.println("La media de los números es: "+mediaNumeros);

}
}
