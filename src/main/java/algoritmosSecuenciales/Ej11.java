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
public class Ej11 {

    public static void main(String[] args) {
        double distanciaIntroducidaPorUsuario;
        double distanciaIntroducidaPorUsuario2;
        double calculoFinal;

        //Creacion de objetos 
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println(
                "Para caluclar la distancia introduce la coordenada");
        distanciaIntroducidaPorUsuario = teclado.nextDouble();

        System.out.println(
                "Para caluclar la distancia introduce la coordenada");
        distanciaIntroducidaPorUsuario2 = teclado.nextDouble();
        //a2 + b2 = c2
        calculoFinal = (Math.pow(distanciaIntroducidaPorUsuario, 2) + Math.pow(distanciaIntroducidaPorUsuario, 2));

        System.out.println(
                "La distancia que nos falta es " + df.format(calculoFinal) + "cm");

    }

}
