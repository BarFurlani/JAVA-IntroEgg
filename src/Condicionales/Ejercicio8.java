package Condicionales;

import java.util.Scanner;

/**
 * Realizar un programa que solo permita introducir solo frases o palabras de 8
 * de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá
 * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
 * se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en
 * Java.
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra/frase de 8 caracteres");
        String palabra = leer.nextLine();
        
       if (palabra.length() == 8){  
           System.out.println("Perfecto, la palabra/frase posee 8 caracteres");
        } else {
           System.out.println("INCORRECTO. La palabra/frase no tiene 8 caracteres");
        
    }
}}