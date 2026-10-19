import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        try {
            System.out.print("Operação (+, -, *, /, r para raiz): ");
            char op = sc.next().charAt(0);

            System.out.print("Digite o primeiro número: ");
            double a = sc.nextDouble();

            double b = 0;
            if (op != 'r') {
                System.out.print("Digite o segundo número: ");
                b = sc.nextDouble();
            }

            if (op == '+') {
                System.out.println("Resultado: " + calc.somar(a, b));
            } else if (op == '-') {
                System.out.println("Resultado: " + calc.subtrair(a, b));
            } else if (op == '*') {
                System.out.println("Resultado: " + calc.multiplicar(a, b));
            } else if (op == '/') {
                System.out.println("Resultado: " + calc.dividir(a, b));
            } else if (op == 'r') {
                System.out.println("Resultado: " + calc.raizQuadrada(a));
            } else {
                System.out.println("Operação inválida!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas números.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}