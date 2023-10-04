package examen;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DescompPrimos {
    static Scanner sc = new Scanner(System.in);
    public static void descompPrimos(int numero) {
        String str = numero + " = ";
        List<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0 && esPrimo(i)) {
                primos.add(i);
                numero /= i;
            }
        }

        for (int i = 0; i < primos.size(); i++) {
            str += primos.get(i);
            if (i < primos.size() - 1) {
                str += " ";
            }
        }

        System.out.println(str);
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;

        if (numero <= 3)
            return true;

        if (numero % 2 == 0 || numero % 3 == 0)
            return false;

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Digita el numero que quieres descomponer:");
        int numero = sc.nextInt();
        descompPrimos(numero);
    }
}

