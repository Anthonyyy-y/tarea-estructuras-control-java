/**
 * @author  Anthony Rafael Jara Gualoto
 */

package com.mycompany.tareaestructurascontrol;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una calificacion entre 0 y 10: ");
        double nota = sc.nextDouble();
        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 8) {
            System.out.println("Muy Bueno");
        } else if (nota >= 7) {
            System.out.println("Bueno");
        } else if (nota >= 5) {
            System.out.println("Regular");
        } else {
            System.out.println("Deficiente");
        }
    }
}
