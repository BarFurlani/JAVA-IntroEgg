
package EjerciciosAprendizaje;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
       
        System.out.println("Ingrese la T° en °C");
        int temperatura, fahrenheint;
        Scanner leer = new Scanner(System.in);
        
        temperatura = leer.nextInt();
        fahrenheint = 32 + (9 * temperatura / 5);
        
        System.out.println("La T° en °F equivale a " + fahrenheint +"°F");
        
    }
    
}
