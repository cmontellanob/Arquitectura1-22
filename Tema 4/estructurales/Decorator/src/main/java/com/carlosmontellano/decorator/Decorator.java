/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.carlosmontellano.decorator;

/**
 *
 * @author Carlos
 */
public class Decorator {

    public static void main(String[] args) {
         Cuenta c = new Cuenta(1, "Juan Perez");

        ICuentaBancaria cuenta = new CuentaAhorro();
        ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);

        cuenta.abrirCuenta(c);
        cuentaBlindada.abrirCuenta(c);
    }
}
