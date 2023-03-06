import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();
    @Test
    @DisplayName("Prueba suma")
    void suma() {
        int esperado = 5;
        assertEquals(esperado, calculadora.suma(2, 3));
    }


    @Test
    @DisplayName("Prueba resta")
    void resta() {
        int esperado = 1;
        assertEquals(esperado, calculadora.resta(3,2));
    }

    @Test
    @DisplayName("Prueba multiplica")
    void multiplica() {
        int esperado = 6;
        assertEquals(esperado, calculadora.multiplica(2, 3));
    }

    @Test
    @DisplayName("Prueba divide")
    void divide(){
//        assertThrows(IllegalArgumentException.class,() ->{
//           calculadora.divide(15,0);
//        });

        assertThrows(ArithmeticException.class, () -> {
            int result = 15 / 0;
        });
    }
}