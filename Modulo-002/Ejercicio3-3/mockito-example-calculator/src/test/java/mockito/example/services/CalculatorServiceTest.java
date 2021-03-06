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
    @DisplayName("Suma")
    void tesAdd() {		
        
	when(basicOperationService.add(5, 5)).thenReturn(10.0);
        Assert.assertEquals(10.0, calc.calculateSum(5, 5));
	verify(basicOperationService).add(5, 5);
    }
	
    @Test
    @DisplayName("Resta")
    void testSubtract() {
        
	when(basicOperationService.subtract(8, 3)).thenReturn(5.0);
        Assert.assertEquals(5.0, calc.calculateSubstraction(8, 3));
	verify(basicOperationService).subtract(8, 3);
    }
	
    @Test
    @DisplayName("Multiplicacion")
    void testMultiply() {	
	
	when(basicOperationService.multiply(2, 2)).thenReturn(4.0);
        Assert.assertEquals(4.0, calc.calculateMultiplication(2, 2));
	verify(basicOperationService).multiply(2, 2);
    }
	
    @Test
    @DisplayName("Division")
    void testDivide() {
        
	when(basicOperationService.divide(10, 2)).thenReturn(5.0);
        Assert.assertEquals(5.0, calc.calculateDivision(10, 2));
	verify(basicOperationService).divide(10, 2);
    }
}
