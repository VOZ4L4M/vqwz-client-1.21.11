package com.client.modules.mace;

import com.client.core.*;

public class AutoPearlCatchModule extends Module {
    private final NumberSetting smoothing = new NumberSetting("Tracking Smoothing", 50.0, 1.0, 100.0, 1.0);

    public AutoPearlCatchModule() {
        super("AutoPearlCatch", "Predicts and intercepts incoming Ender Pearl trajectories.", Category.MACE_PVP, 0);
        registerSetting(smoothing);
    }
}
