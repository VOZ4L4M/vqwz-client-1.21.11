package com.client.modules.combat;

import com.client.core.*;

public class TriggerbotModule extends Module {
    private final NumberSetting minCps = new NumberSetting("Min CPS", 8.0, 1.0, 20.0, 1.0);
    private final NumberSetting maxCps = new NumberSetting("Max CPS", 12.0, 1.0, 20.0, 1.0);
    private final BooleanSetting cooldownSync = new BooleanSetting("Cooldown Sync", true);

    public TriggerbotModule() {
        super("Triggerbot", "Clicks when crosshairs align with targets using Gaussian rhythm.", Category.COMBAT, 0);
        registerSetting(minCps);
        registerSetting(maxCps);
        registerSetting(cooldownSync);
    }
}
