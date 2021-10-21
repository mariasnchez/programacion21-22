public class Ejercicio13{
    public static void main (String [] args) {
    int aux;
    
    System.out.println("Este programa ordena los 3 numeros introducidos");
    System.out.println("Introduzca el primer número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el segundo número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el tercer número: ");
    int num3 = Integer.parseInt(System.console().readLine());
    
    if (num1 > num2) {
    aux = num1;
    num1 = num2;
    num2 = aux;
    } 
    if (num2 > num3) {
    aux = num2;
    num2 = num3;
    num3 = aux;
    } 
    if (num1 > num2) {
    aux = num1;
    num1 = num2;
    num2 = aux;
    }
    System.out.println("Los números introducidos ordenados de menor a mayor son " + num1 + ", " + num2 + " y " + num3 + ".");

}
}
