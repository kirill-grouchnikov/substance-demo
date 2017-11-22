package org.pushingpixels.demo.substance.main.check.command;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;


/**
 * A configure command that selects the specified component.
 * 
 * @author Kirill Grouchnikov
 */
public class SelectCommand implements ConfigurationCommand<JComponent> {
	/*
	 * (non-Javadoc)
	 * 
	 * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
	 */
	public void configure(JComponent ab) {
		if (ab instanceof JButton)
			return;
		if (ab instanceof AbstractButton)
			((AbstractButton) ab).setSelected(true);
	}
}