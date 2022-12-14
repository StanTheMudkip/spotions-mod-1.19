package com.stanthemudkip.spotions.item.custom;

import com.stanthemudkip.spotions.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Byrill_Mortar_Pestle extends Item {
    //Default Constructor
    public Byrill_Mortar_Pestle(Properties properties) {
        super(properties);
    }

    /*
    @Override
    public UseAnim getUseAnimation(ItemStack itemStack) {
        return UseAnim.BOW;
    }
    */

    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.AMETHYST_CLUSTER_HIT;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        ItemStack itemStack1 = new ItemStack(ModItems.MORTAR_PESTLE.get().getDefaultInstance().getItem(), 1);
        ItemStack itemStack2 = new ItemStack(ModItems.BYRILL_DUST.get().getDefaultInstance().getItem(), 1);
        //Grab the player instance
        Player player = Minecraft.getInstance().player;
        //Check if the player exists and run the code from the server
        if( player != null && !level.isClientSide()) {
            //**(TO DO)** Will want to check if the player's inventory is full, then spawn the item entity on the player coordinates.
            //Add the byrill dust to their inventory
            player.getInventory().add(itemStack2);
        }

        return super.finishUsingItem(itemStack1, level, entity);
    }

}
