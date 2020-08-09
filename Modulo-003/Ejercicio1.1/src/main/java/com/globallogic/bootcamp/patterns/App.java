package com.globallogic.bootcamp.patterns;

/**
 Ejercicio 1.1: Crear una clase ElectricalAppliance, con el atributo
power(con valor 500) y un método TurnOn que consuma 50 puntos de power.
Crear una clase ElectricalOven que herede de ElectricalAppliance y al 
ejecutar TurnOn consuma 75 puntos de power. Crear una tercer clase 
LedAppliance con el método TurnOn (que no herede de ElectricalAppliance) y 
que consuma 100 power. La clase ElectricalOven tiene un atributo LedApplance
y un método TurnLed que consuma 100 power al ElectricalOven. Agregar en 
Main: Una instancia de ElectricalOven que al comenzar imprima su energia
inicial (power), ejecutar TurnOn, imprimir power, ejecutar TurnLed e
imprimir su energía. (Debería terminar con 325 de power). Agregar los tests
necesatios para demostar que se realizó correctamente el ejercicio.
 */
public class App {

    public static void main(String[] args) throws Exception {
        
        //Ejercicio 1.1 - Patron Delegate
        ElectricalOven oven = new ElectricalOven(new LedAppliance());
        System.out.println(oven.getPower());
        
        oven.turnOn();
        System.out.println(oven.getPower());
        oven.turnLed();
        System.out.println(oven.getPower());
        
    }
    
}
