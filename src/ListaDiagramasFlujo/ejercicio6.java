//DECIR EL MAYOR DE 3 NÚMEROS, SI ALGUNO ES IGUAL A OTRO, VOLVER A PEDIRLOS

package ListaDiagramasFlujo;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int a,b,c;
        
        System.out.println("Introduce tres números:");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        
        while(a==b || b==c || a==c){
            System.out.println("Hay números iguales, vuelve a introducirlos:");
            a = teclado.nextInt();
            b = teclado.nextInt();
            c = teclado.nextInt();
        }
        
        if(a>b && a>c){
            System.out.println(a+" es mayor que "+b+" y "+c);
        }else{
            if (b>a && b>c){
                System.out.println(b+" es mayor que "+a+" y "+c);
            }else{
                System.out.println(c+" es mayor que "+a+" y "+b);
            }
        }
        
    }
}