/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt()
     */
    public static void main(String[] args) {
    
        System.out.println("Ingrese un n° entero positivo");
        int numero, doble, triple, raiz;
        Scanner leer = new Scanner(System.in);
        numero = leer.nextInt();
        
        doble = numero * 2;
        triple = numero * 3;
        raiz = (int) (Math.sqrt(numero));
        
        System.out.println("El doble es: " + doble);
        System.out.println("El triple es: " + triple);
        System.out.println("La raiz es: " + raiz);
    }
    
}
