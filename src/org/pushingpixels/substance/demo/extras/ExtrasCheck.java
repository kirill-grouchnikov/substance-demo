package org.pushingpixels.substance.demo.extras;

import org.pushingpixels.substance.api.SubstancePluginRepository;
import org.pushingpixels.substance.demo.main.Check;
import org.pushingpixels.substance.skinpack.SubstanceExtrasSkinPlugin;

public class ExtrasCheck {
	public static void main(String[] args) {
	    SubstancePluginRepository.getInstance().registerSkinPlugin(new SubstanceExtrasSkinPlugin());
		Check.main(args);
	}
}
