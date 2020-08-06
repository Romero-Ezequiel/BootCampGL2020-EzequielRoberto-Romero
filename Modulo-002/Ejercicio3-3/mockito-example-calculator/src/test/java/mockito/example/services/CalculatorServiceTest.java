package mockito.example.services;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import junit.framework.Assert;
import mockito.example.services.impl.CalculatorServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
	
    @InjectMocks
    CalculatorServiceImpl calc;

    @Mock
    private BasicOperationsService basicOperationService;

    @Test
    @DisplayName("Test suma")
    void tesAdd() {		
	when(basicOperationService.add(5, 5)).thenReturn(10.0);
	double resultado =  calc.calculateSum(5, 5);
	Assert.assertEquals(10.0, resultado);
	verify(basicOperationService).add(5, 5);
    }
	
    @Test
    @DisplayName("Test resta")
    void testSubtract() {
	when(basicOperationService.subtract(8, 3)).thenReturn(5.0);
	double resultado =  calc.calculateSubstraction(8, 3);
	Assert.assertEquals(5.0, resultado);
	verify(basicOperationService).subtract(8, 3);
    }
	
    @Test
    @DisplayName("Test multiplicacion")
    void testMultiply() {	
	
	when(basicOperationService.multiply(2, 2)).thenReturn(4.0);
	double resultado =  calc.calculateMultiplication(2, 2);
	Assert.assertEquals(4.0, resultado);
	verify(basicOperationService).multiply(2, 2);
    }
	
    @Test
    @DisplayName("Test division")
    void testDivide() {
	when(basicOperationService.divide(10, 2)).thenReturn(5.0);
	double resultado =  calc.calculateDivision(10, 2);
	Assert.assertEquals(5.0, resultado);
	verify(basicOperationService).divide(10, 2);
    }
}
