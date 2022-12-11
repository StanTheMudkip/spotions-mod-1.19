package com.stanthemudkip.spotions.item;

import com.stanthemudkip.spotions.SpotionsMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
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



    //MY Modded Items
    public static final RegistryObject<Item> BYRILL = ITEMS.register("byrill",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(64).tab(ModCreativeModeTab.SPOTIONS_TAB)));
    public static final RegistryObject<Item> BYRILL_DUST = ITEMS.register("byrill_dust",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(64).tab(ModCreativeModeTab.SPOTIONS_TAB)));
    public static final RegistryObject<Item> EMPTY_FLASK = ITEMS.register("empty_flask",
            () -> new Item(new Item.Properties().rarity(Rarity.COMMON).stacksTo(16).tab(ModCreativeModeTab.SPOTIONS_TAB)));
    public static final RegistryObject<Item> MORTAR_PESTLE = ITEMS.register("mortar_pestle",
            () -> new Item(new Item.Properties().rarity(Rarity.COMMON).stacksTo(16).tab(ModCreativeModeTab.SPOTIONS_TAB)));
    public static final RegistryObject<Item> BYRILL_MORTAR_PESTLE = ITEMS.register("byrill_mortar_pestle",
            () -> new Item(new Item.Properties().rarity(Rarity.COMMON).stacksTo(16).tab(ModCreativeModeTab.SPOTIONS_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
