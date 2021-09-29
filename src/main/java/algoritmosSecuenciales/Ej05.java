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
public class Ej05 {

    public static void main(String[] args) {
        //Declaracion de variables 
        final double cobroFijo = 150; //Euros
        final double precioKmRecorrido = 0.153; //Centimos

        double cantidadTotalViaje;
        //En esta variable guardaremos la cantidad de km que introduce el usuario
        double kilometrosPorRecorrer;
        //Declaracion de objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        //Mensaje que se muestra por panatalla informativo
        System.out.println("Introduce los kilometros que va a realiar el usuario");
        kilometrosPorRecorrer = teclado.nextDouble();
        //Guardamos en cantidadTotalViaje la multiplicacion de los km por el precio por km  y le sumamos la cantidad fija
        cantidadTotalViaje = (precioKmRecorrido * kilometrosPorRecorrer) + cobroFijo;
        //Mostramos por pantalla la cantidad antes de ser convertida y despues
        System.out.println("Los km introducidos son " + kilometrosPorRecorrer + " km "
                + " el servicio cuesta " + df.format(cantidadTotalViaje) + " euros");

    }
}
