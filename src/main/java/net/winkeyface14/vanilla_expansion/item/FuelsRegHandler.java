package net.winkeyface14.vanilla_expansion.item;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.component.CookingFuel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.providers.number.floats.ContextFloatProviders;
import net.minecraft.world.level.storage.loot.providers.number.floats.ResolvableFloat;
import net.minecraft.world.level.storage.loot.providers.number.ints.ResolvableInt;
import net.winkeyface14.vanilla_expansion.block.BlockRegHandler;
// plus imports for CookingFuel, ResolvableInt, ResolvableFloat, ContextFloatProviders (let the IDE resolve these)

public class FuelsRegHandler {
    public static void registerFuels() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(BlockRegHandler.CHARCOAL_BLOCK.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(16000)));
            context.modify(BlockRegHandler.BUNDLED_STICKS_BLOCK.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(9000)));

            context.modify(BlockRegHandler.OAK_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.OAK_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.OAK_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_OAK_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_OAK_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.STRIPPED_OAK_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));

            context.modify(BlockRegHandler.SPRUCE_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.SPRUCE_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.SPRUCE_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_SPRUCE_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_SPRUCE_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.STRIPPED_SPRUCE_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));

            context.modify(BlockRegHandler.BIRCH_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.BIRCH_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.BIRCH_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_BIRCH_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_BIRCH_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.STRIPPED_BIRCH_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));

            context.modify(BlockRegHandler.JUNGLE_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.JUNGLE_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.JUNGLE_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_JUNGLE_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_JUNGLE_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.STRIPPED_JUNGLE_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));

            context.modify(BlockRegHandler.ACACIA_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.ACACIA_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.ACACIA_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_ACACIA_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_ACACIA_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.STRIPPED_ACACIA_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));

            context.modify(BlockRegHandler.DARK_OAK_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.DARK_OAK_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.DARK_OAK_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_DARK_OAK_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_DARK_OAK_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.STRIPPED_DARK_OAK_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));

            context.modify(BlockRegHandler.MANGROVE_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.MANGROVE_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.MANGROVE_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_MANGROVE_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_MANGROVE_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.STRIPPED_MANGROVE_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));

            context.modify(BlockRegHandler.CHERRY_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.CHERRY_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.CHERRY_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_CHERRY_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_CHERRY_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.STRIPPED_CHERRY_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));

            context.modify(BlockRegHandler.PALE_OAK_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.PALE_OAK_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.PALE_OAK_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_PALE_OAK_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_PALE_OAK_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.STRIPPED_PALE_OAK_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));

            context.modify(BlockRegHandler.POPLAR_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.POPLAR_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.POPLAR_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_POPLAR_WOOD_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_POPLAR_WOOD_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.STRIPPED_POPLAR_WOOD_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));

            context.modify(BlockRegHandler.CRIMSON_HYPHAE_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.CRIMSON_HYPHAE_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.CRIMSON_HYPHAE_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_CRIMSON_HYPHAE_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_CRIMSON_HYPHAE_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.STRIPPED_CRIMSON_HYPHAE_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));

            context.modify(BlockRegHandler.WARPED_HYPHAE_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.WARPED_HYPHAE_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.WARPED_HYPHAE_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_WARPED_HYPHAE_STAIRS.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));
            context.modify(BlockRegHandler.STRIPPED_WARPED_HYPHAE_SLAB.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(150)));
            context.modify(BlockRegHandler.STRIPPED_WARPED_HYPHAE_FENCE.asItem(), builder
                    -> builder.set(DataComponents.COOKING_FUEL, fuel(300)));

            //Wool Block Sets
            for (DyeColor color : DyeColor.values()) {
                Block baseBlock = BuiltInRegistries.BLOCK.getValue(
                        Identifier.fromNamespaceAndPath("minecraft", color.getName() + "_wool")
                );

                Block wall = BlockRegHandler.DYED_WOOL_WALL.get(color);

                if (wall != null) {
                    context.modify(wall.asItem(), builder
                            -> builder.set(DataComponents.COOKING_FUEL, fuel(100)));
                }
            }
        });
    }

    private static CookingFuel fuel(int burnTicks) {
        return new CookingFuel(
                new ResolvableInt.Constant(burnTicks),
                ResolvableFloat.fromKey(ContextFloatProviders.COOKING_NORMAL_SPEED_MULTIPLIER));
    }
}