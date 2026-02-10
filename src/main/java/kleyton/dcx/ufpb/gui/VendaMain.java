package kleyton.dcx.ufpb.gui;

import javax.swing.*;

public class VendaMain {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VendaJanela().setVisible(true);
        });
    }
}