package kleyton.dcx.ufpb.controller;

import kleyton.dcx.ufpb.VendaRoupas;

public class VendaAddController {

    private VendaRoupas venda;

    public VendaAddController(VendaRoupas venda) {
        this.venda = venda;
    }

    public boolean adicionar(String nome, String tamanho, double preco) {
        return venda.cadastrarRoupa(nome, tamanho, preco);
    }
}