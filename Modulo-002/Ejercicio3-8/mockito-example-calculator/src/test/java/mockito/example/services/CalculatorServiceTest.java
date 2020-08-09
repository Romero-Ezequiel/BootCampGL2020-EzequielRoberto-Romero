package mockito.example.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import mockito.example.services.impl.CalculatorServiceImpl;
import static org.junit.Assert.assertTrue;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

    @InjectMocks
    private CalculatorServiceImpl calculatorServiceImpl;    
    
    @Test
    @DisplayName("Ejercicio 3.8")
    
    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3, 4, 5 , 6, 7, 8, 9, 10 })
    void calculoDataService6(int numero) {
	assertTrue(calculatorServiceImpl.isOdd(numero));
    }

}
