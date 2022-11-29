/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTRAS;

import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej7 {

    /**
     * @param args 
     * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un n° entero positivo (entre 1 y 10)");
        int num = leer.nextInt();
        int cont = 0, valor, menor = 99999, mayor =0, total = 0;
        
        while (cont<num){
            System.out.println("Ingrese un valor");
            valor = leer.nextInt();
            cont++;
            total += valor;
            
            menor=min(menor, valor);
                    
            mayor=max(mayor, valor);
        }
        System.out.println("El mayor n° ingresado es: " + mayor); 
        System.out.println("El menor n° ingresado es: " + menor); 
        System.out.println("El promedio de los n° ingresado es: " + total/num); 
    }
    
}
