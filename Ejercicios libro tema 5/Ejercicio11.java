public class Ejercicio11{
    public static void main (String [] args) {
      int numIntroducido;
      int numerosMostrados = 5;
    System.out.print("Introduce un número y se mostrará el cuadrado y el cubo de los 5 primeros números enteros a partir de este: ");
      numIntroducido = Integer.parseInt(System.console().readLine());
      do {
      System.out.println(numIntroducido+"     "+(numIntroducido*numIntroducido)+"     "+(numIntroducido*numIntroducido*numIntroducido));
      numIntroducido+=1;
      numerosMostrados--;
      }while (numerosMostrados >0);
      
    }
    }
