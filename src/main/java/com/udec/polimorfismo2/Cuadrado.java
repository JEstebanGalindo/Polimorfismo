/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.polimorfismo2;

/**
 *Clase del Cuadrado - hijo
 * @author julian esteban vallejo galindo
 */
public class Cuadrado extends DosDimensiones{

    double lado1;
    double lado2;
    String tipo;
    double area;
    double perimetro;

    /**
     * constructor de la clase Cuadrado
     * @param lado1 guarda el lado a
     * @param lado2 guarda el lado b
     * @param tipo guarda que tipo de cuadrado es
     */
    public Cuadrado(double lado1, double lado2, String tipo) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.tipo = tipo;
    }
    
    /**
     * metodo que halla el area de un cuadrdado
     * @return area del cuadrado
     */
    @Override
    public double hallarArea() {
        area = lado1* lado2;
        return area;
    }
    
    /**
     * metodo que halla el perimetro de un cuadrdado
     * @return perimetro del cuadrado 
     */
    @Override
    public double calcularPerimetro() {
        perimetro = lado1*2 + lado2*2;
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
