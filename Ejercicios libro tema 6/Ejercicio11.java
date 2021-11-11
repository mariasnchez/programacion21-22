public class Ejercicio11 {
public static void main(String[] args) {
//Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
//aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
//final aparecerá el número de suspensos, el número de suficientes, el número
//de bienes, etc.
int notaAleatoria;
String nota="";
int contadorSuspenso=0;
int contadorSuficiente=0;
int contadorBien=0;
int contadorNotable=0;
int contadorSobresaliente=0;

for (int i = 1; i <= 20; i++) {
  notaAleatoria=((int)(Math.random()*5)+1);
      switch(notaAleatoria) {
    case 1:
    nota = "Suspenso";
    contadorSuspenso++;
    break;
    case 2:
    nota= "Suficiente";
    contadorSuficiente++;
    break;
    case 3:
    nota= "Bien";
    contadorBien++;
    break;
    case 4:
    nota="Notable";
    contadorNotable++;
    break;
    case 5:
    nota="Sobresaliente";
    contadorSobresaliente++;
    break;
    default:
    }
      System.out.print(i+". ");
      System.out.println(nota);
    }
          System.out.println("Hay "+contadorSuspenso+" suspensos, "+contadorSuficiente+" suficientes, "+contadorBien+" bienes, "+contadorNotable+" notables y "+contadorSobresaliente+" sobresalientes.");

}
}
