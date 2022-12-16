package com.stanthemudkip.spotions.item.custom;

import com.stanthemudkip.spotions.item.ModItems;
import com.stanthemudkip.spotions.networking.ModMessages;
import com.stanthemudkip.spotions.networking.packet.Mortar_Pestle_ItemC2SPacket;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class Mortar_Pestle_Crystal extends Item {
    //Default Constructor
    public Mortar_Pestle_Crystal(Properties properties) {
        super(properties);
    }

    public void appendHoverText(ItemStack stack, Level level, List<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown()) {
            //If the user presses shift while hovering over the item it will display what we want.
            components.add(Component.literal("Hold right click to grind the Item!").withStyle(ChatFormatting.GRAY));
        } else {
            //If the user isn't pressing shift over the item we can display what we want.
            components.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.DARK_PURPLE));
        }

        super.appendHoverText(stack, level, components, flag);
    }

    @Override
    public SoundEvent getEatingSound() {return SoundEvents.AMETHYST_CLUSTER_HIT;}

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        ItemStack itemStack1 = new ItemStack(ModItems.MORTAR_PESTLE.get().getDefaultInstance().getItem(), 1);
        //Grab the player instance
        Player player = Minecraft.getInstance().player;
        //Check if the player exists and run the code from the server
        if( player != null && !level.isClientSide()) {
            //**(TO DO)** Will want to check if the player's inventory is full, then spawn the item entity on the player coordinates.
            //Add the byrill dust to their inventory
            ModMessages.sendToServer(new Mortar_Pestle_ItemC2SPacket());

        }

        return super.finishUsingItem(itemStack1, level, entity);
    }

}
