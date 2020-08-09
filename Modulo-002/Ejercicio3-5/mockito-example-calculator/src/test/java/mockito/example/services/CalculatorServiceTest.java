package mockito.example.services;

import static org.junit.jupiter.api.Assertions.assertThrows;
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
    DataService dataService;
	
    
    @DisplayName("Ejercicio 3-5")
    @Test
    void tesNullPointerException() {

	when(dataService.getListOfNumbers()).thenReturn(null);
        assertThrows(NullPointerException.class, () -> {
            calculatorServiceImpl.calculateAverage();
        });
    }
}
