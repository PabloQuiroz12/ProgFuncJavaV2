package practica5;

public class Auto extends Vehiculo {
    private boolean elevalunasElectrico;

    public Auto(String modelo, int potencia, boolean elevalunasElectrico) {
        super(modelo, potencia);
        this.elevalunasElectrico = elevalunasElectrico;
    }

    public boolean isElevalunasElectrico() {
        return elevalunasElectrico;
    }
}
