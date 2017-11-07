package org.pushingpixels.demo.substance.flamingo;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.SubstancePluginRepository;
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin;
import org.pushingpixels.substance.flamingo.SubstanceFlamingoPlugin;

public class TestButtonStripHorizontal
        extends org.pushingpixels.demo.flamingo.common.TestButtonStripHorizontal {

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SubstanceLookAndFeel.setSkin(new OfficeBlue2007Skin());
                SubstancePluginRepository.getInstance()
                        .registerComponentPlugin(new SubstanceFlamingoPlugin());
                new TestButtonStripHorizontal().setVisible(true);
            }
        });
    }
}
