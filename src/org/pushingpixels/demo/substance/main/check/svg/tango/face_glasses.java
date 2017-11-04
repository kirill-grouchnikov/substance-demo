package org.pushingpixels.demo.substance.main.check.svg.tango;

import java.awt.*;
import java.awt.geom.*;

import org.pushingpixels.substance.api.hidpi.HiDpiAwareIcon;
import org.pushingpixels.substance.api.iconpack.SubstanceIcon;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/flamingo">Flamingo SVG transcoder</a>.
 */
public class face_glasses implements SubstanceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.875f, -0.625f));
// _0_0_2_0
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.375, 19.1875);
((GeneralPath)shape).curveTo(38.375, 19.49816, 37.311676, 19.75, 36.0, 19.75);
((GeneralPath)shape).curveTo(34.688324, 19.75, 33.625, 19.49816, 33.625, 19.1875);
((GeneralPath)shape).curveTo(33.625, 18.87684, 34.688324, 18.625, 36.0, 18.625);
((GeneralPath)shape).curveTo(37.311676, 18.625, 38.375, 18.87684, 38.375, 19.1875);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -20.25f, -0.625f));
// _0_0_2_1
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.375, 19.1875);
((GeneralPath)shape).curveTo(38.375, 19.49816, 37.311676, 19.75, 36.0, 19.75);
((GeneralPath)shape).curveTo(34.688324, 19.75, 33.625, 19.49816, 33.625, 19.1875);
((GeneralPath)shape).curveTo(33.625, 18.87684, 34.688324, 18.625, 36.0, 18.625);
((GeneralPath)shape).curveTo(37.311676, 18.625, 38.375, 18.87684, 38.375, 19.1875);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_1);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.6772152f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.979781985282898f, 0.0f, 0.0f, 1.979781985282898f, -37.33127975463867f, -14.527460098266602f));
// _0_0_3
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
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 0.36f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.657427, 26.772383);
((GeneralPath)shape).curveTo(29.168451, 29.351362, 27.42745, 31.210005, 24.328217, 31.210005);
((GeneralPath)shape).curveTo(21.317154, 31.210005, 19.112904, 29.067863, 17.737226, 26.685122);
((GeneralPath)shape).curveTo(18.995657, 28.193571, 20.83858, 29.926355, 24.197327, 29.926355);
((GeneralPath)shape).curveTo(28.210522, 29.926355, 28.912231, 28.491488, 30.657427, 26.772383);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
paint = new RadialGradientPaint(new Point2D.Double(25.05270004272461, 39.59280014038086), 15.7572f, new Point2D.Double(25.05270004272461, 39.59280014038086), new float[] {0.0f,1.0f}, new Color[] {new Color(119, 119, 119, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.61701899766922f, 0.0f, 0.0f, 0.61701899766922f, 9.05479621887207f, 7.969542980194092f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.657427, 26.423346);
((GeneralPath)shape).curveTo(29.168451, 29.002323, 27.42745, 30.860968, 24.328217, 30.860968);
((GeneralPath)shape).curveTo(21.317154, 30.860968, 19.112904, 28.718826, 17.737226, 26.336084);
((GeneralPath)shape).curveTo(18.995657, 27.844534, 20.83858, 29.577318, 24.197327, 29.577318);
((GeneralPath)shape).curveTo(28.210522, 29.577318, 28.912231, 28.14245, 30.657427, 26.423346);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.375f, 2.75f));
// _0_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6_0
paint = new Color(65, 65, 65, 255);
stroke = new BasicStroke(0.99999946f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(21.036428, 12.467883);
((GeneralPath)shape).curveTo(21.036428, 17.739962, 16.762564, 22.013824, 11.490486, 22.013824);
((GeneralPath)shape).curveTo(6.2184076, 22.013824, 1.9445438, 17.739962, 1.9445438, 12.467883);
((GeneralPath)shape).curveTo(1.9445438, 7.1958046, 6.2184076, 2.9219408, 11.490486, 2.9219408);
((GeneralPath)shape).curveTo(16.762564, 2.9219408, 21.036428, 7.1958046, 21.036428, 12.467883);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_6_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 24.57196044921875f, 0.0f));
// _0_0_6_1
paint = new Color(65, 65, 65, 255);
stroke = new BasicStroke(0.99999946f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(21.036428, 12.467883);
((GeneralPath)shape).curveTo(21.036428, 17.739962, 16.762564, 22.013824, 11.490486, 22.013824);
((GeneralPath)shape).curveTo(6.2184076, 22.013824, 1.9445438, 17.739962, 1.9445438, 12.467883);
((GeneralPath)shape).curveTo(1.9445438, 7.1958046, 6.2184076, 2.9219408, 11.490486, 2.9219408);
((GeneralPath)shape).curveTo(16.762564, 2.9219408, 21.036428, 7.1958046, 21.036428, 12.467883);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_6_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6_2 = g.getTransform();
g.transform(new AffineTransform(-0.40174999833106995f, -0.47953200340270996f, 0.47953200340270996f, -0.40174999833106995f, 22.405210494995117f, 22.900449752807617f));
// _0_0_6_2
paint = new Color(65, 65, 65, 255);
stroke = new BasicStroke(1.5985087f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(21.036428, 12.467883);
((GeneralPath)shape).curveTo(21.036428, 17.074842, 17.746138, 21.024513, 13.214976, 21.856768);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_6_2);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0321580171585083f, 0.0f, 0.0f, 1.0321580171585083f, 18.261070251464844f, -3.8645999431610107f));
// _0_0_7
paint = new RadialGradientPaint(new Point2D.Double(18.240928649902344, 21.8179874420166), 8.308505f, new Point2D.Double(18.240928649902344, 21.8179874420166), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 159, 207, 53),new Color(114, 159, 207, 172)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.897785, 18.478292);
((GeneralPath)shape).curveTo(25.89879, 21.447306, 24.315418, 24.191217, 21.744347, 25.676014);
((GeneralPath)shape).curveTo(19.173273, 27.160812, 16.00529, 27.160812, 13.434216, 25.676014);
((GeneralPath)shape).curveTo(10.863142, 24.191217, 9.27977, 21.447306, 9.280776, 18.478292);
((GeneralPath)shape).curveTo(9.27977, 15.509279, 10.863142, 12.7653675, 13.434216, 11.28057);
((GeneralPath)shape).curveTo(16.00529, 9.7957735, 19.173273, 9.7957735, 21.744347, 11.28057);
((GeneralPath)shape).curveTo(24.315418, 12.7653675, 25.89879, 15.509279, 25.897785, 18.478292);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(48, 99, 163, 255);
stroke = new BasicStroke(0.968844f,1,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.897785, 18.478292);
((GeneralPath)shape).curveTo(25.89879, 21.447306, 24.315418, 24.191217, 21.744347, 25.676014);
((GeneralPath)shape).curveTo(19.173273, 27.160812, 16.00529, 27.160812, 13.434216, 25.676014);
((GeneralPath)shape).curveTo(10.863142, 24.191217, 9.27977, 21.447306, 9.280776, 18.478292);
((GeneralPath)shape).curveTo(9.27977, 15.509279, 10.863142, 12.7653675, 13.434216, 11.28057);
((GeneralPath)shape).curveTo(16.00529, 9.7957735, 19.173273, 9.7957735, 21.744347, 11.28057);
((GeneralPath)shape).curveTo(24.315418, 12.7653675, 25.89879, 15.509279, 25.897785, 18.478292);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 0.8342246f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new RadialGradientPaint(new Point2D.Double(15.4143705368042, 13.078408241271973), 6.65625f, new Point2D.Double(15.4143705368042, 13.078408241271973), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 63)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9135719537734985f, -5.717108088534165E-24f, -4.217182951704133E-24f, 1.6620229482650757f, 4.360787868499756f, -11.718279838562012f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.254112, 7.7185783);
((GeneralPath)shape).curveTo(32.41098, 7.7185783, 29.298923, 10.830635, 29.298923, 14.673768);
((GeneralPath)shape).curveTo(29.298923, 15.783682, 29.609104, 16.804907, 30.07172, 17.736341);
((GeneralPath)shape).curveTo(30.99596, 18.077005, 31.97776, 18.308784, 33.019806, 18.308784);
((GeneralPath)shape).curveTo(37.573887, 18.308784, 41.21093, 14.720961, 41.49197, 10.237329);
((GeneralPath)shape).curveTo(40.214542, 8.727756, 38.385017, 7.7185783, 36.254112, 7.7185783);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(1.0321580171585083f, 0.0f, 0.0f, 1.0321580171585083f, -6.26925802230835f, -3.8645999431610107f));
// _0_0_9
paint = new RadialGradientPaint(new Point2D.Double(18.240928649902344, 21.8179874420166), 8.308505f, new Point2D.Double(18.240928649902344, 21.8179874420166), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 159, 207, 53),new Color(114, 159, 207, 172)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.897785, 18.478292);
((GeneralPath)shape).curveTo(25.89879, 21.447306, 24.315418, 24.191217, 21.744347, 25.676014);
((GeneralPath)shape).curveTo(19.173273, 27.160812, 16.00529, 27.160812, 13.434216, 25.676014);
((GeneralPath)shape).curveTo(10.863142, 24.191217, 9.27977, 21.447306, 9.280776, 18.478292);
((GeneralPath)shape).curveTo(9.27977, 15.509279, 10.863142, 12.7653675, 13.434216, 11.28057);
((GeneralPath)shape).curveTo(16.00529, 9.7957735, 19.173273, 9.7957735, 21.744347, 11.28057);
((GeneralPath)shape).curveTo(24.315418, 12.7653675, 25.89879, 15.509279, 25.897785, 18.478292);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(48, 99, 163, 255);
stroke = new BasicStroke(0.968844f,1,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.897785, 18.478292);
((GeneralPath)shape).curveTo(25.89879, 21.447306, 24.315418, 24.191217, 21.744347, 25.676014);
((GeneralPath)shape).curveTo(19.173273, 27.160812, 16.00529, 27.160812, 13.434216, 25.676014);
((GeneralPath)shape).curveTo(10.863142, 24.191217, 9.27977, 21.447306, 9.280776, 18.478292);
((GeneralPath)shape).curveTo(9.27977, 15.509279, 10.863142, 12.7653675, 13.434216, 11.28057);
((GeneralPath)shape).curveTo(16.00529, 9.7957735, 19.173273, 9.7957735, 21.744347, 11.28057);
((GeneralPath)shape).curveTo(24.315418, 12.7653675, 25.89879, 15.509279, 25.897785, 18.478292);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 0.8342246f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
paint = new RadialGradientPaint(new Point2D.Double(15.4143705368042, 13.078408241271973), 6.65625f, new Point2D.Double(15.4143705368042, 13.078408241271973), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 63)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9135719537734985f, -5.717108088534165E-24f, -4.217182951704133E-24f, 1.6620229482650757f, -20.1695499420166f, -11.718279838562012f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.723783, 7.7185783);
((GeneralPath)shape).curveTo(7.8806505, 7.7185783, 4.7685933, 10.830635, 4.7685933, 14.673768);
((GeneralPath)shape).curveTo(4.7685933, 15.783682, 5.078774, 16.804907, 5.5413914, 17.736341);
((GeneralPath)shape).curveTo(6.46563, 18.077005, 7.447431, 18.308784, 8.489476, 18.308784);
((GeneralPath)shape).curveTo(13.04356, 18.308784, 16.6806, 14.720961, 16.961643, 10.237329);
((GeneralPath)shape).curveTo(15.684215, 8.727756, 13.85469, 7.7185783, 11.723783, 7.7185783);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10);
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
        return 1.8195440769195557;
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
		return 44.66384506225586;
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
	public face_glasses() {
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
	   face_glasses base = new face_glasses();
	   base.width = width;
	   base.height = height;
	   return new HiDpiAwareIcon(base);
	}
}

