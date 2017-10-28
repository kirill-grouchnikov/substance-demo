package org.pushingpixels.demo.substance.flamingo;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin;

public class TestCommandButtonPanel extends org.pushingpixels.demo.flamingo.common.TestCommandButtonPanel {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				SubstanceLookAndFeel.setSkin(new OfficeBlue2007Skin());
				JFrame.setDefaultLookAndFeelDecorated(true);
				new TestCommandButtonPanel().setVisible(true);
			}
		});

	}
}
