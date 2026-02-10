package kleyton.dcx.ufpb.controller;

import kleyton.dcx.ufpb.VendaRoupas;
import kleyton.dcx.ufpb.RoupaInexistenteException;

public class VendaRemoveController {

    private VendaRoupas venda;

    public VendaRemoveController(VendaRoupas venda) {
        this.venda = venda;
    }

    public boolean remover(String nome) throws RoupaInexistenteException {
        return venda.removerRoupa(nome);
    }
}