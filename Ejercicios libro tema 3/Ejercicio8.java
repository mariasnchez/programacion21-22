public class Ejercicio8{
    public static void main (String [] args) {
    
    System.out.println("Introduce el numero de horas trabajadas esta semana");
        int horas = Integer.parseInt(System.console().readLine());
    
    System.out.println("El dinero que has ganado en la semana es: " + horas*12);
}
}
