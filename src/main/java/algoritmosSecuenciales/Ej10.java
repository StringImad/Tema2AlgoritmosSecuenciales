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
public class Ej10 {

    public static void main(String[] args) {
        //Declaracion de variables
        final double VELOCIDAD_COCHE = 200; //200km/h
        final double HORA_EN_MINUTOS = 60;
        final double TIEMPO_MOVIMIENTO = 20; //20 minutos

        double velocidadIntroducidaPorUsuario;
        double tiempoIntroducidoPorUsuario;
        double calculoFinalVelocidad;

        //Creacion de objetos 
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        //200km = 60 minutos
        //x = 20
        // x = VELOCIDAD_COCHE * TIEMPO_MOVIMIENTO / HORA_EN_MINUTOS
        calculoFinalVelocidad = (VELOCIDAD_COCHE * TIEMPO_MOVIMIENTO) / HORA_EN_MINUTOS;
        System.out.println("La distancia recorrida en " + TIEMPO_MOVIMIENTO + " mins es de " + df.format(calculoFinalVelocidad) + "km");

        System.out.println("Para caluclar el espacio recorrido introduce la velocidad en km/h");
        velocidadIntroducidaPorUsuario = teclado.nextDouble();
        System.out.println("Para caluclar el espacio recorrido introduce el tiempo en movimiento ");
        tiempoIntroducidoPorUsuario = teclado.nextDouble();
        
        calculoFinalVelocidad = (velocidadIntroducidaPorUsuario * tiempoIntroducidoPorUsuario) / HORA_EN_MINUTOS;
        System.out.println("La distancia recorrida en " + tiempoIntroducidoPorUsuario + " mins es de " + df.format(calculoFinalVelocidad) + "km");
    }
}
