package kleyton.dcx.ufpb.controller;

import kleyton.dcx.ufpb.Roupa;
import kleyton.dcx.ufpb.Venda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendaAddController implements ActionListener {

    private Venda venda;

    public VendaAddController(Venda venda) {
        this.venda = venda;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String codigo = JOptionPane.showInputDialog("Código:");
        if (codigo == null) return;

        String nome = JOptionPane.showInputDialog("Nome:");
        if (nome == null) return;

        String tamanho = JOptionPane.showInputDialog("Tamanho:");
        if (tamanho == null) return;

        String precoStr = JOptionPane.showInputDialog("Preço:");
        if (precoStr == null) return;

        try {
            double preco = Double.parseDouble(precoStr);

            Roupa roupa = new Roupa(codigo, nome, tamanho, preco);

            boolean cadastrou = venda.cadastrarRoupa(roupa);

            if (cadastrou) {
                JOptionPane.showMessageDialog(null,
                        "Roupa cadastrada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Roupa já existe!");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,
                    "Preço inválido!");
        }
    }
}