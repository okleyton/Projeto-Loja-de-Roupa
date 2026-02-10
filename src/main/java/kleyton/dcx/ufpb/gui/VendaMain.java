package kleyton.dcx.ufpb.gui;

import javax.swing.SwingUtilities;

public class VendaMain {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VendaJanela();
        });
    }
}