//LEER TRES NÚMEROS Y ORDENARLOS DE MAYOR A MENOR

package ListaDiagramasFlujo;
import java.util.Scanner;

public class ejercicio10_2 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int a,b,c;
        String cad1,cad2,cad3;
        
        System.out.println("Introduce tres números");
        cad1 = teclado.nextLine();
        cad2 = teclado.nextLine();
        cad3 = teclado.nextLine();
        a = Integer.parseInt(cad1);
        b = Integer.parseInt(cad2);
        c = Integer.parseInt(cad3);
        
        while(a==b || a==c || b==c){
            System.out.println("Hay números iguales, vuelve a introducirlos");
            cad1 = teclado.nextLine();
            cad2 = teclado.nextLine();
            cad3 = teclado.nextLine();
            a = Integer.parseInt(cad1);
            b = Integer.parseInt(cad2);
            c = Integer.parseInt(cad3);
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