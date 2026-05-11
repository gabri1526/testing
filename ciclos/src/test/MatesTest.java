import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import com.contornos.Mates;

public class MatesTest {
    @Test
    public void testDividir(){
        int resultado = Mates.dividirStatic(20, 5);
        assertEquals(4, resultado)
    }
}
