package org.pushingpixels.demo.substance.flamingo;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.SubstancePluginRepository;
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin;
import org.pushingpixels.substance.flamingo.SubstanceFlamingoPlugin;

public class TestCommandButtonsRichTooltips
        extends org.pushingpixels.demo.flamingo.common.TestCommandButtonsRichTooltips {

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        UIManager.installLookAndFeel("Substance Office Blue 2007",
                "org.pushingpixels.substance.api.skin.SubstanceOfficeBlue2007LookAndFeel");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SubstanceLookAndFeel.setSkin(new OfficeBlue2007Skin());
                SubstancePluginRepository.getInstance()
                        .registerComponentPlugin(new SubstanceFlamingoPlugin());
                TestCommandButtonsRichTooltips frame = new TestCommandButtonsRichTooltips();
                frame.setSize(800, 400);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }
}
