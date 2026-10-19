public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        return a / b;
    }

    public double raizQuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Raiz de número negativo.");
        }
        return Math.sqrt(a);
    }
}