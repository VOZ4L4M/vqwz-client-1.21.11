package com.client.ui;

import com.client.ClientInitializer;
import com.client.core.Category;
import com.client.core.Module;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class ClickGuiScreen extends Screen {
    public ClickGuiScreen() {
        super(Text.literal("Client ClickGUI"));
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        
        // Simple background rendering for UI panels
        int startX = 50;
        int startY = 50;
        
        for (Category category : Category.values()) {
            context.fill(startX, startY, startX + 120, startY + 20, 0xFF202020);
            context.drawText(this.textRenderer, category.name(), startX + 5, startY + 6, 0xFFFFFFFF, true);
            
            int moduleY = startY + 22;
            for (Module module : ClientInitializer.MODULE_MANAGER.getModules()) {
                if (module.getCategory() == category) {
                    int color = module.isEnabled() ? 0xFF00FF00 : 0xFF808080;
                    context.fill(startX, moduleY, startX + 120, moduleY + 18, 0xFF303030);
                    context.drawText(this.textRenderer, module.getName(), startX + 5, moduleY + 5, color, true);
                    moduleY += 20;
                }
            }
            startX += 130;
        }
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
