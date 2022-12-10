package com.stanthemudkip.spotions.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab SPOTIONS_TAB = new CreativeModeTab("spotionstab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.BYRILL.get());
        }
    };
}
