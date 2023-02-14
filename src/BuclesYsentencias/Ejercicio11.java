/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú
 */
package BuclesYsentencias;

import java.util.Scanner;

/**
 * @author ACER ASPIRE V
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 n° enteros");
        
        int num1, num2;
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        int opcion = 0;
        String salida = " ";
        
        do{
            System.out.println("--MENÚ--");
            System.out.println("1- sumar");
            System.out.println("2- restar");
            System.out.println("3- multiplicar");
            System.out.println("4- dividir");
            System.out.println("5- salir");
            
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("La suma de los n° es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta de los n° es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los n° es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("La divición de los n° es: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("Desea salir del menú? S/N");
                    salida =leer.nextLine();
                    break;
                default:
                    System.out.println("Ingrese una oción correcta (1-5)");
            }        
         }while ((salida.equals("N")) && (opcion >= 1 || opcion <= 5));           
    }  
}


