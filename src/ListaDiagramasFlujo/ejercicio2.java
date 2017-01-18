//CONTAR DESDE 1 HASTA UN NÚMERO DADO POR EL USUARIO

package ListaDiagramasFlujo;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int a;
        String cad;
        boolean bool=false;
        
        while(!bool){
            System.out.print("Escribe un número: ");
            try{
            cad = teclado.nextLine();
            a = Integer.parseInt(cad);

            for(int i=1; i<=a; i++){
                System.out.println(i);
            }
            bool=true;
            }catch(Exception e){
                System.out.println("¡ERROR! El dato introducido no es un número");
            }
        }
    }
}