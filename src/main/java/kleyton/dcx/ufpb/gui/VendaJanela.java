package kleyton.dcx.ufpb.gui;

import javax.swing.*;
import java.awt.*;

public class VendaJanela extends JFrame {

    public VendaJanela() {
        setTitle("Alpha Store");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        // TÍTULO
        JLabel titulo = new JLabel("Minha Loja de Roupas", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        add(titulo, BorderLayout.NORTH);

        // IMAGEM
        ImageIcon icon = new ImageIcon(
                VendaJanela.class.getResource("/imgs/alpha_store.png")
        );
        JLabel imagem = new JLabel(icon);
        imagem.setHorizontalAlignment(SwingConstants.CENTER);
        add(imagem, BorderLayout.CENTER);

        // PAINEL DE BOTÕES
        JPanel painelBotoes = new JPanel();

        JButton btnCadastrar = new JButton("Cadastrar Roupa");
        JButton btnListar = new JButton("Listar Roupas");

        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnListar);

        add(painelBotoes, BorderLayout.SOUTH);

        // AÇÕES
        btnCadastrar.addActionListener(e -> cadastrarRoupa());
        btnListar.addActionListener(e -> listarRoupas());
    }

    private void cadastrarRoupa() {
        String nome = JOptionPane.showInputDialog(this, "Nome da roupa:");
        String tamanho = JOptionPane.showInputDialog(this, "Tamanho:");
        String preco = JOptionPane.showInputDialog(this, "Preço:");

        JOptionPane.showMessageDialog(
                this,
                "Roupa cadastrada!\n" +
                        "Nome: " + nome +
                        "\nTamanho: " + tamanho +
                        "\nPreço: " + preco
        );
    }

    private void listarRoupas() {
        JOptionPane.showMessageDialog(
                this,
                "Nenhuma roupa cadastrada ainda."
        );
    }
}