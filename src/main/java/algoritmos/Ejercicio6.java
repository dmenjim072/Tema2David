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
public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        //Calcular el porcentaje de inversion de cada uno
    
        // Declaramos las variables
         double inversion1;
         double inversion2;
         double inversion3;
         
         double porcentaje1;
         double porcentaje2;
         double porcentaje3;
         
         double sumaTotal;
         
         
       // Con JOption pedimos los valores de las inversiones de cada uno  
        String inversion1String = JOptionPane.showInputDialog("Introduce la primera inversion");
                 
        inversion1 = Double.parseDouble(inversion1String);
        
        String inversion2String = JOptionPane.showInputDialog("Introduce la segunda inversion");
                 
        inversion2 = Double.parseDouble(inversion2String);
        
        String inversion3String = JOptionPane.showInputDialog("Introduce la tercera inversion");
                 
        inversion3 = Double.parseDouble(inversion3String);
        
        //Procesos
        sumaTotal = inversion1 + inversion2 + inversion3;   
     
        porcentaje1 = (inversion1 * 100) / sumaTotal;
        porcentaje2 = (inversion2 * 100) / sumaTotal;
        porcentaje3 = (inversion3 * 100) / sumaTotal;
                     
      
        //Mostramos resultados
        JOptionPane.showMessageDialog(null, "La primera inversion es " + porcentaje1 
        + "La segunda inversion es" + porcentaje2 + "La tercera inversion es" + porcentaje3);
    }
    
}
