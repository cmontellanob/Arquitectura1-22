package com.carlosmontellano.abstractfactory;

public interface IFabricaAbstracta {

	IConexionBD getBD(String motor);
	IConexionREST getREST(String area);
	
}
