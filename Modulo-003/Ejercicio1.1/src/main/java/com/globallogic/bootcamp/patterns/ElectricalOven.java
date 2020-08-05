package com.globallogic.bootcamp.patterns;

public class ElectricalOven extends ElectricalAppliance {

    private final LedAppliance LedAppliance;
    
    public ElectricalOven(){
        LedAppliance = new LedAppliance();
    }
    
    
    public void TurnLed(Integer p) throws Exception{
        LedAppliance.TurnOn(p);
    }

}
