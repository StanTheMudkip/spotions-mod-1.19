package com.stanthemudkip.spotions.potion;

import com.stanthemudkip.spotions.SpotionsMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {

    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, SpotionsMod.MOD_ID);

    public static final RegistryObject<Potion> LEVITATION_POTION = POTIONS.register("levitation_potion",
            () -> new Potion( new MobEffectInstance(MobEffects.LEVITATION, 200, 0 )));

    public static final RegistryObject<Potion> LONG_LEVITATION_POTION = POTIONS.register("long_levitation_potion",
            () -> new Potion( new MobEffectInstance(MobEffects.LEVITATION, 300, 0 )));

    public static final RegistryObject<Potion> HUNGER_POTION = POTIONS.register("hunger_potion",
            () -> new Potion( new MobEffectInstance(MobEffects.HUNGER, 400, 0 )));

    public static final RegistryObject<Potion> LONG_HUNGER_POTION = POTIONS.register("long_hunger_potion",
            () -> new Potion( new MobEffectInstance(MobEffects.HUNGER, 600, 0 )));


    public static void register(IEventBus event) {
        POTIONS.register(event);
    }
}
