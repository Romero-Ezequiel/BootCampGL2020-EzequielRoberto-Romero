package mockito.example.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import mockito.example.services.impl.CalculatorServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

    @InjectMocks
    private CalculatorServiceImpl calculatorServiceImpl;

    @Mock
    private BasicOperationsService basicOperationsService;

    @Test
    @DisplayName("Ejercicio 3-7")
    void testSuma() {
        
        when(basicOperationsService.add(12, 3)).thenReturn(15.0);
        assertEquals("El resultado es: " + calculatorServiceImpl.calculateSum(12, 3), calculatorServiceImpl.printResult(calculatorServiceImpl.calculateSum(12, 3)));
    
    }
}
