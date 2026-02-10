package kleyton.dcx.ufpb.gui;

import kleyton.dcx.ufpb.VendaRoupas;
import kleyton.dcx.ufpb.controller.VendaAddController;

import javax.swing.*;

public class VendaGUI {

    private VendaAddController addController;

    public VendaGUI(VendaRoupas venda) {
        this.addController = new VendaAddController(venda);
    }

    public JButton criaBotaoCadastrar() {
        JButton botao = new JButton("Cadastrar Roupa");
        botao.addActionListener(addController);
        return botao;
    }
}