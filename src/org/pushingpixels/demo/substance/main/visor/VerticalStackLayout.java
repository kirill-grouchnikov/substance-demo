package org.pushingpixels.demo.substance.main.visor;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;
import java.util.ArrayList;
import java.util.List;

public class VerticalStackLayout implements LayoutManager2 {
    private List<Component> components = new ArrayList<>();

    @Override
    public void addLayoutComponent(Component comp, Object constraints) {
        components.add(comp);
    }

    @Override
    public void addLayoutComponent(String name, Component comp) {
        components.add(comp);
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        components.remove(comp);
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        int prefWidth = 0;
        int prefHeight = 0;
        for (Component comp : components) {
            Dimension compPref = comp.getPreferredSize();
            prefWidth = Math.max(prefWidth, compPref.width);
            prefHeight += compPref.height;
        }
        Insets insets = parent.getInsets();
        return new Dimension(prefWidth + insets.left + insets.right,
                prefHeight + insets.top + insets.bottom);
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        int minWidth = 0;
        int minHeight = 0;
        for (Component comp : components) {
            Dimension compPref = comp.getMinimumSize();
            minWidth = Math.max(minWidth, compPref.width);
            minHeight += compPref.height;
        }
        Insets insets = parent.getInsets();
        return new Dimension(minWidth + insets.left + insets.right,
                minHeight + insets.top + insets.bottom);
    }

    @Override
    public Dimension maximumLayoutSize(Container parent) {
        int maxWidth = 0;
        int maxHeight = 0;
        for (Component comp : components) {
            Dimension compPref = comp.getMaximumSize();
            maxWidth = Math.max(maxWidth, compPref.width);
            maxHeight += compPref.height;
        }
        Insets insets = parent.getInsets();
        return new Dimension(maxWidth + insets.left + insets.right,
                maxHeight + insets.top + insets.bottom);
    }

    @Override
    public float getLayoutAlignmentX(Container target) {
        return 0;
    }

    @Override
    public float getLayoutAlignmentY(Container target) {
        return 0;
    }

    @Override
    public void invalidateLayout(Container target) {
    }

    @Override
    public void layoutContainer(Container parent) {
        Insets insets = parent.getInsets();
        int y = insets.top;
        int width = parent.getWidth() - insets.left - insets.right;
        int height = parent.getHeight() - insets.top - insets.bottom;
        for (Component comp : components) {
            Dimension compPref = comp.getPreferredSize();
            int heightLeft = height - y;
            int compHeight = Math.min(heightLeft, compPref.height);
            comp.setBounds(insets.left, y, width, compHeight);
            y += compPref.height;
        }
    }
}
