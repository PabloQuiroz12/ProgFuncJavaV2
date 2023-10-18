package practica5;

import java.util.List;

public class Practica5 {

    public static double sumaElementos(List<? extends Number> listaNum) {
        return listaNum.stream()
                .mapToDouble(Number::doubleValue)
                .sum();
    }

    public static double promedioEdad(List<? extends Persona> personas) {
        return personas.stream()
                .mapToInt(Persona::getEdad)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        // 1

        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        double resultado = sumaElementos(numeros);
        System.out.println("Suma de números: " + resultado);
        System.out.println();

        // 2

        List<Persona> personas = List.of(new Persona("Saul", "Matny", 20)
                , new Persona("Sebastian", "Fiorilo", 23));
        double promedio = promedioEdad(personas);
        System.out.println("Promedio de edades: " + promedio);
        System.out.println();

        // 3

        Auto auto = new Auto("Camaro", 150, true);
        Moto moto = new Moto("Navi", 80, false);

        Garaje garaje = new Garaje();

        garaje.aparca(auto);
        garaje.aparca(moto);

        garaje.mostrarGaraje(garaje);

        garaje.retira(auto);

        garaje.mostrarGaraje(garaje);
    }
}
