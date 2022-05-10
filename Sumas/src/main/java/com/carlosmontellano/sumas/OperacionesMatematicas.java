/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlosmontellano.sumas;

/**
 *
 * @author Carlos
 */
public class OperacionesMatematicas {
    public int sumaElementos(int[] elementos)
    {
        int aux=0;
        for (int elemento:elementos)
        {
            aux+=elemento;
        }
        return aux;
    }
    
}
