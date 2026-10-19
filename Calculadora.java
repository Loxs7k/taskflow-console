import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Operação (+, -, *, /, r para raiz): ");
        char op = sc.next().charAt(0);

        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();

        if (op == 'r') {
            if (a < 0) {
                System.out.println("Erro: raiz de número negativo!");
            } else {
                System.out.println("Resultado: " + Math.sqrt(a));
            }
        } else {
            System.out.print("Digite o segundo número: ");
            double b = sc.nextDouble();

            if (op == '+') {
                System.out.println("Resultado: " + (a + b));
            } else if (op == '-') {
                System.out.println("Resultado: " + (a - b));
            } else if (op == '*') {
                System.out.println("Resultado: " + (a * b));
            } else if (op == '/') {
                if (b == 0) {
                    System.out.println("Erro: divisão por zero!");
                } else {
                    System.out.println("Resultado: " + (a / b));
                }
            } else {
                System.out.println("Operação inválida!");
            }
        }

        sc.close();
    }
}