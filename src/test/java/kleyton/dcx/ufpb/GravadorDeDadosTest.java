package kleyton.dcx.ufpb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDadosTest {

    private GravadorDeDados gravador;

    @BeforeEach
    public void setUp() {
        gravador = new GravadorDeDados();

        File arquivo = new File("roupas.dat");
        if (arquivo.exists()) {
            arquivo.delete();
        }
    }

    @Test
    public void testaSalvarERecuperarDados() {
        Map<String, Roupa> roupas = new HashMap<>();
        roupas.put("01", new Roupa("01", "Camisa", 59.90));
        roupas.put("02", new Roupa("02", "Calça", 89.90));

        gravador.salvarDados(roupas);

        Map<String, Roupa> recuperadas = gravador.recuperarDados();

        assertEquals(2, recuperadas.size());
        assertTrue(recuperadas.containsKey("01"));
        assertEquals("Camisa", recuperadas.get("01").getDescricao());
    }

    @Test
    public void testaRecuperarArquivoInexistente() {
        Map<String, Roupa> recuperadas = gravador.recuperarDados();
        assertNotNull(recuperadas);
        assertEquals(0, recuperadas.size());
    }
}
