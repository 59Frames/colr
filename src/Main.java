import colr.core.schemes.NatureColors;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("");

        JPanel panel = new JPanel();
        panel.setBackground(NatureColors.DEEP_AQUA.toAWTColor());   // sets the background to NatureColors.DEEP_AQUA

        JButton button = new JButton("Test");
        button.setBackground(NatureColors.SEA_FOAM.toAWTColor());   // sets the background to NatureColors.SEA_FOAM

        panel.add(button);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
