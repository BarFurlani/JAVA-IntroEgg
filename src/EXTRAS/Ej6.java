/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el n° de personas para evaluar altura"); 
        int pers = leer.nextInt();
        int altura, total = 0, petisos = 0, hobbits = 0;
        
        for (int i = 1; i <= pers; i++) {
            System.out.println("Ingrese la estatura en cm de la " + i + "° persona");
            altura = leer.nextInt();
            total += altura;
          if(altura<160){
              petisos += altura;
              hobbits++;
          }
            
        } System.out.println("El promodio de altura de las personas es de: " + total/pers + " cm");
          System.out.println(hobbits + " son las personas que miden menos de 1.6, cuyo promedio de estatura es de " + petisos/hobbits);
    }
    
}
