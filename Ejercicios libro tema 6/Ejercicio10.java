public class Ejercicio10 {
public static void main(String[] args) {
// Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
// El carácter con el que se pinta cada línea se elige de forma aleatoria entre
// uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
// aleatoria entre 1 y 40 caracteres.
int lineas=10;
int caracterAleatorio=((int)(Math.random()*6)+1);
int longitudAleatoria=((int)(Math.random()*40)+1);
String caracter ="";
switch(caracterAleatorio) {
case 1:
caracter = "*";
break;
case 2:
caracter= "-";
break;
case 3:
caracter= "=";
break;
case 4:
caracter=".";
break;
case 5:
caracter="|";
break;
case 6:
caracter="@";
break;
default:
}
  
do{
    for (int i = 1; i <= longitudAleatoria; i++) {
      System.out.print(caracter);
    }
  System.out.println();
  lineas--;
}while (lineas>0);
}
}
