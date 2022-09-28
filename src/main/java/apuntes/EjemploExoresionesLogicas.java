/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjemploExoresionesLogicas {

public static void main(String[] args) {    
    
    //Leer por teclado nombre y apellido1 de una persona, edad, peso (kg) y estatura(cm)
    String nombre, apellido;
    int edad, estatura;
    double peso;
    
    Scanner teclado = new Scanner(System.in);
    
    //si hay que leer textos y numeros con scanner
    //primero se leen los textos y al final los numeros
    
    //si lo anterior no es posible, hay que tener en cuenta
    //que despues de leer un numero si vamos a leer un texto
    //hay que limpiar el buffer (teclado.nextLine())
    
    System.out.println("Introduce la edad ");
    edad = teclado.nextInt();
    
    System.out.println("Tu edad es: " + edad);
    
    //limpiar porqueria
    teclado.nextLine();
    nombre = teclado.nextLine();
    System.out.println("Tu nombre es" + nombre);
    
    //Guardar en variables booleanas
    
    //a. Si la edad esta comprendida entre 25 y 25 años incluidos
    boolean a = edad>=25&&edad<=35;
    System.out.println("Edad esta entre 25 y 35?" + a);
    
    //b. El peso es mayor que 50kg o menor o igual que 100kg
    boolean b = peso>50||peso<=100;
    System.out.println("El peso es mayor que 50 o menor igual que 100" + b);
    
    //c. No mide 175cm
    
    //d. La estatura esta entre 100cm y 180cm, excluidos
    
    //e. La edad mas 10 años no supera los 60 años
    
    //f. El nombres es igual a "Pablo", ignorando mayusculas y
    //minusculas. Usa equalsIgnoreCase de los String
    
    //g. El apellido contiene la letra "j". usa contains de los string
    
    //h. El apellido termina en "dez". Usa endsWith de los String
    
    //i. La edad no esta entre 40 y 50 años
    }
}
