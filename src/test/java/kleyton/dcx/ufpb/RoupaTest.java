package kleyton.dcx.ufpb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RoupaTest {

    @Test
    public void testaCriacaoDeRoupa() {
        Roupa r = new Roupa("01", "Camisa", 59.90);

        assertEquals("01", r.getCodigo());
        assertEquals("Camisa", r.getDescricao());
        assertEquals(59.90, r.getValor());
    }

    @Test
    public void testaToString() {
        Roupa r = new Roupa("02", "Calça", 89.90);

        String texto = r.toString();

        assertTrue(texto.contains("02"));
        assertTrue(texto.contains("Calça"));
        assertTrue(texto.contains("89.9"));
    }
}
