/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer  = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra o frase");
        
        String palabra = leer.nextLine();
        
        String letra = palabra.substring(0,1); //creo un segundo String para guardar la 1° posición
        
        System.out.println(palabra.substring(0,1)); //Este sout me muestra la primer posición de mi cadena 
        
        if ("a".equals(letra) || "A".equals(letra)){        //con el if y el equals comparo para ver si se cumple o no la consigna
        
               System.out.println("CORRECTO. tu palabra inica con A");
        }else{
            System.out.println("INCORRECTO. Tu palabra no empieza con 'A'");
        }
                
        
    }
    
    
    
    
    
    
    
    
    
}
