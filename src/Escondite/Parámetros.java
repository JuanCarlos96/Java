package Escondite;

import java.util.Random;
import java.util.Scanner;

public class Parámetros {
    
    private Random r;
    private Scanner teclado;
    private int jugadores,jugador,aleatorio,cont=0;
    private String cadena;
    private boolean bool=false,bool2=false;

    public Parámetros() {
        teclado = new Scanner(System.in);
    }
    
    public void inicializar(){
        while(!bool2){
            try{
                System.out.print("Introduzca el número de jugadores: ");
                cadena = teclado.nextLine();
                jugadores = Integer.parseInt(cadena);
                bool2=true;
            }catch(Exception e){
                System.out.println("El dato introducido no es un número");
//                System.out.println(e.getClass().toString());
            }
        }
    }
    
    public void generarYBuscarJugadores(){
        do{
            r = new Random();
            aleatorio = r.nextInt(jugadores)+1;
                try{
                    do{
                        System.out.print("Introduce el jugador a buscar: ");
                        cadena = teclado.nextLine();
                        jugador = Integer.parseInt(cadena);
                        if(jugador==aleatorio){
                            System.out.println("Lo has encontrado");
                            bool=true;
                            cont++;
                        }else{
                            System.out.println("No lo has encontrado");
                        }
                        System.out.println("Número de jugadores encontrados: "+cont);
                        System.out.println("Número de jugadores que quedan por encontrar: "+(jugadores-cont));
                        System.out.println("--------------------------------------------------------------");
                        System.out.println();
                    }while(bool=false);
                }catch(Exception e){
                    System.out.println("El dato introducido no es un número");
//                    System.out.println(e.getClass().toString());
                }
        }while(cont!=jugadores);
    }
}