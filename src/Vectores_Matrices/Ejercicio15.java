/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package Vectores_Matrices;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] vector = new int[100];
        
        for (int i = 0; i < 100; i++) {
            vector[i]= i+1;
        }
        
        for (int i = 0; i < 100; i++) {
            System.out.print("[" + i +"]");
        }
        
        System.out.println("");
        
        //para ver el vector en forma decreciente
        for (int i = vector.length-1; i >= 0; i--) {
            System.out.print("[" + i + "]"); 
        }
    }
    
}
