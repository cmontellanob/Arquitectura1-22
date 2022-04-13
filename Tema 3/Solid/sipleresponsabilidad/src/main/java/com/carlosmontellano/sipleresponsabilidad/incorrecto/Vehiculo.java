/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlosmontellano.sipleresponsabilidad.incorrecto;

import com.carlosmontellano.sipleresponsabilidad.comun.Marca;
import com.carlosmontellano.sipleresponsabilidad.comun.TipoVehiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public Connection conexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_vehiculos", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    public Boolean GuardarBD(Vehiculo vehiculo) {

        try {
            
            String sql = " insert into vehiculos (marca, modelo,placa,tipovehiculo,color) values (?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = conexion().prepareStatement(sql);
            preparedStmt.setString(1, vehiculo.getMarca().toString());
            preparedStmt.setString(2, vehiculo.getModelo());
            preparedStmt.setString(3, vehiculo.getPlaca());
            preparedStmt.setString(4, vehiculo.getTipovehiculo().toString());
            preparedStmt.setString(5, vehiculo.getColor());

            return preparedStmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean EliminarBD(String  placa) {

        try {
            
            String sql = " delete from vehiculos where placa=?";
            PreparedStatement preparedStmt = conexion().prepareStatement(sql);
            preparedStmt.setString(1, placa);
            
            return preparedStmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Vehiculo LeerBD(String placa) {
        Statement stmt;
        try {
            stmt = conexion().createStatement();
            String sql="select id,marca,modelo,placa,tipovehiculo,color from vehiculos where placa='" + placa+"'";
            
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                this.marca = Marca.valueOf(rs.getString(2));
                this.modelo = rs.getString(3);
                this.placa = rs.getString(4);
                this.tipovehiculo = TipoVehiculo.valueOf(rs.getString(5));
                this.color = rs.getString(6);
                return this;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", tipovehiculo=" + tipovehiculo + ", color=" + color + '}';
    }
    

}
