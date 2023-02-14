/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package Vectores_Matrices;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int j=0, cont =0;
        
        System.out.println("Ingrese un número para la dimención del arreglo");
        int n=leer.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {               //llena el array
            vector [i]= (int)(Math.random()*10);
        }
        
        for (int i = 0; i < n; i++) {              //muestra el array
            System.out.print("["+ String.valueOf(vector[i] + "]" + " " ));
        }
        System.out.println("");
        System.out.println("Ingrese un n° para buscarlo en el Array");
        int buscar = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == buscar) {
                cont +=1;
                j=i;    
            }  
        }
        
        System.out.println("El n° está en la posición: " + j + ", se repite " + cont + " veces.");
    }
    
}
