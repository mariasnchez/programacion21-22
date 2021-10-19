public class Ejercicio9{
    public static void main (String [] args) {
    
    System.out.println("Introduce el valor del radio de la base");
        float radio = Float.parseFloat(System.console().readLine());
        
         System.out.println("Introduce el valor de la altura del cono");
        float altura = Float.parseFloat(System.console().readLine());
    
    float volumencono = (1/3f)*3.14f*radio*radio*altura;
    
    System.out.println("El volumen del cono es: " +volumencono);
    }
    }
