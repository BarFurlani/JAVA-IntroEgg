/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores_Matrices;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int matrizA[][] = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        int matrizN[][] = {{36, 5, 67,},{89, 90, 75},{14, 22, 26}}; 
        
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matrizA[i][j] + "]" );
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               System.out.print("[" + matrizN[i][j] + "]" );
            }
            System.out.println("");
        }
    }
        
        
        int posicionDeElementoBuscado = existeEnArreglo(matrizA, matrizN);
	if (posicionDeElementoBuscado == -1) {
		System.out.println("El elemento NO existe en el arreglo");
	} else {
		System.out.println("El elemento existe en la posición: " + posicionDeElementoBuscado);
	}
        
        
        
    }
   public static int existeEnArreglo(int[] arreglo, int busqueda) {
		for (int x = 0; x < arreglo.length; x++) {
			if (arreglo[x] == busqueda) {
				return x;
			}
		}
		return -1;
	} 
}
