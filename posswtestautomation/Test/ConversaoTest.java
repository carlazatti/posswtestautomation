import com.company.Conversor;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConversaoTest {
    @Test
    public void testTemp() {
        int valor = 0;
        int resultado = Conversor.temp(valor);
        assertEquals(273, resultado, 0.01);
    }

    public void testVeloc() {
        double valor = 1;
        double resultado = Conversor.veloc(valor);
        assertEquals(1.852, resultado, 0.01);
    }

    public void testDist() {
        double valor = 1000;
        double resultado = Conversor.dist(valor);
        assertEquals(1, resultado, 0.01);
    }

    public void testTempo() {
        double valor = 60;
        double resultado = Conversor.tempo(valor);
        assertEquals(1, resultado, 0.01);
    }

}