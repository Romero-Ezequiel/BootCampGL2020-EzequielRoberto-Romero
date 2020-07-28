package POO;

public class  Animal implements Persona {
    
    public void hablar(){
        System.out.println("El hombre no hace sonidos de animal");
    }
    
    public static void main(String[] args){
        
        Animal a1 = new Animal();
        a1.dormir();
        a1.come();
        a1.hablar();
    }

    public void dormir() {
        try{
            throw new UnsupportedOperationException("El hombre duerme muchas horas");
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
    }

    public void come() {
        try{
            throw new UnsupportedOperationException("Las personas hablan mucho");
        } catch (Exception e ){
            System.out.println(e.getMessage());
        }  
    }
}