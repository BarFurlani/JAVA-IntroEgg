/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package BuclesYsentencias;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número. Este será nuestro límite");
        
        int limite = leer.nextInt();
        int  suma = 0;
        do{
            System.out.println("Ingrese un n°");
            int num = leer.nextInt();
                
           suma = suma + num;
                    
        }while(limite>suma);
        
        System.out.println(suma);
        System.out.println("La suma de los n° superó el límite");
        
    }
    
}
