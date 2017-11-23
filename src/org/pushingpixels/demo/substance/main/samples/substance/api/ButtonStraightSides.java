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
package org.pushingpixels.demo.substance.main.samples.substance.api;

import java.awt.FlowLayout;
import java.util.EnumSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.Side;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;

/**
 * Test application that shows the use of the
 * {@link SubstanceCortex.ComponentScope#setButtonStraightSide(javax.swing.JComponent, Side)} and
 * {@link SubstanceCortex.ComponentScope#setButtonStraightSides(javax.swing.JComponent, java.util.Set)}
 * APIs.
 * 
 * @author Kirill Grouchnikov
 * @see SubstanceCortex.ComponentScope#setButtonStraightSide(javax.swing.JComponent, Side)
 * @see SubstanceCortex.ComponentScope#setButtonStraightSides(javax.swing.JComponent, java.util.Set)
 */
public class ButtonStraightSides extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public ButtonStraightSides() {
        super("Buttons with straight sides");

        this.setLayout(new FlowLayout());

        JButton buttonA = new JButton("left only");
        // Mark button to have straight left side
        // using side constant
        SubstanceCortex.ComponentScope.setButtonStraightSide(buttonA, SubstanceSlices.Side.LEFT);

        JButton buttonB = new JButton("right only");
        // Mark button to have straight right side
        // using side constant
        SubstanceCortex.ComponentScope.setButtonStraightSide(buttonB, SubstanceSlices.Side.RIGHT);

        JButton buttonC = new JButton("left+top");
        // Mark button to have straight left and top sides
        // using set of side constants
        SubstanceCortex.ComponentScope.setButtonStraightSides(buttonC,
                EnumSet.of(SubstanceSlices.Side.LEFT, SubstanceSlices.Side.TOP));

        JButton buttonD = new JButton("right+bottom");
        // Mark button to have straight right and bottom sides
        // using set of side constants
        SubstanceCortex.ComponentScope.setButtonStraightSides(buttonD,
                EnumSet.of(SubstanceSlices.Side.RIGHT, SubstanceSlices.Side.BOTTOM));

        this.add(buttonA);
        this.add(buttonB);
        this.add(buttonC);
        this.add(buttonD);

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * The main method for <code>this</code> sample. The arguments are ignored.
     * 
     * @param args
     *            Ignored.
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
                SubstanceCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
                new ButtonStraightSides().setVisible(true);
        });
    }
}
