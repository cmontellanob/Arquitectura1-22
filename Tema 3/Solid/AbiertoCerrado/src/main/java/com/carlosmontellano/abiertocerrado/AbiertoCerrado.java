/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.carlosmontellano.abiertocerrado;

import com.carlosmontellano.abiertocerrado.comun.Marca;
import com.carlosmontellano.abiertocerrado.comun.TipoVehiculo;
import com.carlosmontellano.abiertocerrado.incorrecto.Vehiculo;

/**
 *
 * @author Carlos
 */
public class AbiertoCerrado {

    public static void main(String[] args) {
        Vehiculo[] vehiculos ={
           new Vehiculo(Marca.TOYOTA,"RAV4","5789 TCP",TipoVehiculo.Auto,"Rojo"),
           new Vehiculo(Marca.NISSAN,"March","115 UDP",TipoVehiculo.Auto,"Plomo"),
           new Vehiculo(Marca.MAZDA,"cx300","4758 TDC",TipoVehiculo.Auto,"Amarillo")
           
        };
        imprimirPrecios(vehiculos);
    }    
    public static void imprimirPrecios(Vehiculo[] vehiculos)
    {
        for (Vehiculo v:vehiculos)
        {
            if (v.getMarca()==Marca.TOYOTA) 
            {
                System.out.println(15000);
            }
            else if (v.getMarca()==Marca.NISSAN)
            {
                System.out.println(12000);
            }
            else if (v.getMarca()==Marca.MAZDA)
            {
                System.out.println(22000);
            }
        }
                
    }
}
