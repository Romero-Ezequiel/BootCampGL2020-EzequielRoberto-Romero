package POO;

public class POO {
    public static void main(String[] args){

        Electrodomestico tele = new Electrodomestico();
        tele.apagar();

        Televisor tele1 = new Televisor(20.4, "20");
        tele1.cambiarCanal(11);
        
    }
}