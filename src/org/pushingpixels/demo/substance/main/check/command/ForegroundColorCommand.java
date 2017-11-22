package org.pushingpixels.demo.substance.main.check.command;

import java.awt.Color;

import javax.swing.JComponent;

/**
 * A configure command that sets the specified foreground color on the specified component.
 * 
 * @author Kirill Grouchnikov
 */
public class ForegroundColorCommand implements ConfigurationCommand<JComponent> {
    /**
     * Color to set.
     */
    private Color color;

    /**
     * Creates a foreground color configuration command.
     * 
     * @param color
     *            Foreground color to set.
     */
    public ForegroundColorCommand(Color color) {
        this.color = color;
    }

    /*
     * (non-Javadoc)
     * 
     * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
     */
    public void configure(JComponent ab) {
        ab.setForeground(this.color);
    }
}