package com.client.core;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    private final List<Module> modules = new ArrayList<>();

    public void registerModules(List<Module> mods) {
        modules.addAll(mods);
    }

    public void onUpdate() {
        modules.stream().filter(Module::isEnabled).forEach(Module::onUpdate);
    }

    public void onRender() {
        modules.stream().filter(Module::isEnabled).forEach(Module::onRender);
    }

    public List<Module> getModules() { return modules; }
}
