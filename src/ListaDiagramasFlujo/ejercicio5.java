//DECIR EL MAYOR DE 2 NÚMEROS, SI SON IGUALES VOLVER A PEDIR LOS NÚMEROS

package ListaDiagramasFlujo;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int a,b;
        String cad1,cad2;
        
        System.out.println("Introduce dos números:");

        try{
            do{
                cad1 = teclado.nextLine();
                cad2 = teclado.nextLine();
                a = Integer.parseInt(cad1);
                b = Integer.parseInt(cad2);
            }while(a==b);

            if(a>b){
                System.out.println(a+" es mayor que "+b);
            }else{
                if(a<b){
                    System.out.println(b+" es mayor que "+a);
                }else{
                    System.out.println("Los números son iguales, vuelve a introducirlos:");
                }
            }
        }catch (Exception e){
            System.out.println("Error, uno o varios datos no son un número");
        }
    }
}