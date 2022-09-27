/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import java.util.Scanner;
/**
 *
 * @author david
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        // Declaramos las variables necesarias
        double radio;
        double longitud;
        double area;
        double volumen;
        final double PI = 3.14;
        
        // Creamos el objeto Scanner y pedimos el radio de la circunferencia
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el valor del radio de la circunferencia: ");
        
        radio = teclado.nextDouble();
        
        // Realizamos el proceso con las formulas 
        longitud = 2 * PI * radio;
        area = PI * Math.pow(radio, 2); //math.pow sirve para elevar un numero al cuadrado
        volumen = 1.33 * PI * Math.pow(radio, 3);
        
        // Mostramos los resultados con print
        System.out.printf("El valor de la longitud es: %.2f", + longitud);
        System.out.println("El valor del area es: " + area);
        System.out.printf("El volumen de la circunferencia es: %.3f", volumen);
        
        }
}
