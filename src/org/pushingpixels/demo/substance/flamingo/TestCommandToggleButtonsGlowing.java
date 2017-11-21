package org.pushingpixels.demo.substance.flamingo;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin;
import org.pushingpixels.substance.flamingo.SubstanceFlamingoPlugin;

public class TestCommandToggleButtonsGlowing
        extends org.pushingpixels.demo.flamingo.common.TestCommandToggleButtons {

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SubstanceCortex.GlobalScope.allowAnimations(AnimationFacet.ICON_GLOW);
                SubstanceCortex.GlobalScope.setSkin(new OfficeBlue2007Skin());
                SubstanceCortex.GlobalScope.registerComponentPlugin(new SubstanceFlamingoPlugin());
                TestCommandToggleButtonsGlowing frame = new TestCommandToggleButtonsGlowing();
                frame.setSize(800, 400);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }
}
