import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Calculadora ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Raiz quadrada");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();

                if (opcao == 0) {
                    System.out.println("Até mais!");
                } else if (opcao >= 1 && opcao <= 5) {
                    System.out.print("Digite o primeiro número: ");
                    double a = sc.nextDouble();
                    double b = 0;

                    if (opcao != 5) {
                        System.out.print("Digite o segundo número: ");
                        b = sc.nextDouble();
                    }

                    if (opcao == 1) {
                        System.out.println("Resultado: " + calc.somar(a, b));
                    } else if (opcao == 2) {
                        System.out.println("Resultado: " + calc.subtrair(a, b));
                    } else if (opcao == 3) {
                        System.out.println("Resultado: " + calc.multiplicar(a, b));
                    } else if (opcao == 4) {
                        System.out.println("Resultado: " + calc.dividir(a, b));
                    } else {
                        System.out.println("Resultado: " + calc.raizQuadrada(a));
                    }
                } else {
                    System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite apenas números.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        sc.close();
    }
}