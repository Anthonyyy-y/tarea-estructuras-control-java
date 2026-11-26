/**
 @author Anthony Rafael Jara Gualoto
 */

package com.mycompany.tareaestructurascontrol;

import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese su carrera: ");
        String carrera = sc.nextLine();
        System.out.print("Ingrese su estatura: ");
        Double estatura = sc.nextDouble();
        System.out.println("Su Nombre es: " + nombre);
        System.out.println("Su Edad es: " + edad + " Años");
        System.out.println("Su Carrera es: " + carrera);
        System.out.println("Su Estatura es: " + estatura + "m");
    }
}