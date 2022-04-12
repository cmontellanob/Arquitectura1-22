/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlosmontellano.sipleresponsabilidad.error;

import com.carlosmontellano.sipleresponsabilidad.comun.Marca;
import com.carlosmontellano.sipleresponsabilidad.comun.TipoVehiculo;

/**
 *
 * @author Carlos
 */
public class Vehiculo {

    Marca marca;
    String modelo;
    String placa;
    TipoVehiculo tipovehiculo;
    String color;

    public Vehiculo(Marca marca, String modelo, String placa, TipoVehiculo tipovehiculo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.tipovehiculo = tipovehiculo;
        this.color = color;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
