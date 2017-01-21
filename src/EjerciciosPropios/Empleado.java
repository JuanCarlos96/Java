package EjerciciosPropios;

import java.util.Scanner;

public class Empleado {
    
    private Scanner teclado;
    private String nombre,dinero;
    private int sueldo;

    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.print("Introduzca nombre del empleado: ");
        nombre = teclado.nextLine();
        System.out.print("Introduzca sueldo del empleado: ");
        dinero = teclado.nextLine();
        sueldo = Integer.parseInt(dinero);
    }
    
    public void imprimir(){
        System.out.println("El nombre del empleado es: "+nombre);
        System.out.println("El sueldo del empleado es: "+sueldo);
    }
    
    public void impuestos(){
        if(sueldo>3000){
            System.out.println("El empleado deberá pagar impuestos");
        }else{
            System.out.println("El empleado no deberá pagar impuestos");
        }
    }
    
    public static void main(String[] args){
        Empleado empleado;
        empleado = new Empleado();
        empleado.inicializar();
        empleado.imprimir();
        empleado.impuestos();
    }
}