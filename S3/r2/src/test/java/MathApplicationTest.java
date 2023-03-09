import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class MathApplicationTest {

    @Mock
    CalculadoraService calcService;

    @InjectMocks
    MathApplication mathApplication;

    @Test
    void add() {

        when(calcService.add(10,20)).thenReturn(30.0);
        assertEquals(mathApplication.add(10, 20), 30, 0);

        verify(calcService).add(10.0, 20.0);
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