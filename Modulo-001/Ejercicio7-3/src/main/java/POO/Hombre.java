package POO;

public class Hombre implements  Persona{

    public void hablar(){
        System.out.println("Las personas hablan mucho");
    }

    public void dormir(){
        System.out.println("El hombre duerme muchas horas");
    }

    public void come() {
        try{
            throw new UnsupportedOperationException("El hombre no hace sonidos de animal"); 
        } catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }
}