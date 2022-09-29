/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresbooleanos;

/**
 *
 * @author david
 */
public class Ej05 {
    
    public static void main(String[] args) {
    
        // a
        boolean verdadero = true;
        boolean falso = false;
        
        // b
        System.out.println("Verdadero AND Verdadero es: " + (verdadero&&verdadero));
        System.out.println("Verdadero AND Falso es: " + (verdadero&&falso));
        System.out.println("Falso AND Verdadero es: " + (falso&&verdadero));
        System.out.println("Falso AND Falso es: " + (falso&&verdadero));
        System.out.println("Verdadero OR Verdadero: " + (verdadero||verdadero));
        System.out.println("Verdadero OR Falso: " + (verdadero||falso));
        System.out.println("Falso OR Verdadero: " + (falso||verdadero));
        System.out.println("Falso OR Falso: " + (falso||falso));
        }
}
