//COMPARAR N NÚMEROS Y DECIR CUÁL ES EL MAYOR DE TODOS SIN IMPORTAR SI SON IGUALES

package ListaDiagramasFlujo;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int a,cant,max=-9999999;
        String cad1,cad2;
        
        System.out.println("Introduce cantidad de números a comparar");
        cad1 = teclado.nextLine();
        cant = Integer.parseInt(cad1);
        
        System.out.println("Introduzca los números:");
        
        for(int i=1; i<=cant; i++){
            cad2 = teclado.nextLine();
            a = Integer.parseInt(cad2);
            if(a>max){
                max=a;
            }
        }
        System.out.println("El mayor de todos los números introducidos es: "+max);
    }
}