public class Ejercicio12 {
public static void main (String[] args) {


    System.out.println("Introduce la nota del primer examen");
    float nota1 = Float.parseFloat(System.console().readLine());
    
    System.out.println("¿Que nota quieres sacar en el trimestre?");
    float notaTrim = Float.parseFloat(System.console().readLine());
    
     float nota2= (notaTrim - 0.4f *nota1)/0.6f;
      
      System.out.println("La nota que debes sacar en el segundo examen es: " +nota2);


}
}
