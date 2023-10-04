import java.util.Scanner;
import java.util.function.BiFunction;

public class Calculadora2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            menu();

            int opcion = s.nextInt();
            if (opcion == 5) {System.out.println("Saliendo..");break;}
            if (opcion < 1 || opcion > 4) {System.out.println("Opción no válida"); continue; }
            BiFunction<Double, Double, Double> f = (a, b) -> opcion == 1 ? a + b
                    : opcion == 2 ? a - b : opcion == 3 ? a * b : a / b;

            System.out.print("Primer número: ");
            double a = s.nextDouble();
            System.out.print("Segundo número: ");
            double b = s.nextDouble();
            System.out.println("Resultado: " + f.apply(a, b));
        }
    }
    public static void menu(){
        System.out.println("+-----------+\n     MENU\n1. Suma\n2. Resta" +
                "\n3. Multiplicación\n4. División\n5. Salir");
        System.out.print("Seleccione opción: ");
    }
}

