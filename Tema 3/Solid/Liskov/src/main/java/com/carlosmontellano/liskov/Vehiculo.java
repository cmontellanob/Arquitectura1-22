/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlosmontellano.liskov;

/**
 *
 * @author Carlos
 */
public class Vehiculo {
    private Color color;
    private String placa;
    private TipoVehiculo tipovehiculo;
    public double precioimportacion()
    {
     return 1000;   
    }

    public Vehiculo(Color color, String placa, TipoVehiculo tipovehiculo) {
        this.color = color;
        this.placa = placa;
        this.tipovehiculo = tipovehiculo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoVehiculo getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(TipoVehiculo tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }
    
}
