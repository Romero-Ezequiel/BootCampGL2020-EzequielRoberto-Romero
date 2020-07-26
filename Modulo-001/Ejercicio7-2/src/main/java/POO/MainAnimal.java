package POO;

/**
/**
Ejercicio 7.2 : Metodo default y static 
Pasos:
A la interface creada en el ejercicio anterior le vamos a 
agregar 2 nuevos métodos.
Un método default llamado Come, que tiene como parámetro un
string, en este método vamos a mostrar un mensaje que sea 
System.out.println("El " + s + " se alimenta");
Un método static llamado camina, que tiene como parámetro un 
string, en este método vamos a mostrar un mensaje que sea 
System.out.println("El " + s + " camina");
En el main se agrega la invocación a estos métodos, pasandole 
a ambos el “perro” como parámetro.

Se espera como salida: 
El perro hace guau guau
Zzz
El perro se alimenta
El perro camina
 *
 */
public class MainAnimal
{
    public static void main( String[] args )
    {
        Perro dog = new Perro();
        dog.dormir();
        dog.sonidoAnimal();
        dog.Come("perro");
        dog.camina("perro");
    }
}
