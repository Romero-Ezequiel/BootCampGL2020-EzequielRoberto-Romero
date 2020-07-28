package Excepciones;

/**
Ejercicio 8.4: Crear su propia clase de excepción (Llamada MiExcepcion) 
* extendiendo la clase Exception. Dicha clase deberá almacenar internamente 
* una referencia de tipo String. Escriba un método que muestre la cadena de 
* caracteres almacenada.

Crear otra clase llamada "PropiaClaseExcepcion" donde capture la excepción 
* anterior y utilice el método para mostrar el sting almacenado.
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        try{
            cadenaAlmacenada("342");
            throw new MiExcepcion("Error!! ");
        }catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }
    }

    private static void cadenaAlmacenada(String cadena) {
        try{
            System.out.println(cadena);
            throw new MiExcepcion("Error"); 
        } catch(MiExcepcion e){
            System.out.println("Se produjo un "+ e.getMessage());
        }
    }
    

}
