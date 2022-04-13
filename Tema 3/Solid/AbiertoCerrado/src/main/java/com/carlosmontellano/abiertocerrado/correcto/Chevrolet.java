/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlosmontellano.abiertocerrado.correcto;

import com.carlosmontellano.abiertocerrado.comun.TipoVehiculo;

/**
 *
 * @author Carlos
 */
public class Chevrolet extends Vehiculo {

    public Chevrolet(String modelo, String placa, TipoVehiculo tipovehiculo, String color) {
        super(modelo, placa, tipovehiculo, color);
    }

    @Override
    public int precio() {
        return 18000;
    }
    
}
