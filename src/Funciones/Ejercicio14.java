/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package Funciones;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      double euros; //permite ingresar decimales
      int opcion = 0;        
      System.out.println("Ingrese el valor de Euros que desea convertir");
      euros = leer.nextFloat();
    do{         //para que se repita el menú
      //Creo un menu con las opciones
        System.out.println(" ");
        System.out.println("Ingrese el numero correspondiete a la moneda que quiera convertir:");
        System.out.println("1-Libras esterlinas");
        System.out.println("2-Dolares");
        System.out.println("3-Yenes");
        System.out.println("4-Salir");
        
        opcion = leer.nextInt();
        
      //Un Switch para cada caso
        switch(opcion){
            case 1:
                double libra = cambiarlibra(euros);
                System.out.println("Su cambio a libras es:" + libra);
                break;
            case 2:
                double dolar = cambiardolar(euros);
                System.out.println("Su cambio a libras es:" + dolar);
                break;
            case 3:
                double yen = cambiarYenes(euros);
                System.out.println("Su cambio en yenes es:" + yen);
                break;
            default:
                System.out.println("ERROR");
        }
        
     }while(opcion !=4);   
    
    }
    
    public static double cambiarlibra(double euros){       
        double libra = euros*0.86; 
        return libra;  
    } 
    
     public static double cambiardolar(double euros){       
        double dolar = euros*1.28611; 
        return dolar;  
    } 
     
     public static double cambiarYenes(double euros){
         double yen = euros*129.852;
         return yen;
     }
}
    