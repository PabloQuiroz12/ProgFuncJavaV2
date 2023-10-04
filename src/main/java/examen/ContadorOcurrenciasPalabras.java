package examen;

import java.util.Scanner;

public class ContadorOcurrenciasPalabras {
    public static String[][] contarOcurrencias(String frase) {
        String[] palabras = frase.split(" ");

        String[][] conteo = new String[2][palabras.length];

        int contador = 0;

        for (String palabra : palabras) {
            boolean encontrada = false;

            for (int i = 0; i < contador; i++) {
                if (conteo[0][i].equalsIgnoreCase(palabra)) {
                    int ocurrencias = Integer.parseInt(conteo[1][i]);
                    ocurrencias++;
                    conteo[1][i] = Integer.toString(ocurrencias);
                    encontrada = true;
                    break;
                }
            }

            if (!encontrada) {
                conteo[0][contador] = palabra;
                conteo[1][contador] = "1";
                contador++;
            }
        }

        String[][] resultado = new String[2][contador];
        for (int i = 0; i < contador; i++) {
            resultado[0][i] = conteo[0][i];
            resultado[1][i] = conteo[1][i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba la frase a la cual quiere hacerle el conteo:");
        String frase = sc.nextLine();
        String[][] resultado = contarOcurrencias(frase);

        for (int i = 0; i < resultado[0].length; i++) {
            System.out.println(resultado[0][i] + ": " + resultado[1][i]);
        }
    }
}


