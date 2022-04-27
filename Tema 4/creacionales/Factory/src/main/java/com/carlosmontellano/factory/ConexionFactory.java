package com.carlosmontellano.factory;

public class ConexionFactory {

    public IConexion getConexion(String motor) {
        switch (motor) {
            case "MySQL":
                return new ConexionMySQL();
            case "PostgreSQL":
                return new ConexionPostgreSQL();
            case "SQLServer":
                return new ConexionSQLServer();    
        }
        return null;

    }
}
