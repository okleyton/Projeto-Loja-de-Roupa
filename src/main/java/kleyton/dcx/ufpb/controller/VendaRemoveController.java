package kleyton.dcx.ufpb.controller;

import kleyton.dcx.ufpb.VendaRoupas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendaRemoveController implements ActionListener {

    private VendaRoupas venda;

    public VendaRemoveController(VendaRoupas venda) { // ✅
        this.venda = venda;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(
                null,
                "Remoção de roupa ainda não implementada",
                "Aviso",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}