public class Ejercicio12{
    public static void main (String [] args) {
    System.out.println("Serie de Fibonacci ");
    System.out.print("Introduce un número y se mostrará este numero de cifras de la serie: ");
    int numIntroducido = Integer.parseInt(System.console().readLine());
    int numerosMostrados=0 ;
 
 switch (numIntroducido){
   case 0:
       System.out.println(" ");
  break;
  case 1:
       System.out.println("0");
  break;
  case 2:
       System.out.println("0");
       System.out.println("1");
  break;
  default:
  System.out.println("0");
  System.out.println("1");
  int num1 = 0;
  int num2 = 1; 
  int num3;
    do {
        num3=num1+num2;  
        System.out.println(num3);  
        num1=num2;  
        num2=num3;  
      numIntroducido--;
      }while (numIntroducido >2);
    }
    }
    }
