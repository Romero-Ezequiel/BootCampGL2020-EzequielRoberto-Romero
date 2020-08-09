package com.globallogic.bootcamp.patterns;

public class Order {

    private String description;
    private Integer count;
    private String currency;
    
    private static Order instancia;
    
    private Order(){

    }

    public static Order getInstancia(){
        if (instancia == null){
            instancia = new Order();
        }
        return instancia;
    }

}
