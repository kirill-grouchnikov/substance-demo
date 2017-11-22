package org.pushingpixels.demo.substance.main.check.command;

import java.awt.Rectangle;

import javax.swing.JComponent;

/**
 * A configure command that sets bounds for the specified component.
 * 
 * @author Kirill Grouchnikov
 */
public class SetBoundsCommand implements ConfigurationCommand<JComponent> {
	/**
	 * Component bounds to set.
	 */
	private Rectangle bounds;

	/**
	 * Creates a new configuration command.
	 * 
	 * @param bounds
	 *            Component bounds to set.
	 */
	public SetBoundsCommand(Rectangle bounds) {
		this.bounds = bounds;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
	 */
	public void configure(JComponent comp) {
		comp.setBounds(this.bounds);
	}
}