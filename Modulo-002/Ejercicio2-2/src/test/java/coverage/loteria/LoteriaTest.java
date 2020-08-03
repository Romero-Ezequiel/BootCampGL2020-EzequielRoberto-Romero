package coverage.loteria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;

import coverage.loteria.model.CartonGenerator;

class LoteriaTest {

    private static final CartonGenerator cartonGenerator = new CartonGenerator();
    
    @Test
    public void getGanadores() {
	Loteria loteria = new Loteria(20000, 1000, cartonGenerator);
	assertNotNull(loteria);
        assertNotNull(loteria.getGanadores());
        cartonGenerator.isGanador();
        loteria.jugada();
        assertNotNull(loteria.hayGanadorUnico());
        assertFalse(loteria.hayCuadrupleGanador());
    }
    
}
