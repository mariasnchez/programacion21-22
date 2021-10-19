public class Ejercicio7 {
public static void main(String[] args) {
System.out.print("Introduce la base imponible (precio del artículo sin IVA): ");
float baseImponible = Float.parseFloat(System.console().readLine());

System.out.printf("Base imponible %8.2f\n", baseImponible);
System.out.printf("IVA %8.2f\n", (baseImponible * 0.21));
System.out.printf("-----------------------\n");
System.out.printf("Total %8.2f\n", (baseImponible * 1.21));
}
}
