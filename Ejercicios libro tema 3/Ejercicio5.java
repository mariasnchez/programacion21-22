public class Ejercicio5{
    public static void main (String [] args) {
    
    System.out.println("Introduce el valor de la base");
        float base = Float.parseFloat(System.console().readLine());
        
         System.out.println("Introduce el valor de la altura");
        float altura = Float.parseFloat(System.console().readLine());
    
    float arearect = (base*altura);
    
    System.out.println("El área del rectángulo es: " +arearect);
    }
    }
