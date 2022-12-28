package com.stanthemudkip.spotions.item;

import com.stanthemudkip.spotions.SpotionsMod;
import com.stanthemudkip.spotions.block.ModBlocks;
import com.stanthemudkip.spotions.item.custom.Crystal_Ball_Item;
import com.stanthemudkip.spotions.item.custom.Byrill_Mortar_Pestle;
import com.stanthemudkip.spotions.item.custom.Nightshade_Mortar_Pestle;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
    public static final RegistryObject<Item> LEVITATION_FLASK = ITEMS.register("levitation_flask",
            () -> new Item(new Item.Properties().rarity(Rarity.COMMON).stacksTo(16).tab(ModCreativeModeTab.SPOTIONS_TAB)));

    public static final RegistryObject<Item> MORTAR_PESTLE = ITEMS.register("mortar_pestle",
            () -> new Item(new Item.Properties().rarity(Rarity.COMMON).stacksTo(16).tab(ModCreativeModeTab.SPOTIONS_TAB)));
    public static final RegistryObject<Item> NIGHTSHADE_SEEDS = ITEMS.register("nightshade_seeds",
            () -> new ItemNameBlockItem(ModBlocks.NIGHTSHADE_CROP.get(), new Item.Properties().rarity(Rarity.COMMON).stacksTo(64).tab(ModCreativeModeTab.SPOTIONS_TAB)));
    public static final RegistryObject<Item> NIGHTSHADE_BERRY = ITEMS.register("nightshade_berry",
            () -> new Item(new Item.Properties().rarity(Rarity.COMMON).stacksTo(64).tab(ModCreativeModeTab.SPOTIONS_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).effect(
                    () -> new MobEffectInstance(MobEffects.POISON, 140, 0), 0.95f).build() )));
    public static final RegistryObject<Item> NIGHTSHADE_PASTE = ITEMS.register("nightshade_paste",
            () -> new Item(new Item.Properties().rarity(Rarity.COMMON).stacksTo(64).tab(ModCreativeModeTab.SPOTIONS_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).effect(
                    () -> new MobEffectInstance(MobEffects.POISON, 280, 0), 0.95f).build() )));


    //Tools
    public static final RegistryObject<Item> BYRILL_ENFORCED_PICKAXE = ITEMS.register("byrill_enforced_pickaxe",
            () -> new PickaxeItem(ModTiers.BYRILL_ENFORCED, 1, -2.6f, new Item.Properties().rarity(Rarity.COMMON).stacksTo(16).tab(ModCreativeModeTab.SPOTIONS_TAB)));
    public static final RegistryObject<Item> BYRILL_ENFORCED_AXE = ITEMS.register("byrill_enforced_axe",
            () -> new AxeItem(ModTiers.BYRILL_ENFORCED, 5, -3f, new Item.Properties().rarity(Rarity.COMMON).stacksTo(16).tab(ModCreativeModeTab.SPOTIONS_TAB)));
    public static final RegistryObject<Item> BYRILL_ENFORCED_SHOVEL = ITEMS.register("byrill_enforced_shovel",
            () -> new ShovelItem(ModTiers.BYRILL_ENFORCED, 1, -2.8f, new Item.Properties().rarity(Rarity.COMMON).stacksTo(16).tab(ModCreativeModeTab.SPOTIONS_TAB)));
    public static final RegistryObject<Item> BYRILL_ENFORCED_HOE = ITEMS.register("byrill_enforced_hoe",
            () -> new HoeItem(ModTiers.BYRILL_ENFORCED, 1, 0f, new Item.Properties().rarity(Rarity.COMMON).stacksTo(16).tab(ModCreativeModeTab.SPOTIONS_TAB)));
    public static final RegistryObject<Item> BYRILL_ENFORCED_SWORD = ITEMS.register("byrill_enforced_sword",
            () -> new SwordItem(ModTiers.BYRILL_ENFORCED, 3, -2.3f, new Item.Properties().rarity(Rarity.COMMON).stacksTo(16).tab(ModCreativeModeTab.SPOTIONS_TAB)));

    //Custom Items
    public static final RegistryObject<Item> CRYSTAL_BALL = ITEMS.register("crystal_ball",
            () -> new Crystal_Ball_Item(new Item.Properties().rarity(Rarity.COMMON).stacksTo(1).tab(ModCreativeModeTab.SPOTIONS_TAB)));

    //Mortar_Pestle Items
    public static final RegistryObject<Item> BYRILL_MORTAR_PESTLE = ITEMS.register("byrill_mortar_pestle",
            () -> new Byrill_Mortar_Pestle(new Item.Properties().rarity(Rarity.COMMON).stacksTo(1).tab(ModCreativeModeTab.SPOTIONS_TAB).craftRemainder(ModItems.MORTAR_PESTLE.get().getDefaultInstance().getItem()).food(new FoodProperties.Builder().nutrition(0).saturationMod(0).alwaysEat().build())));
    public static final RegistryObject<Item> NIGHTSHADE_MORTAR_PESTLE = ITEMS.register("nightshade_mortar_pestle",
            () -> new Nightshade_Mortar_Pestle(new Item.Properties().rarity(Rarity.COMMON).stacksTo(1).tab(ModCreativeModeTab.SPOTIONS_TAB).craftRemainder(ModItems.MORTAR_PESTLE.get().getDefaultInstance().getItem()).food(new FoodProperties.Builder().nutrition(0).saturationMod(0).alwaysEat().build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }








}
