/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import java.util.Scanner;

/**
 *
 * @author smr1d
 */
public class Ej14 {
    
    public static void main(String[] args) {
        int tiempoSegundos;
        double tiempoMinutos;
        double tiempoHoras;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de segundos: ");
        tiempoSegundos = teclado.nextInt();
        
        tiempoMinutos = tiempoSegundos / 60;
        tiempoHoras = tiempoMinutos / 60;
        
        System.out.println("La cantidad en segundos es: " + tiempoSegundos);
        System.out.printf("La cantidad en minutos es: %.2f %n" , tiempoMinutos);
        System.out.printf("La cantidad en horas es: %.2f" , tiempoHoras);
    }
    
}
