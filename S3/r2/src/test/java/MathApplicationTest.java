import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class MathApplicationTest {

    @Mock
    CalculadoraService calculadoraService;

    @InjectMocks
    MathApplication mathApplication;

    @Test
    void add() {

        when(CalculadoraService.add(10,20)).thenReturn(30.0))
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }
}