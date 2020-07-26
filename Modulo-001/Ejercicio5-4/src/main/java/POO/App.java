package POO;

/**
Ejercicio 5.4: Abstracción
abstract class Automovil {

    abstract void retoceder();

    void avanzar() {
        System.out.println("Soy el metodo avanzar de Automovil");
    }
}

Extender la clase Berlina de la clase Automovil
Implementar el metodo avanzar
Imprimir por pantalla el mensaje correspondiente
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Berlina b1 = new Berlina();
        b1.avanzar();
        b1.retroceder();
    }
}
