public class Ejercicio14{
    public static void main (String [] args) {
      System.out.println("Introduce un número");
      int num = Integer.parseInt(System.console().readLine());
      
      if ((num % 2)==0 )
        { if ((num % 5)==0){ System.out.println("El número introducido es par y divisible entre 5"); 
                            } 
          else { System.out.println("El número introducido es par y no es divisible entre 5");
               }
        } else { if ((num % 5)==0){ System.out.println("El número introducido es impar y divisible entre 5"); 
                                  }
                else { System.out.println("El número introducido es impar y no es divisible entre 5"); 
                     }         
                }
    }
    }
