/*
MÁXIMO Y MÍNIMO DE UNA LISTA DE NÚMEROS INTRODUCIDA POR EL USUARIO
 */
package ListaDiagramasFlujo;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int cant, num, max=-9999999, min=9999999;
        
        System.out.println("Introduzca la cantidad de la lista de números");
        cant = teclado.nextInt();
        
        System.out.println("Introduzca los números");
        for(int i=1; i<=cant; i++){
            num = teclado.nextInt();
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        
        System.out.println("El mayor de todos los números es: "+max);
        System.out.println("El menor de todos los números es: "+min);
    }
}