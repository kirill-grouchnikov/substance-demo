package org.pushingpixels.demo.substance.main.check.command;

import java.beans.PropertyVetoException;

import javax.swing.JComponent;
import javax.swing.JInternalFrame;

/**
 * A configure command that minimizes internal frames.
 * 
 * @author Kirill Grouchnikov
 */
public class MinimizeInternalFrameCommand implements ConfigurationCommand<JComponent> {
    /*
     * (non-Javadoc)
     * 
     * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
     */
    public void configure(JComponent ab) {
        if (ab instanceof JInternalFrame) {
            JInternalFrame jif = (JInternalFrame) ab;
            try {
                jif.setIcon(true);
            } catch (PropertyVetoException pve) {
            }
        }
    }
}