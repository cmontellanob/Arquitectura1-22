/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlosmontellano.bridge;

/**
 *
 * @author Carlos
 */
public class ElaborarLasagna extends ElaborarAlimento
{
    public ElaborarLasagna( IElaborar implementador )
    {
        this.setImplementador( implementador );
    }
    // ------------------------
    @Override
     public void obtener()
    {
        System.out.println("Preparando lasagna...");
         this.getImplementador().procesar();
    }
}