package PrimeraVariable;

/**
Ejercicio 3.2: 
 	Pasos:
    Crear una clase PrimeraVariable, agregar un método main(), 
    dentro del método crear una variable de tipo String mensaje
    y asignes como valor de inicial "Valor inicial",imprimir el valor. 
    A continuación asígnar a la variable mensaje el valor "Valor modificado" 
    y vuelva a  imprimirla. *
 */
public class PrimeraVariable
{
    public static void main( String[] args )
    {
        String mensaje = "Valor inicial";
        System.out.println(mensaje);

        mensaje = "Valor modificado";
        System.out.println(mensaje);
    }
}
