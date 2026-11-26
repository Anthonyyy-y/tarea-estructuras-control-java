/**
 @author  Anthony Rafael Jara Gualoto
 */

package com.mycompany.tareaestructurascontrol;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su calificacion: ");
        int nota = sc.nextInt();
        if (nota >= 7){
            System.out.print("Aprobado");
        } else {
            System.out.print("Reprobado");
        }
    }
}
