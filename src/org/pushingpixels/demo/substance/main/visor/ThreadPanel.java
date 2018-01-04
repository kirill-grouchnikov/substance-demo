/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.substance.main.visor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import org.jdesktop.swingx.JXSearchField;
import org.pushingpixels.demo.substance.main.visor.svg.ic_mail_outline_black_24px;
import org.pushingpixels.demo.substance.main.visor.svg.ic_mode_edit_black_24px;
import org.pushingpixels.demo.substance.main.visor.svg.ic_person_outline_black_24px;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.colorscheme.SunGlareColorScheme;
import org.pushingpixels.substance.api.colorscheme.TerracottaColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIcon;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.highlight.SubstanceHighlightPainter;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

/**
 * Main destinations panel (leftmost under LTR). In the real app this will probably be a JList
 * backed by an adapter and custom renderer(s).
 */
public class ThreadPanel extends JPanel {
    public ThreadPanel() {
        this.setLayout(new VerticalStackLayout());

        this.setPreferredSize(new Dimension(400, 0));
    }

    // This class emulates the highlights on rows. In the real app this will probably
    // be an extension of SubstanceDefaultListCellRenderer.
    private static class HighlightablePanel extends JPanel {
        private boolean isSelected;

        public HighlightablePanel(JPanel content) {
            content.setOpaque(false);
            setLayout(new BorderLayout());
            add(content, BorderLayout.CENTER);
        }

        public void setSelected() {
            isSelected = true;
            setOpaque(!isSelected);
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (isSelected) {
                SubstanceSkin skin = SubstanceCortex.ComponentScope.getCurrentSkin(this);
                SubstanceHighlightPainter highlightPainter = skin.getHighlightPainter();
                SubstanceBorderPainter highlightBorderPainter = skin.getHighlightBorderPainter();
                if (highlightBorderPainter == null) {
                    highlightBorderPainter = skin.getBorderPainter();
                }
                SubstanceColorScheme fillScheme = new SunGlareColorScheme();
                SubstanceColorScheme borderScheme = new TerracottaColorScheme();

                int width = this.getWidth();
                int height = this.getHeight();

                Graphics2D g2d = (Graphics2D) g.create();
                highlightPainter.paintHighlight(g2d, this, width, height, fillScheme);
                highlightBorderPainter.paintBorder(g2d, this, width, height,
                        new Rectangle2D.Float(0, 0, width, height), null, borderScheme);
                g2d.dispose();
            }

            super.paintComponent(g);
        }
    }

    private HighlightablePanel getSelectorDestinationRow(SubstanceIcon icon, String title,
            int count) {
        FormLayout lm = new FormLayout("center:pref, 4dlu, fill:pref:grow, 4dlu, center:pref", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm).border(new EmptyBorder(8, 8, 8, 8));
        builder.append(new JLabel(icon), new JLabel(title),
                new JLabel(count > 0 ? Integer.toString(count) : ""));
        HighlightablePanel result = new HighlightablePanel(builder.build());
        return result;
    }

    private JPanel getInboxLabel(String title, SubstanceIcon icon, Color background) {
        FormLayout lm = new FormLayout("center:pref, 4dlu, fill:pref:grow", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm).border(
                new CompoundBorder(new LineBorder(background), new EmptyBorder(4, 8, 4, 8)));
        builder.append(new JLabel(icon));
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(SubstanceCortex.GlobalScope.getFontPolicy().getFontSet("Substance", null)
                .getControlFont().deriveFont(Font.BOLD));
        builder.append(titleLabel);
        JPanel result = builder.build();
        result.setBackground(background);
        return result;
    }

    private JPanel getThreadSummaryPanel(String from, String time, String title, String summary,
            int unread) {
        Font bold = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet("Substance", null)
                .getControlFont().deriveFont(Font.BOLD);

        DefaultFormBuilder firstRow = new DefaultFormBuilder(
                new FormLayout("center:pref, 4dlu, fill:pref:grow, 4dlu, right:pref", ""))
                        .border(new EmptyBorder(0, 0, 2, 0));
        firstRow.append(new JLabel(ic_person_outline_black_24px.of(10, 10)));
        JLabel fromLabel = new JLabel(from);
        fromLabel.setFont(bold.deriveFont(bold.getSize() + 1.5f));
        firstRow.append(fromLabel);
        firstRow.append(new JLabel(time));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(bold);

        DefaultFormBuilder thirdRow = new DefaultFormBuilder(
                new FormLayout("fill:pref:grow, 16dlu, right:pref", ""));
        thirdRow.append(new JLabel(summary));
        if (unread > 0) {
            thirdRow.append(new JLabel(Integer.toString(unread)));
        }
        thirdRow.appendSeparator();

        JPanel result = new JPanel(new VerticalStackLayout());
        result.add(firstRow.build());
        result.add(titleLabel);
        result.add(thirdRow.build());
        result.setBorder(new EmptyBorder(8, 16, 8, 16));
        return result;

    }

    private JPanel getTitlePanel(SubstanceIcon icon) {
        FormLayout lm = new FormLayout("fill:pref:grow, 8dlu, center:pref", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm)
                .border(new EmptyBorder(8, 8, 12, 8));

        JXSearchField searchBox = new JXSearchField("Search");
        builder.append(searchBox);

        JButton actionButton = new JButton(icon);
        SubstanceCortex.ComponentOrParentScope.setButtonIgnoreMinimumSize(actionButton,
                Boolean.TRUE);
        SubstanceCortex.ComponentOrParentScope.setFlatBackground(actionButton, Boolean.TRUE);
        builder.append(actionButton);
        JPanel result = builder.build();
        return result;
    }
}
