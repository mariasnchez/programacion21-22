public class Ejercicio12{
    public static void main (String [] args) {
    int puntos=0;
    String respuesta;
    System.out.println("Esto es un cuestionario de 10 preguntas.");
    System.out.println("1. ¿En qué comunidad se encuentra Málaga? ");
    System.out.println("a) Andalucía\nb) Madrid\nc) Barcelona");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
    puntos++;
    }
    
    System.out.println("2. ¿Cuál es el apellido más común de España");
    System.out.println("a) Sánchez\nb) García\nc) Martín");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
    puntos++;
    }
    
    System.out.println("3. ¿De qué color es el cielo?");
    System.out.println("a) Azul\nb) Rosa\nc) Morado");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
    puntos++;
    }
    
    System.out.println("¿4. Cuántos días tiene un año que no es bisiesto? ");
    System.out.println("a) 364\nb) 366\nc) 365");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
    puntos++;
    }
    
    System.out.println("5. Cuántos segundos tiene una hora? ");
    System.out.println("a) 3600\nb) 3400\nc) 3500");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
    puntos++;
    } 
       
    System.out.println("6. ¿Cuál es la capital de Alemania?");
    System.out.println("a) Dublin\nb) Berlin\nc) Milan");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
    puntos++;
    }   
    
    System.out.println("7. ¿Cuanto es 9x9 ");
    System.out.println("a) 81\nb) 91\nc) 71");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
    puntos++;
    } 
    
    System.out.println("8. ¿Cuál es el planeta más cercano al Sol?");
    System.out.println("a) Venus\nb) Marte\nc) Mercurio");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
    puntos++;
    }    
    
    System.out.println("9. ¿Cuál es la montaña más alta del mundo? ");
    System.out.println("a) Teide\nb) Everest\nc) Himalaya");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
    puntos++;
    }   
    
    System.out.println("10. ¿Cuál es el país con más habitantes del mundo? ");
    System.out.println("a) China\nb) Estados Unidos\nc) India");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
    puntos++;
    }    
    
    System.out.println("Ha obtenido " + puntos + " puntos.");
    
    }
    }
