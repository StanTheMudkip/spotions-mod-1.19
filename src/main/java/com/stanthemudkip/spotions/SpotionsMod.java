package com.stanthemudkip.spotions;

import com.mojang.logging.LogUtils;
import com.stanthemudkip.spotions.block.ModBlocks;
import com.stanthemudkip.spotions.effect.ModEffects;
import com.stanthemudkip.spotions.item.ModItems;
import com.stanthemudkip.spotions.networking.ModMessages;
import com.stanthemudkip.spotions.potion.ModPotions;
import com.stanthemudkip.spotions.util.ModBrewingRecipe;
import com.stanthemudkip.spotions.world.feature.ModConfiguredFeatures;
import com.stanthemudkip.spotions.world.feature.ModPlacedFeatures;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SpotionsMod.MOD_ID)
public class SpotionsMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "spotions";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public SpotionsMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //Register our mod Items here
        ModItems.register(modEventBus);
        //Register our mod Blocks here
        ModBlocks.register(modEventBus);
        //Register feature configs here
        ModConfiguredFeatures.register(modEventBus);
        //Register placed features here
        ModPlacedFeatures.register(modEventBus);
        //Register Mod Effects here
        ModEffects.register(modEventBus);

        //Register Mod Potions here
        ModPotions.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));

        event.enqueueWork(() -> {
            //Register the Mod Messages (Should be the first thing here
            ModMessages.register();

            //Potion Recipes
            BrewingRecipeRegistry.addRecipe(new ModBrewingRecipe(Potions.AWKWARD,
                    Items.ROTTEN_FLESH, ModPotions.HUNGER_POTION.get()));
        });

    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            //ItemBlockRenderTypes.setRenderLayer(ModBlocks.NIGHTSHADE_CROP.get(), RenderType.cutout()); //DEPRECATED
        }
    }
}
