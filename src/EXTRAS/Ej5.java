/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     * Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
         
       System.out.println("");
       System.out.println("Ingrese el valor total del tratamiento");
       int valor =leer.nextInt();
       System.out.println("Ingrese el plan de la Obra Social: A, B o C");
       String plan = leer.next();  
       
       switch (plan.toLowerCase()){
            case "a":
                System.out.println("Tiene un 50% de descuento y debe abonar: $ " + valor*0.5);
                break;
            case "b":
                System.out.println("Tiene un 35% de descuento y debe abonar: $ " + valor*0.65);
                break;    
            case "c":
                System.out.println("Su plan no posee descuentos, debe abonar el total");
                break;    
            default:
                System.out.println("Valor inválido");
                
        }
    }
    
}
