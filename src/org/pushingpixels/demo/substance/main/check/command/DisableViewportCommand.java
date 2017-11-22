package org.pushingpixels.demo.substance.main.check.command;

import javax.swing.JComponent;
import javax.swing.JScrollPane;

/**
 * A configure command that disables the viewport component specified component.
 * 
 * @author Kirill Grouchnikov
 */
public class DisableViewportCommand implements ConfigurationCommand<JComponent> {
    /*
     * (non-Javadoc)
     * 
     * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
     */
    public void configure(JComponent ab) {
        if (ab instanceof JScrollPane) {
            JScrollPane jsp = (JScrollPane) ab;
            jsp.getViewport().getView().setEnabled(false);
        }
    }
}