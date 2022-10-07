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
public class Ejercicio5 {
    
     public static void main(String[] args) {
    
         final int HORASCLASE = 30;
         
        int numeroGrupos;
        int horasImpartidas;
        int profesoresNecesarios;
         
        String horasString = JOptionPane.showInputDialog("Introduce las horas que va a trabajar el profesor");
        horasImpartidas = Integer.parseInt(horasString);
        
        String numeroGruposString = JOptionPane.showInputDialog("Introduce el numero de grupos");
        numeroGrupos = Integer.parseInt(numeroGruposString);
        
        
        int numeroProfesores = (HORASCLASE * numeroGrupos) / horasImpartidas;
        
        JOptionPane.showMessageDialog(null, "Se necesitan" + numeroProfesores + " profesores");
              
         
    }
}
