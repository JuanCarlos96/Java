package Utilidades;

import java.util.Scanner;

public class LecturaDatos {
    
    Scanner teclado;
    public final int ERROR = -900000;

    public LecturaDatos() {
        this.teclado = new Scanner(System.in);
    }
    
    public int introducirEntero(){
        String cadena;
        int num = 0;
        boolean bool=false;
  
        while(!bool){
            System.out.print("Introduce un número:");
            try{
                cadena = teclado.nextLine();
                num = Integer.parseInt(cadena);
                bool = true;
            }catch (Exception e){
                System.out.println("ERROR");
            }
        }
        
        return num;
    }
}