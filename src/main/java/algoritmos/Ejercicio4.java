/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        double precioMinimo = 125; //Centimos
        double kmRecorrido;
        double precioKm;
        
        
        String kmRecorridoString = JOptionPane.showInputDialog("Introduce la distancia en kms");
        
        
        kmRecorrido = Double.parseDouble(kmRecorridoString);
        
        precioKm = kmRecorrido * 8 + 125;
        
        JOptionPane.showMessageDialog(null, "El precio en centimos es: " + precioKm);
        
        
    }
}
