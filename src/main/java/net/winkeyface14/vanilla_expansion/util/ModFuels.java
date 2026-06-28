package net.winkeyface14.vanilla_expansion.util;

import net.fabricmc.fabric.api.registry.FuelValueEvents;

public class ModFuels {
    public static void registerFuels(){
        FuelValueEvents.BUILD.register((builder, context) -> {
            builder.add(ItemRegHandler.COAL_CHUNK, 200);
            builder.add(ItemRegHandler.CHARCOAL_CHUNK, 200);
            builder.add(BlockRegHandler.CHARCOAL_BLOCK, 14400);
            builder.add(ItemRegHandler.BUNDLED_STICKS, 900);
            builder.add(BlockRegHandler.BUNDLED_STICKS_BLOCK, 9000);
        });

    }
}
