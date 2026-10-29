package com.client.modules.movement;

import com.client.core.*;

public class VelocityModule extends Module {
    private final NumberSetting horizontal = new NumberSetting("Horizontal %", 0.0, 0.0, 100.0, 1.0);
    private final NumberSetting vertical = new NumberSetting("Vertical %", 0.0, 0.0, 100.0, 1.0);

    public VelocityModule() {
        super("Velocity", "Mitigates incoming knockback vectors.", Category.MOVEMENT, 0);
        registerSetting(horizontal);
        registerSetting(vertical);
    }
}
