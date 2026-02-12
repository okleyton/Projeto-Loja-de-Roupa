package kleyton.dcx.ufpb.controller;

import kleyton.dcx.ufpb.RoupaInexistenteException;
import kleyton.dcx.ufpb.VendaRoupas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendaRemoveController implements ActionListener {

    private VendaRoupas sistema;
    private JFrame janela;

    public VendaRemoveController(VendaRoupas sistema, JFrame janela) {
        this.sistema = sistema;
        this.janela = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String codigo = JOptionPane.showInputDialog(
                janela,
                "Digite o código da roupa a remover:"
        );

        if (codigo == null || codigo.isEmpty()) {
            return;
        }

        try {
            sistema.removerRoupa(codigo);
            JOptionPane.showMessageDialog(
                    janela,
                    "Roupa removida com sucesso!"
            );
        } catch (RoupaInexistenteException ex) {
            JOptionPane.showMessageDialog(
                    janela,
                    ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
