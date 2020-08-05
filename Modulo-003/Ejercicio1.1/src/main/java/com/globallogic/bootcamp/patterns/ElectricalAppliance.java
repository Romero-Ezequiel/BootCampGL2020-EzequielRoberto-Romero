package com.globallogic.bootcamp.patterns;

public class ElectricalAppliance {
    
    private final Integer power = 500;
    
    public void TurnOn(Integer p){
        //System.out.println(p);
        Integer consumo =  power - p;
        System.out.println(consumo);
    }
}
