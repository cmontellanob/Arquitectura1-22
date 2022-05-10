/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.carlosmontellano.sumas;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Sumas {

    public static void main(String[] args) {
        int op = 0;
        Scanner sc = new Scanner((Readable) System.out);
        while (op != 3) {
            System.out.println("1.- Sumar 2 numeros ");
            System.out.println("2. Sumatoria n");
            System.out.println("3. Salir");
            System.out.println("elija opcion");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Introduzca A");
                    int a =sc.nextInt();
                    System.out.println("Introduzca B");
                    int b =sc.nextInt();
                    System.out.println("La suma es"+operacion.sumar(a,b));
                    
                    break;
                case 2:
                    break;

            }
        }
    }
}
