/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.carlosmontellano.singleton;

/**
 *
 * @author Carlos
 */
public class Singleton {

    public static void main(String[] args) {
        SingleObject single=SingleObject.getInstance();
        single.setMensaje("Hola Mundo");
        System.out.println(single.getMensaje());
        
        SingleObject dos=SingleObject.getInstance();
        dos.setMensaje("Hola a todos");
        System.out.println(single.getMensaje());
    }
}
