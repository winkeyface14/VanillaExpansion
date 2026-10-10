package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

// Static import lets us drop the "BlockRegHandler." prefix everywhere
import static net.winkeyface14.vanilla_expansion.block.BlockRegHandler.*;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {

    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        // Miscellaneous & Barrels
        dropSelves(
                CHARCOAL_BLOCK,
                EMPOWERED_NETHERITE_BLOCK,
                BUNDLED_STICKS_BLOCK,
                BARREL_OF_APPLES_BLOCK,
                BARREL_OF_POTATOES_BLOCK,
                BARREL_OF_CARROTS_BLOCK,
                BARREL_OF_BEETROOTS_BLOCK,
                BARREL_OF_SWEETBERRIES_BLOCK,
                BARREL_OF_CHORUS_BLOCK
        );

        // Fired Bricks
        dropSelves(
                FIRED_BRICKS,
                FIRED_BRICK_STAIRS,
                FIRED_BRICK_SLAB,
                FIRED_BRICK_WALL
        );

        // Stone & Sandstone Variants
        dropSelves(
                SMOOTH_STONE_STAIRS,
                SMOOTH_STONE_WALL,
                SMOOTH_SANDSTONE_WALL,
                CUT_SANDSTONE_STAIRS,
                CUT_SANDSTONE_WALL,
                SMOOTH_RED_SANDSTONE_WALL,
                CUT_RED_SANDSTONE_STAIRS,
                CUT_RED_SANDSTONE_WALL
        );

        // Quartz Variants
        dropSelves(
                QUARTZ_WALL,
                SMOOTH_QUARTZ_WALL,
                QUARTZ_BRICK_STAIRS,
                QUARTZ_BRICK_SLAB,
                QUARTZ_BRICK_WALL
        );

        // Smoked Quartz
        dropSelves(
                SMOKED_QUARTZ_BLOCK,
                SMOOTH_SMOKED_QUARTZ,
                CHISELED_SMOKED_QUARTZ_BLOCK,
                SMOKED_QUARTZ_BRICKS,
                SMOKED_QUARTZ_PILLAR,
                SMOKED_QUARTZ_STAIRS,
                SMOOTH_SMOKED_QUARTZ_STAIRS,
                SMOKED_QUARTZ_BRICK_STAIRS,
                SMOKED_QUARTZ_SLAB,
                SMOOTH_SMOKED_QUARTZ_SLAB,
                SMOKED_QUARTZ_BRICK_SLAB,
                SMOKED_QUARTZ_WALL,
                SMOKED_QUARTZ_BRICK_WALL,
                SMOOTH_SMOKED_QUARTZ_WALL
        );

        // Burnt Quartz
        dropSelves(
                BURNT_QUARTZ_BLOCK,
                SMOOTH_BURNT_QUARTZ,
                CHISELED_BURNT_QUARTZ_BLOCK,
                BURNT_QUARTZ_BRICKS,
                BURNT_QUARTZ_PILLAR,
                BURNT_QUARTZ_STAIRS,
                SMOOTH_BURNT_QUARTZ_STAIRS,
                BURNT_QUARTZ_BRICK_STAIRS,
                BURNT_QUARTZ_SLAB,
                SMOOTH_BURNT_QUARTZ_SLAB,
                BURNT_QUARTZ_BRICK_SLAB,
                BURNT_QUARTZ_WALL,
                BURNT_QUARTZ_BRICK_WALL,
                SMOOTH_BURNT_QUARTZ_WALL
        );

        // Base Terracotta
        dropSelves(
                TERRACOTTA_STAIRS,
                TERRACOTTA_SLAB,
                TERRACOTTA_WALL);

        // Dyed Block Collections
        dropCollections(
                DYED_TERRACOTTA_STAIRS.values(),
                DYED_TERRACOTTA_SLAB.values(),
                DYED_TERRACOTTA_WALL.values(),
                DYED_WOOL_WALL.values(),
                DYED_CONCRETE_WALL.values()
        );

        //Wood
        dropSelves(
                OAK_WOOD_FENCE,
                OAK_WOOD_SLAB,
                OAK_WOOD_STAIRS,

                BIRCH_WOOD_FENCE,
                BIRCH_WOOD_SLAB,
                BIRCH_WOOD_STAIRS,

                SPRUCE_WOOD_FENCE,
                SPRUCE_WOOD_SLAB,
                SPRUCE_WOOD_STAIRS,

                JUNGLE_WOOD_FENCE,
                JUNGLE_WOOD_SLAB,
                JUNGLE_WOOD_STAIRS,

                ACACIA_WOOD_FENCE,
                ACACIA_WOOD_SLAB,
                ACACIA_WOOD_STAIRS,

                DARK_OAK_WOOD_FENCE,
                DARK_OAK_WOOD_SLAB,
                DARK_OAK_WOOD_STAIRS,

                MANGROVE_WOOD_FENCE,
                MANGROVE_WOOD_SLAB,
                MANGROVE_WOOD_STAIRS,

                CHERRY_WOOD_FENCE,
                CHERRY_WOOD_SLAB,
                CHERRY_WOOD_STAIRS,

                PALE_OAK_WOOD_FENCE,
                PALE_OAK_WOOD_SLAB,
                PALE_OAK_WOOD_STAIRS,

                POPLAR_WOOD_FENCE,
                POPLAR_WOOD_SLAB,
                POPLAR_WOOD_STAIRS,

                CRIMSON_HYPHAE_STAIRS,
                CRIMSON_HYPHAE_SLAB,
                CRIMSON_HYPHAE_FENCE,

                WARPED_HYPHAE_STAIRS,
                WARPED_HYPHAE_SLAB,
                WARPED_HYPHAE_FENCE
        );

        //Stripped Wood
        dropSelves(
                STRIPPED_OAK_WOOD_FENCE,
                STRIPPED_OAK_WOOD_SLAB,
                STRIPPED_OAK_WOOD_STAIRS,

                STRIPPED_BIRCH_WOOD_FENCE,
                STRIPPED_BIRCH_WOOD_SLAB,
                STRIPPED_BIRCH_WOOD_STAIRS,

                STRIPPED_SPRUCE_WOOD_FENCE,
                STRIPPED_SPRUCE_WOOD_SLAB,
                STRIPPED_SPRUCE_WOOD_STAIRS,

                STRIPPED_JUNGLE_WOOD_FENCE,
                STRIPPED_JUNGLE_WOOD_SLAB,
                STRIPPED_JUNGLE_WOOD_STAIRS,

                STRIPPED_ACACIA_WOOD_FENCE,
                STRIPPED_ACACIA_WOOD_SLAB,
                STRIPPED_ACACIA_WOOD_STAIRS,

                STRIPPED_DARK_OAK_WOOD_FENCE,
                STRIPPED_DARK_OAK_WOOD_SLAB,
                STRIPPED_DARK_OAK_WOOD_STAIRS,

                STRIPPED_MANGROVE_WOOD_FENCE,
                STRIPPED_MANGROVE_WOOD_SLAB,
                STRIPPED_MANGROVE_WOOD_STAIRS,

                STRIPPED_CHERRY_WOOD_FENCE,
                STRIPPED_CHERRY_WOOD_SLAB,
                STRIPPED_CHERRY_WOOD_STAIRS,

                STRIPPED_PALE_OAK_WOOD_FENCE,
                STRIPPED_PALE_OAK_WOOD_SLAB,
                STRIPPED_PALE_OAK_WOOD_STAIRS,

                STRIPPED_POPLAR_WOOD_FENCE,
                STRIPPED_POPLAR_WOOD_SLAB,
                STRIPPED_POPLAR_WOOD_STAIRS,

                STRIPPED_CRIMSON_HYPHAE_STAIRS,
                STRIPPED_CRIMSON_HYPHAE_SLAB,
                STRIPPED_CRIMSON_HYPHAE_FENCE,

                STRIPPED_WARPED_HYPHAE_STAIRS,
                STRIPPED_WARPED_HYPHAE_SLAB,
                STRIPPED_WARPED_HYPHAE_FENCE
        );
    }

    private void dropSelves(Block... blocks) {
        for (Block block : blocks) {
            dropSelf(block);
        }
    }

    @SafeVarargs
    private void dropCollections(Iterable<Block>... blockCollections) {
        for (Iterable<Block> collection : blockCollections) {
            collection.forEach(this::dropSelf);
        }
    }
}