/*
DECIR EL MAYOR DE 2 NÚMEROS
*/
package ListaDiagramasFlujo;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int a,b;
        
        System.out.println("Introduce dos números:");
        a = teclado.nextInt();
        b = teclado.nextInt();
        
        while(a==b){
            System.out.println("Los números son iguales, vuelve a introducirlos:");
            a = teclado.nextInt();
            b = teclado.nextInt();
        }
        
        if(a>b){
            System.out.println(a+" es mayor que "+b);
        }else{
            System.out.println(b+" es mayor que "+a);
        }
        
    }
}