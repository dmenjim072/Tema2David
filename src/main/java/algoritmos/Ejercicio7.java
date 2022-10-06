/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import javax.swing.JOptionPane;

/**
 *
 * @author smr1d
 */
public class Ejercicio7 {
    
     public static void main(String[] args) {
         
         
         //Conversor euros a dolares
         double euros;
         double dolares;
         
         JOptionPane.showInputDialog("Introduce la cantidad en euros");
         
         dolares = euros * 0.98;
         
         JOptionPane.showMessageDialog(null, "Tu cantidad en dolares es: " + dolares);
}
    
}
