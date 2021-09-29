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
public class Ej01 {

    public static void main(String[] args) {
        //Declaracion de variables 
        double eurosUsuario;
        //La variable rupiaEnEuro equivale al valor real de 1€ en rupias
        double rupiaEnEuro = 86.57;
        //En esta variable guardaremos la cantidad de rupias que equivalen los euros
        double cantidadConvertida;
        //Declaracion de objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        //Mensaje que se muestra por panatalla informativo
        System.out.println("Introduce la cantidad de dinero que ha traido en euros ");
        eurosUsuario = teclado.nextDouble();
        //Guardamos en cantidadConvertida la multiplicacion de los euros por el valor de cada euro en rupias
        cantidadConvertida = eurosUsuario * rupiaEnEuro;
        //Mostramos por pantalla la cantidad antes de ser convertida y despues
        System.out.println("La cantidad introducida es " + eurosUsuario + "€ "
                + "que equivale a " + df.format(cantidadConvertida) + " Rupias indias");

    }
}
