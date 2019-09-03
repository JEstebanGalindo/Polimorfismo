/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.polimorfismo2;

/**
 * Clase del Cubo - hijo
 * @author julian esteban vallejo galindo
 */
public class Cubo extends TresDimensiones{

    double arista;
    String tipo;
    double area;
    double volumen;

    /**
     * constructor de la clase Cubo
     * @param arista guarda la arista del cubo
     * @param tipo gusrda que tipo de cubo es
     */
    public Cubo(double arista, String tipo) {
        this.arista = arista;
        this.tipo = tipo;
    }

    /**
     * metodo que halla el area de un cubo
     * @return area del cubo
     */
    @Override
    public double hallarArea() {
        area = 6 * Math.pow(arista, 2);
        return area;
    }

    /**
     * metodo que halla el volumen de un cubo
     * @return volumen del cubo
     */
    @Override
    public double hallarVolumen() {
        volumen = Math.pow(arista, 3);
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
