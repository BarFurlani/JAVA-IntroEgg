/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int aprobados = 0, desaprobados = 0;
        double tp1[], tp2[], ev1[], ev2[], nota, promedio;

        tp1 = new double[10];
        tp2 = new double[10];
        ev1 = new double[10];
        ev2 = new double[10];

        //cargado de notas y ponderaciones
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota del 1° TP del alumno n° " + (i + 1));
            nota = leer.nextDouble();
            tp1[i] = nota * 0.10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota del 2° TP del alumno n° " + (i + 1));
            nota = leer.nextDouble();
            tp2[i] = nota * 0.15;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota del 1° Integrador del alumno n° " + (i + 1));
            nota = leer.nextDouble();
            ev1[i] = nota * 0.25;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota del 2° Integrador del alumno n° " + (i + 1));
            nota = leer.nextDouble();
            ev2[i] = nota * 0.50;
        }

        //promedios
        for (int i = 0; i < 10; i++) {
            promedio = (tp1[i] + tp2[i] + ev1[i] + ev2[i]);
            System.out.println("El promedio del alumno n° " + (i + 1) + " es: " + promedio);

            if (promedio <= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}
