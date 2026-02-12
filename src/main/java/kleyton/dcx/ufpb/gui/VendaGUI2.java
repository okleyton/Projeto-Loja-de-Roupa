package kleyton.dcx.ufpb.gui;

import kleyton.dcx.ufpb.*;

import javax.swing.*;
import java.awt.*;

public class VendaGUI2 extends JFrame {

    private VendaRoupas sistema;

    public VendaGUI2(VendaRoupas sistema) {
        this.sistema = sistema;

        setTitle("Cadastrar Roupa");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));

        JTextField txtCodigo = new JTextField();
        JTextField txtDescricao = new JTextField();
        JTextField txtValor = new JTextField();

        JButton btnCadastrar = new JButton("Cadastrar");
        JButton btnVoltar = new JButton("Voltar");

        add(new JLabel("Código:"));
        add(txtCodigo);
        add(new JLabel("Descrição:"));
        add(txtDescricao);
        add(new JLabel("Valor:"));
        add(txtValor);

        add(btnCadastrar);
        add(btnVoltar);

        btnCadastrar.addActionListener(e -> {
            sistema.cadastrarRoupa(
                    txtCodigo.getText(),
                    txtDescricao.getText(),
                    Double.parseDouble(txtValor.getText())
            );
            JOptionPane.showMessageDialog(this, "Roupa cadastrada!");
        });

        btnVoltar.addActionListener(e -> {
            new VendaGUI(sistema).setVisible(true);
            dispose();
        });
    }
}
