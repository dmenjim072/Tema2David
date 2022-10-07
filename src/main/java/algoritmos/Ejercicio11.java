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
public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        // Declaramos variables
        double valorR;
        double valorH;
        
        // Pedimos los valores con JOption
        String valorRString = JOptionPane.showInputDialog("Introduce el valor de R");
        valorR = Double.parseDouble(valorRString);
        
        String valorHString = JOptionPane.showInputDialog("Introduce el valor de H");
        valorH = Double.parseDouble(valorHString);
        
        // Procesos
        final double PI = Math.PI;
        
        double semicirculoArea = (PI * Math.pow(valorR,2)) / 2;
        double trianguloAltura = Math.sqrt(Math.pow(valorH, 3) - Math.pow(valorR,2));
        double trianguloArea = ((valorR * 2) * trianguloAltura) / 2;
        double areaTotal = semicirculoArea + trianguloArea;
        
        // Mostramos la solucion con JOption
        JOptionPane.showMessageDialog(null, "El area total de la figura es: " + areaTotal);
        
    }
    
}
