package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {
    
    @Test
    void testString() {
        String cadenaTexto1 = "lalala";
        String cadenaTexto2 = "lalala";
        String cadenaTexto3 = "lololo";
        
        assertNotEquals(cadenaTexto1, cadenaTexto2, cadenaTexto3);
    }

}
