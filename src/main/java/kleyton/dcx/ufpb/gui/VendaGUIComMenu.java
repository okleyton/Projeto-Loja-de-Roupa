package kleyton.dcx.ufpb.gui;

import kleyton.dcx.ufpb.VendaRoupas;
import kleyton.dcx.ufpb.controller.VendaPesquisaController;
import kleyton.dcx.ufpb.controller.VendaRemoveController;

import javax.swing.*;
import java.awt.*;

public class VendaGUIComMenu extends JFrame {

    JLabel linha1, linha2;
    VendaRoupas sistema;
    JMenuBar barraDeMenu = new JMenuBar();

    public VendaGUIComMenu(VendaRoupas sistema) {
        this.sistema = sistema;

        setTitle("Sistema de Venda de Roupas");
        setSize(800, 600);
        setLocation(150, 150);
        setResizable(false);
        setBackground(Color.white);

        linha1 = new JLabel("Sistema de Venda de Roupas", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));

        ImageIcon imgOriginal = new ImageIcon(
                getClass().getResource("/imgs/fundo.png")
        );

        Image imgRedimensionada = imgOriginal.getImage().getScaledInstance(
                800, 250, Image.SCALE_SMOOTH
        );

        ImageIcon imgFinal = new ImageIcon(imgRedimensionada);
        linha2 = new JLabel(imgFinal, JLabel.CENTER);

        setLayout(new GridLayout(3, 1));
        add(linha1);
        add(linha2);
        add(new JLabel());

        JMenu menuCadastrar = new JMenu("Cadastrar");
        JMenuItem itemCadastrar = new JMenuItem("Cadastrar Roupa");

        JMenu menuPesquisar = new JMenu("Pesquisar");
        JMenuItem itemPesquisar = new JMenuItem("Pesquisar Roupa");

        JMenu menuRemover = new JMenu("Remover");
        JMenuItem itemRemover = new JMenuItem("Remover Roupa");

        itemCadastrar.addActionListener(e -> {
            String codigo = JOptionPane.showInputDialog(this, "Código:");
            String descricao = JOptionPane.showInputDialog(this, "Descrição:");
            double valor = Double.parseDouble(
                    JOptionPane.showInputDialog(this, "Valor:")
            );

            boolean cadastrou = sistema.cadastrarRoupa(codigo, descricao, valor);

            if (cadastrou) {
                JOptionPane.showMessageDialog(this, "Roupa cadastrada!");
            } else {
                JOptionPane.showMessageDialog(this, "Roupa já existe!");
            }
        });

        itemPesquisar.addActionListener(
                new VendaPesquisaController(sistema, this)
        );

        itemRemover.addActionListener(
                new VendaRemoveController(sistema, this)
        );

        menuCadastrar.add(itemCadastrar);
        menuPesquisar.add(itemPesquisar);
        menuRemover.add(itemRemover);

        barraDeMenu.add(menuCadastrar);
        barraDeMenu.add(menuPesquisar);
        barraDeMenu.add(menuRemover);

        setJMenuBar(barraDeMenu);
    }
}
