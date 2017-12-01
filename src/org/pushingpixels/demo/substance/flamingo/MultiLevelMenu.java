package org.pushingpixels.demo.substance.flamingo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.demo.substance.flamingo.svg.transcoded.Edit_copy;
import org.pushingpixels.demo.substance.flamingo.svg.transcoded.Edit_cut;
import org.pushingpixels.demo.substance.flamingo.svg.transcoded.Edit_find;
import org.pushingpixels.demo.substance.flamingo.svg.transcoded.Edit_find_replace;
import org.pushingpixels.demo.substance.flamingo.svg.transcoded.Edit_paste;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonPopupOrientationKind;
import org.pushingpixels.flamingo.api.common.JCommandMenuButton;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.GeminiSkin;
import org.pushingpixels.substance.flamingo.SubstanceFlamingoPlugin;

public class MultiLevelMenu extends JFrame {

    public MultiLevelMenu() {
        super("Multi level menu");

        JCommandButton main = new JCommandButton("click me");
        main.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
        main.setDisplayState(CommandButtonDisplayState.MEDIUM);
        main.setFlat(false);

        // first level menu
        main.setPopupCallback((JCommandButton commandButton) -> {
            JCommandPopupMenu result = new JCommandPopupMenu();

            result.addMenuButton(new JCommandMenuButton("Copy", new Edit_copy()));
            result.addMenuButton(new JCommandMenuButton("Cut", new Edit_cut()));
            result.addMenuButton(new JCommandMenuButton("Paste", new Edit_paste()));

            result.addMenuSeparator();

            JCommandMenuButton second = new JCommandMenuButton("Find", null);
            second.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
            // second level
            second.setPopupCallback((JCommandButton commandButton2) -> {
                JCommandPopupMenu result2 = new JCommandPopupMenu();

                result2.addMenuButton(new JCommandMenuButton("Find", new Edit_find()));
                result2.addMenuButton(
                        new JCommandMenuButton("Find replace", new Edit_find_replace()));

                return result2;
            });
            second.setPopupOrientationKind(CommandButtonPopupOrientationKind.SIDEWARD);
            result.addMenuButton(second);

            return result;
        });

        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.add(main);

        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceCortex.GlobalScope.registerComponentPlugin(new SubstanceFlamingoPlugin());

        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new GeminiSkin());

            new MultiLevelMenu().setVisible(true);
        });
    }

}
