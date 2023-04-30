package dev.rubikon.api.feature;

import dev.rubikon.api.commons.Toggleable;

/**
 * a object that can be toggled on/ off
 */
public class AstractFeature implements Toggleable {
    private boolean toggled = false;

    @Override
    public void toggle() {
    toggled = !toggled;
        if (toggled) {
            onEnable();
        } else {
            onDisable();
        }
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    public boolean isToggled() {
        return toggled;
    }

    public void setToggled(boolean toggled) {
        this.toggled = toggled;
    }
}