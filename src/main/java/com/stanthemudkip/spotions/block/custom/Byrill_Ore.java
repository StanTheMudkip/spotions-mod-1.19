package com.stanthemudkip.spotions.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class Byrill_Ore extends Block {
    //Custom Property of the block
    public static final BooleanProperty LIT = BooleanProperty.create("lit");


    //Constructor
    public Byrill_Ore(Properties properties) {
        super(properties);
    }

    //Builder
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        //Add the property to the block state.
        builder.add(LIT);

        //WE DON'T ACTUALLY USE LIT BUT WE SET THE GLOW STATE HERE ANYWAY

    }
}
