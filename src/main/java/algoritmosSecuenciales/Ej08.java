/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosSecuenciales;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author imad
 */
public class Ej08 {

    public static void main(String[] args) {
        //Declaracion de variables
        String precioArticulo;
        boolean repetir = true;
        //Constantes
        final double IVA = 16;
        String ivaManual;
        double precioFinal;

        //Declaracion de objetos
        //decimalformat nos sirve para darle formato a nuestras lineas
        DecimalFormat df = new DecimalFormat("#.00");
        //Utilizo el bucle do while, para repetir el programa hasta que se pulse el boton de salida
        //el bucle se repite hasta que la condicion sea falsa
        do {
            //Creamos un array llamado botones donde almaceno las distintas opciones
            String[] botones = {"automatico", "manual", "salir"};

            //creo una variable llamada ventana que almacena la posicion del array que ha sido pulsada
            int ventana = JOptionPane.showOptionDialog(null,
                    "Elige el modo de calculo:",
                    " Bienvenido al sistema",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE, null,
                    botones, botones[0]);

            //el switch case nos lleva segun lo que hayamos pulsado a una opcion o otra 
            switch (ventana) {
                case 0:
                   
                    //utilizo try catch para captar el error de formato que se produce al meter un dato que no corresponde con la variable
                try {
                    precioArticulo = JOptionPane.showInputDialog("Introduce el precio del articulo");
                    //hago un simple calculo para sacar el iva y debemos de hacer casting ya que en joption usamos strings para la introduccion de datos
                    precioFinal = Double.parseDouble(precioArticulo) + (Double.parseDouble(precioArticulo) * (IVA / 100));
                    JOptionPane.showMessageDialog(null, "El precio del articulo con el iva al " + IVA + "% es " + df.format(precioFinal));
                } catch (NumberFormatException ex) {
                    //Mensaje de error
                    JOptionPane.showMessageDialog(null, "Formato incorrecto:\n"
                            + "Por favor ingrese un valor valido", "Error de formato",
                            JOptionPane.ERROR_MESSAGE);
                }
                break;
                case 1:
                try {
                    precioArticulo = JOptionPane.showInputDialog("Introduce el precio del articulo");
                    ivaManual = JOptionPane.showInputDialog("Introduce el porcentaje del Iva");

                    precioFinal = Double.parseDouble(precioArticulo) + (Double.parseDouble(precioArticulo) * ((Double.parseDouble(ivaManual)) / 100));
                    JOptionPane.showMessageDialog(null, "El precio del articulo con el iva al " + ivaManual + "% es " + df.format(precioFinal));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Formato incorrecto:\n"
                            + "Por favor ingrese un valor valido", "Error de formato",
                            JOptionPane.ERROR_MESSAGE);
                }
                break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Pulse aceptar para salir del sistema.");

                    repetir = false;
                    break;
            }
        } while (repetir);

    }
}
