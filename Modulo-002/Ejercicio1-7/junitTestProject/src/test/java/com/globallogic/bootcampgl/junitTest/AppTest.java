package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
Ejercicio 1.7: Crear un método con las siguientes condiciones
    - Debe retornar un boolean
    - Realizar un for, con valor inicial 0 y donde el valor máximo de iteración
   será recibido por parámetro.
    - Se debe colocar un corte en la iteración cuando este llegue a 3
    retornando true, en caso contrario retornar false.

Crear un Test que utilice este método y donde se realice las assertions
en lo siguientes casos:
    - Enviar un máximo y que sea true con el mensaje "Esta variable no es 
    true"
    - Enviar un valor máximo y que sea false con el mensaje "Esta variable
    no es false"
*/


class AppTest {

    @Test
    void testCondicion() {
        App app = new App();
        
        boolean resultado = app.Condicion(6);
        boolean valorEsperado = true;
    	assertEquals(valorEsperado, resultado);
        
    }
    

}
