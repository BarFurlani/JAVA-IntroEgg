/*
Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un n° para realizar una secuencia Fibonacci");
        int Fibonacci = leer.nextInt(), f1 = 1, f2 =1;
        int[] vector = new int[Fibonacci];
        
        for (int i = 0; i < Fibonacci; i++) {
            if (i<2) {
                vector[i] = 1;
            } else {
                vector[i] = f1 + f2;
                f1 = f2;
                f2 = vector[i];
            }
        }
        
        for (int i = 0; i < Fibonacci; i++) {
            if (i == 0) {
                System.out.print(vector[i]);
            } else{
                System.out.print(", " + vector[i]);
            }   
        }
        System.out.println("");         
    }    
}
