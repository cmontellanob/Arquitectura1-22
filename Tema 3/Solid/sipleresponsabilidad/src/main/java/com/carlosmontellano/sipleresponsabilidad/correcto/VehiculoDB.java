/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlosmontellano.sipleresponsabilidad.correcto;

/**
 *
 * @author Carlos
 */
public class VehiculoDB {

    
    Vehiculo vehiculo;

    public VehiculoDB(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public Boolean guardarBD(Vehiculo vehiculo)
    {
        //
        return true;
    }
    public Boolean EliminarBD(Vehiculo vehiculo)
    {
        //
        return true;
    }
    public Vehiculo LeerBD(String placa)
    {
        //Vehiculo aux;
        //
        return null;
    }
    
}
