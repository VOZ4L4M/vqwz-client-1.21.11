package com.client;

import com.client.core.ModuleManager;
import com.client.modules.combat.*;
import com.client.modules.movement.*;
import com.client.modules.mace.*;
import com.client.modules.crystalanchor.*;
import com.client.modules.world.*;
import com.client.modules.system.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import java.util.Arrays;

public class ClientInitializer implements ClientModInitializer {
    public static final ModuleManager MODULE_MANAGER = new ModuleManager();

    @Override
    public void onInitializeClient() {
        // Register all client modules across all categories
        MODULE_MANAGER.registerModules(Arrays.asList(
            new AimAssistModule(),
            new TriggerbotModule(),
            new VelocityModule(),
            new SafeWalkNoSlowModule(),
            new AutoMaceModule(),
            new AutoPearlCatchModule(),
            new AutoTotemModule(),
            new AutoCrystalAnchorModule(),
            new ScaffoldModule(),
            new ChestStealerModule(),
            new AntiBotModule(),
            new SelfDestructModule()
        ));

        // Hook the module update loop into every client game tick
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            MODULE_MANAGER.onUpdate();
        });
    }
}
