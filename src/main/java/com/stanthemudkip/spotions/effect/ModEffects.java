package com.stanthemudkip.spotions.effect;

import com.stanthemudkip.spotions.SpotionsMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SpotionsMod.MOD_ID);




    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
