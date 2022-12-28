package com.stanthemudkip.spotions.networking;

import com.stanthemudkip.spotions.SpotionsMod;
import com.stanthemudkip.spotions.networking.packet.M_P_Byrill_DustC2SPacket;
import com.stanthemudkip.spotions.networking.packet.ExampleC2SPacket;
import com.stanthemudkip.spotions.networking.packet.M_P_Nightshade_PasteC2SPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;

public class ModMessages {
    public static SimpleChannel INSTANCE;

    public static int packetId = 0;
    public static int id() {
        return packetId++;
    }

    public static void register() {
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(SpotionsMod.MOD_ID, "messages"))
                .networkProtocolVersion(() ->"1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();

        //Set this as the current instance
        INSTANCE = net;

        net.messageBuilder(ExampleC2SPacket.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(ExampleC2SPacket::new)
                .encoder(ExampleC2SPacket::toBytes)
                .consumerMainThread(ExampleC2SPacket::handler)
                .add();

        net.messageBuilder(M_P_Byrill_DustC2SPacket.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(M_P_Byrill_DustC2SPacket::new)
                .encoder(M_P_Byrill_DustC2SPacket::toBytes)
                .consumerMainThread(M_P_Byrill_DustC2SPacket::handler)
                .add();

        net.messageBuilder(M_P_Nightshade_PasteC2SPacket.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(M_P_Nightshade_PasteC2SPacket::new)
                .encoder(M_P_Nightshade_PasteC2SPacket::toBytes)
                .consumerMainThread(M_P_Nightshade_PasteC2SPacket::handler)
                .add();
    }

    public static <MSG> void sendMessage(MSG message) {
        //Send the passed message to the server (<MSG> object is a generic type)
        INSTANCE.sendToServer(message);
    }

    public static <MSG> void sendToServer(MSG message) {
        INSTANCE.sendToServer(message);
    }

    public static <MSG> void sendToPlayer(MSG message, ServerPlayer player) {
        //Grab the channel instance and use the package distributor to package the message and send it.
        INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), message);
    }
}
