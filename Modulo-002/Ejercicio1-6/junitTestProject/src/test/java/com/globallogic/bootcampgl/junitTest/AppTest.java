package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
Ejercicio 1.6: Crear un método que sume dos parámetros de Type int. Crear
un test que utilice este método enviando dos valores y que verifique:

    - Que la suma sea correcta
    - Que la suma sea incorrecta con el mensaje "El resultado esta mal: "
*/

class AppTest {
    
    @Test
    void testSuma() {

        int resultado = App.sumar(2, 3);
        int esperado = 5;
        
        assertEquals(esperado, resultado, "El resultado es correcto");
        assertNotEquals(4, App.sumar(7,5), "El resultado está mal");

    }

}
