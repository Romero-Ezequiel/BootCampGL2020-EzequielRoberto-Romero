package com.globallogic.bootcamp.patterns;

/*
Ejercicio 1.4:  Crear una clase Product, con el atributo 
name (con valor "Clavos") siendo esta un singleton, e
incluir en la clase Order un atributo de esta clase. Agregar los 
tests necesarios para demostrar que se realizó correctamente el ejercicio.
*/

public class App {

    public static void main(String[] args) {

        Product p1 = Product.getInstance();
        
        System.out.println(p1.getName());
       
    }   
}
