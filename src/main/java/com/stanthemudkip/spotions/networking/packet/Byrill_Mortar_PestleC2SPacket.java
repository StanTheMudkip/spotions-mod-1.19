package com.stanthemudkip.spotions.networking.packet;

import com.stanthemudkip.spotions.item.ModItems;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class Byrill_Mortar_PestleC2SPacket {

    //Packet constructor
    public Byrill_Mortar_PestleC2SPacket() {

    }


    public Byrill_Mortar_PestleC2SPacket(FriendlyByteBuf buf) {

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

            //Spawn some Byrill_Dust on the player :)
            ItemStack itemStack1 = new ItemStack(ModItems.BYRILL_DUST.get().getDefaultInstance().getItem(), 1);
            player.drop(itemStack1, true);
            level.playSound(null, player.getOnPos(), SoundEvents.LARGE_AMETHYST_BUD_BREAK , SoundSource.PLAYERS,
                    0.5f,level.random.nextFloat() * 0.1f + 0.9f);
        });

        return true;
    }
}
