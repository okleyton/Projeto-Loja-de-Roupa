package kleyton.dcx.ufpb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendaRoupasTest {

    @Test
    public void testCadastrarERemover() {
        VendaRoupas venda = new VendaRoupas();

        assertTrue(venda.cadastrarRoupa("Camisa", "M", 79.90));

        assertDoesNotThrow(() -> {
            assertTrue(venda.removerRoupa("Camisa"));
        });
    }

    @Test
    public void testRemoverRoupaInexistente() {
        VendaRoupas venda = new VendaRoupas();

        assertThrows(RoupaInexistenteException.class, () -> {
            venda.removerRoupa("Calça");
        });
    }
}