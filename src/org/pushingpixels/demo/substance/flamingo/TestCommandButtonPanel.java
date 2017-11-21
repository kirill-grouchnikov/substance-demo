package org.pushingpixels.demo.substance.flamingo;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin;
import org.pushingpixels.substance.flamingo.SubstanceFlamingoPlugin;

public class TestCommandButtonPanel
        extends org.pushingpixels.demo.flamingo.common.TestCommandButtonPanel {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SubstanceCortex.GlobalScope.setSkin(new OfficeBlue2007Skin());
                SubstanceCortex.GlobalScope.registerComponentPlugin(new SubstanceFlamingoPlugin());
                JFrame.setDefaultLookAndFeelDecorated(true);
                new TestCommandButtonPanel().setVisible(true);
            }
        });

    }
}
