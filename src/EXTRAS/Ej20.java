/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array");
        int n = leer.nextInt();

        int[] vector = new int[n];

        rellenaV(vector, n);
        mostrarV(vector, n);
    }

    public static void rellenaV(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void mostrarV(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
}
