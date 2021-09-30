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
public class Ej06 {
    public static void main(String[] args) {
        //Declaracion de variables
        int a, b;
        //Declaracion de objetos
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce por teclado el valor de a ");
        a = teclado.nextInt();
        System.out.println("Introduce por teclado el valor de b ");
        b = teclado.nextInt();
        
        System.out.println("a/b = "+(a/b)+ ", a mod b = "+(a%b));
    }
}
