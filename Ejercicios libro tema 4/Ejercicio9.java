public class Ejercicio9{
    public static void main (String [] args) {
    
    double a, b, c;
    double x1, x2;
    
    System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax² + bx + c = 0");
    System.out.println("Por favor, introduzca el valor de a: ");
    a = Double.parseDouble(System.console().readLine());
    System.out.println("Ahora introduzca el valor de b: ");
    b = Double.parseDouble(System.console().readLine());
    System.out.println("Ahora introduzca el valor de c: ");
    c = Double.parseDouble(System.console().readLine());
    
    if ((a == 0) && (b == 0) && (c == 0)) {
    System.out.println("La ecuación tiene infinitas soluciones.");
    }

    if ((a == 0) && (b == 0) && (c != 0)) {
    System.out.println("La ecuación tiene infinitas soluciones.");
    }

    if ((a != 0) && (b != 0) && (c == 0)) {
    System.out.println("x1 = 0");
    System.out.println("x2 = " + (-b / a));
    }
    
    if ((a == 0) && (b != 0) && (c != 0)) {
    System.out.println("x1 = x2 = " + (-c / b));
    }
    
    if ((a != 0) && (b == 0) && (c == 0)) {
    System.out.println("x1 = 0");
    System.out.println("x2 = 0");
    }

    
    double raiz;
    raiz = b*b-(4*a*c);
    x1 = (-b + Math.sqrt(raiz))/(2*a);
    x2 = (-b - Math.sqrt(raiz))/(2*a);
    
    
    if ((a != 0) && (b != 0) && (c != 0)) {
    if (raiz<0) { 
    System.out.println("La ecuación no tiene");
    }else{
      System.out.println("Las soluciones son: ");
      System.out.println("x1 = " +x1);
      System.out.println("x2 = " +x2);
        }
      }
    }
    }
