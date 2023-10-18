package practica5;

public class Moto extends Vehiculo {
    private boolean carenado;

    public Moto(String modelo, int potencia, boolean carenado) {
        super(modelo, potencia);
        this.carenado = carenado;
    }

    public boolean hasCarenado() {
        return carenado;
    }
}
