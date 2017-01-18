//Programar un sistema de calefacción-refrigeración que compruebe en función del día
//y el mes la estación en la que estamos y en función de la estación programe la 
//temperatura: Invierno->19º, Primavera->20º, Verano->24º, Otoño->19º

package ListaDiagramasFlujo;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args){
        
        int dia,mes;
        String cad1,cad2;
        boolean bool=false;
        
        Scanner teclado = new Scanner(System.in);
        
        while(!bool){
            System.out.println("Introduce el mes");
            try{
                cad1 = teclado.nextLine();
                mes = Integer.parseInt(cad1);
                
                //if(mes)
            }catch(Exception e){
                
            }
        }
    }
}