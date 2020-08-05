package com.globallogic.bootcamp.patterns;

public class LedAppliance {
    
    private final Integer power = 100;
  
    public void TurnOn(int p){
        int consumo = power - p;
        System.out.println(consumo);
    }

    
}
