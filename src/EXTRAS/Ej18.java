/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
 N, con los valores ingresados por el usuario.
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Escriba cuantos números quiere crear para sumarlos entre si");
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        //Me permite completar el vector
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un n°");
            vector[i]= leer.nextInt();
        }
        int suma = 0;
        
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }
        System.out.println("La suma de los n° ingresados es [" + suma +"].");
    }
    
}
