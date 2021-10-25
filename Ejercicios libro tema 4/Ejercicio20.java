public class Ejercicio20{
    public static void main (String [] args) {
      System.out.println("Introduce un número de máximo 5 cifras para saber si es capicúo");
      int num = Integer.parseInt(System.console().readLine());
      boolean capicua = false;
      
      if (num < 10) {
       capicua = true;}
       
      if ((num >=10) && (num < 100)){
      if ((num / 10) == (num % 10)){
        capicua = true;}
      }
      
      if ((num >=100) && (num < 1000)){
      if ((num / 100) == (num % 10)){
        capicua = true;}
      }
      
      if ((num >=1000) && (num < 10000)){
      if (((num / 1000) == (num % 10)) && (((num/100)%10 == ((num / 10 % 10))))){
        capicua = true;
        }
      }
      
      if ((num >=10000) && (num < 100000)){
      if (((num / 10000) == (num % 10) ) && ((((num / 1000) % 10)) == ((num / 10) % 10))){
        capicua = true;}
      }
      
      
      if (capicua){
      System.out.println("El número introducido es capicúa" );
    } else {
    System.out.println("El número introducido no es capicúa" );
    }
    }
}
