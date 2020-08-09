package com.globallogic.bootcamp.patterns;

/*
Ejercicio 1.5: Inyección de dependencia
Crear una clase Game con el atributo title 
Crear una clase Playstation con el atributo videogame de la clase Game, 
un constructor que inyecte un objeto Game en el atributo videogame, 
un setter que reemplace el objeto Game, un método askMyGame que devuelva 
el string “El videojuego que estoy corriendo es: “ y el título del 
videojuego inyectado en caso de que no tenga ningún videojuego, 
que devuelve el string “¡Estoy vacío!”. En el método Main, crear una 
instancia de Playstation inyectando un juego de titulo “Resident Evil”,
imprimir el contenido de askMyGame(). Inyectar otra instancia de 
Game (usando el setter) con el título “Brawlhalla” e
imprimir la respuesta de askMyGame(). Por último, inyectar en 
Nulo un videogame e imprimir el contenido de askMyGame(). 
*/

public class App {

    public static void main(String[] args) {
        
        //Inyectar un juego de titulo Resident Evil
        Playstation p1 = new Playstation(new Game("Resident Evil"));
        System.out.println(p1.askMyGame());
        
        //Inyectar titulo Brawlhalla
        p1.setVideogame(new Game("Brawlhalla"));
        System.out.println(p1.askMyGame());
        
        //Inyectar en Nulo un videogame
        p1.setVideogame(null);
        System.out.println(p1.askMyGame());
    }   
}
