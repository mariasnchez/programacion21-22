public class Ejercicio15 {
public static void main(String[] args){

int[] ocupacion = new int[10];
  for (int i = 0; i <= 9; i++){
    ocupacion[i] = (int)(Math.random()*5);
  }
int personas=0;

do {  
  System.out.print("Mesa nº   ");
  for (int i = 1; i <= 10; i++){
      System.out.printf("%4d ", i);
    }

  System.out.print("\nOcupación ");
  for (int i = 0; i <= 9; i++){
      System.out.printf("%4d ", ocupacion[i]);
    }
    
    System.out.print("\n\n¿Cuántos son? (Introduzca -1 para salir del programa): ");
    personas=Integer.parseInt(System.console().readLine());
    
    if (personas>4){
    System.out.println("\nLo siento, no admitimos grupos de "+personas+". Haga grupos de 4 personas como máximo e intente de nuevo");
    }else{
      int vacio=0;
      boolean esVacio=false;
      for(int i = 9; i >= 0; i--) {
      if (ocupacion[i] == 0) {
      vacio = i;
      esVacio = true;
      }
      }
      
      if (esVacio){
        ocupacion[vacio] = personas; 
        System.out.println("Por favor, siéntense en la mesa número " + (vacio + 1) + ".");
      } else {
        int iHueco = 0;
        boolean hayHueco = false;
        for(int i = 9; i >= 0; i--) {
        if (personas <= (4 - ocupacion[i])) {
        iHueco = i;
        hayHueco = true;
        }
        }
        if (hayHueco) {
        ocupacion[iHueco] += personas; 
        System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (iHueco + 1) + ".");
        } else {
        System.out.println("Lo siento, en estos momentos no queda sitio.");
        }
        }

      }     
      
      
    
    
    System.out.println();
  }while(personas!=-1);  
  
  System.out.print("Gracias. Hasta pronto.");

}
}
