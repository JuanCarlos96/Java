package Utilidades;

import java.util.Scanner;

public class LecturaDatos {
    
    Scanner teclado;
    public final int ERROR = -900000;

    public LecturaDatos() {
        this.teclado = new Scanner(System.in);
    }
    
    public int introducirEntero(){
        int entero = 0;
        String cadena;
        
        try{
            cadena = teclado.nextLine();
            entero = Integer.parseInt(cadena);
        }catch (Exception e){
            System.out.println("ERROR");
        }
        
        return entero;
    }
}