package Condicional;

/**
Ejercicio 4.2:  Dado los siguientes valores de entrada “A” y “b”,
determinar si una letra es mayúscula o no. 
Imprimir "Es una letra mayuscula"  en el caso de ser mayúscula.
Imprimir "No es una letra mayuscula"  en el caso de ser minúscula. *
 */
import java.util.Scanner;

public class Main 
{
    public static void main(String[ ] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print ("Ingrese un caracter: ");
        char letra = teclado.nextLine().charAt(0);
        
        if(Character.isUpperCase(letra)){
            System.out.println("Mayúscula");
        }else{
            System.out.println("Minúscula");
        }
    }
}
