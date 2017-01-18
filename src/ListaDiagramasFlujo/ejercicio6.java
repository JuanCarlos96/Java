//DECIR EL MAYOR DE 3 NÚMEROS, SI ALGUNO ES IGUAL A OTRO, VOLVER A PEDIRLOS

package ListaDiagramasFlujo;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int a,b,c;
        String cad1,cad2,cad3;
        boolean bool=false;
        
        while(!bool){
            try{
                do{
                    System.out.println("Introduce tres números:");
                    cad1 = teclado.nextLine();
                    cad2 = teclado.nextLine();
                    cad3 = teclado.nextLine();
                    a = Integer.parseInt(cad1);
                    b = Integer.parseInt(cad2);
                    c = Integer.parseInt(cad3);

                    if(a==b || b==c || a==c){
                        System.out.println("Uno o más números son iguales");
                    }
                }while(a==b || b==c || a==c);

                if(a>b && a>c){
                    System.out.println(a+" es mayor que "+b+" y "+c);
                }else{
                    if (b>a && b>c){
                        System.out.println(b+" es mayor que "+a+" y "+c);
                    }else{
                        System.out.println(c+" es mayor que "+a+" y "+b);
                    }
                }
                bool=true;
            }catch (Exception e){
                System.out.println("Uno o más datos introducidos no son un número");
            }
        }
    }
}