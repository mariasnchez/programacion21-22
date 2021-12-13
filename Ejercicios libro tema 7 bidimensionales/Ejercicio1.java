public class Ejercicio1 {
public static void main(String[] args){
int[][] n = new int[3][6]; // array de 3 filas por 6 columnas
n[0][1]=30;
n[0][2]=2;
n[0][5]=5;
n[1][0]=75;
n[2][2]=-2;
n[2][3]=9;
n[2][5]=11;

System.out.print("Array num  ");
for(int i = 0; i < 6; i++) {
System.out.print("Columna "+ i +"  ");
}
System.out.println();
int fila, columna;
for(fila = 0; fila < 3; fila++) {
System.out.print("Fila " + fila);
for(columna = 0; columna < 6; columna++) {
System.out.printf("%10d ", n[fila][columna]);
}
System.out.println();
}
}
}
