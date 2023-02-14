
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese un  tiempo en minutos. Ej: 1600");
        Scanner leer = new Scanner(System.in);
        double minutos, horas, dias;
        minutos =leer.nextInt();
        
           // dias = (minutos/60)/24;
           // horas = (minutos/60)%24;  
            
        System.out.println("Equivale a: " + ((minutos/60)/24)  + " días, y " + ((minutos/60)%24) +" horas.");
      
    }
    
}
