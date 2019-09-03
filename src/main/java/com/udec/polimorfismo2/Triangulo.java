/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.polimorfismo2;

/**
 *Clase de Triangulo - hijo
 * @author julian esteban vallejo galindo
 */
public class Triangulo extends DosDimensiones{

    float lado1;
    float lado2;
    float lado3;
    String tipo;
    double area;
    double perimetro;

    /**
     * constructor de la clase triangulo
     * @param lado1 guarda el primer lado
     * @param lado2 guarda el segundo lado
     * @param lado3 guarda el tercer lado
     * @param tipo guarda el tipo de triangulo que es
     */
    public Triangulo(float lado1, float lado2, float lado3, String tipo) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.tipo = tipo;
    }
    
    /**
     * metodo que halla el area de un triangulo
     * @return area del triangulo
     */
    @Override
    public double hallarArea() {
        double semiperimetro;
        semiperimetro = (lado1+lado2+lado3)/2;
        area=(Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3)));
        return area;
    }

    /**
     * metodo que calcula el perimetro de un triangulo
     * @return perimetro del triangulo
     */
    @Override
    public double calcularPerimetro() {
        perimetro = lado1+lado2+lado3;
        return perimetro;
    }

    /**
     * metodo que imprime los datos tipo, area y perimetro
     */
    @Override
    public void imprimirDatos() {
        hallarArea();
        calcularPerimetro();
        System.out.println("La figura es: "+tipo+" El area es:"+ area+"cm^2"+" El perimetro es: "+ perimetro+"cm");
    }
    
    
    
}
