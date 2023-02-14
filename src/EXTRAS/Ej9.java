/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int r = 0, cont = 0;
        
        System.out.println("DIVISIÓN CON RESTAS SUCESIVAS");
        System.out.println("Ingrese 2 n° para comenzar");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        
        if (n1>n2) {
            do {
             r = n1 - n2;  
             n1 -= n2;
             cont ++;
            } while (r>= n2);
               System.out.println("El residuo es: " + r + " y el divisor es: " + cont);
        } else {
            System.out.println("La divisón no puede realizarse, el 1° número debe ser mayor al 2°");
        }
    }
    
}
