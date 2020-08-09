package testPatterns;

import com.globallogic.bootcamp.patterns.ElectricalAppliance;
import com.globallogic.bootcamp.patterns.ElectricalOven;
import com.globallogic.bootcamp.patterns.LedAppliance;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AppTest {

    private static ElectricalAppliance electricalAppliance;
    private static ElectricalOven electricalOven;
    
    
    @BeforeAll
    static void testPreparar() {
        
        electricalOven = new ElectricalOven(new LedAppliance());
       // electricalAppliance = new ElectricalAppliance();
        
    }
	
    @Test
    void testElecticalAplicance() {
        
        electricalAppliance.turnOn();
        assertEquals(450, electricalAppliance.getPower());
        electricalOven.turnOn();
        assertEquals(425, electricalOven.getPower());
        electricalOven.turnLed();
        assertEquals(325, electricalOven.getPower());
        
    }
}
