public class Ejercicio21 {
public static void main(String[] args){ 
  int monedaAleatoria;
  int posicionAleatoria;
  String moneda="";
  String posicion="";

  for (int i = 1; i <= 5; i++) {
  monedaAleatoria=(int)(Math.random()*8);
  posicionAleatoria=(int)(Math.random()*2);
  switch (posicionAleatoria){
        case 0:
      posicion= "cara";
      break;
      case 1:
      posicion = "cruz";
      break;
    }
  switch (monedaAleatoria){
        case 0:
      moneda= "1 céntimo";
      break;
      case 1:
      moneda = "2 céntimos";
      break;
      case 2:
      moneda = "5 céntimos";
      break;
      case 3:
      moneda = "20 céntimos";
      break;
      case 4:
      moneda = "50 céntimos";
      break;
      case 5:
      moneda = "1 euro";
      break;
      case 6:
      moneda = "2 euros";
      break;
    }
      System.out.println(moneda+" - "+posicion);

    }
}
}
