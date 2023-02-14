/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package BuclesYsentencias;

import java.util.Scanner;

/**
 * @author ACER ASPIRE V
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner leer = new Scanner(System.in);
     String fin = "&&&&&";
     String cadena = " ";
     String X, O;
    
     //crear un int para establecer el max de caracteres y 2 contadores
     int maximo = 5;
     int correcto = 0;
     int incorrecto = 0;
     
     do{
         do{
             System.out.println("Ingrese una palabra");
             cadena = leer.nextLine();
             if (cadena.length() != 5){
                 incorrecto ++;     
             }
         } while (cadena.length() != 5);
          X = cadena.substring(0, 1);
          O = cadena.substring(cadena.length() - 1, cadena.length());
          if (X.equals("X") && O.equals("O")) {
                correcto++;
            } 
            else {
                incorrecto++;
            }  
    } while (!cadena.equals(fin));
      
        System.out.println("Las palabras correctas ingresadas fueron: " + correcto);
        
        incorrecto = incorrecto-1; //para que no cuente "&&&&&" dentro de las cadenas
        System.out.println("Las palabras incorrectas ingresadas fueron: " + incorrecto);
    
}}
