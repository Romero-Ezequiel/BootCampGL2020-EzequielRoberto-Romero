package com.globallogic.bootcamp.patterns;

public class ElectricalOven extends ElectricalAppliance {

    private LedAppliance ledAppliance;
   
    public ElectricalOven(LedAppliance led){
        this.ledAppliance = led;
    }

    @Override
    public void turnOn(){
        this.setPower(this.getPower() - 75);
    }
    
    public void turnLed(){
        this.setPower(ledAppliance.turnOn(this.power));
    }

}
