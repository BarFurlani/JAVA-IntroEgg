/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package BuclesYsentencias;

import java.util.Scanner;

/**
 * 
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un número para el tamaño del cuadrado");
        num = leer.nextInt();
        
        if (num >= 2 && num < 50){
            //linea superior del cuadrado
            for (int i = 0; i < num; i++) {
                System.out.print("*");  //sin el "ln]" para que no haga salto de linea
            }
            System.out.println("");
            
            //laterales
            for (int i = 0; i < num-2; i++) {
                System.out.print("*");
                for (int j = 0; j < num-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            
            //linea inferior del cuadrado
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println(""); 
        }
        
    }
    
}
