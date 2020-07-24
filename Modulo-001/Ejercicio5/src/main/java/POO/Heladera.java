package POO;

public class Heladera extends Electrodomestico{

    private double capacidad;
    private boolean tieneFreezer;
    private double capacidadFreezer;

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void setCapacidadFreezer(double capacidadFreezer) {
        this.capacidadFreezer = capacidadFreezer;
    }

    public void setTieneFreezer(boolean tieneFreezer) {
        this.tieneFreezer = tieneFreezer;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public double getCapacidadFreezer() {
        return capacidadFreezer;
    }

    public boolean getTieneFreezer(){
        return tieneFreezer;
    }

    public void guardarElemento(String dato){
        System.out.println("Guardaste "+ dato+ " en la Heladera?");
    }

    public void extraerElemento(String dato){
        System.out.println("Sacaste "+ dato + " de la Heladera?");
    }
    
}