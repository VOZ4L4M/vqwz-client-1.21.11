package com.client.modules.movement;

import com.client.core.*;

public class SafeWalkNoSlowModule extends Module {
    private final BooleanSetting safeWalk = new BooleanSetting("SafeWalk Enabled", true);
    private final BooleanSetting itemSlowdown = new BooleanSetting("Item Slowdown Bypass", true);
    private final BooleanSetting cobwebBypass = new BooleanSetting("Cobweb Bypass", true);

    public SafeWalkNoSlowModule() {
        super("SafeWalk & NoSlow", "Prevents edge falls and suppresses movement speed penalties.", Category.MOVEMENT, 0);
        registerSetting(safeWalk);
        registerSetting(itemSlowdown);
        registerSetting(cobwebBypass);
    }
}
