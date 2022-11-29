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
public class Ej7_2 {

    /**
     * @param args the command line arguments
     * ES = QUE EL 7 PERO CON DO-WHILE
     */
    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un n° entero positivo (entre 1 y 10)");
        int num = leer.nextInt();
        int cont = 0, valor, menor = 99999, mayor =0, total = 0;
        
        do{
            System.out.println("Ingrese un valor");
            valor = leer.nextInt();
            cont++;
            total += valor;
            
            menor=min(menor, valor);       
            mayor=max(mayor, valor);
            
        } while(cont < num);
            System.out.println("El mayor n° ingresado es: " + mayor); 
            System.out.println("El menor n° ingresado es: " + menor); 
            System.out.println("El promedio de los n° ingresado es: " + total/num);
    }
    
}

