package kleyton.dcx.ufpb;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VendaRoupas implements Venda, Serializable {

    private static final long serialVersionUID = 1L;

    private Map<String, Roupa> roupas;
    private GravadorDeDados gravador;

    public VendaRoupas() {
        this.roupas = new HashMap<>();
        this.gravador = new GravadorDeDados();

        try {
            recuperarDados();
        } catch (IOException e) {
            System.out.println("Arquivo ainda não existe.");
        }
    }

    @Override
    public boolean cadastrarRoupa(Roupa roupa) {
        if (roupas.containsKey(roupa.getCodigo())) {
            return false;
        }
        roupas.put(roupa.getCodigo(), roupa);
        return true;
    }

    @Override
    public Roupa pesquisarRoupa(String codigo) throws Exception {
        Roupa roupa = roupas.get(codigo);
        if (roupa == null) {
            throw new Exception("Roupa não encontrada!");
        }
        return roupa;
    }

    @Override
    public Collection<Roupa> listarRoupas() {
        return roupas.values();
    }

    @Override
    public void salvarDados() throws IOException {
        gravador.salvarDados(roupas);
    }

    @Override
    public void recuperarDados() throws IOException {
        this.roupas = gravador.recuperarDados();
    }
}