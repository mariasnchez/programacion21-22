public class Ejercicio10{
    public static void main (String [] args) {
    
    System.out.println("Introduce el numero mb que quieres convertir");
        float mb = Float.parseFloat(System.console().readLine());
    
    System.out.println(mb*1000+" kb son "+mb+" mb.");
}
}
