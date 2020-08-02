package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {
    
    final String cadenaTexto1 = "lalala";
    final String cadenaTexto2 = "lalala";
    final String cadenaTexto3 = "lololo";

    @Test
    void test() {
        assertTrue(cadenaTexto1.equals(cadenaTexto2) && !cadenaTexto2.equals(cadenaTexto3));
    }
    
    /*
    
    @Test
    void testString() {
        String cadenaTexto1 = "lalala";
        String cadenaTexto2 = "lalala";
        String cadenaTexto3 = "lololo";
        
        assertNotEquals(cadenaTexto1, cadenaTexto2, cadenaTexto3);
    }*/

}
