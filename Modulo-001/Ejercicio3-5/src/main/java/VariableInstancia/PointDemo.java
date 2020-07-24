package VariableInstancia;

/**
Ejercicio 3.5: Crear una nueva clase VariableInstancia.
En la clase agregamos 3 variables entera engPoints, mathsPoints y 
phyPoints..

Crear otra clase PointDemo que posea un método main().
En el método main() crear una variable de tipo VariableInstancia con 
nombre vI y la inicializamos.
Le asignamos a engPoints el valor 50 y a mathsPoints  el valor 80.
Imprimir el valor.
 *
 */

class VariableInstancia{
    int engPoints, mathsPoints, phyPoints;
}

public class PointDemo{
    public static void main(String[] args){
        VariableInstancia vI = new VariableInstancia();
        vI.engPoints = 50;
        vI.mathsPoints = 80;

        System.out.println(vI.engPoints + " " + vI.mathsPoints);

    }
}

