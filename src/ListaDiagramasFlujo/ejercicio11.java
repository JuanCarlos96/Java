/*
DECIR SI UN NÚMERO N ENTERO ES PRIMO O NO
 */
package ListaDiagramasFlujo;
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        System.out.print("Introduce un número:");
        numero = teclado.nextInt();
        
        if(numero==2){
            System.out.println("El número es primo");
        }else{
            if(numero%2==0 || numero%3==0 || numero%4==0 || numero%5==0 || numero%6==0 || numero%7==0 || numero%8==0 || numero%9==0){
                System.out.println("El número no es primo");
            }else{
                System.out.println("El número es primo");
            }
        }
        
    }
}