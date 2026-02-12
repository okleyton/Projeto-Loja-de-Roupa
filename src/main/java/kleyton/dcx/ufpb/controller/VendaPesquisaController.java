package kleyton.dcx.ufpb.controller;

import kleyton.dcx.ufpb.Roupa;
import kleyton.dcx.ufpb.RoupaInexistenteException;
import kleyton.dcx.ufpb.VendaRoupas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendaPesquisaController implements ActionListener {

    private VendaRoupas sistema;
    private JFrame janela;

    public VendaPesquisaController(VendaRoupas sistema, JFrame janela) {
        this.sistema = sistema;
        this.janela = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String codigo = JOptionPane.showInputDialog(janela, "Código da roupa:");

        try {
            Roupa r = sistema.pesquisarRoupa(codigo);
            JOptionPane.showMessageDialog(janela, r.toString());
        } catch (RoupaInexistenteException ex) {
            JOptionPane.showMessageDialog(janela, ex.getMessage());
        }
    }
}
