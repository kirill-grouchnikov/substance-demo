package org.pushingpixels.demo.substance.extras;

import org.pushingpixels.demo.substance.main.Check;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.extras.api.SubstanceExtrasSkinPlugin;

public class ExtrasCheck {
	public static void main(String[] args) {
	    SubstanceCortex.GlobalScope.registerSkinPlugin(new SubstanceExtrasSkinPlugin());
		Check.main(args);
	}
}
