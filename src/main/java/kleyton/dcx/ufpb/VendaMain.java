package kleyton.dcx.ufpb;

import kleyton.dcx.ufpb.gui.VendaGUIComMenu;

import javax.swing.*;

public class VendaMain {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            VendaRoupas sistema = new VendaRoupas();
            JFrame janela = new VendaGUIComMenu(sistema);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setVisible(true);
        });
    }
}
