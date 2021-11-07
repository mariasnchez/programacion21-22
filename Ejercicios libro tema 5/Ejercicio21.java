public class Ejercicio21{
    public static void main (String [] args) {
      int introducidos;
      int contador = 0;
      double sumaImpares =0;
      double contadorImpar=0;
      int maxPar=0;
      
      System.out.println("Ve introduciendo números hasta introducir uno negativo. ");
      do {
      introducidos = Integer.parseInt(System.console().readLine());
          if ((introducidos%2!=0)&&(introducidos>0)){
          contadorImpar++;
          sumaImpares+=introducidos;
          }else {
          if ((introducidos>maxPar)&&(introducidos>0)){
            maxPar=introducidos;
          }
        }
      contador ++;
      }while (introducidos >= 0); 
      
      System.out.println("Se han introducido " +(contador-1)+ " números. ");
      System.out.println("La media de los impares introducidos es " +(sumaImpares)/(contadorImpar));
      System.out.println("El máximo par es "+maxPar);
      }
    }
    
    
