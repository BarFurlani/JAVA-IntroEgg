/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package EXTRAS;

import java.util.Scanner;

/**
 *aux.equalsIgnoreCase("S")
 * @author ACER ASPIRE V
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int flias, hijos, edad, cont = 0;
        double promedio;
        
        System.out.println("Ingrese el n° de familias");
        flias = leer.nextInt();
       
        for (int i = 1; i <= flias; i++) {
            System.out.println("Ingrese el n° de hijos de la familia n° " + i);
            hijos= leer.nextInt();
            for (int j = 1; j <= hijos; j++) {
                System.out.println("Ingrese la edad del hijo n° " + j);
                edad = leer.nextInt();
                
                cont += edad;
            }
            promedio = cont/hijos;
            System.out.println("El promedio de edades de la familia " + i + " es de: " + promedio + " años");    
        }    
    }    
}
