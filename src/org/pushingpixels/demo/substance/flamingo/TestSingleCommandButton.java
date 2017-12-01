package org.pushingpixels.demo.substance.flamingo;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.JCommandToggleButton;
import org.pushingpixels.ibis.SvgBatikResizableIcon;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.OfficeSilver2007Skin;
import org.pushingpixels.substance.flamingo.SubstanceFlamingoPlugin;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.FormLayout;

public class TestSingleCommandButton extends JFrame {

    public TestSingleCommandButton() {
        FormLayout lm = new FormLayout("left:pref, 4dlu, left:pref", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm).border(Borders.DIALOG);

        SvgBatikResizableIcon svgIcon = SvgBatikResizableIcon.getSvgIcon(
                TestSingleCommandButton.class.getClassLoader().getResource(
                        "org/pushingpixels/demo/substance/flamingo/svg/transcoded/Font-x-generic.svg"),
                new Dimension(16, 16));
        svgIcon.addAsynchronousLoadListener((boolean success) -> {
            if (success)
                repaint();
        });
        JCommandButton cb = new JCommandButton("Command", svgIcon);
        cb.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
        cb.setDisplayState(CommandButtonDisplayState.MEDIUM);
        cb.setFlat(false);

        JCommandToggleButton ctb = new JCommandToggleButton("ComToggle", svgIcon);
        ctb.setDisplayState(CommandButtonDisplayState.MEDIUM);
        ctb.setFlat(false);

        builder.append(cb, ctb);

        ImageIcon icon = new ImageIcon(Thread.currentThread().getContextClassLoader()
                .getResource("org/pushingpixels/demo/substance/flamingo/edit-paste.png"));
        JButton b = new JButton("Regular", icon);
        JToggleButton tb = new JToggleButton("RegToggle", icon);

        builder.append(b, tb);

        this.add(builder.getPanel(), BorderLayout.CENTER);

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceCortex.GlobalScope.registerComponentPlugin(new SubstanceFlamingoPlugin());

        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new OfficeSilver2007Skin());
            new TestSingleCommandButton().setVisible(true);
        });
    }

}
