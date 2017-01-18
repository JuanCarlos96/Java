//ADIVINAR UN NÚMERO A BASE DE INTENTARLO

package ListaDiagramasFlujo;

import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        
        int numero;
        String cadena;

        Scanner in = new Scanner(System.in);
        Random r = new Random();

        int adivinar = r.nextInt(10)+1;
        boolean encontrado = false, bool=false;

        while(!bool){
            while (!encontrado) {
                try {
                    System.out.print("Introduzca un número: ");
                    cadena = in.nextLine();            

                    numero = Integer.parseInt(cadena);

                    if (numero==adivinar) {
                        System.out.println("¡Has acertado!");
                        encontrado = true;
                    }else{
                        System.out.println("Prueba otra vez");
                    }
                    bool=true;
                }catch (Exception e) {
                    System.out.println("El dato introducido no es un número.");
                }
            }
        }
    }
}