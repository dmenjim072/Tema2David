/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author david
 */
public class Ej03 {
    
    public static void main(String[] args) {
        
        // a b
        int a = 10, b = 5, i = 0;
        double c = 71.3, d = 4.8;
        
        // c
        int suma1 = a + b;
        int resta1 = a - b;
        int multiplicacion1 = a * b;
        int division1 = a / b;       
        double suma2 = c + d;
        double resta2 = c - d;
        double multiplicacion2 = c * d;
        double division2 = c / d;
        
        System.out.println("Suma: " + suma1 + " Resta: " + resta1 + 
                " Multiplicacion: " + multiplicacion1 + " Division: " + division1);
        
        // %.xf para que salgan menos decimales
        System.out.printf("Suma %.3f Resta %.4f Multiplicacion %.2f Division %.1f",
                suma2, resta2, multiplicacion2, division2);
        
        
   
        
        // Si quiero decimales dividiendo dos int tengo que forzar
        //que uno de los operadores sea double o float
       //division1 = a/(double)b;
        
        // d  que poner dentro del textblock
        String resultados="""
                          suma1 %d
                          resta1 %d 
                          multiplicacion1 %d
                          division1 %d
                         
                          """.formatted(suma1, resta1, multiplicacion1, 
                                  division1);
        
        System.out.println(resultados);
        
        // e     se suman entre ellos
        System.out.println(a*=3);
        System.out.println(b-=1);
        System.out.println(a/=b);
        System.out.println(c+=d);
        
        // f     se suman entre ellos
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        
        //ejemplo division con resto 
        a = 11;
        b = 5;
        
        int cociente = a/b;
        int resto = a%b;
        
        System.out.println("Cociente " + cociente + " Resto" + resto);
    }
    
}
