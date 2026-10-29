package com.client.modules.world;

import com.client.core.*;

public class ScaffoldModule extends Module {
    private final ModeSetting raytrace = new ModeSetting("Raytrace", "Strict", "Strict", "Normal");
    private final BooleanSetting keepRotation = new BooleanSetting("Keep Rotation", true);
    private final NumberSetting expandRange = new NumberSetting("Expand Range", 0.0, 0.0, 5.0, 1.0);

    public ScaffoldModule() {
        super("Scaffold", "Places structural blocks beneath player vectors safely.", Category.WORLD_INVENTORY, 0);
        registerSetting(raytrace);
        registerSetting(keepRotation);
        registerSetting(expandRange);
    }
}
