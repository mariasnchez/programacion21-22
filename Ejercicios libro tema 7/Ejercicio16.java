public class Ejercicio16 {
public static void main(String[] args){
int[] num = new int[20];
int multiplo5=0;
int multiplo7=0;
  for (int i = 0; i < 20; i++){
    num[i] = (int)(Math.random()*401);
    System.out.print(num[i]+" ");
    }
    
  System.out.print("\n¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
  int multiplo =Integer.parseInt(System.console().readLine());
  
  System.out.println();
  
  for (int i = 0; i < 20; i++){
     if (multiplo==1){
       if (num[i]%5==0){
          System.out.print("["+num[i]+"] ");
        }else{
          System.out.print(num[i]+" ");
        }
      }
    
     if (multiplo==2){
       if (num[i]%7==0){
         System.out.print("["+num[i]+"] ");
        }else{
          System.out.print(num[i]+" ");
        }
      }
  }

}
}
