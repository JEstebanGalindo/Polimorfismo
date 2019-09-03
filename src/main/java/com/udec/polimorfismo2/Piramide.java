/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.polimorfismo2;

/**
 *Clase de la Piramide - hijo
 * @author julian esteban vallejo galindo
 */
public class Piramide extends TresDimensiones{
    
    double arista;
    double apotema;
    double altura;
    String tipo;
    double area;
    double volumen;

    /**
     * constructor de la clase Piramide
     * @param arista guarda la arista de la piramide
     * @param apotema guarda el apotema de la piramide
     * @param altura guarda la altura de la piramide
     * @param tipo guarda el tipo de la piramide
     */
    public Piramide(double arista, double apotema, double altura, String tipo) {
        this.arista = arista;
        this.apotema = apotema;
        this.altura = altura;
        this.tipo = tipo;
    }
    
    /**
     * metodo que halla el area de una piramide
     * @return area de una piramide 
     */
    @Override
    public double hallarArea() {
        area = (((arista*4)*apotema)/2)+Math.pow(arista, 2);
        return area;
    }

    /**
     * metodo que halla el volumen de una piramide
     * @return volumen de la piramide
     */
    @Override
    public double hallarVolumen() {
        volumen = (Math.pow(arista, 2)*12)/3;
        return volumen;
    }

    /**
     * metodo que imprime los datos tipo, area y volumen
     */
    @Override
    public void imprimirDatos() {
        hallarArea();
        hallarVolumen();
        System.out.println("La figura es: "+tipo+" El area es: "+area+"cm^2"+" El volumen es: "+ volumen+"cm^3");
    }
    
}
