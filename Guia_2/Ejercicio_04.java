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
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int gradosC, gradosF;
        System.out.println("Ingrese la cantidad de grados centigrados");
        gradosC = leer.nextInt();
        gradosF = 32 + (9 * gradosC / 5);
        System.out.println(gradosC + " grados centigrados " + " equivalen a " + gradosF + " grados farenheit");
    }
    
}
