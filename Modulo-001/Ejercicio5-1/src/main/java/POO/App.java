package POO;

/**
Ejercicio 5.1: Herencia
Crear clases: Electrodoméstico y Heladera que se muestran en el 
diagrama.

Hacer que Heladera extienda de Electrodoméstico.
A la hora de implementar los métodos hacerlo imprimiendo una 
descripción de su comportamiento.

Ej: System.out.println("Encendiendo electrodoméstico")
Crear una instancia de Electrodoméstico y una de Heladera.
Imprimir atributos y métodos de las instancias de Electrodoméstico 
y Heladera.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Electrodomestico heladera2020 = new Electrodomestico();
        heladera2020.encender();
    }
}
