public class Ejercicio21{
    public static void main (String [] args) {
      double nota1;
      double nota2;
      String respuesta;
      
      System.out.println("Introduce la nota del primer examen");
      nota1 = Double.parseDouble(System.console().readLine());
      System.out.println("Introduce la nota del segundo examen");
      nota2 = Double.parseDouble(System.console().readLine());
      
      double media = (nota1 + nota2)/2;
      
      if (media >= 5){
        System.out.println("Nota del primer control: "+nota1);
        System.out.println("Nota del segundo control: "+nota2);
        System.out.println("Tu nota de Programación es "+media);
        }
      if (media < 5) {
      System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      System.out.print("=> ");
      respuesta = System.console().readLine();
      if (respuesta.equals("apto")) {
      System.out.println("Tu nota de Programación es 5");
      }
      if (respuesta.equals("no apto")) {
      System.out.println("Tu nota de Programación es "+media);
      }
      }
        
     
    }
  }
