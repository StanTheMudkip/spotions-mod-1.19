package com.stanthemudkip.spotions.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.List;
import com.stanthemudkip.spotions.SpotionsMod;
import com.stanthemudkip.spotions.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, SpotionsMod.MOD_ID);

    //List of our ores and where (Deepslate, stone, nether, endstone, etc) they should spawn
    public static final Supplier<java.util.List<OreConfiguration.TargetBlockState>> OVERWORLD_ZIRCON_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BYRILL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BYRILL_ORE.get().defaultBlockState())));


    //Registry objects for the lists
    public static final RegistryObject<ConfiguredFeature<?, ?>> BYRILL_ORE = CONFIGURED_FEATURES.register("byrill_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ZIRCON_ORES.get(),3))); //Changes how many blocks per vein


    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
