import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void somarDeveRetornarASoma() {
        assertEquals(5, new Calculadora().somar(2, 3));
    }

    @Test
    public void subtrairDeveRetornarADiferenca() {
        assertEquals(1, new Calculadora().subtrair(3, 2));
    }

    @Test
    public void multiplicarDeveRetornarOProduto() {
        assertEquals(6, new Calculadora().multiplicar(2, 3));
    }

    @Test
    public void dividirDeveLancarExcecaoQuandoDivisorForZero() {
        assertThrows(ArithmeticException.class, () -> new Calculadora().dividir(5, 0));
    }

    @Test
    public void raizQuadradaDeveRetornarARaiz() {
        assertEquals(4, new Calculadora().raizQuadrada(16));
    }

    @Test
    public void raizQuadradaDeveLancarExcecaoParaNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Calculadora().raizQuadrada(-1));
    }
}