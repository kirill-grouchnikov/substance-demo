package org.pushingpixels.demo.substance.main.check.command;

import javax.swing.JComponent;


/**
 * A configure command that disables the specified component.
 * 
 * @author Kirill Grouchnikov
 */
public class DisableCommand implements ConfigurationCommand<JComponent> {
	/*
	 * (non-Javadoc)
	 * 
	 * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
	 */
	public void configure(JComponent ab) {
		ab.setEnabled(false);
	}
}