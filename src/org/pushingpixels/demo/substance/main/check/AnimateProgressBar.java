package org.pushingpixels.demo.substance.main.check;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;

public class AnimateProgressBar extends JFrame {
    public AnimateProgressBar() {
        this.setLayout(new BorderLayout());
        final JProgressBar jpb = new JProgressBar(0, 15);
        this.add(jpb, BorderLayout.CENTER);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton forw = new JButton("Increment");
        forw.addActionListener((ActionEvent e) -> jpb.setValue(jpb.getValue() + 1));
        controls.add(forw);
        this.add(controls, BorderLayout.SOUTH);

        this.setSize(300, 100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new AnimateProgressBar().setVisible(true);
        });
    }

}
