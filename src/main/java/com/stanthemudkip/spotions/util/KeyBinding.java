package com.stanthemudkip.spotions.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static String KEY_CATEGORY_SPOTIONS = "key.category.spotions.spotions";
    public static String KEY_WHY_NOT = "key.spotions.why_not";

    public static final KeyMapping WHY_NOT_KEY = new KeyMapping(KEY_WHY_NOT, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_O, KEY_CATEGORY_SPOTIONS);

}
