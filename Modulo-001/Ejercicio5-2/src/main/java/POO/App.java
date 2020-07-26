package POO;

import java.util.ArrayList;

/**
Ejercicio 5.2: Polimorfismo
Crear todas las clases del diagrama anterior.
Sobrescribir el método encender en cada subclase.
Crear una instancia de cada 

electrodoméstico (Heladera, Cafetera, Televisor)
Hacer una lista de electrodomésticos
Agregar cada instancia a la lista de electrodomésticos
Recorrer la lista y llamar al método encender
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Heladera hela1 = new Heladera(2, true, 1);
        Cafetera cafe = new Cafetera(30);
        Televisor tele = new Televisor(20, "HD");

        ArrayList<Electrodomestico> electrodomésticos = new ArrayList<Electrodomestico>();

        electrodomésticos.add(hela1);
        electrodomésticos.add(cafe);
        electrodomésticos.add(tele);

        for (Electrodomestico electrodomestico : electrodomésticos) {
            electrodomestico.encender();
        }

    }
}
