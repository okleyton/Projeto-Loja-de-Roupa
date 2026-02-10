package kleyton.dcx.ufpb.gui;

import kleyton.dcx.ufpb.Venda;
import kleyton.dcx.ufpb.VendaRoupas;
import kleyton.dcx.ufpb.controller.VendaSearchController;
import kleyton.dcx.ufpb.controller.VendaAddController;

import javax.swing.*;

public class VendaJanela extends JFrame {

    public VendaJanela() {

        Venda venda = new VendaRoupas();

        setTitle("Alpha Store");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        // ===== IMAGEM =====
        ImageIcon icon = new ImageIcon(
                getClass().getResource("/imgs/alpha_store.png")
        );

        JLabel labelImagem = new JLabel(icon);
        labelImagem.setAlignmentX(CENTER_ALIGNMENT);
        painel.add(labelImagem);

        // ===== BOTÕES =====
        JPanel painelBotoes = new JPanel();

        JButton btnCadastrar = new JButton("Cadastrar roupa");
        btnCadastrar.addActionListener(new VendaAddController(venda));

        JButton btnPesquisar = new JButton("Pesquisar roupa");
        btnPesquisar.addActionListener(new VendaSearchController(venda));

        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(e -> {
            try {
                venda.salvarDados();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.exit(0);
        });

        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnPesquisar);
        painelBotoes.add(btnSair);

        painel.add(painelBotoes);

        add(painel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VendaJanela();
    }
}