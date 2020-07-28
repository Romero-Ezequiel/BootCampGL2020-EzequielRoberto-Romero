package Excepciones;

/**
Ejercicio 8.3: Escriba código para generar y capturar
la excepción ArrayIndexOutOfBoundsException
(Índice de matriz fuera de límites) mostrando en la consola 
"Excepción: índice de array fuera de límites" *
 */

class ArrayIndexOutOfBoundsException extends Exception {
    public ArrayIndexOutOfBoundsException(String message){
        super();
    }
}

public class App 
{
    public static void main( String[] args )
    {
        try{
            String nombres [];
            nombres = new String[2];
            nombres[0] = "Lalala";
            nombres[1] = "lelele";
            nombres[2] = "lilili";  
            throw new ArrayIndexOutOfBoundsException("indice de array fuera de limites");
        }catch (Exception e){
            System.out.println("Excepción: "+ e.getMessage());
        }

    }
}
