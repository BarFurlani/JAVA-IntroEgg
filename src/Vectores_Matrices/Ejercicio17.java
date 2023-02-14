/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Vectores_Matrices;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String j= "";
        int con1 = 0, con2 = 0, con3 = 0, con4 = 0, con5 = 0, n;
        
        System.out.println("Ingrese un n° para el tamaño del Array");
        n = leer.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese n° de 1 a 5 dígitos");
            vector[i]=leer.nextInt();  //se va llenando con c/n° ingresado
            
            j= String.valueOf(vector[i]); //pasa a String los datos, para poder despues usar
                                          //length y contar los caracteres
                                          
            switch(j.length()){  //permito contar los caracteres y c/n° de caso es el largo
                case 1:
                    con1 += 1;
                    break;
                case 2:
                    con2 += 1;
                    break;
                case 3:
                    con3 += 1;
                    break;   
                case 4:
                    con4 += 1;
                    break;
                case 5:
                    con5 += 1;
                    break;
                default:
                    System.out.println("El numero ingresado es inválido");
            }                                          
        }
        System.out.println("N° de 1 dígito: " + con1);
        System.out.println("N° de 2 dígitos: " + con2);
        System.out.println("N° de 3 dígitos: " + con3);
        System.out.println("N° de 4 dígitos: " + con4);
        System.out.println("N° de 5 dígitos: " + con5);
    }
    
}
