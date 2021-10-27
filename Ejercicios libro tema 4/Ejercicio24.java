public class Ejercicio24{
    public static void main (String [] args) {
    
    String cargo;
    int diasViaje;
    String estado;
      
    System.out.println("1 - Programador junior ");
    System.out.println("2 - Prog. senior ");
    System.out.println("3 - Jefe de proyecto");
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    cargo = System.console().readLine();
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    diasViaje = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    estado = System.console().readLine();
    
    double sueldoCargo=0;
    
    switch (cargo) {
      case "1":
        sueldoCargo=950;
        break;
      case "2":
        sueldoCargo=1200;
        break;
      case "3":
        sueldoCargo=1600;
        break;
      
    }
    
    int irpf=0;
    
    switch (estado) {
      case "1":
        irpf=25;
        break;
      case "2":
        irpf=20;
        break;
    }
    
    System.out.println("---------------------------------");
    if (cargo.equals("1")) {
    System.out.println(" Sueldo base              "+sueldoCargo+" ");
    }
    if (cargo.equals("2")) {
    System.out.println(" Sueldo base             "+sueldoCargo+" ");
    }
    if (cargo.equals("3")) {
    System.out.println(" Sueldo base             "+sueldoCargo+" ");
    }
    System.out.println(" Dietas ( "+diasViaje+" viajes)      "+ diasViaje*30+ ".0 ");
    System.out.println("---------------------------------");
    
    double sueldoBruto = sueldoCargo+diasViaje*30;
    System.out.println(" Sueldo bruto            "+sueldoBruto+" ");
    double retencion =irpf*0.01*sueldoBruto;
    System.out.println(" Retención IRPF ("+irpf+"%)    "+retencion+ "");
    System.out.println("---------------------------------");

    System.out.println(" Sueldo neto             "+(sueldoBruto-retencion)+" ");
    System.out.println("---------------------------------");

    }
    }
