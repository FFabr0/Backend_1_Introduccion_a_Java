/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_2;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("El doble del numero ingresado es: " + num1 * 2);
        System.out.println("El triple del numero ingresado es: " + num1 * 3);
        System.out.println("La raiz cuadrada del numero ingresado es: " + Math.sqrt(num1));
    }
    
}
