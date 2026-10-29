package com.client.modules.crystalanchor;

import com.client.core.*;

public class AutoCrystalAnchorModule extends Module {
    private final NumberSetting placeSpeed = new NumberSetting("Place Speed", 1.0, 1.0, 20.0, 1.0);
    private final NumberSetting breakSpeed = new NumberSetting("Break Speed", 1.0, 1.0, 20.0, 1.0);
    private final NumberSetting maxSelfDamage = new NumberSetting("Max Self Damage", 10.0, 1.0, 20.0, 0.5);

    public AutoCrystalAnchorModule() {
        super("AutoCrystalAnchor", "Automated Crystal and Respawn Anchor burst damage loops.", Category.CRYSTAL_ANCHOR, 0);
        registerSetting(placeSpeed);
        registerSetting(breakSpeed);
        registerSetting(maxSelfDamage);
    }
}
