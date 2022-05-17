/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.carlosmontellano.bridge;

/**
 *
 * @author Carlos
 */
public class Bridge {

    public static void main(String[] args) {
            ElaborarAlimento lasagna = new ElaborarLasagna(new Carne());
        lasagna.obtener();
        // Ahora le indicamos que use otra implementación para obtener la de verduras
        lasagna.setImplementador(new Verduras());
        lasagna.obtener();
        // Ahora le indicamos que use otra implementación para obtener picante
        lasagna.setImplementador(new Picante());
        lasagna.obtener();
    }
}
