package POO;

/**
Ejercicio 5.3: Encapsulamiento
public class Gato {
    private String nombre;
    private int patas;
    public getNombre(){ return nombre;}
    public getPatas(){ return patas;}
    public setNombre(String nuevoNombre){ nombre = nuevoNombre;}
    public setPatas(int numeroPatas){ patas = numeroPatas;}
}
 
Instanciar la clase Gato
Setear un nombre y patas al objeto Gato
Imprimir por pantalla nombre y número de patas
 *
 */
class Gato {
    private String nombre;
    private int patas;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getPatas() {
        return patas;
    }
}

public class Main
{
    public static void main( String[] args )
    {
        Gato gaturro = new Gato();
        gaturro.setNombre("Gaturro");
        gaturro.setPatas(4);

        System.out.println("Se llama " + gaturro.getNombre() + " y tiene " +gaturro.getPatas() + " patas");
    }
}
