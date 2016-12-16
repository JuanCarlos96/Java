package programacionjava;
import java.util.Scanner;

public class ProgramacionJava {
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        int[] vector;
        vector=new int[5];
        
        for (int i=0; i<5; i++){
            System.out.println("Introduce un valor para el vector: ");
            vector[i]=teclado.nextInt();
        }
    }
}