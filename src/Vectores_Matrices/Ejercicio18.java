/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package Vectores_Matrices;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double [][] matriz = new double [4][4];
        int [][] matrizT = new int [4][4];
        
        //asignación valores
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = Math.floor(Math.random()*10);
            }
        }
        
        //imprimir matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //transponer la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[i][j]= (int) matriz[j][i];
            }            
        }
        
        //imprimir
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizT[i][j] + "]");
            }   
            System.out.println("");
        }
    }  
}
