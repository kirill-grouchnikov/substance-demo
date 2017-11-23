package org.pushingpixels.demo.substance.main;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.GeminiSkin;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

public class CheckCombo extends JFrame {
    public CheckCombo() {
        super("Alignment");

        this.setLayout(new BorderLayout());

        JComboBox combo = new JComboBox(new Object[] { "test" });
        SubstanceCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(combo,
                SwingConstants.CENTER);

        JPanel content = new JPanel();

        FormLayout lm = new FormLayout("pref", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm, content);
        builder.setDefaultDialogBorder();

        builder.append(combo);

        this.add(content, BorderLayout.CENTER);

        this.setSize(450, 125);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new GeminiSkin());
            new CheckCombo().setVisible(true);
        });
    }

}
