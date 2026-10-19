import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double a = sc.nextDouble();

        System.out.print("Digite a operacao (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Digite o segundo numero: ");
        double b = sc.nextDouble();

        if (op == '+') {
            System.out.println("Resultado: " + (a + b));
        } else if (op == '-') {
            System.out.println("Resultado: " + (a - b));
        } else if (op == '*') {
            System.out.println("Resultado: " + (a * b));
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Erro: divisao por zero!");
            } else {
                System.out.println("Resultado: " + (a / b));
            }
        } else {
            System.out.println("Operação invalida!");
        }

        sc.close();
    }
}