package EjerciciosPropios;

import java.util.Scanner;

public class Operaciones {
    
    public void principal(){
        Scanner teclado = new Scanner(System.in);
        int num1,num2;
        String cadena;
        
        System.out.print("Introduce un entero: ");
        cadena = teclado.nextLine();
        num1 = Integer.parseInt(cadena);
        System.out.print("Introduce otro entero: ");
        cadena = teclado.nextLine();
        num2 = Integer.parseInt(cadena);
        
        int suma = sumar(num1,num2);
        System.out.println("La suma de los enteros es "+suma);
        
        int resta = restar(num1,num2);
        System.out.println("La resta de los enteros es "+resta);
        
        int multiplicacion = multiplicar(num1,num2);
        System.out.println("La multiplicación de los enteros es "+multiplicacion);
        
        double division = dividir(num1,num2);
        System.out.println("La division de los enteros es "+division);
    }
    
    public int sumar(int a, int b){
        int suma = a+b;
        return suma;
    }
    
    public int restar(int a, int b){
        int resta = a-b;
        return resta;
    }
    
    public int multiplicar(int a, int b){
        int multiplicacion = a*b;
        return multiplicacion;
    }
    
    public double dividir(int a, int b){
        double division = a/b;
        return division;
    }
    
    public static void main(String[] args){
        
        Operaciones operaciones;
        operaciones = new Operaciones();
        operaciones.principal();
        
    }
}
