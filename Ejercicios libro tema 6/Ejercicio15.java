public class Ejercicio15 {
public static void main(String[] args){ 
  int numAleatorio;
  String nota="";
  int numVecesAleatoria=((int)(Math.random()*6)+1);
  int contador=0;
  String primeraNota="";
  
  
  do{
  for (int i = 1; i <= 4; i++) {
  numAleatorio=((int)(Math.random()*7)+1);
      switch(numAleatorio) {
    case 1:
    nota = "do";
    break;
    case 2:
    nota= "re";
    break;
    case 3:
    nota= "mi";
    break;
    case 4:
    nota="fa";
    break;
    case 5:
    nota="sol";
    break;
    case 6:
    nota="la";
    break;
    case 7:
    nota="si";
    break;
    default:
    }
    System.out.print(nota+" ");
    contador++;
    if (contador == 1) {
    primeraNota = nota;
    }
  }
  numVecesAleatoria--;
  System.out.print(" | ");
  }while(numVecesAleatoria>0);

  //ultimo compas
  for (int i = 1; i <= 3; i++) {
  numAleatorio=((int)(Math.random()*7)+1);
      switch(numAleatorio) {
    case 1:
    nota = "do";
    break;
    case 2:
    nota= "re";
    break;
    case 3:
    nota= "mi";
    break;
    case 4:
    nota="fa";
    break;
    case 5:
    nota="sol";
    break;
    case 6:
    nota="la";
    break;
    case 7:
    nota="si";
    break;
    default:
    }
    System.out.print(nota+" ");
  }
  
  System.out.print(primeraNota+" |");
  System.out.print("|");

}
}
