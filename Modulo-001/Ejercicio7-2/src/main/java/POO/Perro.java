package POO;

class Perro implements Animal {
    
    public void dormir(){
        System.out.println("El perro hace guau guau");
    }

    public void sonidoAnimal(){
        System.out.println("Zzz");
    }

    public void Come(String s){
        System.out.println("El "+ s +" alimenta");
    }

    public void camina(String s){
       System.out.println("El "+ s +" camina");
    }
}