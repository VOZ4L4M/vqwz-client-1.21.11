package com.client.modules.combat;

import com.client.core.*;

public class AimAssistModule extends Module {
    private final ModeSetting targetType = new ModeSetting("Target", "Players", "Players", "Mobs", "All");
    private final ModeSetting priority = new ModeSetting("Priority", "Distance", "Distance", "Health", "Angle");
    private final NumberSetting fov = new NumberSetting("FOV", 90.0, 1.0, 360.0, 1.0);
    private final NumberSetting smoothness = new NumberSetting("Smoothness", 15.0, 1.0, 100.0, 1.0);
    private final BooleanSetting gaussianNoise = new BooleanSetting("Gaussian Noise", true);

    public AimAssistModule() {
        super("AimAssist", "Smooth target tracking with humanized constraints.", Category.COMBAT, 0);
        registerSetting(targetType);
        registerSetting(priority);
        registerSetting(fov);
        registerSetting(smoothness);
        registerSetting(gaussianNoise);
    }
}
