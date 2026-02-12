package kleyton.dcx.ufpb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VendaRoupasTest {

    private VendaRoupas sistema;

    @BeforeEach
    public void setUp() {
        java.io.File arquivo = new java.io.File("roupas.dat");
        if (arquivo.exists()) {
            arquivo.delete();
        }
        sistema = new VendaRoupas();
    }

    @Test
    public void testaCadastroDeRoupa() {
        sistema.cadastrarRoupa("01", "Camisa", 59.90);
        assertEquals(1, sistema.getRoupas().size());
    }

    @Test
    public void testaPesquisaDeRoupa() throws RoupaInexistenteException {
        sistema.cadastrarRoupa("02", "Calça", 89.90);
        Roupa r = sistema.pesquisarRoupa("02");
        assertEquals("Calça", r.getDescricao());
        assertEquals(89.90, r.getValor());
    }

    @Test
    public void testaRemocaoDeRoupa() throws RoupaInexistenteException {
        sistema.cadastrarRoupa("03", "Vestido", 120.00);
        sistema.removerRoupa("03");
        assertEquals(0, sistema.getRoupas().size());
    }

    @Test
    public void testaRemocaoDeRoupaInexistente() {
        assertThrows(RoupaInexistenteException.class, () -> {
            sistema.removerRoupa("99");
        });
    }
}
