package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     * 
     * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int num, cont, par, impar;
     
        par = 0;
        impar = 0;
        cont = 0;
        
        do{
        System.out.println("Ingrese números enteros");
        num = leer.nextInt();
        
        if (num%2 == 0){
            par ++;
            cont += 1;
        }else{
            impar ++;
            cont += 1;
            }
        
        }while (!(num%5 == 0));
        
        System.out.println("La cantidad de números pares son: "+ par);
        System.out.println("La cantidad de números impares son: "+ impar);
        System.out.println("La cantidad total es: "+cont);
        
    } 
    }
