/*
MOSTRAR LA TABLA DE MULTIPLICAR DE UN NÚMERO
 */
package ListaDiagramasFlujo;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int numero,mult;
        
        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();
        
        System.out.println("TABLA DEL "+numero);
        for(int i=1; i<=10; i++){
            mult=numero*i;
            System.out.println(numero+" x "+i+" = "+mult);
        }   
    }
}