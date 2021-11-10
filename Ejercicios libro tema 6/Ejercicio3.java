public class Ejercicio3 {
public static void main(String[] args) {
// Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
// de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.(oros, copas, bastos, espadas)
System.out.println("Carta al azar (baraja española)-> ");

String palo="";
String carta="";

int numPalo = (int)(Math.random()*4); 

switch(numPalo) {
case 0:
palo = "oros";
break;
case 1:
palo= "copas";
break;
case 2:
palo= "bastos";
break;
case 3:
palo="espadas";
break;
default:
}
int numCarta = (int)(Math.random()*10+1); 

switch(numCarta) {
case 1:
carta = "As";
break;
case 8:
carta= "Sota";
break;
case 9:
carta= "Caballo";
break;
case 10:
carta="Rey";
break;
default:
carta= String.valueOf(numCarta);
}

System.out.print(carta+" de "+palo);

}
}


