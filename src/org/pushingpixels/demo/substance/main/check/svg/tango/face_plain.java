package org.pushingpixels.demo.substance.main.check.svg.tango;

import java.awt.*;
import java.awt.geom.*;

import org.pushingpixels.substance.api.hidpi.HiDpiAwareIcon;
import org.pushingpixels.substance.api.iconpack.SubstanceIcon;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/flamingo">Flamingo SVG transcoder</a>.
 */
public class face_plain implements SubstanceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.5316456f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(24.714284896850586, 38.57143020629883), 19.714285f, new Point2D.Double(24.714284896850586, 38.57143020629883), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.33333298563957214f, 0.0f, 25.714290618896484f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.42857, 38.57143);
((GeneralPath)shape).curveTo(44.42857, 42.20073, 35.602184, 45.14286, 24.714285, 45.14286);
((GeneralPath)shape).curveTo(13.826386, 45.14286, 5.0, 42.20073, 5.0, 38.57143);
((GeneralPath)shape).curveTo(5.0, 34.94213, 13.826386, 32.0, 24.714285, 32.0);
((GeneralPath)shape).curveTo(35.602184, 32.0, 44.42857, 34.94213, 44.42857, 38.57143);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(2.083142042160034f, 0.0f, 0.0f, 2.083142042160034f, -40.547149658203125f, -16.49224090576172f));
// _0_0_1
paint = new RadialGradientPaint(new Point2D.Double(29.288070678710938, 15.72098445892334), 8.90208f, new Point2D.Double(29.158466339111328, 15.755711555480957), new float[] {0.0f,0.6448598f,1.0f}, new Color[] {new Color(255, 252, 222, 255),new Color(246, 231, 106, 255),new Color(255, 183, 56, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.774754, 19.008621);
((GeneralPath)shape).curveTo(39.776207, 22.104244, 38.125546, 24.96534, 35.4449, 26.51357);
((GeneralPath)shape).curveTo(32.76425, 28.061802, 29.461142, 28.061802, 26.780495, 26.51357);
((GeneralPath)shape).curveTo(24.099848, 24.96534, 22.449186, 22.104244, 22.45064, 19.008621);
((GeneralPath)shape).curveTo(22.449186, 15.912998, 24.099848, 13.051903, 26.780495, 11.503672);
((GeneralPath)shape).curveTo(29.461142, 9.9554405, 32.76425, 9.9554405, 35.4449, 11.503672);
((GeneralPath)shape).curveTo(38.125546, 13.051903, 39.776207, 15.912998, 39.774754, 19.008621);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(156, 140, 10, 255);
stroke = new BasicStroke(0.48004404f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.774754, 19.008621);
((GeneralPath)shape).curveTo(39.776207, 22.104244, 38.125546, 24.96534, 35.4449, 26.51357);
((GeneralPath)shape).curveTo(32.76425, 28.061802, 29.461142, 28.061802, 26.780495, 26.51357);
((GeneralPath)shape).curveTo(24.099848, 24.96534, 22.449186, 22.104244, 22.45064, 19.008621);
((GeneralPath)shape).curveTo(22.449186, 15.912998, 24.099848, 13.051903, 26.780495, 11.503672);
((GeneralPath)shape).curveTo(29.461142, 9.9554405, 32.76425, 9.9554405, 35.4449, 11.503672);
((GeneralPath)shape).curveTo(38.125546, 13.051903, 39.776207, 15.912998, 39.774754, 19.008621);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.6772152f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.979781985282898f, 0.0f, 0.0f, 1.979781985282898f, -37.33127975463867f, -14.527460098266602f));
// _0_0_2
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.5051063f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.774754, 19.008621);
((GeneralPath)shape).curveTo(39.776207, 22.104244, 38.125546, 24.96534, 35.4449, 26.51357);
((GeneralPath)shape).curveTo(32.76425, 28.061802, 29.461142, 28.061802, 26.780495, 26.51357);
((GeneralPath)shape).curveTo(24.099848, 24.96534, 22.449186, 22.104244, 22.45064, 19.008621);
((GeneralPath)shape).curveTo(22.449186, 15.912998, 24.099848, 13.051903, 26.780495, 11.503672);
((GeneralPath)shape).curveTo(29.461142, 9.9554405, 32.76425, 9.9554405, 35.4449, 11.503672);
((GeneralPath)shape).curveTo(38.125546, 13.051903, 39.776207, 15.912998, 39.774754, 19.008621);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 0.7495200037956238f, 0.35355299711227417f, 7.357569217681885f));
// _0_0_3
g.setComposite(AlphaComposite.getInstance(3, 0.36f * origAlpha));
AffineTransform defaultTransform__0_0_3_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_0
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(21.398157, 15.321428);
((GeneralPath)shape).curveTo(21.398157, 17.821428, 20.273157, 19.821428, 18.898157, 19.821428);
((GeneralPath)shape).curveTo(17.523157, 19.821428, 16.273157, 17.821428, 16.273157, 15.321428);
((GeneralPath)shape).curveTo(16.273157, 12.821428, 17.398157, 10.821428, 18.773157, 10.821428);
((GeneralPath)shape).curveTo(20.148157, 10.821428, 21.273157, 12.821428, 21.273157, 15.321428);
((GeneralPath)shape).lineTo(21.398157, 15.321428);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_0);
g.setComposite(AlphaComposite.getInstance(3, 0.36f * origAlpha));
AffineTransform defaultTransform__0_0_3_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_1
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.688513, 15.321428);
((GeneralPath)shape).curveTo(30.688513, 17.821428, 29.563513, 19.821428, 28.188513, 19.821428);
((GeneralPath)shape).curveTo(26.813513, 19.821428, 25.688513, 17.821428, 25.688513, 15.321428);
((GeneralPath)shape).curveTo(25.688513, 12.821428, 26.813513, 10.821428, 28.188513, 10.821428);
((GeneralPath)shape).curveTo(29.563513, 10.821428, 30.688513, 12.821428, 30.688513, 15.321428);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_2
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(21.398157, 14.696428);
((GeneralPath)shape).curveTo(21.398157, 17.196428, 20.273157, 19.196428, 18.898157, 19.196428);
((GeneralPath)shape).curveTo(17.523157, 19.196428, 16.398157, 17.196428, 16.398157, 14.696428);
((GeneralPath)shape).curveTo(16.398157, 12.196428, 17.523157, 10.196428, 18.898157, 10.196428);
((GeneralPath)shape).curveTo(20.273157, 10.196428, 21.398157, 12.196428, 21.398157, 14.696428);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_3
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.688513, 14.696428);
((GeneralPath)shape).curveTo(30.688513, 17.196428, 29.563513, 19.196428, 28.188513, 19.196428);
((GeneralPath)shape).curveTo(26.813513, 19.196428, 25.688513, 17.196428, 25.688513, 14.696428);
((GeneralPath)shape).curveTo(25.688513, 12.196428, 26.813513, 10.196428, 28.188513, 10.196428);
((GeneralPath)shape).curveTo(29.563513, 10.196428, 30.688513, 12.196428, 30.688513, 14.696428);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_3);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new RadialGradientPaint(new Point2D.Double(-23.45212173461914, 38.60285186767578), 15.7572f, new Point2D.Double(-23.45212173461914, 38.60285186767578), new float[] {0.0f,1.0f}, new Color[] {new Color(119, 119, 119, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.3578989505767822f, 0.0f, 0.0f, 0.41666701436042786f, 55.845611572265625f, 15.20930004119873f));
shape = new RoundRectangle2D.Double(14.0, 29.0, 20.0, 1.0, 1.0, 1.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.36f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
paint = new Color(255, 255, 255, 255);
shape = new RoundRectangle2D.Double(14.0, 30.0, 20.0, 1.0, 1.0, 1.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_5);
g.setTransform(defaultTransform__0_0);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 5.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 3.7242751121520996;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 39.42856979370117;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 41.41858673095703;
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
	public face_plain() {
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
	
	public static HiDpiAwareIcon of(int width, int height) {
	   face_plain base = new face_plain();
	   base.width = width;
	   base.height = height;
	   return new HiDpiAwareIcon(base);
	}
}

