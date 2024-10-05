import com.github.pedrossjr.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private int valor1 = 10;
    private int valor2 = 0;

    @Test // Anotação indicando que este método é um método de teste.
    public void testSomar () { // Teste do método somar valores.
        // Instancia a classe Calculadora.
        Calculadora calc = new Calculadora();

        // Atribuição a variável resultado o cálculo do método somarValores.
        int resultado = calc.somarValores(this.valor1,this.valor2);

        // Método "assertEquals" assegura que o resultado obtido será igual ao resultado esperado
        // No primeiro parâmetro informamos o resultado esperado
        // No segundo parâmetro informamos a variável com o resultado do método somarCalores.
        // No terceiro parâmetro informamos uma string contendo a mensagem teste realizado com sucesso
        assertEquals(10,
                resultado,
                "O teste de soma não foi bem sucessido");
    }

    @Test // Anotação indicando que este método é um método de teste.
    public void testSubtrair() {
        // Instancia a classe Calculadora.
        Calculadora calc = new Calculadora();

        // Atribuição a variável resultado o cálculo do método subtrairValores.
        int resultado = calc.subtrairValores(this.valor1,this.valor2);

        // Método "assertEquals" assegura que o resultado obtido será igual ao resultado esperado
        // No primeiro parâmetro informamos o resultado esperado
        // No segundo parâmetro informamos a variável com o resultado do método somarCalores.
        // No terceiro parâmetro informamos uma string contendo a mensagem teste realizado com sucesso
        assertEquals(10, resultado, "O teste de subtração não foi bem sucessido");
    }

    @Test // Anotação indicando que este método é um método de teste.
    public void testMultiplicar() {
        // Instancia a classe Calculadora.
        Calculadora calc = new Calculadora();

        // Atribuição a variável resultado o cálculo do método subtrairValores.
        int resultado = calc.multilicarValores(this.valor1,this.valor2);

        // Método "assertEquals" assegura que o resultado obtido será igual ao resultado esperado
        // No primeiro parâmetro informamos o resultado esperado
        // No segundo parâmetro informamos a variável com o resultado do método somarCalores.
        // No terceiro parâmetro informamos uma string contendo a mensagem teste realizado com sucesso
        assertEquals(0, resultado, "O teste de multiplicação não foi bem sucessido");
    }

    @Test // Anotação indicando que este método é um método de teste.
    public void testDividir() {
        // Instancia a classe Calculadora.
        Calculadora calc = new Calculadora();

        // Método "assertThrows" assegura que o resultado obtido resultará em uma Exception de divisão por zero
        // No primeiro parâmetro informamos o resultado esperado
        // No segundo parâmetro informamos a variável com o resultado do método somarCalores.
        // No terceiro parâmetro informamos uma string contendo a mensagem teste realizado com sucesso
        assertThrows(IllegalArgumentException.class, () -> {
            int resultado = calc.dividirValores(this.valor1, this.valor2);
        }, "Divisão por zero deve lançar IllegalArgumentException");
    }
}
