/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int n1, n2, suma, resta, multi, div, opc;
        
        System.out.println("CALCULADORATOR-3000");
        System.out.println("Ingrese 2 números");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
              
        do {
         System.out.println(" -- MENÚ -- ");
         System.out.println("1 - Sumar");
         System.out.println("2 - Restar");
         System.out.println("3 - Multiplicar");
         System.out.println("4 - Dividir");
         System.out.println("5 - Salir"); 
         opc = leer.nextInt();
            switch ((int)opc){
                case 1:
                    suma = suma (n1, n2);
                    System.out.println("SUMA");
                    System.out.println((int)suma);
                    break;
                case 2:
                    resta = resta (n1, n2);
                    System.out.println("RESTA");
                    System.out.println((int)resta);
                    break;
                case 3:
                    multi = multi (n1, n2);
                    System.out.println("MULTIPLICAR");
                    System.out.println(multi);
                    break;
                case 4:
                    div = div (n1, n2);
                    System.out.println("DIVIDIR");
                    System.out.println(div);
                    break;
                case 5:
                    System.out.println("GRACIAS POR USAR CALCULADORATOR-3000");
                    break;
                default:
                    System.out.println("Ingrese una opción valida"); 
            }       
        } while ((opc > 0 || opc < 5) && (opc != 5));
    }           

    public static int suma(int n1, int n2){
       int suma = n1 + n2;
       return suma; 
    }
    
     public static int resta(int n1, int n2){
       int resta = n1 - n2;
       return resta; 
    }
     
      public static int multi(int n1, int n2){
       int multi = n1 * n2;
       return multi; 
    }
      
       public static int div(int n1, int n2){
       int div = n1 / n2;
       return div; 
    }
}
