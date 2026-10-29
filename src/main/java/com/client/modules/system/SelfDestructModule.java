package com.client.modules.system;

import com.client.core.*;

public class SelfDestructModule extends Module {
    public SelfDestructModule() {
        super("SelfDestruct", "Emergency client wiper and memory cleaner.", Category.EXPLOIT_SYSTEM, 0);
    }

    @Override
    public void onEnable() {
        System.gc();
    }
}
