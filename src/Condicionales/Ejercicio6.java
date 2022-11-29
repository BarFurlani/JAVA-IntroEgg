package Condicionales;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     * Crear un programa que dado un numero determine si es par o impar.
     */
    public static void main(String[] args) {
        System.out.println("ingrese un n° entero");
        int num, mod;
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        mod = num % 2; 
       
        if(mod == 0){
                System.out.println("Es par");
        
    } else{
            System.out.println("Es impar");
        }
       
        
    
    }
    
}
