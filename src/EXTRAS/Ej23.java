/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] sopaLetras = new String[20][20];
        String palabras;
        int fila, k = 0, l = 0;
        
        System.out.println("Ingrese 5 palabras de entre 3 y 5 caracteres para crear una sopa de letras");
        
        do{
            for (int i = 0; i < 5; i++) {  //ciclo for para ingresar 5 palabras
                fila = (int)(Math.floor(Math.random()*19)); //va a ir eligiendo una fila al azar
                palabras = leer.nextLine();
                for (int j = 0; j < palabras.length(); j++) {
                    sopaLetras[fila][j] = palabras.substring(k, k+1);
                    k ++;
                }               
                k = 0;
                l ++;     
            }
        } while(l < 5);
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopaLetras[i][j] == null) {
                   sopaLetras[i][j] = String.valueOf((int)Math.floor(Math.random()*10)); //va a llenar donde no hayan palabras                  
                }
            }
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + sopaLetras[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
