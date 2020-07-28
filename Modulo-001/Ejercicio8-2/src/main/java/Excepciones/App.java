package Excepciones;

/**
Ejercicio 8.2: A partir de un objeto inicializado en null, 
ejecute un método de este y capture la excepción mostrando en 
la salida: "Se produjo una excepción. null" *
 */
class ObjetoNull extends Exception {
    public ObjetoNull(String message){
        super();
    }
}

public class App 
{
    public static void main( String[] args )
    {    
        try{
            throw new ObjetoNull("null");
        }catch (Exception e){
            System.out.println("Se produjo una excepcion. " + e.getMessage());
        }
    }
}
