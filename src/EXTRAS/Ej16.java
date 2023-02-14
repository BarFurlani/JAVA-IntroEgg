/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String aux = "", persona;
        int cont = 0;
    
    do{ 
        persona = persona();
        System.out.println(persona);
        System.out.println("Desea salir? SI/NO");   
            aux = leer.nextLine();
            cont ++; 
       System.out.println("Persona n° " + (cont + 1) +":");      
     }while(aux.equalsIgnoreCase("N"));
    }
     
    public static String persona(){
        Scanner leer = new Scanner(System.in);
        String nombre = "", aux = " ";
        int edad;
        
            System.out.println("Ingrese el nombre de la persona:");
           nombre = leer.next();
            System.out.println("Ingrese la edad"); 
            edad = leer.nextInt();
            if (edad>=18) {
                   return nombre + ", " + edad + " años. Es mayor de edad."; 
            } else{
                  return nombre + ", " + edad + " años. Es menor de edad.";
                }     
     
    }
}