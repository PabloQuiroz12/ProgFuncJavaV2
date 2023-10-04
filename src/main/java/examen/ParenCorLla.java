package examen;

public class ParenCorLla {
    public boolean controlador(String cadena) {
        int parentesis = 0;
        int corchetes = 0;
        int llaves = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == '(') {
                parentesis++;
            } else if (caracter == ')') {
                parentesis--;
                if (parentesis < 0) {
                    return false;
                }
            } else if (caracter == '[') {
                corchetes++;
            } else if (caracter == ']') {
                corchetes--;
                if (corchetes < 0) {
                    return false;
                }
            } else if (caracter == '{') {
                llaves++;
            } else if (caracter == '}') {
                llaves--;
                if (llaves < 0) {
                    return false;
                }
            }
        }

        return parentesis == 0 && corchetes == 0 && llaves == 0;
    }

    public static void main(String[] args) {
        ParenCorLla verificador = new ParenCorLla();
        String cadena = "({})[]";
        boolean resultado = verificador.controlador(cadena);

        if (resultado) {
            System.out.println("Los paréntesis, corchetes y llaves están correctamente cerrados.");
        } else {
            System.out.println("Los paréntesis, corchetes y llaves NO están correctamente cerrados.");
        }
    }
}

