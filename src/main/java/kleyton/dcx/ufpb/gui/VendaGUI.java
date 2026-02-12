package kleyton.dcx.ufpb.gui;

import kleyton.dcx.ufpb.*;

import javax.swing.*;
import java.awt.*;

public class VendaGUI extends JFrame {

    private VendaRoupas sistema;

    public VendaGUI(VendaRoupas sistema) {
        this.sistema = sistema;

        setTitle("Sistema de Venda de Roupas");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JButton btnCadastrar = new JButton("Cadastrar Roupa");
        JButton btnPesquisar = new JButton("Pesquisar Roupa");
        JButton btnRemover = new JButton("Remover Roupa");
        JButton btnSair = new JButton("Sair");

        btnCadastrar.addActionListener(e -> {
            new VendaGUI2(sistema).setVisible(true);
            dispose();
        });

        btnPesquisar.addActionListener(e -> {
            new VendaGUI3(sistema).setVisible(true);
            dispose();
        });

        btnRemover.addActionListener(e -> {
            new VendaGUI4(sistema).setVisible(true);
            dispose();
        });

        btnSair.addActionListener(e -> System.exit(0));

        add(btnCadastrar);
        add(btnPesquisar);
        add(btnRemover);
        add(btnSair);
    }
}
