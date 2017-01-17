//LEER TRES NÚMEROS Y ORDENARLOS DE MAYOR A MENOR

package ListaDiagramasFlujo;
import java.util.Scanner;

public class ejercicio10_2 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int a,b,c;
        
        System.out.println("Introduce tres números");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        
        while(a==b || a==c || b==c){
            System.out.println("Hay números iguales, vuelve a introducirlos");
            a = teclado.nextInt();
            b = teclado.nextInt();
            c = teclado.nextInt();
        }
        
        if(a>b && a>c){
            if(b>c){
                System.out.println(a+" > "+b+" > "+c);
            }else{
                System.out.println(a+" > "+c+" > "+b);
            }
        }else{
            if(b>a && b>c){
                if(a>c){
                    System.out.println(b+" > "+a+" > "+c);
                }else{
                    System.out.println(b+" > "+c+" > "+a);
                }
            }else{
                if(a>b){
                    System.out.println(c+" > "+a+" > "+b);
                }else{
                    System.out.println(c+" > "+b+" > "+a);
                }
            }
        }
    }
}