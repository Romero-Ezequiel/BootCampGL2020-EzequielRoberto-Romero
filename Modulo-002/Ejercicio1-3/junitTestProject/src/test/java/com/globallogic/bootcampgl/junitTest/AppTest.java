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
        assertTrue(25 > 12);
        assertFalse(25 > 27);
    }

}
