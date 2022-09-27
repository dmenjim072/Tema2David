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
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        double gradosCentigrados;
        double gradosFarenheit;
        
                
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("introduce una cantidad de grados centigrados: ");
        
        gradosCentigrados = teclado.nextDouble();       // Se usa para relacionar la variable con el numero que pedimos
        
        gradosFarenheit = (gradosCentigrados * 1.8) + 32;
        
        System.out.println("El resultado es: " + gradosFarenheit + "°F");
    }
    
}
