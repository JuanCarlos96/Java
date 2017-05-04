package EjerciciosPropios;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anio;
        System.out.print("Introduzca un año: ");
        anio=teclado.nextInt();
        float mod=anio%4;
        float mod2=anio%100;
        float mod3=anio%400;
        if(mod2==0) {
            if(mod3==0) {
                System.out.println("El año es bisiesto");
            }else {
                System.out.println("El año no es bisiesto");
            }
        }else {
            if(mod==0) {
                System.out.println("El año es bisiesto");
            }else {
                System.out.println("El año no es bisiesto");
            }
        }
    }
}