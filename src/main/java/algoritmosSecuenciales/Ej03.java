/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosSecuenciales;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author imad
 */
public class Ej03 {

    public static void main(String[] args) {
        //DEclaracion de objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        //Declaracion de variables
        double notaNumerica1, notaNumerica2, notaNumerica3;
        double notaMedia;
        System.out.println("Introduce la nota examen 1");
        //Introducimos por teclado los datos de cada nota
        notaNumerica1 = teclado.nextDouble();
        System.out.println("Introduce la nota examen 2");
        notaNumerica2 = teclado.nextDouble();
        System.out.println("Introduce la nota examen 3");
        notaNumerica3 = teclado.nextDouble();
        //Algotitmo que suma todas las nostas y divide por la cantidad de notas
        notaMedia = (notaNumerica1 + notaNumerica2 + notaNumerica3) / 3;

        System.out.println("La nota media de los examenes " + notaNumerica1 + " - " + notaNumerica2 + " - " + notaNumerica3 + " es de: " + df.format(notaMedia));

        //¿DIFERENCIA ENTRE I++ y ++I;
    }
}
