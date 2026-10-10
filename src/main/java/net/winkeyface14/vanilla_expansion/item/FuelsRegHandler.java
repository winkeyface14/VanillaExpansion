package net.winkeyface14.vanilla_expansion.item;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.component.CookingFuel;
import net.minecraft.world.level.storage.loot.providers.number.floats.ContextFloatProviders;
import net.minecraft.world.level.storage.loot.providers.number.floats.ResolvableFloat;
import net.minecraft.world.level.storage.loot.providers.number.ints.ResolvableInt;
import net.winkeyface14.vanilla_expansion.block.BlockRegHandler;
// plus imports for CookingFuel, ResolvableInt, ResolvableFloat, ContextFloatProviders (let the IDE resolve these)

public class FuelsRegHandler {
    public static void registerFuels() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(BlockRegHandler.CHARCOAL_BLOCK.asItem(), builder ->
                    builder.set(DataComponents.COOKING_FUEL, fuel(14400)));
            context.modify(BlockRegHandler.BUNDLED_STICKS_BLOCK.asItem(), builder ->
                    builder.set(DataComponents.COOKING_FUEL, fuel(9000)));
        });
    }

    private static CookingFuel fuel(int burnTicks) {
        return new CookingFuel(
                new ResolvableInt.Constant(burnTicks),
                ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER));
    }
}