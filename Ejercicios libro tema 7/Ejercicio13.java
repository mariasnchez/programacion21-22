public class Ejercicio13 {
public static void main(String[] args){
  int[] numero = new int[100];
  int maximo=Integer.MIN_VALUE;
  int minimo=Integer.MAX_VALUE;
  
  for (int i = 0; i < 100; i++){
  numero[i] = (int)(Math.random()*501);
}
for (int i = 0; i < 100; i++){
  System.out.print(numero[i]+" ");
  
}
 System.out.print("\n\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
 int destacar= Integer.parseInt(System.console().readLine());
 
 for (int i = 0; i < 100; i++){
 if (destacar==1){
   if (numero[i]<minimo){
        minimo=numero[i];
      }
  }
  if (destacar==2){
       if (numero[i]>maximo){
        maximo=numero[i];
      }
  }
}
for (int i = 0; i < 100; i++){
      
      if (numero[i]==minimo){
      System.out.print("***"+numero[i]+"*** ");
      }else if (numero[i]==maximo){
      System.out.print("***"+numero[i]+"*** ");
      }else{
      System.out.print(numero[i]+" ");
    }
  }

}
}
