/*
ADIVINAR UN NÚMERO A BASE DE INTENTARLO
*/
package ListaDiagramasFlujo;

import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        Random rnd = new Random();
        
        int a,aleatorio;
        
        aleatorio = rnd.nextInt(10)+1;
        
        System.out.println("Escribe un número para averiguarlo(entre 1 y 10)");
        a = teclado.nextInt();
        
        while(a!=aleatorio){
            System.out.println("Has fallado, inténtalo de nuevo");
            a = teclado.nextInt();
        }
        
        System.out.println("Has acertado, ¡enhorabuena!");
    }
}