package POO;

class Cafetera extends Electrodomestico{
    
    private double litros;

    public Cafetera(double litros){
        super();
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public void elegirSabor(String sabor){
        System.out.println("Elegiste " + sabor + " que buen Sabor xD");
    }

}