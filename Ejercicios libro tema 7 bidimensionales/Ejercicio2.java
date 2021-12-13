public class Ejercicio2 {
public static void main(String[] args){
  int[][] n = new int[4][5];
  int sumaFila;
  int sumaColumna;
   int fila, columna; 
    System.out.println("Introduce 20 números: ");
    for(fila = 0; fila < 4; fila++) {
    for(columna = 0; columna < 5; columna++) {
      System.out.print("Fila " + fila + ", columna " + columna + ": ");
      n[fila][columna] = Integer.parseInt(System.console().readLine());
    }
   }
   
      System.out.println();
   for(fila = 0; fila < 4; fila++) {
   sumaFila=0;
    for(columna = 0; columna < 5; columna++) {
    System.out.printf("%10d ", n[fila][columna]);
    sumaFila += n[fila][columna];
    }
  System.out.printf("|%7d\n", sumaFila);
  }
  for(columna = 0; columna < 5; columna++) {
  System.out.print("----------");
  }
  System.out.println("-----------");
    int sumaTotal = 0;
    for(columna = 0; columna < 5; columna++) {
    sumaColumna = 0;
    for(fila = 0; fila < 4; fila++) {
    sumaColumna += n[fila][columna];
    }
    sumaTotal += sumaColumna;
    System.out.printf("%10d ", sumaColumna);
    }
    System.out.print("|     Total: "+ sumaTotal);
}
}
