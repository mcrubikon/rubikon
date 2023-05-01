package dev.rubikon.features;

import dev.rubikon.api.feature.Feature;
import dev.rubikon.events.TickEvent;
import io.github.nevalackin.radbus.Listen;
import org.lwjgl.glfw.GLFW;

public class Sprint extends Feature {
    public Sprint() {
        super("Sprint","Lets you sprint without holding any key", GLFW.GLFW_KEY_F);
    }

    @Override
    public void onEnable() {
    }

    @Listen
    public void onTick(TickEvent event) {

        mc.options.sprintKey.setPressed(true);
    }

    @Override
    public void onDisable() {

    }
}
