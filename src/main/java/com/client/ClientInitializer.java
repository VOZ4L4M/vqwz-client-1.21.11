package com.client;

import com.client.core.ModuleManager;
import com.client.modules.combat.*;
import com.client.modules.movement.*;
import com.client.modules.mace.*;
import com.client.modules.crystalanchor.*;
import com.client.modules.world.*;
import com.client.modules.system.*;
import com.client.ui.ClickGuiScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import java.util.Arrays;

public class ClientInitializer implements ClientModInitializer {
    public static final ModuleManager MODULE_MANAGER = new ModuleManager();
    private static KeyBinding guiKeyBinding;

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

        // Register Right Shift key to open the ClickGUI
        guiKeyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.client.clickgui",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_RIGHT_SHIFT,
            "category.client.main"
        ));

        // Hook game ticks to update modules and listen for GUI keypress
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            MODULE_MANAGER.onUpdate();
            
            while (guiKeyBinding.wasPressed()) {
                client.setScreen(new ClickGuiScreen());
            }
        });
    }
}
