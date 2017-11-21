/*
 * Copyright (c) 2005-2017 Substance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.substance.main.check;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Composite;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Locale;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;

import org.pushingpixels.demo.substance.main.Check;
import org.pushingpixels.demo.substance.main.Check.MyMainTabPreviewPainter;
import org.pushingpixels.demo.substance.main.SubstanceLogo;
import org.pushingpixels.demo.substance.main.check.svg.ic_error_black_24px;
import org.pushingpixels.demo.substance.main.check.svg.ic_help_black_24px;
import org.pushingpixels.demo.substance.main.check.svg.ic_info_black_24px;
import org.pushingpixels.demo.substance.main.check.svg.ic_warning_black_24px;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.SubstanceSlices.FocusKind;
import org.pushingpixels.substance.api.SubstanceSlices.MenuGutterFillKind;
import org.pushingpixels.substance.api.SubstanceSlices.SubstanceOptionPaneButtonAlignment;
import org.pushingpixels.substance.api.SubstanceSlices.SubstanceOptionPaneButtonOrder;
import org.pushingpixels.substance.api.SubstanceSlices.SubstanceWidgetType;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.SubstanceWidget;
import org.pushingpixels.substance.api.iconpack.SubstanceDefaultIconPack;
import org.pushingpixels.substance.api.painter.preview.DefaultPreviewPainter;
import org.pushingpixels.substance.api.skin.NebulaBrickWallSkin;
import org.pushingpixels.substance.tabbed.TabOverviewDialogWidget.TabOverviewKind;
import org.pushingpixels.substance.tabbed.TabPreviewUtilities;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

/**
 * Factory for creating the global control panels (for global settings and testing the dialogs).
 * 
 * @author Kirill Grouchnikov
 */
public class ControlPanelFactory {
    /**
     * Instance of a simple dialog.
     */
    private static SimpleDialog simpleDialog;

    /**
     * Instance of a disposable dialog.
     */
    private static JDialog disposableDialog;

