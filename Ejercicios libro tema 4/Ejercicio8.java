public class Ejercicio8{
    public static void main (String [] args) {
    
    System.out.println("Este programa calcula la media de tres notas");
    System.out.println("Introduzca el resultado de la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el resultado de la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el resultado de la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2 + nota3)/3;
    System.out.println("La media de las notas es: "+media);
    
    if (media<5){
      System.out.println("Boletín --> insuficiente");
    }
    if ((media>=5) && (media<6)){
      System.out.println("Boletín --> suficiente");
    }
    if ((media>=6) && (media<7)){
      System.out.println("Boletín --> bien");
    }
    if ((media>=7) && (media<9)){
      System.out.println("Boletín --> notable");
    }
    if ((media>=9) && (media<=10)){
      System.out.println("Boletín --> sobresaliente");
    }
}
}
