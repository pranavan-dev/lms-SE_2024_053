package lms;

import lms.ui.MainFrame;
import javax.swing.SwingUtilities;

public class GuiMain {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() ->
                new MainFrame()
        );

    }
}
