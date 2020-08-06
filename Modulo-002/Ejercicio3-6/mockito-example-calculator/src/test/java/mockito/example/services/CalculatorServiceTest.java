package mockito.example.services;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import mockito.example.exception.ZeroDivisionException;
import mockito.example.services.impl.CalculatorServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

    @InjectMocks
    private CalculatorServiceImpl calculatorServiceImpl;

    @Mock
    private BasicOperationsService basicOperationsService;
	
    @Test
    @DisplayName("Ejercicio 3.6 - Módulo 2 - Mockito")
    void testZeroDivisionException() {
	assertThrows(ZeroDivisionException.class, () -> {
		calculatorServiceImpl.calculateDivision(3, 0);
        });
		
	verify(basicOperationsService, never()).divide(3,0);
    }
}
