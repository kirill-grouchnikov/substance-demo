package org.pushingpixels.demo.substance.main.check;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultComboBoxRenderer;
import org.pushingpixels.substance.api.skin.SkinInfo;

public class SubstanceSkinComboSelector extends JComboBox {
    public SubstanceSkinComboSelector() {
        // populate the combobox
        super(new ArrayList<SkinInfo>(SubstanceCortex.GlobalScope.getAllSkins().values())
                .toArray());
        // set the current skin as the selected item
        SubstanceSkin currentSkin = SubstanceCortex.GlobalScope.getCurrentSkin();
        for (SkinInfo skinInfo : SubstanceCortex.GlobalScope.getAllSkins().values()) {
            if (skinInfo.getDisplayName().compareTo(currentSkin.getDisplayName()) == 0) {
                this.setSelectedItem(skinInfo);
                break;
            }
        }
        // set custom renderer to show the skin display name
        this.setRenderer(new SubstanceDefaultComboBoxRenderer(this) {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                return super.getListCellRendererComponent(list, ((SkinInfo) value).getDisplayName(),
                        index, isSelected, cellHasFocus);
            }
        });
        // add an action listener to change skin based on user selection
        this.addActionListener(
                (ActionEvent e) -> SwingUtilities.invokeLater(() -> SubstanceCortex.GlobalScope
                        .setSkin(((SkinInfo) SubstanceSkinComboSelector.this.getSelectedItem())
                                .getClassName())));
    }
}
