package kleyton.dcx.ufpb;

import java.util.Collection;
import java.util.Map;

public class VendaRoupas {

    private Map<String, Roupa> roupas;
    private GravadorDeDados gravador;

    public VendaRoupas() {
        this.gravador = new GravadorDeDados();
        this.roupas = gravador.recuperarDados();
    }

    public boolean cadastrarRoupa(String codigo, String descricao, double valor) {
        if (roupas.containsKey(codigo)) {
            return false;
        }
        Roupa r = new Roupa(codigo, descricao, valor);
        roupas.put(codigo, r);
        gravador.salvarDados(roupas);
        return true;
    }

    public Roupa pesquisarRoupa(String codigo) throws RoupaInexistenteException {
        Roupa r = roupas.get(codigo);
        if (r == null) {
            throw new RoupaInexistenteException("Roupa não encontrada");
        }
        return r;
    }

    public boolean removerRoupa(String codigo) throws RoupaInexistenteException {
        if (!roupas.containsKey(codigo)) {
            throw new RoupaInexistenteException("Roupa não encontrada");
        }
        roupas.remove(codigo);
        gravador.salvarDados(roupas);
        return true;
    }

    public Collection<Roupa> getRoupas() {
        return roupas.values();
    }
}
