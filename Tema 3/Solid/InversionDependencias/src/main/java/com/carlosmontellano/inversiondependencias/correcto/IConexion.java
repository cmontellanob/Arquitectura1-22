package com.carlosmontellano.inversiondependencias.correcto;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;

/**
 *
 * @author Carlos
 */
public interface IConexion {
    Connection conectar(); 
    boolean ejecutarSQL(String sql);
    
}