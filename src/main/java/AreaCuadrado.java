import java.util.Scanner;

public class AreaCuadrado {
    public static void main (String args[]){
        Scanner leer=new Scanner(System.in);
        
       System.out.println("Aquí podemos sacar el área de un cuadrado");
       System.out.println("Introduce el lado del cuadrado:");
       int lado=leer.nextInt();
       System.out.println("El numero leido es: "+lado);
       
       System.out.println("El valor del cuadrado es: "+lado*2);           
    
    }
}
