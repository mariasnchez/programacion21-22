public class Ejercicio5{
    public static void main (String [] args) {
    
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.println("Por favor, introduzca el valor de a: ");
    int numA = Integer.parseInt(System.console().readLine());
    System.out.println("Ahora introduzca el valor de b: ");
    int numB = Integer.parseInt(System.console().readLine());
    
    if (numA!=0){ 
    double division;
    division = (double)-numB / (double) numA;
    System.out.println("El valor de x será: "+division);
    }else{
      System.out.println("Esa ecuación no tiene solución real.");
        }
    }
    }
