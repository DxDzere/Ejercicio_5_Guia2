/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5_guia2;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_5_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        System.out.println("El doble del numero imgresado es: " + num*2);
        System.out.println("El triple del numero imgresado es: " + num*3);
        System.out.println("La raiz cuadrada del numero imgresado es: " + Math.sqrt(num));
    }
    
}
