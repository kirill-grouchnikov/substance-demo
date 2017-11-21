package org.pushingpixels.demo.substance.flamingo;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin;
import org.pushingpixels.substance.flamingo.SubstanceFlamingoPlugin;

public class TestColorSelector extends org.pushingpixels.demo.flamingo.common.TestColorSelector {

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SubstanceCortex.GlobalScope.setSkin(new OfficeBlue2007Skin());
                SubstanceCortex.GlobalScope.registerComponentPlugin(new SubstanceFlamingoPlugin());
                TestColorSelector frame = new TestColorSelector();

                frame.centerPanel.putClientProperty(SubstanceLookAndFeel.COLORIZATION_FACTOR,
                        new Double(1.0));

                frame.setSize(500, 400);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }
}
