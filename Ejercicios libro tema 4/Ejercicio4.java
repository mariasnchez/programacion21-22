public class Ejercicio4{
    public static void main (String [] args) {
    
    System.out.println("Introduce el numero de horas trabajadas esta semana");
        int horas = Integer.parseInt(System.console().readLine());
    if (horas<=40){
    System.out.println("El sueldo semanal que le corresponde es de "+horas*12);
    }
    if (horas>40){
    System.out.println("El sueldo semanal que le corresponde es de "+(40*12+(horas-40)*16));
    }
}
}
