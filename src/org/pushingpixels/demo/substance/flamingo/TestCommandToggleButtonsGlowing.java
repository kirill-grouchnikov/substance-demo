package org.pushingpixels.demo.substance.flamingo;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.AnimationConfigurationManager;
import org.pushingpixels.substance.api.AnimationFacet;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin;

public class TestCommandToggleButtonsGlowing extends org.pushingpixels.demo.flamingo.common.TestCommandToggleButtons {

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AnimationConfigurationManager.getInstance()
                        .allowAnimations(AnimationFacet.ICON_GLOW);
                SubstanceLookAndFeel.setSkin(new OfficeBlue2007Skin());
                TestCommandToggleButtonsGlowing frame = new TestCommandToggleButtonsGlowing();
                frame.setSize(800, 400);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }
}
