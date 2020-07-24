package TiposPrimitivos;

/**
Ejercicio 3.1 : Creación de tipo de datos primitivos
Pasos:
Crear una clase TiposPrimitivos con un método main() 
Dentro del método crear una variable llamada myNum de tipo int y 
asígnarle el valor 15. Imprimir el valor utilizando System.out.println(myNum);
Crear una variable de tipo char,  asignar el valor  'a'  e imprimir su valor.
Crear una variable de tipo booleano, asignar el valor true e imprimir su valor.
Crear una variable de tipo float,  asignar el valor  '2436.2456' e imprimir su 
valor. Crear una variable de tipo short,  asignar el valor  '500' e 
imprimir su valor.

Se espera como salida: 
El valor de mi numero es 15
El valor de caracter es a
El valor de b es true
El valor de mifloat es 2436.2456
El valor de mishort es 500
 *
 */
public class TiposPrimitivos 
{
    public static void main( String[] args )
    {
        //Creación y asignación de una variable de tipo int e imprimir su valor
        int myNum = 15;
        System.out.println("El valor de mi numero es "+ myNum);

        //Creación y asignacón de una variable de tipo char e imprimir su valor
        char valor = 'a';
        System.out.println("El valor de mi caracter es "+ valor);

        //Creación y asignacón de una variable de tipo boolean e imprimir su valor
        boolean b = true;
        System.out.println("El valor de b es " + b);

        float mifloat = 2436.2456F;
        System.out.println("El valor de mifloat es "+ mifloat);

        short mishort = 500;
        System.out.println("El valor de mishort es "+ mishort);

    }
}
