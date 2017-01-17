//SUMA DE PARES E IMPARES HASTA UN NÚMERO N

package ListaDiagramasFlujo;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int a,par,impar,sumapar=0,sumaimpar=0;
        String cad;
        
        System.out.println("Introduce un número");
        
        try{
            cad = teclado.nextLine();
            a = Integer.parseInt(cad);

            for(int i=1; i<=a; i++){
                if(i%2==0){
                    par=i;
                    sumapar+=par;
                }else{
                    impar=i;
                    sumaimpar+=impar;
                }
            }
            System.out.println("La suma de los pares hasta "+a+" es "+sumapar);
            System.out.println("La suma de los impares hasta "+a+" es "+sumaimpar);
        }catch (Exception e){
            System.out.println("¡ERROR! El dato introducido no es un número");
        }
    }
}