//CONTAR DESDE 1 HASTA UN NÚMERO DADO POR EL USUARIO

package ListaDiagramasFlujo;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int a;
        String cad;
        
        System.out.print("Escribe un número: ");
        cad = teclado.nextLine();
        a = Integer.parseInt(cad);
        
        for(int i=1; i<=a; i++){
            System.out.println(i);
        }
    }
}