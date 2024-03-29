/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int num, aux = 0;
        
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        
        do {
           num /= 10; 
           aux ++;
        } while (num%10 != 0 || num == 10);
        
        System.out.println("El numero posee " + aux + " dígitos");
        
        
        
    }
    
}
