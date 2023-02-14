/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Vectores_Matrices;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio20 {

    /**

     * @param args
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int contador = 0;
        int suma1 = 0, suma2 = 0, sumacol = 0, sumafil = 0, sumaant = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                 System.out.println("Ingrese números del 1-9 para crear una matríz mágica");
               matriz[i][j] = leer.nextInt();  
                                                  
                    sumafil += matriz[i][j];
                    
                     if(i==j){   
                     suma1 +=  matriz[i][j];      
                     }  if(j==(2-i)){                    
                        suma2 += matriz[i][j];     
                                    
                 }
            }
         if(i == 0){
             sumaant = sumafil;
         }else{
            if(sumaant != sumafil){
                sumaant = 0;
            } 
         }
          sumafil = 0;     
        }
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {   
                sumacol += matriz[i][j];    
            }  
            if(sumaant != sumacol){
                sumaant = 0;
            }  
            sumacol = 0;
        }
   
        
        //System.out.println("La suma de la diagonal 1 es: " + suma1);
        //System.out.println("La suma de la diagonal 2 es: " + suma2);
        //System.out.println("columna " + sumacol);
        //System.out.println("fila " + sumafil);
          
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                 System.out.print("[ " + matriz[i][j] + " ]" );
                    
            }
            System.out.println("");     
        }
       
        if((suma1==suma2) && (suma1 == sumaant)){
            System.out.println("El cubo es mágico!!");
        } else{
            System.out.println("Volve a intentarlo");
        }
    }    
}
