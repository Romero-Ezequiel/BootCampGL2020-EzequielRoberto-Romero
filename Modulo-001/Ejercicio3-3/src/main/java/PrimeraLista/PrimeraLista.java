package PrimeraLista;

/**
Ejercicio 3.3: Crear una clase PrimeraLista , agregar un método main(), 
dentro del método crear una Lista de Strings letters y agregar a la 
lista A, B y C.

Imprimir la lista y luego imprimir la cantidad de elementos que posee la 
lista. Agregar en la primera posición el elemento X y volver a imprimir
la lista.	 
 *
 */
public class PrimeraLista
{
    public static void main(String[] args)
    {
        String[] letters = new String[] {"A", "B", "C"};
        System.out.println(letters);
        System.out.println("La lista tiene " + letters.length + " elementos");
    }
}
