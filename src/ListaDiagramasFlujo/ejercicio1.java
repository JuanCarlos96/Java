//COMPROBAR SI UN NÚMERO ES +,- Ó 0

package ListaDiagramasFlujo;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int a;
        String cad;
        boolean bool=false;
        
        while(!bool){
            System.out.print("Introduzca un número:");
            try {
                cad = teclado.nextLine();
                a = Integer.parseInt(cad);

                if(a<0){
                    System.out.println("El número es negativo");
                }else{
                    if(a>0){
                        System.out.println("El número es positivo");
                    }else{
                        System.out.println("El número es un cero");
                    }
                }
                bool=true;
            }catch (Exception e){
                System.out.println("¡ERROR! El dato introducido no es un número");
            }
        }
    }
}