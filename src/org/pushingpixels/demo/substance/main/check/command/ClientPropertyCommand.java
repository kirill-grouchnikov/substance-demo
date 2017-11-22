package org.pushingpixels.demo.substance.main.check.command;

import javax.swing.JComponent;

/**
 * A configure command that sets the specified client property to the specified value.
 * 
 * @author Kirill Grouchnikov
 */
public class ClientPropertyCommand implements ConfigurationCommand<JComponent> {
    /**
     * Client property name.
     */
    private String propName;

    /**
     * Client property value.
     */
    private Object propValue;

    /**
     * Creates an client property configuration command.
     * 
     * @param propName
     *            Client property name.
     * @param propValue
     *            Client property value.
     */
    public ClientPropertyCommand(String propName, Object propValue) {
        this.propName = propName;
        this.propValue = propValue;
    }

    /*
     * (non-Javadoc)
     * 
     * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
     */
    public void configure(JComponent ab) {
        if (ab instanceof JComponent)
            ((JComponent) ab).putClientProperty(this.propName, this.propValue);
    }
}