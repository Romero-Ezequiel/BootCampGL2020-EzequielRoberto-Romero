package POO;

public class Cafetera extends Electrodomestico{
    
    private double litros;

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    Heladera heladera1x = new Heladera();

    public void elegirSabor(String sabor){
        System.out.println("Elegiste " + sabor + " que buen Sabor xD");
    }

}