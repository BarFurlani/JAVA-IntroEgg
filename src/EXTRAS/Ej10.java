/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner leer = new Scanner(System.in);
       
       int A = (int) (Math.random()*10);
       int B = (int) (Math.random()*10);
       
        System.out.println("ADIVINA EL RESULTADO...");
        System.out.println("Multiplicando 2 números entre 0 y 10...");
        System.out.println("");
        System.out.println("Estas listo???");
        System.out.println("Tu respuesrta...");
        int rta = leer.nextInt();
        
        do {
            System.out.println("Incorrecto. Tu rta..."); 
            rta = leer.nextInt();
           // System.out.println(A*B);  //Para comprobar que funcione
        } while (rta != A*B);
            System.out.println("Correcto. Los números multiplicados fueron: " + A + " y " + B);
    }   
}
