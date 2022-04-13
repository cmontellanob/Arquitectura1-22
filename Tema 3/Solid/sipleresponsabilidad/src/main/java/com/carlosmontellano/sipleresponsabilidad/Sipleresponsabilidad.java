/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.carlosmontellano.sipleresponsabilidad;

/**
 *
 * @author Carlos
 */
import com.carlosmontellano.sipleresponsabilidad.comun.Marca;
import com.carlosmontellano.sipleresponsabilidad.comun.TipoVehiculo;
import com.carlosmontellano.sipleresponsabilidad.incorrecto.Vehiculo;

public class Sipleresponsabilidad {

    public static void main(String[] args) {
        
        Vehiculo vehiculo=new Vehiculo(Marca.TOYOTA,"RAV4","5789 TCP",TipoVehiculo.Auto,"Rojo");
      //  vehiculo.GuardarBD(vehiculo);
        
        System.out.println(vehiculo.LeerBD("5789 TCP"));
        
    }
}
