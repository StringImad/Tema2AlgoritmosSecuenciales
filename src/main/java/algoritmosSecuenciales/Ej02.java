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
public class Ej02 {

    public static void main(String[] args) {
        //DEclaracion de objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        //Declaracion de variables
        double radioIntroducido;
        double areaCalculada;
        System.out.println("Introduce la radio de la circunferencia que quiere calcular");
        radioIntroducido = teclado.nextDouble();
        //Utilizamos el algoritmo para hacer el calculo
        //Sabiendo que la formula del area es pi * r2
        //Utilizamos la clase de java Math y hacemis uso de sus funciones
        //Math.pow nos da la posiblidad de elevar una variable al numero que queramos
        areaCalculada = Math.PI * Math.pow(radioIntroducido, 2);
        System.out.println("El area del circulo con radio " + radioIntroducido + " cm, es de " + df.format(areaCalculada));
    }
}
