package com.carlosmontellano.inversiondependencias.incorrecto;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.carlosmontellano.inversiondependencias.comun.*;

/**
 *
 * @author Carlos
 */
public class InversionDependencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConexionMySQL conmysql=new  ConexionMySQL("bd_parqueo", "root", "");
        
        Vehiculo vehiculo = new Vehiculo(Color.Blanco, "1138-CTC", "Nisan", TipoVehiculo.Camion);
        VehiculoDB vehiculoDB = new VehiculoDB(vehiculo,conmysql);
        vehiculoDB.guardarDB();

    }

}
