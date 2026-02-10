package kleyton.dcx.ufpb.controller;

import kleyton.dcx.ufpb.Roupa;
import kleyton.dcx.ufpb.Venda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendaSearchController implements ActionListener {

    private Venda venda;

    public VendaSearchController(Venda venda) {
        this.venda = venda;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String codigo = JOptionPane.showInputDialog("Código da roupa:");
        if (codigo == null) return;

        try {
            Roupa roupa = venda.pesquisarRoupa(codigo);

            JOptionPane.showMessageDialog(null,
                    "Código: " + roupa.getCodigo() +
                            "\nNome: " + roupa.getNome() +
                            "\nTamanho: " + roupa.getTamanho() +
                            "\nPreço: R$ " + roupa.getPreco()
            );

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}