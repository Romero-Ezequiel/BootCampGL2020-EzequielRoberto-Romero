package mockito.example.services;

import mockito.example.services.impl.BasicOperationsServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

  /*  @InjectMocks
    private CalculatorServiceImpl calculatorServiceImpl;

    @Mock
    private BasicOperationsService basicOperationsService;
*/
    
    @DisplayName("Ejercicio 3.9")
    @Test
    void testSpyBasicOperationsServiceImpl() {
        BasicOperationsService operacion = (BasicOperationsService) new BasicOperationsServiceImpl();
	BasicOperationsService ejemplo = spy(operacion);
	
        verify(ejemplo.add(2, 30));
        
       	
    }
    
}
