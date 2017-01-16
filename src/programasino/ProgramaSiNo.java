package programasino;
import java.util.Scanner;
import java.util.Random;

public class ProgramaSiNo {
    public static void main(String[] args) {
        
        //Inicializo las clases y les doy un nombre para luego usarlas
        Scanner teclado = new Scanner(System.in);
        Random rnd = new Random();
        
        //Declaro las variables
        String pregunta;
        int aleatorio;
        
        System.out.println("Pregúntame(Fin para terminar)");
        pregunta= teclado.nextLine();
        
        while (!(pregunta.equals("Fin"))){
            aleatorio = rnd.nextInt(6)+1;

            if (aleatorio==1){
                System.out.println("Sí");
            }else{
                if (aleatorio==2){
                    System.out.println("No");
                }else{
                    if (aleatorio==3){
                        System.out.println("No lo sé, no soy 100tífiko");
                    }else{
                        if (aleatorio==4){
                            System.out.println("Claro que sí guapi");
                        }else{
                            if (aleatorio==5){
                                System.out.println("Posiblemente");
                            }else{
                                System.out.println("Aún no te lo puedo decir");
                            }
                        }
                    }
                }
            }
            System.out.println("Pregúntame(Fin para terminar)");
            pregunta= teclado.nextLine();
        }
        
        System.out.println("Adiós");
    }
}