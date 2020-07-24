package SudentDetails;

/**
Ejercicio 3.4: 
Crear una nueva clase StudentDetails.
Agregar un método studentAge, dentro crear una variable de tipo int con 
nombre age, valor 0 y sumar el valor 5.
Imprimir el valor de la variable  agregando como mensaje lo siguiente  
“La edad del estudiante es :”. En el main, crear una variable de tipo local 
de nombre estudiante, asignar una instancia de StudentDetails y luego invocar 
al método studentAge. Validar que la salida sea la correcta.

Luego modificar el método para que imprima la edad que reciba por parámetro en
vez del valor hardcodeado 5.
Validar que imprima el valor pasado por parámetro.
 *
 */
class StudentDetails 
{

    public void studentAge(int edad){
        int Age = 0 + 5;
        System.out.println("La edad del de este estudiante es :" + Age);

        System.out.println("La edad de este otro estudiante es de "+ edad);
    }
}

public class App{ 
    public static void main( String[] args )
    {
        StudentDetails nombreEstudiante = new StudentDetails();
        nombreEstudiante.studentAge(20);
    }
}
