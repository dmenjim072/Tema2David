/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author smr1d
 */
public class Ejercicio3 {
    
    public static void main(String[] args){
        
        // Declaramos las variables
        float numero1;
        float numero2;
        float numero3;
        float resultado;
        
        // Pedimos 3 numeros diferentes por teclado con la creacion de los objetos Scanner
        //y los relacionamos con las variables
        Scanner teclado1 = new Scanner(System.in);
        System.out.printf("Introduce el primer numero: ");
        numero1 = teclado1.nextFloat();
        
        Scanner teclado2 = new Scanner(System.in);
        System.out.printf("Introduce el segundo numero: ");
        numero2 = teclado2.nextFloat();
        
        Scanner teclado3 = new Scanner(System.in);
        System.out.printf("Introduce el tercer numero: ");
        numero3 = teclado3.nextFloat();
              
       
        // Realizamos el proceso
        resultado = (numero1 + numero2 + numero3) / 3;
        
        // Mostramos el resultado
        System.out.printf("La media de los tres numeros es: %.2f" ,resultado);
        
        
           
    }
    
}
