package practica5;

public class Vehiculo implements Comparable<Vehiculo> {
    private String modelo;
    private int potencia;

    public Vehiculo(String modelo, int potencia) {
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public int compareTo(Vehiculo otro) {
        return Integer.compare(this.potencia, otro.potencia);
    }
}
