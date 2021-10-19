public class Ejercicio4{
    public static void main (String [] args) {
    
    System.out.println("Introduce el primer numero");
        int num1 = Integer.parseInt(System.console().readLine());
        
         System.out.println("Introduce el segundo numero");
        int num2 = Integer.parseInt(System.console().readLine());
     
    int suma = num1+num2;
    int resta = num1-num2;  
    int multiplicacion = num1*num2;
    double division = (double) num1 / (double) num2;
    
    System.out.println("El resultado de la suma es: " +suma);
    System.out.println("El resultado de la resta es: " +resta);
    System.out.println("El resultado de la multiplicación es: " +multiplicacion);
    System.out.println("El resultado de la division es: " +division);
}
}
