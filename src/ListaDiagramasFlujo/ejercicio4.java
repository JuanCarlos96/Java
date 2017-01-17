//SUMA DE LOS N PRIMEROS NÚMEROS NATURALES

package ListaDiagramasFlujo;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int a,suma=0;
        
        System.out.println("Introduce un número");
        a = teclado.nextInt();
        
        for(int i=1; i<=a; i++){
            suma=suma+i;
        }
        
        System.out.println("La suma de los primeros "+a+" números es "+suma);
    }
}