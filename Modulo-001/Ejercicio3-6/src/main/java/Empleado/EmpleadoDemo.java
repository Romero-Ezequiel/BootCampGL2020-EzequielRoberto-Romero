package Empleado;

/**
Ejercicio 3.6:Crear una nueva clase Empleado.
En la clase agregamos 2 variables estáticas salario de tipo double y 
nombre String. A nombre inicializarla con  el valor “Alex”.

Crear otra clase EmpleadoDemo que posea un método main().
En el método  main() asignarle el valor de 1000 a la variable salario y a 
continuación imprimir el valor 
como por ejemplo “Alex  tiene un salario promedio de 1000”.
 *
 */

class Empleado{
    static double salario;
    static String nombre = "Alex";
}

public class EmpleadoDemo 
{
    public static void main(String[] args)
    {
        Empleado.salario = 1000;

        System.out.println(Empleado.nombre + "  tiene un salario promedio de "+ Empleado.salario );
    }
}
