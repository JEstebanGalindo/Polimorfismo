/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.polimorfismo2;

/**
 *Clase de la Esfera - hijo
 * @author julian esteban vallejo galindo
 */
public class Esfera extends TresDimensiones{

    double radio;
    double area;
    double volumen;
    String tipo;

    /**
     * constructor de la clase Esfera
     * @param radio guarda el radio de la esfera
     * @param tipo guarda que tipo de Esfera es
     */
    public Esfera(double radio, String tipo) {
        this.radio = radio;
        this.tipo = tipo;
    }
    
    /**
     * metodo que halla el area de una esfera
     * @return area de la esfera
     */
    @Override
    public double hallarArea() {
        area = 4 * Math.PI * Math.pow(radio, 2);
        return area;
    }

    /**
     * metodo que halla el volumen de la esfera
     * @return volumen de la esfera
     */
    @Override
    public double hallarVolumen() {
        volumen = (4 * Math.PI * Math.pow(radio, 3)) / 3;
        return volumen;
    }

    /**
     * metodo que imprime datos tipo, area y volumen
     */
    @Override
    public void imprimirDatos() {
        hallarArea();
        hallarVolumen();
        System.out.println("La figura es: "+tipo+" El area es: "+area+"cm^2"+" El volumen es: "+ volumen+"cm^3");
    }
    
}
