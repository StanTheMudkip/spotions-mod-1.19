package com.stanthemudkip.spotions.event;

import com.stanthemudkip.spotions.SpotionsMod;
import com.stanthemudkip.spotions.networking.ModMessages;
import com.stanthemudkip.spotions.networking.packet.ExampleC2SPacket;
import com.stanthemudkip.spotions.util.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = SpotionsMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key input) {
            if(KeyBinding.WHY_NOT_KEY.consumeClick()) {
                //Do this if this button has been pressed.
                ModMessages.sendToServer(new ExampleC2SPacket());
            }
        }
    }


    @Mod.EventBusSubscriber(modid = SpotionsMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.WHY_NOT_KEY);
        }
    }
}
