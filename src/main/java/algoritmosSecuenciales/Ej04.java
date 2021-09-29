/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosSecuenciales;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Ej04 {

    public static void main(String[] args) {
        //Declaracion de variables 
        double gramosUsuario;
        //La variable gramoEnLibra equivale al valor real de 1 gramo en libras
        final double GRAMO_EN_LIBRA = 0.00220462;
        //En esta variable guardaremos la cantidad de libras que equivalen los gramos
        double cantidadConvertida;
        //Declaracion de objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        //Mensaje que se muestra por panatalla informativo
        System.out.println("Introduce la cantidad de gramos que ha traido el usuario");
        gramosUsuario = teclado.nextDouble();
        //Guardamos en cantidadConvertida la multiplicacion de los gramos por el valor de cada gramo en libras
        cantidadConvertida = gramosUsuario * GRAMO_EN_LIBRA;
        //Mostramos por pantalla la cantidad antes de ser convertida y despues
        System.out.println("La cantidad introducida es " + gramosUsuario + " gramos "
                + "que equivale a " + df.format(cantidadConvertida) + " libras");

    }
}
