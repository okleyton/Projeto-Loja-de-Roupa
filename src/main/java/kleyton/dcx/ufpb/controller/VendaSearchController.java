package kleyton.dcx.ufpb.controller;

import java.util.Collection;
import kleyton.dcx.ufpb.VendaRoupas;
import kleyton.dcx.ufpb.Roupa;

public class VendaSearchController {

    private VendaRoupas venda;

    public VendaSearchController(VendaRoupas venda) {
        this.venda = venda;
    }

    public Collection<Roupa> pesquisarPorTamanho(String tamanho) {
        return venda.pesquisarPorTamanho(tamanho);
    }
}