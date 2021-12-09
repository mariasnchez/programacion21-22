public class Ejercicio14 {
public static void main(String[] args){

  
  String[] colores = {
     "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro",
     "blanco", "morado"
  };
  String[] palabra = new String[8];
  String[] resultado = new String[8];
  int j = 0;

  System.out.println("Introduce 8 palabras: ");
  for (int i = 0; i < 8; i++){
  palabra[i] = System.console().readLine();
    for (String c: colores ){
      if (palabra[i].equals(c)){
        resultado[j++] = c;
      }
    }
  }
  for (int i = 0; i < 8; i++) {
boolean esColor = false;
for (String c : colores) {
if (palabra[i].equals(c)) {
esColor = true;
}
}
if (!esColor) {
resultado[j++] = palabra[i];
}
}

  System.out.println("\n\nArray original:");

System.out.println();
for (int i = 0; i < 8; i++) {
System.out.printf("│    %d    ", i);
}

System.out.println();
for (String p : palabra) {
System.out.printf("│%-8s ", p);
}

System.out.println("\n\nArray resultado:");

System.out.println();
for (int i = 0; i < 8; i++) {
System.out.printf("│    %d    ", i);
}
System.out.println();
for (String r : resultado) {
System.out.printf("│%-8s ", r);
}
}
}
  
  
  
