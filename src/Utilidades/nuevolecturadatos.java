package Utilidades;

import java.util.Scanner;


public class nuevolecturadatos {
    
    private Scanner teclado;
    public final int ERROR = -95327458;

    public nuevolecturadatos() {
        teclado = new Scanner(System.in);
    }
    
    public int leerentero(){
        int num = ERROR;
        
        try{
            System.out.print("Introduce un número:");
            String cadena = teclado.nextLine();
            num = Integer.parseInt(cadena);
        }catch (Exception e){
            System.out.println("ERROR");
        }
        return num;
    }
    
    public int leerenteroobligado(){
        int resultado = ERROR;
        
        do{
            resultado = leerentero();
        }while(resultado==ERROR);
        return resultado;
    }
}