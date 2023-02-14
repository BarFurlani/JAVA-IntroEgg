/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package EXTRAS;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
     
        System.out.println("Ingrese un n° para determinar el tamaño del vector");
        int n = leer.nextInt();
        
        int[] vect1 = new int[n];
        int[] vect2 = new int[n];
       
 //completar cada vector
        for (int i = 0; i < n; i++) { 
         vect1[i] = (int)(Math.random()*10); 
         vect2[i] = (int)(Math.random()*10);            
        }
       
        
 //Mostrar 
        System.out.println("Vector 1");
        for (int i = 0; i < n; i++) {
           System.out.print("[" + vect1[i] + "]");                       
        }
        System.out.println("");
        System.out.println("Vector 2");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vect2[i] + "]");
        }
        System.out.println("");
 //recorrer y comparar  
        if (Arrays.equals(vect2, vect1)) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
   }
}




    

