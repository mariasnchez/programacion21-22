public class Ejercicio29{
    public static void main (String [] args) {
    System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    String comida = System.console().readLine();
      
    double valorComida=0;
    double valorBebida=0;
    String pitufoCon="";
    
    switch (comida) {
      case "palmera":
      valorComida = 1.40;
      break;
      case "donut":
      valorComida = 1;
      break;
      case "pitufo":
        System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
         pitufoCon= System.console().readLine();
        if (pitufoCon.equals("aceite")){
          valorComida = 1.20;
        }
        if (pitufoCon.equals("tortilla")){
          valorComida = 1.60;
        }
      break;
      default:
    }
     System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
    String beber = System.console().readLine();
    
    switch (beber) {
      case "zumo":
      valorBebida = 1.50;
      break;
      case "cafe":
      case "café":
      valorBebida = 1.20;
      break;
      default:
    }
    double total=(valorComida+valorBebida);
    
    System.out.print(comida);
    if (comida.equals("pitufo")) {
    System.out.print(" " + pitufoCon);
    }
    System.out.println(": "+valorComida+" €");
    
    System.out.println(beber+": "+valorBebida+" €");

    System.out.println("total desayuno: "+total+" €");

    }
    }
