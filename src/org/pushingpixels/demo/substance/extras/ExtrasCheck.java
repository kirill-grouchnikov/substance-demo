package org.pushingpixels.demo.substance.extras;

import org.pushingpixels.demo.substance.main.Check;
import org.pushingpixels.substance.api.SubstancePluginRepository;
import org.pushingpixels.substance.skinpack.SubstanceExtrasSkinPlugin;

public class ExtrasCheck {
	public static void main(String[] args) {
	    SubstancePluginRepository.getInstance().registerSkinPlugin(new SubstanceExtrasSkinPlugin());
		Check.main(args);
	}
}
