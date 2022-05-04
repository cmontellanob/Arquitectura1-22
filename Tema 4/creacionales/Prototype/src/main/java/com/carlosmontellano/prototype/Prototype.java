/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.carlosmontellano.prototype;

/**
 *
 * @author Carlos
 */
public class Prototype {

    public static void main(String[] args) {
         CuentaAhorro cuentaAhorro1 = new CuentaAhorro();
        cuentaAhorro1.setMonto(200);

  
        CuentaAhorro cuentaClonada = (CuentaAhorro) cuentaAhorro1.clonar();

        System.out.println(cuentaAhorro1);
        System.out.println(cuentaClonada);
        cuentaClonada.setMonto(300);
        System.out.println(cuentaAhorro1);
        System.out.println(cuentaClonada);
    }
}
