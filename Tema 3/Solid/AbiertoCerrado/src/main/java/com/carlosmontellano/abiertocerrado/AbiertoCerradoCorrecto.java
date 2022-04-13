/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.carlosmontellano.abiertocerrado;

import com.carlosmontellano.abiertocerrado.comun.Marca;
import com.carlosmontellano.abiertocerrado.comun.TipoVehiculo;
import com.carlosmontellano.abiertocerrado.correcto.Chevrolet;
import com.carlosmontellano.abiertocerrado.correcto.Mazda;
import com.carlosmontellano.abiertocerrado.correcto.Nissan;
import com.carlosmontellano.abiertocerrado.correcto.Toyota;
import com.carlosmontellano.abiertocerrado.correcto.Vehiculo;


/**
 *
 * @author Carlos
 */
public class AbiertoCerradoCorrecto {

    public static void main(String[] args) {
        Vehiculo[] vehiculos ={
           new Toyota("RAV4","5789 TCP",TipoVehiculo.Auto,"Rojo"),
           new Nissan("March","115 UDP",TipoVehiculo.Auto,"Plomo"),
           new Mazda("cx300","4758 TDC",TipoVehiculo.Auto,"Amarillo"),
           new Chevrolet("tracker","5788 MBC",TipoVehiculo.Auto,"Rojo")
           
        };
        imprimirPrecios(vehiculos);
    }    
    public static void imprimirPrecios(Vehiculo[] vehiculos)
    {
        for (Vehiculo v:vehiculos)
        {
            System.out.println(v.precio());
            
        }
                
    }
}
