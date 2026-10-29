package com.client.modules.crystalanchor;

import com.client.core.*;

public class AutoTotemModule extends Module {
    private final NumberSetting healthThreshold = new NumberSetting("Health Threshold", 8.0, 1.0, 20.0, 0.5);
    private final NumberSetting swapDelay = new NumberSetting("Swap Delay MS", 50.0, 0.0, 500.0, 10.0);
    private final BooleanSetting overrideShield = new BooleanSetting("Override Shield", true);

    public AutoTotemModule() {
        super("AutoTotem", "Instantly restores Totem of Undying to offhand slot.", Category.CRYSTAL_ANCHOR, 0);
        registerSetting(healthThreshold);
        registerSetting(swapDelay);
        registerSetting(overrideShield);
    }
}
