/*
 * Copyright (c) 2005-2008 Substance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.demo.main.check;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.pushingpixels.substance.api.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.DecorationAreaType;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.BusinessSkin;
import org.pushingpixels.substance.demo.main.SubstanceLogo;

/**
 * A simple dialog for the test application.
 * 
 * @author Kirill Grouchnikov
 */
public class SimpleDialog extends JDialog {
	/**
	 * Dialog button.
	 */
	public JButton b1;

	/**
	 * Creates a simple dialog.
	 */
	public SimpleDialog() {
		this.setLayout(new FlowLayout());
		b1 = new JButton("regular") {
			// @Override
			// public void paint(Graphics g) {
			// System.out.println("b1.paint focus:" + b1.isFocusOwner());
			// super.paint(g);
			// }
		};
		JButton b2 = new JButton("disabled");
		b2.setEnabled(false);
		JButton b3 = new JButton("default") {
			// @Override
			// public void paint(Graphics g) {
			// System.out.println("b3.paint focus:" + b1.isFocusOwner());
			// super.paint(g);
			// }
		};
		this.add(b1);
		this.add(b2);
		this.add(b3);

		this.getRootPane().setDefaultButton(b3);
		this.setTitle("Simple dialog");
	}

	public static void main(String... args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JDialog.setDefaultLookAndFeelDecorated(true);
				SubstanceLookAndFeel.setSkin(new BusinessSkin());
				SimpleDialog sd = new SimpleDialog();
				if (UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel) {
					sd.setIconImage(SubstanceLogo
							.getLogoImage(SubstanceLookAndFeel.getCurrentSkin(
									sd.getRootPane()).getColorScheme(
									DecorationAreaType.PRIMARY_TITLE_PANE,
									ColorSchemeAssociationKind.FILL,
									ComponentState.ENABLED)));
				}
				sd.setModal(false);
				sd.pack();
				sd.setLocationRelativeTo(null);
				sd.setVisible(true);
				sd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			}
		});
	}
}