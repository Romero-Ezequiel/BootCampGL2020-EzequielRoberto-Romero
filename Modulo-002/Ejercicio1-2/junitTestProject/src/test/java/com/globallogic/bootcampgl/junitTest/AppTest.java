package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void test() {
        String texto1 = "hola";
        String texto2 = "hola";
        
        assertEquals(texto1, texto2);   
    
    }

}
