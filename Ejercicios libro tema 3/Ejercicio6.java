public class Ejercicio6{
    public static void main (String [] args) {
    
    System.out.println("Introduce el valor de la base");
        float base = Float.parseFloat(System.console().readLine());
        
         System.out.println("Introduce el valor de la altura");
        float altura = Float.parseFloat(System.console().readLine());
    
    float areatri = (base*altura)/2;
    
    System.out.println("El área del triángulo es: " +areatri);
    }
    }
