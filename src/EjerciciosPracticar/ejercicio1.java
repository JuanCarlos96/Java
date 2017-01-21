//SUMAR DOS NÚMEROS LEÍDOS POR TECLADO Y MOSTRAR SU SUMA

package EjerciciosPracticar;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        
        int a,b;
        String cad1,cad2;
        boolean bool=false;
        
        Scanner teclado = new Scanner(System.in);
        
        while(!bool){
            System.out.println("Introduzca dos números a sumar:");
            try{
                cad1 = teclado.nextLine();
                a = Integer.parseInt(cad1);
                cad2 = teclado.nextLine();
                b = Integer.parseInt(cad2);
                
                int suma=a+b;
                System.out.println("La suma de los números es: "+suma);
                bool=true;
            }catch(Exception e){
                System.out.println("¡ERROR! El dato introducido no es un número");
            }
        }
    }
}
