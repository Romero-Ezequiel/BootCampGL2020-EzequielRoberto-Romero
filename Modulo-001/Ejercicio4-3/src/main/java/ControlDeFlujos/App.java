package ControlDeFlujos;

import java.util.Scanner;

/**
Ejercicio 4.3:  Mediantes la cláusula IF resolver la siguiente
problemática. En Tienda se hace un 20% de descuento a los clientes 
cuya compra sea igual a $300, del 25% a los clientes cuya compra 
sea mayor a $350 y sin descuento cuando no se cumple ninguna de 
las anteriores condiciones.
En el caso de tener descuento, imprimir los siguientes mensajes: 
El descuento es de:  <valor>
En el caso de no tener descuento, imprimir el siguiente mensaje: 
Sin descuentos, el total es: <valor>
Ejecutar este ejemplo, tomando como entrada una compra de $400 
 *
 */

public class App 
{
    public static void main( String[] args )
    {

        Scanner dato = new Scanner(System.in);

        int descuento;
        int compra;
        System.out.println("Introduzca el monto de su compra: ");
        compra = Integer.parseInt(dato.nextLine());

        if(compra == 300){
            descuento = ((25 * compra) / 100);
            System.out.println("Tienes un descuento de "+ descuento);
        }else{
            if (compra >= 350){
                descuento = ((25 * compra) / 100);
                System.out.println("Tienes un descuento de "+descuento);
            }else{
                System.out.println("Lo lamento no tienes descuentos");
            }
        }


    }
}
