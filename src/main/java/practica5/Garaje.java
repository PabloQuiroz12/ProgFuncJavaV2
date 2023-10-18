package practica5;

import java.util.ArrayList;
import java.util.List;

public class Garaje {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void aparca(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void retira(Vehiculo vehiculo) throws VehiculoInexistenteException {
        if (!vehiculos.remove(vehiculo)) {
            throw new VehiculoInexistenteException("El vehículo no estaba en el garaje.");
        }
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void mostrarGaraje(Garaje garaje) {
        System.out.println("Vehículos en el garaje:");
        for (Vehiculo vehiculo : garaje.getVehiculos()) {
            System.out.println("Modelo: " + vehiculo.getModelo() + ", Potencia: " + vehiculo.getPotencia());
        }
    }
}

