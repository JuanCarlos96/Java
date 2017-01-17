//MOSTRAR LA TABLA DE MULTIPLICAR DE UN NÚMERO

package ListaDiagramasFlujo;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int numero,mult;
        String cad;
        
        System.out.print("Introduce un número: ");
        
        try{
        cad = teclado.nextLine();
        numero = Integer.parseInt(cad);
        
        System.out.println("TABLA DEL "+numero);
        for(int i=1; i<=10; i++){
            mult=numero*i;
            System.out.println(numero+" x "+i+" = "+mult);
        }
        }catch (Exception e){
            System.out.println("¡ERROR! El dato introducido no es un número");
        }
    }
}