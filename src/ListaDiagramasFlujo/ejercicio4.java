//SUMA DE LOS N PRIMEROS NÚMEROS NATURALES

package ListaDiagramasFlujo;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int a,suma=0;
        String cadena;
        
        System.out.print("Introduce un número:");
        
        try{
            cadena = teclado.nextLine();
            a = Integer.parseInt(cadena);

            for(int i=1; i<=a; i++){
                suma=suma+i;
            }

            System.out.println("La suma de los primeros "+a+" números es "+suma);
        }catch (Exception e){
            System.out.println("Error, al dato introducido no es un número");
        }
    }
}