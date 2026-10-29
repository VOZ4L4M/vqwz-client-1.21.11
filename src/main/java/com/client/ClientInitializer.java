package com.client;

import com.client.core.ModuleManager;
import com.client.modules.combat.AimAssistModule;
import com.client.modules.combat.TriggerbotModule;
import com.client.modules.movement.VelocityModule;
import com.client.modules.movement.SafeWalkNoSlowModule;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import java.util.Arrays;

public class ClientInitializer implements ClientModInitializer {
    public static final ModuleManager MODULE_MANAGER = new ModuleManager();

    @Override
    public void onInitializeClient() {
        // Register all your client modules
        MODULE_MANAGER.registerModules(Arrays.asList(
            new AimAssistModule(),
            new TriggerbotModule(),
            new VelocityModule(),
            new SafeWalkNoSlowModule()
        ));

        // Hook the module update loop into every client game tick
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            MODULE_MANAGER.onUpdate();
        });
    }
}
