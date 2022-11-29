/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     */
    public static void main(String[] args) {
       System.out.println("Ingrese una letra"); 
       Scanner leer = new Scanner(System.in);
       char vocal = leer.next().charAt(0);
 
       if((Character.toLowerCase(vocal) == 'a') || (Character.toLowerCase(vocal) == 'e') || (Character.toLowerCase(vocal) == 'i') || (Character.toLowerCase(vocal) == 'o') || (Character.toLowerCase(vocal) == 'u')){

           System.out.println("La letra es una vocal");
        
    } else {
           System.out.println("La letra no es una vocal");
       }
    }}
