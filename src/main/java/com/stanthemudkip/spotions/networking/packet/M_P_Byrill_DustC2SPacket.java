package com.stanthemudkip.spotions.networking.packet;
import com.stanthemudkip.spotions.item.ModItems;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class M_P_Byrill_DustC2SPacket {

    //Packet constructor
    public M_P_Byrill_DustC2SPacket() {

    }


    public M_P_Byrill_DustC2SPacket(FriendlyByteBuf buf) {

    }

    public void toBytes(FriendlyByteBuf buf) {

    }

    public boolean handler(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            //**This is executed on the server**
            ServerPlayer player = context.getSender();
            assert(player != null);
            ServerLevel level = player.getLevel();

            //This will contain the item  (set to BYRILL_DUST but default)
            ItemStack itemStack1 = new ItemStack(ModItems.BYRILL_DUST.get().getDefaultInstance().getItem(), 1);

            //Play the sounds
            level.playSound(null, player.getOnPos(), SoundEvents.LARGE_AMETHYST_BUD_BREAK , SoundSource.PLAYERS,
                    0.5f,level.random.nextFloat() * 0.1f + 0.9f);

            //Spawn the item on the player
            ItemEntity itemEntity = new ItemEntity(level, player.getX(), player.getY(), player.getZ(), itemStack1);
            itemEntity.setPickUpDelay(0);
            level.addFreshEntity(itemEntity);
        });

        return true;
    }
}
