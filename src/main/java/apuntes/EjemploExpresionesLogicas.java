/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import java.util.Arrays;
import java.util.Scanner;
import jdk.dynalink.NamespaceOperation;

/**
 *
 * @author david
 */
public class EjemploExpresionesLogicas {

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
    System.out.println("Introduce el peso ");
    peso = teclado.nextDouble();
    System.out.println("Tu peso es: " + peso);
    System.out.println("Introduce la estatura ");
    estatura = teclado.nextInt();
    System.out.println("Su estatura es: " + estatura);
    
    //limpiar porqueria
    teclado.nextLine(); //Ponerlo por si acaso
    System.out.println("Introduce tu nombre ");
    nombre = teclado.nextLine();
    System.out.println("Tu nombre es: " + nombre);
    System.out.println("Introduce tu apellido");
    apellido = teclado.nextLine();
    System.out.println("Tu apellido es: " + apellido);
    
    //Guardar en variables booleanas
    
    //a. Si la edad esta comprendida entre 25 y 25 años incluidos
    boolean a = edad>=25&&edad<=35;
    System.out.println("Edad esta entre 25 y 35?" + a);
    
    //b. El peso es mayor que 50kg o menor o igual que 100kg
    boolean b = peso>50||peso<=100;
    System.out.println("¿El peso esta entre 50 y 100*?" + b);
    
    //c. No mide 175cm
    boolean c = estatura!=175;
    System.out.println("¿La estatura es diferente a 175 cm?" + c);
    
    //d. La estatura esta entre 100cm y 180cm, excluidos
    boolean d = estatura>100&&estatura<180;
    System.out.println("¿Estatura entre 100 y 180?" + d);
    
    //e. La edad mas 10 años no supera los 60 años
    boolean e = edad+10<60;
    System.out.println("¿La edad + 10 es menor que 60 años?" + e);
    
    //f. El nombres es igual a "Pablo", ignorando mayusculas y
    //minusculas. Usa equalsIgnoreCase de los String
    boolean f = (nombre.equalsIgnoreCase("Pablo"));
    System.out.println("¿Es el nombre igual a Pablo?" + f);
    
    //g. El apellido contiene la letra "j". usa contains de los string
    boolean g = apellido.contains("j");
    System.out.println("¿El apellido contiene la letra j?" + g);
    
    //h. El apellido termina en "dez". Usa endsWith de los String
    boolean h = apellido.endsWith("dez");
    System.out.println("¿El apellido termina en dez?" + h);
    
    //i. La edad no esta entre 40 y 50 años
    boolean i = edad>40!=edad<50;
    System.out.println("¿Esta la edad fuera del rango de edad entre 40 y 50 años?" + i);
    }
}
