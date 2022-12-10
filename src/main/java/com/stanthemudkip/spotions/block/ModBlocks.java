package com.stanthemudkip.spotions.block;

import com.stanthemudkip.spotions.SpotionsMod;
import com.stanthemudkip.spotions.item.ModCreativeModeTab;
import com.stanthemudkip.spotions.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SpotionsMod.MOD_ID);

    //Our Blocks
    public static final RegistryObject<Block> BYRILL_ORE = registerBlock("byrill_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(5, 9)), ModCreativeModeTab.SPOTIONS_TAB);

    public static final RegistryObject<Block> DEEPSLATE_BYRILL_ORE = registerBlock("deepslate_byrill_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(5, 9)), ModCreativeModeTab.SPOTIONS_TAB);




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
