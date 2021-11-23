public class Ejercicio31 {
public static void main(String[] args){
  System.out.print("Por favor, introduzca la cantidad de euros que desea apostar: ");
  int apuesta = Integer.parseInt(System.console().readLine());
  int dado1;
  int dado2;
  int dado1SegRonda;
  int dado2SegRonda;
  int dineroFinal;
  dado1=((int)(Math.random()*6)+1);
  dado2=((int)(Math.random()*6)+1);
  System.out.println("Primer dado: "+dado1);
  System.out.println("Segundo dado: "+dado2);
  if ((dado1+dado2==7)||(dado1+dado2==11)){
    dineroFinal=apuesta*2;
      System.out.println("Enhorabuena, su dinero final es: "+dineroFinal+"€");
  }else if ((dado1+dado2==2)||(dado1+dado2==3)||(dado1+dado2==12)){
    dineroFinal=0;
      System.out.println("Lo siento, su dinero final es: "+dineroFinal+"€");
  } else{
    do{
      System.out.println();
        dado1SegRonda=((int)(Math.random()*6)+1);
        dado2SegRonda=((int)(Math.random()*6)+1);
        System.out.println("Primer dado: "+dado1SegRonda);
        System.out.println("Segundo dado: "+dado2SegRonda);
        if (dado1SegRonda+dado2SegRonda==7){
          dineroFinal=0;
          System.out.println("Lo siento, su dinero final es: "+dineroFinal+"€");
        }else if (dado1SegRonda+dado2SegRonda==11){
        dineroFinal=apuesta*2;
        System.out.println("Enhorabuena, su dinero final es: "+dineroFinal+"€");
        }else if ((dado1SegRonda+dado2SegRonda==2)||(dado1SegRonda+dado2SegRonda==3)||(dado1SegRonda+dado2SegRonda==12)){
        dineroFinal=0;
        System.out.println("Lo siento, su dinero final es: "+dineroFinal+"€");
         } 
      }while((dado1SegRonda+dado2SegRonda==4)||(dado1SegRonda+dado2SegRonda==5)||(dado1SegRonda+dado2SegRonda==6)||(dado1SegRonda+dado2SegRonda==8)||(dado1SegRonda+dado2SegRonda==9)||(dado1SegRonda+dado2SegRonda==10));
  }
}
}


