package org.pushingpixels.demo.substance.main.check.svg;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.Icon;
import javax.swing.plaf.UIResource;

import org.pushingpixels.lafwidget.icon.IsHiDpiAware;
import org.pushingpixels.lafwidget.icon.IsResizable;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/flamingo">Flamingo SVG transcoder</a>.
 */
public class ic_help_black_24px implements Icon, UIResource, IsResizable, IsHiDpiAware {
	/**
	 * Paints the transcoded SVG image on the specified graphics context. You
	 * can install a custom transformation on the graphics context to scale the
	 * image.
	 * 
	 * @param g
	 *            Graphics context.
	 */
    @SuppressWarnings("unused")
	public static void paint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = ((Graphics2D)g).getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.0, 2.0);
((GeneralPath)shape).curveTo(6.48, 2.0, 2.0, 6.48, 2.0, 12.0);
((GeneralPath)shape).curveTo(2.0, 17.52, 6.48, 22.0, 12.0, 22.0);
((GeneralPath)shape).curveTo(17.52, 22.0, 22.0, 17.52, 22.0, 12.0);
((GeneralPath)shape).curveTo(22.0, 6.4799995, 17.52, 2.0, 12.0, 2.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(13.0, 19.0);
((GeneralPath)shape).lineTo(11.0, 19.0);
((GeneralPath)shape).lineTo(11.0, 17.0);
((GeneralPath)shape).lineTo(13.0, 17.0);
((GeneralPath)shape).lineTo(13.0, 19.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(15.07, 11.25);
((GeneralPath)shape).lineTo(14.17, 12.17);
((GeneralPath)shape).curveTo(13.45, 12.9, 13.0, 13.5, 13.0, 15.0);
((GeneralPath)shape).lineTo(11.0, 15.0);
((GeneralPath)shape).lineTo(11.0, 14.5);
((GeneralPath)shape).curveTo(11.0, 13.4, 11.45, 12.4, 12.17, 11.67);
((GeneralPath)shape).lineTo(13.41, 10.41);
((GeneralPath)shape).curveTo(13.78, 10.05, 14.0, 9.55, 14.0, 9.0);
((GeneralPath)shape).curveTo(14.0, 7.9, 13.1, 7.0, 12.0, 7.0);
((GeneralPath)shape).curveTo(10.9, 7.0, 10.0, 7.9, 10.0, 9.0);
((GeneralPath)shape).lineTo(8.0, 9.0);
((GeneralPath)shape).curveTo(8.0, 6.79, 9.79, 5.0, 12.0, 5.0);
((GeneralPath)shape).curveTo(14.21, 5.0, 16.0, 6.79, 16.0, 9.0);
((GeneralPath)shape).curveTo(16.0, 9.88, 15.64, 10.68, 15.07, 11.25);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 2.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 2.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 20.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 20.0;
	}

	/**
	 * The current width of this resizable icon.
	 */
	private int width;

	/**
	 * The current height of this resizable icon.
	 */
	private int height;

	/**
	 * Creates a new transcoded SVG image.
	 */
	public ic_help_black_24px() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconHeight()
	 */
    @Override
	public int getIconHeight() {
		return height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconWidth()
	 */
    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
    public void setDimension(Dimension newDimension) {
        this.width = newDimension.width;
        this.height = newDimension.height;
    }
    
    @Override
    public boolean isHiDpiAware() {
        return true;
    }

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics,
	 * int, int)
	 */
    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.translate(x, y);

		double coef1 = (double) this.width / (double) getOrigWidth();
		double coef2 = (double) this.height / (double) getOrigHeight();
		double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
		g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
		paint(g2d);
		g2d.dispose();
	}
	
	public static ic_help_black_24px of(int width, int height) {
	   ic_help_black_24px result = new ic_help_black_24px();
	   result.width = width;
	   result.height = height;
	   return result;
	}
}

