public class Ejercicio11{
    public static void main (String [] args) {
    
    System.out.println("Introduce el numero kb que quieres convertir");
        float kb = Float.parseFloat(System.console().readLine());
    
    System.out.println(kb*0.001f+" mb son "+kb+" kb.");
}
}
