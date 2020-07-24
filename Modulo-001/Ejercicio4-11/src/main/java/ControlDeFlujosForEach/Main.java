package ControlDeFlujosForEach;

/**

Ejercicio 4.11:  Iterar con un For each el string “BootCamp 2020” 

e imprimir cada carácter.
		
Ejemplo salida: 
Letra: B
Letra: o
Letra: o
...
 *
 */
public class Main
{
    public static void main(String[] args)
    {
        String palabra = "BootCamp 2020";
        for (char iterar : palabra.toCharArray()) {
            System.out.println(iterar);
        }
    }
}
