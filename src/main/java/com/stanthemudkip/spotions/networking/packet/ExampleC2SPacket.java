package com.stanthemudkip.spotions.networking.packet;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class ExampleC2SPacket {

    //Packet constructor
    public ExampleC2SPacket() {

    }


    public ExampleC2SPacket(FriendlyByteBuf buf) {

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

            //Spawn some LLama spit on the player :)
            EntityType.LLAMA_SPIT.spawn(level, null, null, player.blockPosition(),
                    MobSpawnType.COMMAND, true, false);

        });

        return true;
    }
}
