package ControlDeFlujosFor;

/**
Ejercicio 4.6:  Crear un array string con todos los días de la
semana ("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", 
"Domingo"), recorrer ese array con un For e imprimir cada uno de los valores.

Ejemplo salida: 
Dia de la semana: Lunes
Dia de la semana: Martes
...
 *
 */
public class App 
{

    
    public static void main(String[] args)
    {
        String semana[] = {"Lunes","Martes","Miercoles","Jueves","Viernes", "Sabado","Domingo"};
        
        for(int i=0; i <= semana.length; i++){
            System.out.println("Dia de la semana: "+ i);
        }
    }
}
