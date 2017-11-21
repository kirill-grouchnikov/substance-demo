package org.pushingpixels.demo.substance.flamingo;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin;
import org.pushingpixels.substance.flamingo.SubstanceFlamingoPlugin;

public class TestButtonStripVertical
        extends org.pushingpixels.demo.flamingo.common.TestButtonStripVertical {

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SubstanceCortex.GlobalScope.setSkin(new OfficeBlue2007Skin());
                SubstanceCortex.GlobalScope.registerComponentPlugin(new SubstanceFlamingoPlugin());
                new TestButtonStripVertical().setVisible(true);
            }
        });
    }
}
