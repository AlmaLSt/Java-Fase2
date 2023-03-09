import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDivideTest {

    static Calculadora calculadora;

    @BeforeAll

    static void setup(){
        calculadora = new Calculadora();
    }
    @Test
    void divide() {
        int esperado = 2;
        assertEquals(esperado, calculadora.divide(4, 2));
    }
}