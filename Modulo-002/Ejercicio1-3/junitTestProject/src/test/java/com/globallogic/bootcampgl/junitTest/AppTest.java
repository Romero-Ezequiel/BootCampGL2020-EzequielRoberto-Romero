package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*Ejercicio 1.3: Crear un Test con las siguientes assertions

    - 25 > 12 sea verdadero
    - 25 > 27 sea falso

*/

class AppTest {
    
    @Test
    void test() {
        boolean valor1 = 25 > 12;
        boolean valor2 = 25 > 27;
        assertTrue(valor1);
        assertFalse(valor2);
    }

}
