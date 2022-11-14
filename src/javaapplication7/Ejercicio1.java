/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese dos números enteros, para calcular su suma");
        int num1, num2, suma;
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        num2 = leer.nextInt();
         
        suma = num1 + num2;
       
        System.out.println("La suma de los números es: " + suma);
        
    }
    
}
