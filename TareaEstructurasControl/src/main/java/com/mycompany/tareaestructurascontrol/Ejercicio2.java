/**
 @author  Anthony Rafael Jara Gualoto
 */

package com.mycompany.tareaestructurascontrol;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int num2 =sc.nextInt();
        System.out.println("La suma de ambos numeros es: " + (num1+num2));
        System.out.println("La resta de ambos numeros es: " + (num1-num2));
        System.out.println("La multiplicacion de ambos numeros es: " + (num1*num2));
        if(num2 != 0) {
            System.out.println("La division de ambos numeros es: " + ((double) num1/num2));
            System.out.println("El residuo de ambos numeros es: " + (num1%num2));    
        } else {
            System.out.println("No se puede hacer este calculo");
        }

    }
}
