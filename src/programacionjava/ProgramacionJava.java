package programacionjava;
import java.util.Scanner;
import java.util.Random;

public class ProgramacionJava {
    public static void main(String[] args) {
        
        //Inicializo las clases y les doy un nombre para luego usarlas
        Scanner teclado = new Scanner(System.in);
        Random rnd = new Random();
        
        //Declaro las variables
        String pregunta;
        int aleatorio;
        
        System.out.println("Pregúntame");
        pregunta= teclado.nextLine();
        
        aleatorio = rnd.nextInt(2)+1;
        
        if (aleatorio==1){
            System.out.println("Sí");
        }else{
            System.out.println("No");
        }
        
    }
}