package org.pushingpixels.demo.substance.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.skin.OfficeSilver2007Skin;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.FormLayout;

public class StatesSample extends JFrame {
    public StatesSample() {
        super("States");

        setIconImage(SubstanceLogo
                .getLogoImage(SubstanceCortex.ComponentScope.getCurrentSkin(this.getRootPane())
                        .getColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE,
                                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)));

        FormLayout layout = new FormLayout("right:pref, 4dlu, fill:pref:grow", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(layout).border(Borders.DIALOG);

        JButton regular = new JButton("sample");
        builder.append("Regular", regular);

        JButton rollover = new JButton("sample");
        rollover.getModel().setRollover(true);
        builder.append("Rollover", rollover);

        JButton selected = new JButton("sample");
        selected.getModel().setSelected(true);
        builder.append("Selected", selected);

        JButton rolloverSelected = new JButton("sample");
        rolloverSelected.getModel().setRollover(true);
        rolloverSelected.getModel().setSelected(true);
        builder.append("Rollover selected", rolloverSelected);

        JButton pressed = new JButton("sample");
        pressed.getModel().setArmed(true);
        pressed.getModel().setPressed(true);
        builder.append("Pressed", pressed);

        JButton pressedSelected = new JButton("sample");
        pressedSelected.getModel().setArmed(true);
        pressedSelected.getModel().setPressed(true);
        pressedSelected.getModel().setSelected(true);
        builder.append("Pressed selected", pressedSelected);

        this.add(builder.getPanel());

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setFocusKind(SubstanceSlices.FocusKind.NONE);
            SubstanceCortex.GlobalScope.setSkin(new OfficeSilver2007Skin());
            new StatesSample().setVisible(true);
        });
    }

}
