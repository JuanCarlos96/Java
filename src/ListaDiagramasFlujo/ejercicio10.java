//LEER DOS NÚMEROS Y ORDENARLOS DE MAYOR A MENOR

package ListaDiagramasFlujo;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int a,b;
        
        System.out.println("Introduce dos números");
        a = teclado.nextInt();
        b = teclado.nextInt();
        
        while(a==b){
            System.out.println("Los números son iguales, vuelve a introducirlos");
            a = teclado.nextInt();
            b = teclado.nextInt();
        }
        
        if(a<b){
            System.out.println(b+" > "+a);
        }else{
            System.out.println(a+" > "+b);
        }
    }
}