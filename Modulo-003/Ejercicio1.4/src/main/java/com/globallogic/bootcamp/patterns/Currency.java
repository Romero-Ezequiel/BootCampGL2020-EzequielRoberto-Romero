package com.globallogic.bootcamp.patterns;


public class Currency {
    
    private final String name;
    private static Currency instance;
    
    private Currency(){
        this.name = "ARS";
    }
    
    public static Currency getInstance(){
        if(instance == null){
            instance = new Currency();
        }
        return instance;
    }
    
    public void mostrar(){
        System.out.println("El valor de name es: "+ this.name);
    }
    
}
