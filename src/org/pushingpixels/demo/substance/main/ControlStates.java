package org.pushingpixels.demo.substance.main;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;

public class ControlStates extends JFrame {
    public ControlStates() {
        super("Control states");

        this.setLayout(new FlowLayout());
        JButton defaultButton = new JButton("active");
        JButton button = new JButton("default");
        JButton disabledButton = new JButton("disabled");
        disabledButton.setEnabled(false);
        this.getRootPane().setDefaultButton(defaultButton);

        this.add(defaultButton);
        this.add(button);
        this.add(disabledButton);

        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setIconImage(new BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setFocusKind(SubstanceSlices.FocusKind.NONE);
            SubstanceCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new ControlStates().setVisible(true);
        });
    }

}
