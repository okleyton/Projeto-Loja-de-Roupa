package kleyton.dcx.ufpb.gui;

import javax.swing.JOptionPane;
import java.util.Collection;

import kleyton.dcx.ufpb.Roupa;
import kleyton.dcx.ufpb.RoupaInexistenteException;
import kleyton.dcx.ufpb.VendaRoupas;
import kleyton.dcx.ufpb.controller.VendaAddController;
import kleyton.dcx.ufpb.controller.VendaRemoveController;
import kleyton.dcx.ufpb.controller.VendaSearchController;

public class VendaGUI {

    private VendaAddController addController;
    private VendaRemoveController removeController;
    private VendaSearchController searchController;

    public VendaGUI(VendaRoupas venda) {
        this.addController = new VendaAddController(venda);
        this.removeController = new VendaRemoveController(venda);
        this.searchController = new VendaSearchController(venda);
    }

    public void iniciar() {
        String opcao;

        do {
            opcao = JOptionPane.showInputDialog(
                    "=== LOJA DE ROUPAS ===\n"
                            + "1 - Cadastrar roupa\n"
                            + "2 - Remover roupa\n"
                            + "3 - Pesquisar por tamanho\n"
                            + "0 - Sair"
            );

            if (opcao == null) return;

            switch (opcao) {
                case "1":
                    cadastrarRoupa();
                    break;
                case "2":
                    removerRoupa();
                    break;
                case "3":
                    pesquisarPorTamanho();
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (!opcao.equals("0"));
    }

    private void cadastrarRoupa() {
        String nome = JOptionPane.showInputDialog("Nome da roupa:");
        String tamanho = JOptionPane.showInputDialog("Tamanho:");
        double preco = Double.parseDouble(
                JOptionPane.showInputDialog("Preço:")
        );

        boolean ok = addController.adicionar(nome, tamanho, preco);

        if (ok) {
            JOptionPane.showMessageDialog(null, "Roupa cadastrada com sucesso!");
        }
    }

    private void removerRoupa() {
        String nome = JOptionPane.showInputDialog("Nome da roupa:");

        try {
            removeController.remover(nome);
            JOptionPane.showMessageDialog(null, "Roupa removida!");
        } catch (RoupaInexistenteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void pesquisarPorTamanho() {
        String tamanho = JOptionPane.showInputDialog("Digite o tamanho:");

        Collection<Roupa> roupas = searchController.pesquisarPorTamanho(tamanho);

        if (roupas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma roupa encontrada.");
            return;
        }

        StringBuilder resultado = new StringBuilder();

        for (Roupa r : roupas) {
            resultado.append(r).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}