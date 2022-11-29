package EXTRAS;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     *  Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar. 
     */
    public static void main(String[] args) {
    
        int a = 2, b = 4, c = 6, d = 8, aux;
        System.out.println("Las variables iniciales en orden son: " + a + b + c + d);   
        
       aux = b;
       b = c;
       c = a;
       a = d;
       d = aux;
    System.out.println("Las variables iniciales en orden son: " + a + b + c + d);    
    }
  
}
