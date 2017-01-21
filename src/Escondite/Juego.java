package Escondite;

import Escondite.Parámetros;

public class Juego {
    public static void main(String[] args){
        
        Parámetros escondite;
        escondite = new Parámetros();
        escondite.inicializar();
        escondite.generarYBuscarJugadores();
        
    }
}