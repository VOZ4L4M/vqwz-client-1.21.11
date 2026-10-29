package com.client.modules.mace;

import com.client.core.*;

public class AutoMaceModule extends Module {
    private final ModeSetting mode = new ModeSetting("Mode", "On Hit", "On Hit", "Silent");
    private final NumberSetting heightThreshold = new NumberSetting("Height Threshold", 3.0, 1.0, 10.0, 0.5);
    private final BooleanSetting cancelElytra = new BooleanSetting("Cancel Elytra", true);

    public AutoMaceModule() {
        super("AutoMace", "Calculates maximum smash-attack vectors for Mace damage amplification.", Category.MACE_PVP, 0);
        registerSetting(mode);
        registerSetting(heightThreshold);
        registerSetting(cancelElytra);
    }
}
