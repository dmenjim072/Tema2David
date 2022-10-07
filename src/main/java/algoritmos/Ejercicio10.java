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
public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        // Declaramos variables
        double valor1;
        double valor2;
        double valor3;
        
        // Pedimos los valores con JOption
        String valor1String = JOptionPane.showInputDialog("Introduce el primer valor");
        valor1 = Double.parseDouble(valor1String);
        
        String valor2String = JOptionPane.showInputDialog("Introduce el segundo valor");
        valor2 = Double.parseDouble(valor2String);
        
        String valor3String = JOptionPane.showInputDialog("Introduce el tercer valor");
        valor3 = Double.parseDouble(valor3String);
        
        // Procesos
        
        double trianguloArea = ((valor1 - valor3) * valor2) / 2;
        double rectanguloArea = valor2 * valor3;
        double areaTotal = trianguloArea + trianguloArea;
        
        // Mostramos la solucion con JOption
        JOptionPane.showMessageDialog(null, "El area total de la parcela es: " + areaTotal);
        
    }
    
}
