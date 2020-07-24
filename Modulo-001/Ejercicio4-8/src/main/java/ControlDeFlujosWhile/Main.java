package ControlDeFlujosWhile;

/**
Ejercicio 4.8:  Realizar un While de 1 a 50, imprimir
“Valor iterado <valor> par” (Si el valor es par) o imprimir 
“Valor iterado <valor> impar”(si el valor es impar).

Ejemplo salida: 
Valor iterado 1 impar
Valor iterado 2 par
...
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        int i = 1;
        while(i <=50){
            if(i % 2 == 0){
                System.out.println("El valor iterado "+ i + " es par");
            }else{
                System.out.println("El valor iterado "+ i + " es impar");
            }
            i++;
        }

    }
}
