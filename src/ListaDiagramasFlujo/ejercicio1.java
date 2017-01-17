//COMPROBAR SI UN NÚMERO ES +,- Ó 0

package ListaDiagramasFlujo;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int a;
        
        try {
            System.out.println("Introduzca un número");
            a = teclado.nextInt();

            if(a<0){
                System.out.println("El número es negativo");
            }else{
                if(a>0){
                    System.out.println("El número es positivo");
                }else{
                    System.out.println("El número es un cero");
                }
            }
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}