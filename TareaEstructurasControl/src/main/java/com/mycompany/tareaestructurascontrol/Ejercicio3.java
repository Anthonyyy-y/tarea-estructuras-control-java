/**
 @author  Anthony Rafael Jara Gualoto
 */

package com.mycompany.tareaestructurascontrol;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        if (edad >= 18){
            System.out.print("Es mayor de edad.");
        }
    }
}
