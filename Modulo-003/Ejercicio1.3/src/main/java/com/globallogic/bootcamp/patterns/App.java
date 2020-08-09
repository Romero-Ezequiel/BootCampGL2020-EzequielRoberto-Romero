package com.globallogic.bootcamp.patterns;

public class App {

    public static void main(String[] args) {

        Order order1 = new Order("Descripcion - 1", 6);
        order1.getCurrency();     
        System.out.println(order1.getDescription());
        
    }
    
}
