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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla
     */
    public static void main(String[] args) {
     
        System.out.println("Escriba su nombre");
        String cadena = "nombre";
        Scanner leer = new Scanner (System.in);   
        String nombre = leer.next();
        
        System.out.println("Su nombre es " + nombre);         
                
        
    }
    
}
