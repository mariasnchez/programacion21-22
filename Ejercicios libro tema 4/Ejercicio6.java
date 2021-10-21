public class Ejercicio6{
    public static void main (String [] args) {
    
    System.out.println("Este programa calcula el tiempo que tardará en caer un objeto desde una altura");
    System.out.println("Introduzca el valor de la altura en metros: ");
    double altura = Double.parseDouble(System.console().readLine());
    double g = 9.81;
    double formulatiempo = Math.sqrt(2*altura/g); 

    System.out.println("El tiempo que tardará en caer será "+formulatiempo+ " segundos");
    
    }
    }
