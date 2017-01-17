//AÑOS, MESES Y DIAS DE UN NUMERO DE DIAS

package ListaDiagramasFlujo;
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int numero,años,modaños,meses,modmeses,dias;
        
        System.out.print("Introduce el número de días: ");
        numero = teclado.nextInt();
        
        años = numero/365;
        modaños = numero%365;
        
        meses = modaños/30;
        modmeses = modaños%30;
        
        dias = modmeses;
        
        System.out.println(años+" año(s), "+meses+" mes(es) y "+dias+" día(s)");
    }
}