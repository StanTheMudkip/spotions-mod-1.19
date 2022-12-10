package com.stanthemudkip.spotions.item;

import com.stanthemudkip.spotions.SpotionsMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.units.qual.C;

import javax.swing.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpotionsMod.MOD_ID);

    public static final RegistryObject<Item> BYRILL = ITEMS.register("byrill",
            () -> new Item(new Item.Properties().rarity(Rarity.COMMON).stacksTo(16).tab(ModCreativeModeTab.SPOTIONS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
