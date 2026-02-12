package kleyton.dcx.ufpb.gui;

import kleyton.dcx.ufpb.*;

import javax.swing.*;
import java.awt.*;

public class VendaGUI3 extends JFrame {

    public VendaGUI3(VendaRoupas sistema) {

        setTitle("Pesquisar Roupa");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2));

        JTextField txtCodigo = new JTextField();
        JButton btnPesquisar = new JButton("Pesquisar");
        JButton btnVoltar = new JButton("Voltar");

        add(new JLabel("Código:"));
        add(txtCodigo);
        add(btnPesquisar);
        add(btnVoltar);

        btnPesquisar.addActionListener(e -> {
            try {
                Roupa r = sistema.pesquisarRoupa(txtCodigo.getText());
                JOptionPane.showMessageDialog(this,
                        r.getDescricao() + " - R$ " + r.getValor());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        btnVoltar.addActionListener(e -> {
            new VendaGUI(sistema).setVisible(true);
            dispose();
        });
    }
}
