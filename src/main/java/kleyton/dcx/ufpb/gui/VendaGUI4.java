package kleyton.dcx.ufpb.gui;

import kleyton.dcx.ufpb.*;

import javax.swing.*;
import java.awt.*;

public class VendaGUI4 extends JFrame {

    public VendaGUI4(VendaRoupas sistema) {

        setTitle("Remover Roupa");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2));

        JTextField txtCodigo = new JTextField();
        JButton btnRemover = new JButton("Remover");
        JButton btnVoltar = new JButton("Voltar");

        add(new JLabel("Código:"));
        add(txtCodigo);
        add(btnRemover);
        add(btnVoltar);

        btnRemover.addActionListener(e -> {
            try {
                sistema.removerRoupa(txtCodigo.getText());
                JOptionPane.showMessageDialog(this, "Roupa removida!");
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
