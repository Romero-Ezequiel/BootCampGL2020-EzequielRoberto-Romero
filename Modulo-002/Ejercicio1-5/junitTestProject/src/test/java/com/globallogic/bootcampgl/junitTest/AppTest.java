package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
Ejercicio 1.5: Modificar los ejercicios anteriores (1.2, 1.3 y 1.4) para
que todas las verificaciones resulten en error
*/

class AppTest {

    //Ejercicio 1.2 -> Para que tire error
    @Test
    void testVariables() {
        String palabra1 = "cadena";
        String palabra2 = "cadena";
        String palabra3 = "cadena";
        
        assertNotEquals(palabra1, palabra2, palabra3);
    }
 
    //Ejercicio 1.3 -> Para que tire error
    @Test
    void testBooleano(){
        
        assertTrue( 25 > 12, "Es mayor que" );
        assertFalse( 75 > 27, "No es mayor que" );
        
    }
    
    //Ejercicio 1.4 -> Para que tire error
    @Test
    void testLong(){
        Long valor = 20L;
        assertNull(valor, "El valor es null");
        valor = null;
        assertNotNull(valor, "El valor no es null");
        
    }
    

}
