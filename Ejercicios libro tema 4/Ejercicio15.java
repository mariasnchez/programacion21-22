public class Ejercicio15{
    public static void main (String [] args) {
    String respuesta;
    System.out.println("Elige hacia qué lado quieres que el vértice de la pirámide apunte.");
    System.out.println("a) Arriba\nb) Abajo\nc) Izquierda\nd) Derecha");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
    System.out.println("");
    System.out.println("   +   ");
    System.out.println("  + +  ");
    System.out.println(" +   + ");
    System.out.println("+ + + +");
    } 
    
     if (respuesta.equals("b")) {
    System.out.println("");
    System.out.println("+ + + +");
    System.out.println(" +   + ");
    System.out.println("  + +  ");
    System.out.println("   +   ");
    } 
    
     if (respuesta.equals("c")) {
    System.out.println("");
    System.out.println("     +");
    System.out.println("   +  ");
    System.out.println(" +   +");
    System.out.println("+     ");
    System.out.println(" +   +");
    System.out.println("   +  ");
    System.out.println("     +");
    } 
    
     if (respuesta.equals("d")) {
    System.out.println("");
    System.out.println("+   ");
    System.out.println("  +  ");
    System.out.println("+   + ");
    System.out.println("     +");
    System.out.println("+   + ");
    System.out.println("  +  ");
    System.out.println("+   ");
    } 
  }
}
