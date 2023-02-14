/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un n° del 1-9 para la escalera");
        num = leer.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }     
        }
        System.out.println(" ");
    }    
}
