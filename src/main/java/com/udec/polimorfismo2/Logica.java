/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.polimorfismo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase de la logica del programa
 * @author julian esteban vallejo galindo
 */
public class Logica {
    List<Figuras> lista = new ArrayList();
    String dimension;
    String tipoTriangulo;
    Scanner ladosTriangulo = new Scanner(System.in);
    Scanner entrada = new Scanner(System.in);
    
    
    /**
     * metodo que solicita la dimension de las figuras
     */
    public void solicitarDimension(){
        boolean seguir = true;
        while (seguir == true) {
            if(lista.isEmpty()){
                System.out.println("¿En qué dimensión desea la figura?");
                System.out.println("2D / 3D");
                dimension = entrada.nextLine();
                dimensiones(dimension);               
            }else{
                System.out.print("¿Desea continuar? ");
                System.out.println("S / N ");
                String opcion = entrada.nextLine();
                if (opcion.equals("s") || opcion.equals("S")) {
                    System.out.println("¿En qué dimensión desea la figura?");
                    System.out.println("2D / 3D");
                    dimension = entrada.nextLine();
                    dimensiones(dimension);  
                }else{
                    recorrerLista();
                    seguir=false;
                }            
            }
        }
    }
    
    /**
     * metodo que llama a dosDimensiones o a tresDimensiones
     * @param dimension guarda la dimension digitada
     */
    public void dimensiones(String dimension){
        if(dimension.equals("2d") || dimension.equals("2D")){
            dosDimensiones();
        }else{
            tresDimensiones();
        }    
    }
    
    /**
     * metodo que muestra un menu de figuras de 2 dimensiones
     */
    public void dosDimensiones(){
        int figura;
        Scanner opcion = new Scanner(System.in);
        
        System.out.println("Escoja una opción:");
        System.out.println("1 - Triangulo");
        System.out.println("2 - Cuadrado");
        System.out.println("3 - Circulo");        
        figura = opcion.nextInt();
        if(figura == 1){
            pedirDatosTriangulo();
        }else if(figura == 2){            
            pedirDatosCuadrado();
        }else if(figura == 3){
            pedirDatosCirculo();
        }            
    }
    
    /**
     * metodo que muestra un menu de figuras de 3 dimensiones
     */
    public void tresDimensiones(){
        int figura;
        Scanner opcion = new Scanner(System.in);
        
        System.out.println("Escoja una opción:");
        System.out.println("1 - Piramide");
        System.out.println("2 - Cubo");
        System.out.println("3 - Esfera");        
        figura = opcion.nextInt();
        if(figura == 1){
            pedirDatosPiramide();
        }else if(figura == 2){            
            pedirDatosCubo();
        }else if(figura == 3){
            pedirDatosEsfera();
        }
    } 
    
    /**
     * metodo que solicita los datos de cuadrado
     */
    public void pedirDatosCuadrado(){
        float lado1;
        float lado2;
        String tipo;
        Scanner lados = new Scanner(System.in);
        System.out.println("Ingrese el lado 1 en cm :");
        lado1 = lados.nextInt();
        System.out.println("Ingrese el lado 2 en cm :");
        lado2 = lados.nextInt();
        if(lado1 == lado2){
            tipo = "Cuadrado";
            Cuadrado cuadrado = new Cuadrado(lado1,lado2,tipo);
            lista.add(cuadrado);
        }else{
            tipo = "Rectangulo";
            Cuadrado cuadrado = new Cuadrado(lado1,lado2,tipo);
            lista.add(cuadrado);
        }
    }
    
    /**
     * metodo que solicita los datos de circulo
     */
    public void pedirDatosCirculo(){
        float radio;
        String tipo;
        Scanner lados = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo en cm: ");
        radio = lados.nextInt();
        tipo = "Circulo";
        Circulo circulo = new Circulo(radio,tipo);
        lista.add(circulo);
    }
    
    /**
     * metodo que solicita los datos de triangulo
     */
    public void pedirDatosTriangulo(){
        float lado1;
        float lado2;
        float lado3;
        System.out.println("Ingrese el lado 1 en cm :");
        lado1 = ladosTriangulo.nextInt();
        System.out.println("Ingrese el lado 2 en cm :");
        lado2 = ladosTriangulo.nextInt();
        System.out.println("Ingrese el lado 3 en cm :");
        lado3 = ladosTriangulo.nextInt();
        if(lado1 == lado2 && lado1 == lado3){
            tipoTriangulo = "Triangulo Equilatero";
            Triangulo triangulo = new Triangulo(lado1,lado2,lado3,tipoTriangulo);
            lista.add(triangulo);
        }else if (lado1 != lado2 && lado1 !=lado3){
            tipoTriangulo = "Triangulo Escaleno";
            Triangulo triangulo = new Triangulo(lado1,lado2,lado3,tipoTriangulo);
            lista.add(triangulo);
        }else{
            tipoTriangulo = "Triangulo Isosceles";
            Triangulo triangulo = new Triangulo(lado1,lado2,lado3,tipoTriangulo);
            lista.add(triangulo);
        }
    }
    
    /**
     * metodo que solicita los datos de esfera
     */
    public void pedirDatosEsfera(){
        float radio;
        String tipo;
        Scanner lados = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera en cm: ");
        radio = lados.nextInt();
        tipo = "Esfera";
        Esfera esfera = new Esfera(radio,tipo);
        lista.add(esfera);
    }
    
    /**
     * metodo que solicita los datos de cubo
     */
    public void pedirDatosCubo(){
        float arista;
        String tipo;
        Scanner lados = new Scanner(System.in);
        System.out.println("Ingrese una arista del cubo en cm :");
        arista = lados.nextInt();
        tipo = "Cubo";
        Cubo cubo = new Cubo(arista,tipo);
        lista.add(cubo);
    }
    
    /**
     * metodo que solicita los datos de piramide
     */
    public void pedirDatosPiramide(){
        float arista;
        float apotema;
        float altura;
        Scanner datos = new Scanner(System.in);
        String tipo;
        System.out.println("Ingrese una arista de la piramide en cm :");
        arista = datos.nextInt();
        System.out.println("Ingrese el apotema de la piramide en cm :");
        apotema = datos.nextInt();
        System.out.println("Ingrese la altura de la piramide en cm :");
        altura = datos.nextInt();
        
        tipo = "Piramide Cuadrangular";
        Piramide piramide = new Piramide(arista,apotema,altura,tipo);
        lista.add(piramide);
        
    }
    
    
    /**
     * metodo que hace el casteo final
     */
    public void recorrerLista(){
        for(int i=0; i<lista.size(); i++){           
            if(lista.get(i) instanceof Cuadrado) {
                ((Cuadrado) lista.get(i)).imprimirDatos();        
            }else if(lista.get(i) instanceof Circulo){
                ((Circulo) lista.get(i)).imprimirDatos();            
            }else if (lista.get(i) instanceof Triangulo){
                ((Triangulo) lista.get(i)).imprimirDatos();            
            }else if (lista.get(i) instanceof Cubo){
                ((Cubo) lista.get(i)).imprimirDatos();            
            }else if (lista.get(i) instanceof Esfera){
                ((Esfera) lista.get(i)).imprimirDatos();            
            }else if (lista.get(i) instanceof Piramide){
                ((Piramide) lista.get(i)).imprimirDatos();            
            }
        }
    }
    
}
