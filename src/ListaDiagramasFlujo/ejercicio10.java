//LEER DOS NÚMEROS Y ORDENARLOS DE MAYOR A MENOR

package ListaDiagramasFlujo;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int a,b;
        String cad1,cad2;
        boolean bool=false;
        
        while(!bool){
            try{
                do{
                    System.out.println("Introduce dos números");
                    cad1 = teclado.nextLine();
                    cad2 = teclado.nextLine();
                    a = Integer.parseInt(cad1);
                    b = Integer.parseInt(cad2);
                    
                    if(a==b){
                        System.out.println("Los números son iguales, vuelve a introducirlos");
                    }
                }while(a==b);

                if(a<b){
                    System.out.println(b+" > "+a);
                }else{
                    System.out.println(a+" > "+b);
                }
                bool=true;
            }catch(Exception e){
                System.out.println("¡ERROR! Uno o más datos no son un número");
            }
        }
    }
}