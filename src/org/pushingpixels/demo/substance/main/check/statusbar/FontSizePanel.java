package org.pushingpixels.demo.substance.main.check.statusbar;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.FontUIResource;

import org.pushingpixels.demo.substance.main.check.svg.tango.view_zoom_in;
import org.pushingpixels.demo.substance.main.check.svg.tango.view_zoom_out;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.font.FontPolicy;
import org.pushingpixels.substance.api.font.FontSet;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

public class FontSizePanel {
    private static class WrapperFontSet implements FontSet {
        private int extra;

        private FontSet delegate;

        public WrapperFontSet(FontSet delegate, int extra) {
            super();
            this.delegate = delegate;
            this.extra = extra;
        }

        private FontUIResource getWrappedFont(FontUIResource systemFont) {
            return new FontUIResource(systemFont.getFontName(), systemFont.getStyle(),
                    systemFont.getSize() + extra);
        }

        public FontUIResource getControlFont() {
            return getWrappedFont(delegate.getControlFont());
        }

        public FontUIResource getMenuFont() {
            return getWrappedFont(delegate.getMenuFont());
        }

        public FontUIResource getMessageFont() {
            return getWrappedFont(delegate.getMessageFont());
        }

        public FontUIResource getSmallFont() {
            return getWrappedFont(delegate.getSmallFont());
        }

        public FontUIResource getTitleFont() {
            return getWrappedFont(delegate.getTitleFont());
        }

        public FontUIResource getWindowTitleFont() {
            // FontUIResource f = this.getWrappedFont(this.delegate
            // .getWindowTitleFont());
            // return new FontUIResource(f.deriveFont(Font.BOLD, f.getSize() +
            // 1));
            return getWrappedFont(delegate.getWindowTitleFont());
        }
    }

    private static class Tahoma11FontSet implements FontSet {
        private FontUIResource tahoma11 = new FontUIResource("Tahoma", Font.PLAIN, 11);

        public FontUIResource getControlFont() {
            return tahoma11;
        }

        public FontUIResource getMenuFont() {
            return tahoma11;
        }

        public FontUIResource getMessageFont() {
            return tahoma11;
        }

        public FontUIResource getSmallFont() {
            return tahoma11;
        }

        public FontUIResource getTitleFont() {
            return tahoma11;
        }

        public FontUIResource getWindowTitleFont() {
            return tahoma11;
        }
    }

    public static JPanel getPanel() {
        FormLayout lm = new FormLayout(
                "fill:pref, 2dlu, fill:pref, 0dlu, fill:min:grow, 0dlu, fill:pref, 2dlu, fill:pref",
                "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm);
        builder.setBorder(new EmptyBorder(0, 0, 0, 0));

        final JLabel fontSizeLabel = new JLabel();
        fontSizeLabel.setText(SubstanceCortex.GlobalScope.getFontPolicy()
                .getFontSet("Substance", null).getControlFont().getSize() + " pt.");
        builder.append(fontSizeLabel);
        // fontSizeLabel.add(Box.createHorizontalStrut(5));

        Icon zoomOutIcon = view_zoom_out.of(16, 16);
        JLabel zoomOutLabel = new JLabel(zoomOutIcon);
        builder.append(zoomOutLabel);

        final JSlider fontSizeSlider = new JSlider(0, 10, 0);
        fontSizeSlider.setFocusable(false);
        // fontSizeSlider.setOpaque(false);
        fontSizeSlider.setToolTipText(
                "Controls the global font set size. Resets Substance as the current LAF.");
        fontSizeSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                // if the value is adjusting - ignore. This is done
                // to make CPU usage better.
                if (!fontSizeSlider.getModel().getValueIsAdjusting()) {
                    final int newValue = fontSizeSlider.getValue();
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            SubstanceCortex.GlobalScope.setFontPolicy(null);
                            final FontSet substanceCoreFontSet = SubstanceCortex.GlobalScope
                                    .getFontPolicy().getFontSet("Substance", null);
                            FontPolicy newFontPolicy = new FontPolicy() {
                                public FontSet getFontSet(String lafName, UIDefaults table) {
                                    return new WrapperFontSet(substanceCoreFontSet, newValue);
                                }
                            };

                            SubstanceCortex.GlobalScope.setFontPolicy(newFontPolicy);

                            fontSizeLabel.setText(SubstanceCortex.GlobalScope.getFontPolicy()
                                    .getFontSet("Substance", null).getControlFont().getSize()
                                    + " pt.");
                        }
                    });
                }
            }
        });
        builder.append(fontSizeSlider);

        Icon zoomInIcon = view_zoom_in.of(16, 16);
        JLabel zoomInLabel = new JLabel(zoomInIcon);
        builder.append(zoomInLabel);

        JButton tahoma = new JButton("Tahoma 11");
        SubstanceCortex.ComponentOrParentScope.setButtonIgnoreMinimumSize(tahoma, true);
        tahoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        SubstanceCortex.GlobalScope.setFontPolicy(null);
                        FontPolicy newFontPolicy = new FontPolicy() {
                            public FontSet getFontSet(String lafName, UIDefaults table) {
                                return new Tahoma11FontSet();
                            }
                        };

                        SubstanceCortex.GlobalScope.setFontPolicy(newFontPolicy);

                        fontSizeLabel.setText(SubstanceCortex.GlobalScope.getFontPolicy()
                                .getFontSet("Substance", null).getControlFont().getSize() + " pt.");
                    }
                });
            }
        });
        builder.append(tahoma);

        JPanel result = builder.getPanel();
        // result.setOpaque(false);
        return result;
    }
}
