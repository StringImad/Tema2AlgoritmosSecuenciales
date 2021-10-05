/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosSecuenciales;

import java.util.Scanner;

/**
 *
 * @author imad
 */
public class Ej09 {
    public static void main(String[] args) {
        //calcular el area del rombo es (D*d)/2
        //declaracion de variables
        double distanciaEntreAyC;
        double distanciaEntreByD;
        double calculoAreaRombo;
        //Declaracion de objetos
        Scanner teclado = new Scanner(System.in);
        //Mensajes informativos de introduccion de datos para el usuario
        System.out.println("Introduce la distancia que "
                + "tenemos entre los puntos A y C ");
        distanciaEntreAyC = teclado.nextDouble();
        System.out.println("Introduce la distancia que "
                + "tenemos entre los puntos B y D ");
        distanciaEntreByD = teclado.nextDouble();
        
        calculoAreaRombo = (distanciaEntreAyC * distanciaEntreByD)/2;
        
        System.out.println("La diagonal mayor mide "+distanciaEntreAyC+" y la diagonal menor mide "+distanciaEntreByD+ " por lo tanto"
                + " necesitamos una cantidad de tela total de "+calculoAreaRombo);
        
        
    }
}
