package com.carlosmontellano.inversiondependencias.incorrecto;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class VehiculoDB {
    Vehiculo vehiculo;
    ConexionMySQL coneccion;

    public VehiculoDB(Vehiculo vehiculo, ConexionMySQL coneccion) {
        this.vehiculo = vehiculo;
        this.coneccion = coneccion;
    }
  
    
    public void guardarDB()
    {
      if ( coneccion.ejecutarSQL("INSERT INTO vehiculos (color,placa,marca,tipovehiculo) VALUES('"+vehiculo.getColor().toString()+"','"+vehiculo.getPlaca()+"','"+vehiculo.getMarca()+"','"+vehiculo.getTipovehiculo().toString()+"')"))
            System.out.println("Se inserto con Ã©xito");
      else
          System.out.println("Ocurrio un Error");
       
        
    }
    public void eliminarDB()
    {
        //
    }
}
