/*
 * Copyright (c) 2005-2016 Substance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  o Redistributions of source code must retain the above copyright notice, 
 *    this list of conditions and the following disclaimer. 
 *     
 *  o Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution. 
 *     
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
 *    its contributors may be used to endorse or promote products derived 
 *    from this software without specific prior written permission. 
 *     
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR 
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, 
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */
package org.pushingpixels.demo.substance.main.samples.substance.clientprop;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.pushingpixels.demo.substance.main.Check;
import org.pushingpixels.demo.substance.main.check.svg.flags.mx;
import org.pushingpixels.demo.substance.main.check.svg.flags.se;
import org.pushingpixels.substance.api.SubstanceConstants.MenuGutterFillKind;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultComboBoxRenderer;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;

/**
 * Test application that shows the use of the
 * {@link SubstanceLookAndFeel#MENU_GUTTER_FILL_KIND} client property.
 * 
 * @author Kirill Grouchnikov
 * @see SubstanceLookAndFeel#MENU_GUTTER_FILL_KIND
 */
public class MenuGutterFillKindProperty extends JFrame {
	/**
	 * Creates the main frame for <code>this</code> sample.
	 */
	public MenuGutterFillKindProperty() {
		super("Menu gutter fill kind");

		setLayout(new BorderLayout());

		// create sample menu bar with one menu and a few menu items
		JMenuBar jmb = new JMenuBar();
		JMenu menu = new JMenu("menu");
		menu.add(new JMenuItem("test item 1", Check.configure(new mx(), 21, 16)));
		menu.add(new JMenuItem("test item 2"));
		menu.add(new JMenuItem("test item 3"));
		menu.addSeparator();
		menu.add(new JMenuItem("test menu item 4"));
		menu.add(new JMenuItem("test menu item 5", Check.configure(new se(), 21, 16)));
		menu.add(new JMenuItem("test menu item 6"));
		jmb.add(menu);

		setJMenuBar(jmb);

		JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));

		final JComboBox menuGutterFillCombo = new JComboBox(new Object[] {
				MenuGutterFillKind.NONE, MenuGutterFillKind.SOFT,
				MenuGutterFillKind.HARD, MenuGutterFillKind.SOFT_FILL,
				MenuGutterFillKind.HARD_FILL });
		menuGutterFillCombo.setRenderer(new SubstanceDefaultComboBoxRenderer(
				menuGutterFillCombo) {
			@Override
			public Component getListCellRendererComponent(JList list,
					Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				MenuGutterFillKind mgfk = (MenuGutterFillKind) value;
				return super.getListCellRendererComponent(list, mgfk.name()
						.toLowerCase(), index, isSelected, cellHasFocus);
			}
		});
		menuGutterFillCombo.setSelectedItem(MenuGutterFillKind.HARD);
		menuGutterFillCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// based on the selected item, set the global menu gutter
				// fill kind
				UIManager.put(SubstanceLookAndFeel.MENU_GUTTER_FILL_KIND,
						menuGutterFillCombo.getSelectedItem());
			}
		});
		controls.add(new JLabel("Menu fill"));
		controls.add(menuGutterFillCombo);

		this.add(controls, BorderLayout.SOUTH);

		this.setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * The main method for <code>this</code> sample. The arguments are ignored.
	 * 
	 * @param args
	 *            Ignored.
	 */
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SubstanceLookAndFeel.setSkin(new BusinessBlackSteelSkin());
				new MenuGutterFillKindProperty().setVisible(true);
			}
		});
	}
}
