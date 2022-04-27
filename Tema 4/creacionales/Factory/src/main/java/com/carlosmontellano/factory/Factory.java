/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.carlosmontellano.factory;

/**
 *
 * @author Carlos
 */
public class Factory {

    public static void main(String[] args) {
         ConexionFactory fabrica=new ConexionFactory(); 
        IConexion con1=fabrica.getConexion("MySQL");
        con1.conectar();
        IConexion con2=fabrica.getConexion("PostgreSQL");
        con2.conectar();
    }
}
