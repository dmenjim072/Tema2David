/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

/**
 *
 * @author smr1d
 */
public class ejer6 {
    
    public static void main(String[] args) {
        
        // Es falso porque false && false = falso, pero funciona
        boolean adivina = ((83 == 'a') && false);
		System.out.println(adivina);
        
        // Es verdadero porque a = 97 en unicode y lo muestra en el System.out
        int a = 'a';
		System.out.println(a);
        
        // No funciona porque es una variable int en vez de una double
        int number = 2.14;
		System.out.println(number);
        
        // No funciona porque la variable double tiene que ponerse con un . en vez de ,
        double pi = 3,14;
		System.out.println(pi);
        
        // Funciona y es verdadero porque hace un boolean a 1=1
        boolean test = (1==1);
		System.out.println(test);
    }
}
