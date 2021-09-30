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
public class Ej07 {

    public static void main(String[] args) {
        //Declaracion de variables
        double lecheProducida;
        //Constantes
        final double GALON_EQUIVALE_LECHE = 3.78;
        final double PRECIO_GALON = 1.20;
        double calculoGalones;
        double precioFinal;
        //Declaracion de objetos 
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Introduce la cantidad en litros de la leche que trae ");
        lecheProducida = teclado.nextDouble();
        //dividimos la leche producida entre lo que equivale cada galon y nos da la cantidad que deberemos de usar para sacar el precio
        calculoGalones = (lecheProducida/GALON_EQUIVALE_LECHE);
        //el precio final es la multiplicacion de los galones que hemos sacado por el precio fijo de cada galon
        precioFinal = calculoGalones * PRECIO_GALON;
        //imprimimos por pantalla los variables que necesitamos y le damos un formato para limitar los decimales que se muestran por pantalla
        System.out.println("Usted ha traido una cantidad total de "+lecheProducida+" L"+ " que equivale a "+df.format(calculoGalones)+ " galones"
                + " el precio total sería: "+df.format(precioFinal)+" €");
        
    }
}