    /**
     * Returns the main control panel.
     * 
     * @param mainFrame
     *            The main test frame.
     * @param mainTabbedPane
     *            The main tabbed pane.
     * @param mainTabPreviewPainter
     *            The preview painter of the main tabbed pane.
     * @param toolbar
     *            The toolbar of the main test frame.
     * @return The main control panel.
     */
    public static JPanel getMainControlPanel(final JFrame mainFrame,
            final JTabbedPane mainTabbedPane, final MyMainTabPreviewPainter mainTabPreviewPainter,
            final JToolBar toolbar) {
        FormLayout lm = new FormLayout("right:pref, 4dlu, fill:pref:grow", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm);
        // builder.setDefaultDialogBorder();

        builder.appendSeparator("Title pane settings");
        final JCheckBox markAsModified = new JCheckBox("Marked modified");
        markAsModified.setSelected(false);
        markAsModified.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainFrame.getRootPane().putClientProperty(SubstanceLookAndFeel.WINDOW_MODIFIED,
                        (markAsModified.isSelected() ? Boolean.TRUE : false));
            }
        });
        builder.append("Modified", markAsModified);

        final JCheckBox heapPanel = new JCheckBox("Has heap panel");
        heapPanel.setSelected(false);
        heapPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SubstanceCortex.WindowScope.setWidgetVisible(mainFrame, heapPanel.isSelected(),
                        SubstanceWidgetType.TITLE_PANE_HEAP_STATUS);
            }
        });
        builder.append("Heap panel", heapPanel);

        JButton changeTitleButton = new JButton("Change");
        changeTitleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String random = "abcdefghijklmnopqrstuvwxyz ";
                int length = 60 + (int) (150 * Math.random());
                String title = "";
                while (length > 0) {
                    title += random.charAt((int) (random.length() * Math.random()));
                    length--;
                }
                mainFrame.setTitle(title);
            }
        });
        builder.append("Title string", changeTitleButton);

        builder.appendSeparator("Miscellaneous");

        final JCheckBox useThemedDefaultIconsCheckBox = new JCheckBox("use themed icons");
        useThemedDefaultIconsCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        UIManager.put(SubstanceLookAndFeel.USE_THEMED_DEFAULT_ICONS,
                                useThemedDefaultIconsCheckBox.isSelected() ? Boolean.TRUE : null);
                        mainFrame.repaint();
                    }
                });
            }
        });
        builder.append("Themed icons", useThemedDefaultIconsCheckBox);

        final JCheckBox useConstantThemesOnDialogs = new JCheckBox("use constant themes");
        useConstantThemesOnDialogs
                .setSelected(SubstanceCortex.GlobalScope.isToUseConstantThemesOnDialogs());
        useConstantThemesOnDialogs.addActionListener((ActionEvent e) -> {
            SwingUtilities.invokeLater(() -> {
                SubstanceCortex.GlobalScope
                        .setToUseConstantThemesOnDialogs(useConstantThemesOnDialogs.isSelected());
                SubstanceCortex.GlobalScope.setSkin(
                        SubstanceCortex.ComponentScope.getCurrentSkin(mainFrame.getRootPane()));
            });
        });
        builder.append("Option pane icons", useConstantThemesOnDialogs);

        final JComboBox placementCombo = new JComboBox(
                new Object[] { "top", "bottom", "left", "right" });
        placementCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) placementCombo.getSelectedItem();
                if ("top".equals(selected))
                    mainTabbedPane.setTabPlacement(JTabbedPane.TOP);
                if ("bottom".equals(selected))
                    mainTabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
                if ("left".equals(selected))
                    mainTabbedPane.setTabPlacement(JTabbedPane.LEFT);
                if ("right".equals(selected))
                    mainTabbedPane.setTabPlacement(JTabbedPane.RIGHT);
            }
        });
        builder.append("Placement", placementCombo);

        try {
            final JComboBox overviewKindCombo = new FlexiComboBox<TabOverviewKind>(
                    TabOverviewKind.GRID, TabOverviewKind.MENU_CAROUSEL,
                    TabOverviewKind.ROUND_CAROUSEL) {
                @Override
                public String getCaption(TabOverviewKind item) {
                    return item.getName();
                }
            };
            overviewKindCombo.setSelectedItem(TabPreviewUtilities
                    .getTabPreviewPainter(mainTabbedPane).getOverviewKind(mainTabbedPane));
            overviewKindCombo.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    mainTabPreviewPainter.setTabOverviewKind(
                            (TabOverviewKind) overviewKindCombo.getSelectedItem());
                }
            });

            builder.append("Overview kind", overviewKindCombo);
        } catch (NoClassDefFoundError ncdfe) {
        }

        final JComboBox menuGutterFillCombo = new FlexiComboBox<MenuGutterFillKind>(
                MenuGutterFillKind.NONE, MenuGutterFillKind.SOFT, MenuGutterFillKind.HARD,
                MenuGutterFillKind.SOFT_FILL, MenuGutterFillKind.HARD_FILL) {
            @Override
            public String getCaption(MenuGutterFillKind item) {
                return item.name();
            }
        };
        menuGutterFillCombo.setSelectedItem(MenuGutterFillKind.HARD);
        menuGutterFillCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UIManager.put(SubstanceLookAndFeel.MENU_GUTTER_FILL_KIND,
                        menuGutterFillCombo.getSelectedItem());
            }
        });
        builder.append("Menu fill", menuGutterFillCombo);

        final JComboBox focusKindCombo = new FlexiComboBox<FocusKind>(FocusKind.values()) {
            @Override
            public String getCaption(FocusKind item) {
                return item.name();
            }
        };
        focusKindCombo.setSelectedItem(FocusKind.ALL_INNER);
        focusKindCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UIManager.put(SubstanceLookAndFeel.FOCUS_KIND, focusKindCombo.getSelectedItem());
            }
        });
        builder.append("Focus kind", focusKindCombo);

        JButton buttonGlassPane = new JButton("Show");
        buttonGlassPane.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                final JPanel glassPane = new JPanel() {
                    @Override
                    public void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        Graphics2D graphics = (Graphics2D) g;
                        int height = getHeight();
                        int width = getWidth();
                        Composite c = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
                                (float) 0.4);
                        graphics.setComposite(c);
                        for (int i = 0; i < height; i++) {
                            Color color = (i % 2 == 0) ? new Color(200, 200, 255)
                                    : new Color(230, 230, 255);
                            graphics.setColor(color);
                            graphics.drawLine(0, i, width, i);
                        }
                        Composite c2 = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
                                (float) 1.0);
                        graphics.setComposite(c2);
                    }
                };
                glassPane.setOpaque(false);
                glassPane.addMouseListener(new MouseAdapter() {
                });
                glassPane.addKeyListener(new KeyAdapter() {
                });
                mainFrame.setGlassPane(glassPane);
                new Thread() {
                    @Override
                    public void run() {
                        glassPane.setVisible(true);
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ie) {
                            ie.printStackTrace();
                        }
                        glassPane.setVisible(false);
                    }
                }.start();
            }
        });
        builder.append("Glass pane", buttonGlassPane);

        builder.appendSeparator("Custom animations");
        final JCheckBox allowFocusLoopAnimations = new JCheckBox("Allow animation");
        allowFocusLoopAnimations.setSelected(SubstanceCortex.GlobalScope
                .isAnimationAllowed(AnimationFacet.FOCUS_LOOP_ANIMATION));
        allowFocusLoopAnimations.addActionListener((ActionEvent e) -> {
            if (allowFocusLoopAnimations.isSelected()) {
                SubstanceCortex.GlobalScope.allowAnimations(AnimationFacet.FOCUS_LOOP_ANIMATION);
            } else {
                SubstanceCortex.GlobalScope.disallowAnimations(AnimationFacet.FOCUS_LOOP_ANIMATION);
            }
        });
        builder.append("Focus loop", allowFocusLoopAnimations);

        final JCheckBox allowGlowIconAnimations = new JCheckBox("Allow animation");
        allowGlowIconAnimations.addActionListener((ActionEvent e) -> {
            if (allowGlowIconAnimations.isSelected()) {
                SubstanceCortex.GlobalScope.allowAnimations(AnimationFacet.ICON_GLOW);
            } else {
                SubstanceCortex.GlobalScope.disallowAnimations(AnimationFacet.ICON_GLOW);
            }
        });
        builder.append("Icon glow", allowGlowIconAnimations);

        final JCheckBox allowGhostIconAnimations = new JCheckBox("Allow animation");
        allowGhostIconAnimations.addActionListener((ActionEvent e) -> {
            if (allowGhostIconAnimations.isSelected()) {
                SubstanceCortex.GlobalScope.allowAnimations(AnimationFacet.GHOSTING_ICON_ROLLOVER);
            } else {
                SubstanceCortex.GlobalScope
                        .disallowAnimations(AnimationFacet.GHOSTING_ICON_ROLLOVER);
            }
        });
        builder.append("Icon rollover", allowGhostIconAnimations);

        final JCheckBox allowGhostPressAnimations = new JCheckBox("Allow animation");
        allowGhostPressAnimations.addActionListener((ActionEvent e) -> {
            if (allowGhostPressAnimations.isSelected()) {
                SubstanceCortex.GlobalScope.allowAnimations(AnimationFacet.GHOSTING_BUTTON_PRESS);
            } else {
                SubstanceCortex.GlobalScope
                        .disallowAnimations(AnimationFacet.GHOSTING_BUTTON_PRESS);
            }
        });
        builder.append("Button press", allowGhostPressAnimations);

        builder.appendSeparator("Toolbar");
        final JCheckBox isToolbarFlat = new JCheckBox("Is flat");

        isToolbarFlat.setSelected(true);
        isToolbarFlat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                toolbar.putClientProperty(SubstanceLookAndFeel.FLAT_PROPERTY,
                        Boolean.valueOf(isToolbarFlat.isSelected()));
                toolbar.repaint();
            }
        });
        builder.append("Flat", isToolbarFlat);

        builder.appendSeparator("Menu bar");
        final JCheckBox menuSearch = new JCheckBox("Has menu search");
        menuSearch.setSelected(false);
        menuSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SubstanceCortex.WindowScope.setWidgetVisible(mainFrame, menuSearch.isSelected(),
                        SubstanceWidgetType.MENU_SEARCH);
            }
        });
        builder.append("Menu search", menuSearch);

        builder.appendSeparator("Icon pack");
        final JCheckBox iconPack = new JCheckBox("Use custom icon pack");
        iconPack.setSelected(false);
        iconPack.addActionListener((ActionEvent e) -> SubstanceCortex.GlobalScope.setIconPack(
                iconPack.isSelected() ? new TangoIconPack() : new SubstanceDefaultIconPack()));
        builder.append("Icon pack", iconPack);

        JPanel result = builder.getPanel();
        result.setName("Main control panel");
        return result;
    }

    /**
     * Returns the control panel for testing dialogs.
     * 
     * @param mainFrame
     *            The main test frame.
     * @return Control panel for testing dialogs.
     */
    public static JPanel getDialogControlPanel(final JFrame mainFrame) {
        FormLayout lm = new FormLayout("right:pref, 4dlu, fill:pref:grow", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm);

        builder.appendSeparator("Core choosers");
        JButton bfo = new JButton("Open dialog", Check.getIcon("JFileChooserColor16"));
        bfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JFileChooser jfc = new JFileChooser();
                        jfc.showOpenDialog(mainFrame);
                    }
                });
            }
        });
        builder.append("File chooser", bfo);

        JButton bfs = new JButton("Save dialog", Check.getIcon("JFileChooserColor16"));
        bfs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JFileChooser jfc = new JFileChooser();
                        jfc.showSaveDialog(mainFrame);
                    }
                });
            }
        });
        builder.append("", bfs);

        JButton bc = new JButton("Open", Check.getIcon("JColorChooserColor16"));
        bc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        Color color = JColorChooser.showDialog(mainFrame, "Color chooser",
                                new Color(23, 45, 200));
                        if (color != null) {
                            Check.out("Chosen " + color.toString());
                        }
                    }
                });
            }
        });
        builder.append("Color chooser", bc);

        JButton bcWindow = new JButton("open in window");
        bcWindow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        final Window window = new Window(mainFrame);
                        window.setLayout(new BorderLayout());
                        window.add(new JColorChooser());
                        window.pack();
                        window.setLocationRelativeTo(null);
                        window.setVisible(true);
                        Timer timerDispose = new Timer(5000, new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                window.dispose();
                            }
                        });
                        timerDispose.setRepeats(false);
                        timerDispose.start();
                    }
                });
            }
        });
        builder.append("", bcWindow);

        builder.appendSeparator("Option panes");

        final JComboBox optionPaneButtonOrderCombo = new FlexiComboBox<SubstanceOptionPaneButtonOrder>(
                SubstanceOptionPaneButtonOrder.values()) {
            @Override
            public String getCaption(SubstanceOptionPaneButtonOrder item) {
                return item.name();
            }
        };
        optionPaneButtonOrderCombo
                .setSelectedItem(SubstanceCortex.GlobalScope.getOptionPaneButtonOrder());
        optionPaneButtonOrderCombo.addActionListener((ActionEvent e) -> {
            SubstanceCortex.GlobalScope.setOptionPaneButtonOrder(
                    (SubstanceOptionPaneButtonOrder) optionPaneButtonOrderCombo.getSelectedItem());
        });
        builder.append("Button order", optionPaneButtonOrderCombo);

        final JComboBox optionPaneButtonAlignmentCombo = new FlexiComboBox<SubstanceOptionPaneButtonAlignment>(
                SubstanceOptionPaneButtonAlignment.values()) {
            @Override
            public String getCaption(SubstanceOptionPaneButtonAlignment item) {
                return item.name();
            }
        };
        optionPaneButtonAlignmentCombo
                .setSelectedItem(SubstanceCortex.GlobalScope.getOptionPaneButtonAlignment());
        optionPaneButtonAlignmentCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SubstanceCortex.GlobalScope.setOptionPaneButtonAlignment(
                        (SubstanceOptionPaneButtonAlignment) optionPaneButtonAlignmentCombo
                                .getSelectedItem());
            }
        });
        builder.append("Button alignment", optionPaneButtonAlignmentCombo);

        JButton bop = new JButton("Show");
        bop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JOptionPane pane = new JOptionPane("Sample option pane");
                        pane.applyComponentOrientation(
                                ComponentOrientation.getOrientation(Locale.getDefault()));
                        JDialog dialog = pane.createDialog(mainFrame, "Sample title");
                        dialog.setVisible(true);
                        dialog.dispose();
                    }
                });
            };
        });
        builder.append("Plain", bop);

        JButton bopi = new JButton("Show", ic_info_black_24px.of(16, 16));
        bopi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JOptionPane.showMessageDialog(mainFrame, "Sample info message",
                                "Sample title", JOptionPane.INFORMATION_MESSAGE);
                    }
                });
            };
        });
        builder.append("Info", bopi);

        JButton bope = new JButton("Show", ic_error_black_24px.of(16, 16));
        bope.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JOptionPane.showMessageDialog(mainFrame, "Sample error message",
                                "Sample title", JOptionPane.ERROR_MESSAGE);
                    }
                });
            };
        });
        builder.append("Error", bope);

        JButton bopw = new JButton("Show", ic_warning_black_24px.of(16, 16));
        bopw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JOptionPane.showMessageDialog(mainFrame, "Sample warning message",
                                "Sample title", JOptionPane.WARNING_MESSAGE);
                    }
                });
            };
        });
        builder.append("Warning", bopw);

        JButton bopq = new JButton("Show", ic_help_black_24px.of(16, 16));
        bopq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JOptionPane.showMessageDialog(mainFrame, "Sample question message",
                                "Sample title", JOptionPane.QUESTION_MESSAGE);
                    }
                });
            };
        });
        builder.append("Question", bopq);

        JButton bopc = new JButton("Show");
        bopc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JOptionPane.showOptionDialog(mainFrame, new JPanel(), "Option",
                                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,
                                null);
                    }
                });
            };
        });
        builder.append("Custom", bopc);

        JButton buttonOptionPaneSimpleInput = new JButton("Show");
        buttonOptionPaneSimpleInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JDialog dialog = new JDialog(mainFrame, "Sample dialog", true);
                        dialog.setSize(400, 300);
                        dialog.setLocationRelativeTo(mainFrame);
                        dialog.setLayout(new BorderLayout());
                        JDesktopPane panel = new JDesktopPane();
                        panel.applyComponentOrientation(
                                ComponentOrientation.getOrientation(Locale.getDefault()));
                        dialog.add(panel, BorderLayout.CENTER);
                        JOptionPane.showInputDialog(panel, "Sample Question Message",
                                "Default Answer");
                        dialog.dispose();
                    }
                });
            }
        });
        builder.append("Simple input", buttonOptionPaneSimpleInput);

        JButton buttonOptionPaneComplexInput = new JButton("Show");
        buttonOptionPaneComplexInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JDialog dialog = new JDialog(mainFrame, "Sample dialog", true);
                        dialog.setSize(400, 300);
                        dialog.setLocationRelativeTo(mainFrame);
                        dialog.setLayout(new BorderLayout());
                        JDesktopPane panel = new JDesktopPane();
                        panel.applyComponentOrientation(
                                ComponentOrientation.getOrientation(Locale.getDefault()));
                        dialog.add(panel, BorderLayout.CENTER);
                        // dialog.setVisible(true);
                        String optionChoices[] = new String[] { "entry1", "entry2", "entry3",
                                        "entry4" };
                        JOptionPane.showInputDialog(panel, "Sample Question Message",
                                "Title Goes Here", JOptionPane.QUESTION_MESSAGE, null,
                                optionChoices, "entry1");
                        dialog.dispose();
                    }
                });
            }
        });
        builder.append("Complex input", buttonOptionPaneComplexInput);

        JButton buttonOptionPaneInternalInput = new JButton("Show");
        buttonOptionPaneInternalInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JDialog dialog = new JDialog(mainFrame, "Sample dialog", true);
                        dialog.setSize(400, 300);
                        dialog.setLocationRelativeTo(mainFrame);
                        dialog.setLayout(new BorderLayout());
                        JDesktopPane panel = new JDesktopPane();
                        panel.applyComponentOrientation(
                                ComponentOrientation.getOrientation(Locale.getDefault()));
                        dialog.add(panel, BorderLayout.CENTER);
                        // dialog.setVisible(true);
                        JOptionPane.showInternalInputDialog(panel, "Sample info message",
                                "Sample title", JOptionPane.INFORMATION_MESSAGE);
                        dialog.dispose();
                    }
                });
            }
        });
        builder.append("Internal input", buttonOptionPaneInternalInput);

        builder.appendSeparator("Default buttons");

        JButton openDisposable = new JButton("Open");
        openDisposable.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (disposableDialog != null) {
                            disposableDialog.setVisible(true);
                            return;
                        }
                        disposableDialog = new JDialog();
                        disposableDialog.setTitle("Disposable");

                        JTree tree = new JTree();
                        JScrollPane jsp = new JScrollPane(tree,
                                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                        jsp.putClientProperty(SubstanceWidget.COMPONENT_PREVIEW_PAINTER,
                                new DefaultPreviewPainter());

                        disposableDialog.setLayout(new BorderLayout());
                        disposableDialog.add(jsp, BorderLayout.CENTER);

                        disposableDialog.setSize(200, 100);
                        disposableDialog.setLocationRelativeTo(null);
                        disposableDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                        disposableDialog.setVisible(true);
                    }
                });
            };
        });
        builder.append("Disposable dialog", openDisposable);

        JButton launchFrameDialogWithIcon = new JButton("Open");
        launchFrameDialogWithIcon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        SimpleDialog sd = new SimpleDialog();
                        if (UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel) {
                            sd.setIconImage(SubstanceLogo.getLogoImage(
                                    SubstanceCortex.ComponentScope.getCurrentSkin(sd.getRootPane())
                                            .getColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE,
                                                    ColorSchemeAssociationKind.FILL,
                                                    ComponentState.ENABLED)));
                        }
                        sd.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
                        sd.setModal(false);
                        sd.pack();
                        sd.setLocationRelativeTo(null);
                        sd.setVisible(true);
                        sd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    }
                });
            };
        });
        builder.append("Dialog with icon", launchFrameDialogWithIcon);

        JButton bd = new JButton("Open");
        bd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        SimpleDialog sd = new SimpleDialog();
                        sd.setModal(false);
                        sd.pack();
                        sd.setLocationRelativeTo(null);
                        sd.setVisible(true);
                        simpleDialog = sd;
                    }
                });
            };
        });
        builder.append("Open a dialog", bd);

        JButton bcd = new JButton("Close");
        bcd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (simpleDialog != null) {
                            simpleDialog.removeAll();
                            simpleDialog.dispose();
                            ReferenceQueue<JButton> weakQueue = new ReferenceQueue<JButton>();
                            WeakReference<JButton> weakRef = new WeakReference<JButton>(
                                    simpleDialog.b1, weakQueue);
                            weakRef.enqueue();
                            simpleDialog.b1 = null;
                            simpleDialog = null;
                            System.gc();
                            // Wait until the weak reference is on the queue and
                            // remove
                            // it
                            Check.out("Waiting to remove");
                            try {
                                Reference<?> ref = weakQueue.remove();
                                ref.clear();
                            } catch (InterruptedException ie) {
                                ie.printStackTrace();
                                return;
                            }
                            Check.out("Removed");
                        }
                    }
                });
            };
        });
        builder.append("Close the dialog", bcd);

        JButton buttonDialogCloseOnEsc = new JButton("Show");
        buttonDialogCloseOnEsc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        final JDialog dialog = new JDialog((Frame) null, "Click ESC to dispose");
                        dialog.setSize(200, 200);
                        dialog.setLayout(new BorderLayout());

                        JPanel myContentPane = new JPanel();
                        myContentPane.setLayout(new BorderLayout());
                        dialog.setContentPane(myContentPane);

                        JTabbedPane tabs = new JTabbedPane();
                        JPanel tab1 = new JPanel(new FlowLayout());
                        tab1.add(new JLabel("test"));
                        JTextField tab1TextField = new JTextField("some text");
                        tab1TextField.putClientProperty(SubstanceWidget.TEXT_FLIP_SELECT_ON_ESCAPE,
                                Boolean.TRUE);
                        tab1.add(tab1TextField);
                        tabs.addTab("Foo", tab1);
                        JPanel tab2 = new JPanel(new FlowLayout());
                        tab2.add(new JButton("Test"));
                        tabs.addTab("Bar", tab2);
                        dialog.add(tabs, BorderLayout.CENTER);

                        dialog.add(new JLabel("Press Esc to close dialog"), BorderLayout.NORTH);

                        // connect "Esc" key with disposing the dialog
                        String actionName = "VK_ESCAPE";
                        Action action = new AbstractAction(actionName) {
                            public void actionPerformed(ActionEvent e) {
                                dialog.dispose();
                            }
                        };
                        myContentPane.getActionMap().put(actionName, action);
                        myContentPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                                KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0),
                                actionName);

                        dialog.setLocationRelativeTo(null);
                        dialog.setVisible(true);
                    }
                });
            }
        });
        builder.append("Dialog with ESC close", buttonDialogCloseOnEsc);

        JButton buttonDialogUndecorated = new JButton("Show");
        buttonDialogUndecorated.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        final JDialog dialog = new JDialog((Frame) null, "");
                        dialog.setSize(200, 200);
                        dialog.setUndecorated(true);
                        dialog.setLayout(new BorderLayout());

                        JPanel myContentPane = new JPanel();
                        myContentPane.setLayout(new BorderLayout());
                        dialog.setContentPane(myContentPane);

                        dialog.add(new JLabel("Press Esc to close dialog"), BorderLayout.NORTH);

                        // connect "Esc" key with "System.exit(0)"
                        String actionName = "VK_ESCAPE";
                        Action action = new AbstractAction(actionName) {
                            public void actionPerformed(ActionEvent e) {
                                dialog.dispose();
                            }
                        };
                        myContentPane.getActionMap().put(actionName, action);
                        myContentPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                                KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0),
                                actionName);

                        dialog.setLocationRelativeTo(null);
                        dialog.setVisible(true);
                    }
                });
            }
        });
        builder.append("Undecorated dialog", buttonDialogUndecorated);

        builder.appendSeparator("Miscellaneous");

        JButton customSkinFrame = new JButton("Show");
        customSkinFrame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame testFrame = new SampleFrame();
                        testFrame.getRootPane().putClientProperty(
                                SubstanceLookAndFeel.SKIN_PROPERTY, new NebulaBrickWallSkin());
                        SwingUtilities.updateComponentTreeUI(testFrame.getRootPane());
                        testFrame.setSize(315, 245);
                        testFrame.setLocationRelativeTo(mainFrame);
                        testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        testFrame.setVisible(true);
                    }
                });
            }
        });
        builder.append("Nebula brick wall frame", customSkinFrame);

        JButton btf = new JButton("Show");
        btf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JFrame testFrame = new JFrame("test1");
                        testFrame.setSize(262, 100);
                        testFrame.setLocationRelativeTo(mainFrame);
                        testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        testFrame.setVisible(true);
                    }
                });
            };
        });
        builder.append("Regular frame", btf);

        JButton btfU = new JButton("Show");
        btfU.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JFrame.setDefaultLookAndFeelDecorated(false);
                        JDialog.setDefaultLookAndFeelDecorated(false);

                        JFrame testFrame = new JFrame("test undecorated");
                        // testFrame.setUndecorated(true);

                        testFrame.setSize(262, 100);
                        testFrame.setLocation(400, 400);
                        testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        testFrame.setVisible(true);

                        JFrame.setDefaultLookAndFeelDecorated(true);
                        JDialog.setDefaultLookAndFeelDecorated(true);
                    }
                });
            };
        });
        builder.append("Undecorated frame", btfU);

        JButton bcp = new JButton("Open");
        bcp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {

                        JFrame colorFrame = new JFrame();
                        final ColorPanel cp1 = new ColorPanel("default");
                        final ColorPanel cp2 = new ColorPanel("green");
                        cp2.setBackground(Color.green);
                        final ColorPanel cp3 = new ColorPanel("red");
                        cp3.setBackground(Color.red);
                        final ColorPanel cp4 = new ColorPanel("black");
                        cp4.setBackground(Color.black);
                        // cp2.setBackground(Color.GREEN);
                        colorFrame.setLayout(new LayoutManager() {
                            public void addLayoutComponent(String name, Component comp) {
                            }

                            public void layoutContainer(Container parent) {
                                int h = parent.getHeight() / 2;
                                int w = parent.getWidth() / 2;
                                cp1.setBounds(0, 0, w, h);
                                cp2.setBounds(0, h, w, parent.getHeight() - h);
                                cp3.setBounds(w, 0, w, h + 1);
                                cp4.setBounds(w, h + 1, w, parent.getHeight() - h);
                            }

                            public Dimension minimumLayoutSize(Container parent) {
                                return preferredLayoutSize(parent);
                            }

                            public Dimension preferredLayoutSize(Container parent) {
                                return new Dimension(100, 100);
                            }

                            public void removeLayoutComponent(Component comp) {
                            }

                        });
                        colorFrame.add(cp1);
                        colorFrame.add(cp2);
                        colorFrame.add(cp3);
                        colorFrame.add(cp4);

                        colorFrame.setSize(400, 399);
                        colorFrame.setLocation(300, 300);
                        colorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        colorFrame.setVisible(true);
                    }
                });
            };
        });
        builder.append("Color panels", bcp);

        JButton paneDialog = new JButton("Open");
        paneDialog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JDialog dialog = new JDialog(mainFrame, true);
                        dialog.setTitle("Test text pane in scroll pane");
                        JTextPane textPane = new JTextPane();
                        String contents = "";
                        for (int i = 0; i < 100; i++)
                            contents += "This is sample line " + i
                                    + " and a lot of other irrelevant text\n";
                        textPane.replaceSelection(contents);

                        JScrollPane scroll = new JScrollPane(textPane);
                        JPanel panel = new JPanel();
                        panel.setLayout(new BorderLayout());
                        panel.add(scroll, BorderLayout.CENTER);

                        dialog.setLayout(new BorderLayout());
                        dialog.add(panel, BorderLayout.CENTER);
                        dialog.setSize(400, 400);
                        dialog.setLocation(400, 200);
                        dialog.setVisible(true);
                    }
                });
            };
        });
        builder.append("Text pane dialog", paneDialog);

        return builder.getPanel();
    }
}
