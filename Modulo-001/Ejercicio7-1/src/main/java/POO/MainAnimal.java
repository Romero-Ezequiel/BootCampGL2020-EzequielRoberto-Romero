package POO;

/**
Ejercicio 7.1 : Creamos una interface 
Pasos:
Crear una interfaz InterfaceAnimal.
Definir dentro de la interfaz dos métodos: dormir y sonidoAnimal.
Crear una clase Perro que implemente la clase Animal.
Implementar los métodos creados en la interfaz Animal.
En cada método mostrar un mensaje de salida.
Crear una clase MainAnimal que posea un método main().
En el main crear una variable dog de tipo Perro e inicializarla.
Invocar los métodos creados anteriormente, primero a dormir y 
luego a sonidoAnimal.

Se espera como salida: 
El perro hace guau guau
Zzz
 *
 */
public class MainAnimal
{
    public static void main( String[] args )
    {

        Perro dog = new Perro();
        dog.dormir();
        dog.sonidoAnimal();

    }
}
