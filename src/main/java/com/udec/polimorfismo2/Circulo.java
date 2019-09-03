/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.polimorfismo2;

/**
 * Clase del circulo - hijo
 * @author julian esteban vallejo galindo
 */
public class Circulo extends DosDimensiones {

    double radio;
    double area;
    double perimetro;
    String tipo;

    /**
     * Constructor de la clase Circulo
     * @param radio guarda el radio del circulo
     * @param tipo guarda el tipo del circulo
     */
    public Circulo(double radio, String tipo) {
        this.radio = radio;
        this.tipo = tipo;
    }    
    
    /**
     * metodo que halla el area de un circulo
     * @return area del circulo
     */
    @Override
    public double hallarArea() {
        area = Math.PI * Math.pow(radio,2);
        return area;
    }

    /**
     * metodo que halla el perimetro de un circulo
     * @return perimetro del circulo
     */
    @Override
    public double calcularPerimetro() {
        perimetro = 2*Math.PI*radio;
        return perimetro;
    }
    
    /**
     * metodo que imprime los datos tipo area y perimetro
     */
    @Override
    public void imprimirDatos() {
        hallarArea();
        calcularPerimetro();
        System.out.println("La figura es: "+tipo+" El area es:"+ area+"cm^2"+" El perimetro es: "+ perimetro+"cm");
    }
    
}
