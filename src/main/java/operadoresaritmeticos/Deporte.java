/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresaritmeticos;
/**
 *
 * @author david
 */
import java.util.Scanner;
public class Deporte {
    
    // Solicitar al usuario los minutos que esta corriendo Forest 
    // y el programa me diga la distancia recorrida a 8km/h
    
    public static void main(String [] args){
        
        // Variables y constantes
        final int VELOCIDAD = 8; //km/h
        final double MINUTOS_HORA = 60.0;
        int minutosCorriendo;
        double distanciaRecorrida;
        
        //Creacion del objeto Scanner llamado teclado
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos por teclado  (se podria añadir "%n" al final para hacer un salto de linea)
        System.out.println("Introduce los minutos que esta corriendo: ");
        
        // Usando el teclado y el metodo nextInt vamos a leer un numero entero
        
        minutosCorriendo = teclado.nextInt();
        
        System.out.println("Valor minutosCorriendo: " + minutosCorriendo);
              
        // Proceso
        
        distanciaRecorrida = (minutosCorriendo / MINUTOS_HORA) * VELOCIDAD;
        
        // Mostrar resultados
        
        System.out.println("Ha recorrido " + distanciaRecorrida + " km");
    }
}
