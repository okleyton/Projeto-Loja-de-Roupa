package kleyton.dcx.ufpb;

import java.io.IOException;
import java.util.*;

public class VendaRoupas {

    private Map<String, Roupa> roupas;
    private GravadorDeDados gravador;

    public VendaRoupas() {
        this.roupas = new HashMap<>();
        this.gravador = new GravadorDeDados();
    }

    public boolean cadastrarRoupa(String nome, String tamanho, double preco) {
        if (!roupas.containsKey(nome)) {
            roupas.put(nome, new Roupa(nome, tamanho, preco));
            return true;
        }
        return false;
    }

    public boolean removerRoupa(String nome) throws RoupaInexistenteException {
        if (!roupas.containsKey(nome)) {
            throw new RoupaInexistenteException("Roupa não encontrada: " + nome);
        }
        roupas.remove(nome);
        return true;
    }

    public Collection<Roupa> pesquisarPorTamanho(String tamanho) {
        Collection<Roupa> resultado = new ArrayList<>();
        for (Roupa r : roupas.values()) {
            if (r.getTamanho().equalsIgnoreCase(tamanho)) {
                resultado.add(r);
            }
        }
        return resultado;
    }

    public void salvarDados() throws IOException {
        gravador.salvarRoupas(roupas);
    }

    public void recuperarDados() throws IOException {
        this.roupas = gravador.recuperarRoupas();
    }
}