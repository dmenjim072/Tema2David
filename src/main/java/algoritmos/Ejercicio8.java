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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        final double GINECOLOGIA = 0.4;
        final double TRAUMATOLOGIA = 0.3;
        final double PEDIATRIA = 0.3;
        
        double ginecologiaTotal;
        double traumatologiaTotal;
        double pediatriaTotal;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Presupuesto total");
        double presupuesto = teclado.nextDouble();
        
        double presupuestoGinecologia = GINECOLOGIA * presupuesto;
        double presupuestoTraumatologia = TRAUMATOLOGIA * presupuesto;
        double presupuestoPediatria = PEDIATRIA * presupuesto;
        
        System.out.println("""
                           Con un presupuesto de %.2f €
                           se asigna a ginecologia %.2f €, se asigna a traumatologia %.2f €, se asgina a pediatria %.2f €,
                                                      """);
        
    }
}
