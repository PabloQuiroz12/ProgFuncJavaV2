import java.util.Scanner;

public class EspecialNumbers {
    public static void n_Esimonumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero n: ");
        long n = scanner.nextLong();
        long esimo = n * n;
        for (long i = n - 1; i >= 1; --i) {
            long d = esimo % i;
            if (d == 0) {
                d = i;
            }
            esimo -= d;
        }
        System.out.println("El n-esimonumero es: " +esimo);
    }
    public static void main(String[] args) {
        n_Esimonumero();
    }
}






