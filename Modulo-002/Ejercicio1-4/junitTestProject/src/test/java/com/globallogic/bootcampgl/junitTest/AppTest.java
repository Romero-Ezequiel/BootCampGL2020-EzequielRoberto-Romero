package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
Ejercicio 1.4: Crear un Test donde se evalue que una variable Long
inicializada en null. Luego asignarle el valor 1 volver a verificar
pero que esta vez no sea null.
*/


class AppTest {

    @Test
    void testLong() {
        Long valor = null;
        assertNull(valor);
        valor = (long) 1;
        assertNotNull(valor);
       
    }



}
