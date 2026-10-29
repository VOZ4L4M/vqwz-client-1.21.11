package com.client.modules.world;

import com.client.core.*;

public class ChestStealerModule extends Module {
    private final NumberSetting delay = new NumberSetting("Delay Per Slot MS", 80.0, 0.0, 500.0, 5.0);
    private final BooleanSetting closeWhenEmpty = new BooleanSetting("Close When Empty", true);

    public ChestStealerModule() {
        super("ChestStealer", "Rapidly loots inventory containers with humanized timing.", Category.WORLD_INVENTORY, 0);
        registerSetting(delay);
        registerSetting(closeWhenEmpty);
    }
}
