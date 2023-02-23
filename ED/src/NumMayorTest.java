import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

        public class NumMayorTest {
            @Test
            public void es_mayot() {
                int a = 10, b = 20, c = 15;
                int resultado_esperado = b;

                int resultado_obtenido = NumMayor.es_mayor(a, b, c);

                assertEquals(resultado_esperado, resultado_obtenido);
            }
        }
