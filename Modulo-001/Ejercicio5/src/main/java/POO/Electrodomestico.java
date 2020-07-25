package POO;

class Electrodomestico 
{
    private String marca;
    private double pesos;
    private char consumo;


    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPesos(double pesos) {
        this.pesos = pesos;
    }

    public char getConsumo() {
        return consumo;
    }
    public String getMarca() {
        return marca;
    }

    public double getPesos() {
        return pesos;
    }

    public void encender(){
        System.out.println("Encendiste el Electrodomestico");
    }

    public void apagar(){
        System.out.println("Apagaste el Eletrodomestico");
    }
}

