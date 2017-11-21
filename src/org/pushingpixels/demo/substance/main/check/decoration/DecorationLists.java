package org.pushingpixels.demo.substance.main.check.decoration;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.pushingpixels.demo.substance.main.check.SubstanceSkinComboSelector;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;

public class DecorationLists extends JFrame {
	private static class ListPanel extends JPanel {
		public ListPanel(String caption, DecorationAreaType decorationAreaType,
				boolean isEnabled) {
			super(new BorderLayout());
			SubstanceCortex.ComponentScope.setDecorationType(this, decorationAreaType);

			JLabel captionLabel = new JLabel(" " + caption);
			Font font = captionLabel.getFont();
			captionLabel.setFont(font.deriveFont(Font.BOLD));
			this.add(captionLabel, BorderLayout.NORTH);
			JList list = new JList(new Object[] { "entry1", "entry2", "entry3",
					"entry4" });
			list.setEnabled(isEnabled);
			this.add(list, BorderLayout.CENTER);
		}
	}

	public DecorationLists() {
		super("Lists in decoration areas");

		JPanel listsPanel = new JPanel(new GridLayout(2, 4));

		listsPanel.add(new ListPanel("Enabled in HEADER",
				DecorationAreaType.HEADER, true));
		listsPanel.add(new ListPanel("Disabled in HEADER",
				DecorationAreaType.HEADER, false));
		listsPanel.add(new ListPanel("Enabled in NONE",
				DecorationAreaType.NONE, true));
		listsPanel.add(new ListPanel("Disabled in NONE",
				DecorationAreaType.NONE, false));
		listsPanel.add(new ListPanel("Enabled in GENERAL",
				DecorationAreaType.GENERAL, true));
		listsPanel.add(new ListPanel("Disabled in GENERAL",
				DecorationAreaType.GENERAL, false));
		listsPanel.add(new ListPanel("Enabled in FOOTER",
				DecorationAreaType.FOOTER, true));
		listsPanel.add(new ListPanel("Disabled in FOOTER",
				DecorationAreaType.FOOTER, false));

		this.setLayout(new BorderLayout());
		this.add(listsPanel, BorderLayout.CENTER);

		JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		controlPanel.add(new SubstanceSkinComboSelector());

		this.add(controlPanel, BorderLayout.SOUTH);

		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SubstanceCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
				new DecorationLists().setVisible(true);
			}
		});
	}
}
