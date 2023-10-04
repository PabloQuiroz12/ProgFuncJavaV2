import java.util.Scanner;

// STRATEGY
public class Main {
    ICalculadora calculadora;
    public Main(ICalculadora calculadora){
        this.calculadora = calculadora;
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double numero1 , numero2;
        String operador = "";

        System.out.print("Primer numero: ");
        numero1 = sc.nextInt();

        System.out.print("Segundo numero: ");
        numero2 = sc.nextInt();

        System.out.print("Que quieres hacer? :");
        operador = sc.next();

        Main main = new Main(operador.equals("+") ? new Suma() :
                operador.equals("-") ? new Resta() :
                    operador.equals("*") ? new Multiplicacion() : new Division());

        System.out.println(main.calculadora.calcular(numero1,numero2));
    }
}
