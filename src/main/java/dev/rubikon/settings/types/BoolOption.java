package dev.rubikon.settings.types;

import dev.rubikon.settings.Option;
import net.minecraft.nbt.NbtCompound;

import java.util.function.Predicate;

public class BoolOption extends Option<Boolean> {
    private final Predicate<Boolean> validator;

    public BoolOption(String name, String description, Boolean defaultValue) {
        this(name, description, defaultValue, null);
    }

    public BoolOption(String name, String description, Boolean defaultValue, Predicate<Boolean> validator) {
        super(name, description, defaultValue);

        this.validator = validator;
    }

    @Override
    protected NbtCompound save(NbtCompound nbt) {
        nbt.putBoolean("value", get());

        return nbt;
    }

    @Override
    protected Boolean load(NbtCompound nbt) {
        if (nbt.contains("value"))
            set(nbt.getBoolean("value"));

        return get();
    }

    @Override
    public boolean isValid(Boolean value) {
        return validator == null || validator.test(value);
    }
}