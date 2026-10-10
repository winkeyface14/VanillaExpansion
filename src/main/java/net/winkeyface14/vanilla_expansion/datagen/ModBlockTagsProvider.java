package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.winkeyface14.vanilla_expansion.tags.TagRegHandler;
import net.winkeyface14.vanilla_expansion.block.BlockRegHandler;
import org.jspecify.annotations.NonNull;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

import static net.winkeyface14.vanilla_expansion.block.BlockRegHandler.*;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {


    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider registries) {

        // Pickaxe Blocks
        addBlocks(BlockTags.MINEABLE_WITH_PICKAXE,
                CHARCOAL_BLOCK,
                EMPOWERED_NETHERITE_BLOCK,

                FIRED_BRICKS,
                FIRED_BRICK_STAIRS,
                FIRED_BRICK_SLAB,
                FIRED_BRICK_WALL,

                SMOOTH_STONE_STAIRS,

                SMOOTH_SANDSTONE_WALL,
                CUT_SANDSTONE_STAIRS,
                CUT_SANDSTONE_WALL,

                SMOOTH_RED_SANDSTONE_WALL,
                CUT_RED_SANDSTONE_STAIRS,
                CUT_RED_SANDSTONE_WALL,

                QUARTZ_BRICK_STAIRS,
                QUARTZ_BRICK_SLAB,
                QUARTZ_WALL,
                SMOOTH_QUARTZ_WALL,
                QUARTZ_BRICK_WALL,

                SMOKED_QUARTZ_BLOCK,
                SMOOTH_SMOKED_QUARTZ,
                CHISELED_SMOKED_QUARTZ_BLOCK,
                SMOKED_QUARTZ_BRICKS,
                SMOKED_QUARTZ_PILLAR,
                SMOKED_QUARTZ_STAIRS,
                SMOKED_QUARTZ_BRICK_STAIRS,
                SMOOTH_SMOKED_QUARTZ_STAIRS,
                SMOKED_QUARTZ_SLAB,
                SMOOTH_SMOKED_QUARTZ_SLAB,
                SMOKED_QUARTZ_BRICK_SLAB,
                SMOKED_QUARTZ_WALL,
                SMOKED_QUARTZ_BRICK_WALL,
                SMOOTH_SMOKED_QUARTZ_WALL,

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
                SMOOTH_BURNT_QUARTZ_WALL,

                TERRACOTTA_STAIRS,
                TERRACOTTA_SLAB,
                TERRACOTTA_WALL
        );

        // Axe Tools
        addBlocks(BlockTags.MINEABLE_WITH_AXE,
                BUNDLED_STICKS_BLOCK,
                BARREL_OF_APPLES_BLOCK,
                BARREL_OF_POTATOES_BLOCK,
                BARREL_OF_CARROTS_BLOCK,
                BARREL_OF_BEETROOTS_BLOCK,
                BARREL_OF_SWEETBERRIES_BLOCK,
                BARREL_OF_CHORUS_BLOCK,

                // Wood
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
                WARPED_HYPHAE_FENCE,

                // Stripped Wood
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

        // --- Misc Block Tags ---
        addBlock(BlockTags.NEEDS_DIAMOND_TOOL, EMPOWERED_NETHERITE_BLOCK);
        addBlock(BlockTags.BEACON_BASE_BLOCKS, EMPOWERED_NETHERITE_BLOCK);

        // Fence
        addBlocks(BlockTags.FENCES,
                OAK_WOOD_FENCE,
                SPRUCE_WOOD_FENCE,
                BIRCH_WOOD_FENCE,
                JUNGLE_WOOD_FENCE,
                ACACIA_WOOD_FENCE,
                DARK_OAK_WOOD_FENCE,
                MANGROVE_WOOD_FENCE,
                CHERRY_WOOD_FENCE,
                PALE_OAK_WOOD_FENCE,
                CRIMSON_HYPHAE_FENCE,
                WARPED_HYPHAE_FENCE,
                POPLAR_WOOD_FENCE,

                STRIPPED_OAK_WOOD_FENCE,
                STRIPPED_SPRUCE_WOOD_FENCE,
                STRIPPED_BIRCH_WOOD_FENCE,
                STRIPPED_JUNGLE_WOOD_FENCE,
                STRIPPED_ACACIA_WOOD_FENCE,
                STRIPPED_DARK_OAK_WOOD_FENCE,
                STRIPPED_MANGROVE_WOOD_FENCE,
                STRIPPED_CHERRY_WOOD_FENCE,
                STRIPPED_PALE_OAK_WOOD_FENCE,
                STRIPPED_CRIMSON_HYPHAE_FENCE,
                STRIPPED_WARPED_HYPHAE_FENCE,
                STRIPPED_POPLAR_WOOD_FENCE
                );

        // Walls
        addBlocks(BlockTags.WALLS,
                SMOOTH_STONE_WALL,

                SMOOTH_SANDSTONE_WALL,
                CUT_SANDSTONE_WALL,

                SMOOTH_RED_SANDSTONE_WALL,
                CUT_RED_SANDSTONE_WALL,

                QUARTZ_WALL,
                QUARTZ_BRICK_WALL,
                SMOOTH_QUARTZ_WALL,

                SMOKED_QUARTZ_WALL,
                SMOKED_QUARTZ_BRICK_WALL,
                SMOOTH_SMOKED_QUARTZ_WALL,

                BURNT_QUARTZ_WALL,
                BURNT_QUARTZ_BRICK_WALL,
                SMOOTH_BURNT_QUARTZ_WALL,

                FIRED_BRICK_WALL,

                TERRACOTTA_WALL
        );

        // Stairs
        addBlocks(BlockTags.STAIRS,
                SMOOTH_STONE_STAIRS,

                CUT_SANDSTONE_STAIRS,

                CUT_RED_SANDSTONE_STAIRS,
                QUARTZ_BRICK_STAIRS,

                SMOKED_QUARTZ_STAIRS,
                SMOKED_QUARTZ_BRICK_STAIRS,
                SMOOTH_SMOKED_QUARTZ_STAIRS,

                BURNT_QUARTZ_STAIRS,
                BURNT_QUARTZ_BRICK_STAIRS,
                SMOOTH_BURNT_QUARTZ_STAIRS,

                FIRED_BRICK_STAIRS,

                TERRACOTTA_STAIRS,

                OAK_WOOD_STAIRS,
                SPRUCE_WOOD_STAIRS,
                BIRCH_WOOD_STAIRS,
                JUNGLE_WOOD_STAIRS,
                ACACIA_WOOD_STAIRS,
                DARK_OAK_WOOD_STAIRS,
                MANGROVE_WOOD_STAIRS,
                CHERRY_WOOD_STAIRS,
                PALE_OAK_WOOD_STAIRS,
                CRIMSON_HYPHAE_STAIRS,
                WARPED_HYPHAE_STAIRS,

                STRIPPED_OAK_WOOD_STAIRS,
                STRIPPED_SPRUCE_WOOD_STAIRS,
                STRIPPED_BIRCH_WOOD_STAIRS,
                STRIPPED_JUNGLE_WOOD_STAIRS,
                STRIPPED_ACACIA_WOOD_STAIRS,
                STRIPPED_DARK_OAK_WOOD_STAIRS,
                STRIPPED_MANGROVE_WOOD_STAIRS,
                STRIPPED_CHERRY_WOOD_STAIRS,
                STRIPPED_PALE_OAK_WOOD_STAIRS,
                STRIPPED_CRIMSON_HYPHAE_STAIRS,
                STRIPPED_WARPED_HYPHAE_STAIRS
        );

        // Slabs
        addBlocks(BlockTags.SLABS,
                QUARTZ_BRICK_SLAB,

                SMOKED_QUARTZ_SLAB,
                SMOKED_QUARTZ_BRICK_SLAB,
                SMOOTH_SMOKED_QUARTZ_SLAB,

                BURNT_QUARTZ_SLAB,
                BURNT_QUARTZ_BRICK_SLAB,
                SMOOTH_BURNT_QUARTZ_SLAB,

                FIRED_BRICK_SLAB,

                TERRACOTTA_SLAB,

                OAK_WOOD_SLAB,
                SPRUCE_WOOD_SLAB,
                BIRCH_WOOD_SLAB,
                JUNGLE_WOOD_SLAB,
                ACACIA_WOOD_SLAB,
                DARK_OAK_WOOD_SLAB,
                MANGROVE_WOOD_SLAB,
                CHERRY_WOOD_SLAB,
                PALE_OAK_WOOD_SLAB,
                CRIMSON_HYPHAE_SLAB,
                WARPED_HYPHAE_SLAB,

                STRIPPED_OAK_WOOD_SLAB,
                STRIPPED_SPRUCE_WOOD_SLAB,
                STRIPPED_BIRCH_WOOD_SLAB,
                STRIPPED_JUNGLE_WOOD_SLAB,
                STRIPPED_ACACIA_WOOD_SLAB,
                STRIPPED_DARK_OAK_WOOD_SLAB,
                STRIPPED_MANGROVE_WOOD_SLAB,
                STRIPPED_CHERRY_WOOD_SLAB,
                STRIPPED_PALE_OAK_WOOD_SLAB,
                STRIPPED_CRIMSON_HYPHAE_SLAB,
                STRIPPED_WARPED_HYPHAE_SLAB
        );

        // --- Custom Tool Tags ---
        tag(TagRegHandler.Blocks.NEEDS_EMERALD_TOOL).addOptionalTag(BlockTags.NEEDS_IRON_TOOL);
        tag(TagRegHandler.Blocks.INCORRECT_FOR_EMERALD_TOOL).addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(TagRegHandler.Blocks.NEEDS_LAPIS_LAZULI_TOOL).addOptionalTag(BlockTags.NEEDS_STONE_TOOL);
        tag(TagRegHandler.Blocks.INCORRECT_FOR_LAPIS_LAZULI_TOOL)
                .addOptionalTag(BlockTags.NEEDS_IRON_TOOL)
                .addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(TagRegHandler.Blocks.NEEDS_REDSTONE_TOOL).addOptionalTag(BlockTags.NEEDS_IRON_TOOL);
        tag(TagRegHandler.Blocks.INCORRECT_FOR_REDSTONE_TOOL).addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(TagRegHandler.Blocks.NEEDS_QUARTZ_TOOL).addOptionalTag(BlockTags.NEEDS_IRON_TOOL);
        tag(TagRegHandler.Blocks.INCORRECT_FOR_QUARTZ_TOOL).addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(TagRegHandler.Blocks.NEEDS_EMPOWERED_NETHERITE_TOOL).addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(getRK(BlockRegHandler.EMPOWERED_NETHERITE_BLOCK));

        tag(TagRegHandler.Blocks.NEEDS_EMERALD_TOOL)
                .addOptionalTag(BlockTags.NEEDS_IRON_TOOL);

        tag(TagRegHandler.Blocks.INCORRECT_FOR_EMERALD_TOOL)
                .addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(TagRegHandler.Blocks.NEEDS_LAPIS_LAZULI_TOOL)
                .addOptionalTag(BlockTags.NEEDS_STONE_TOOL);

        tag(TagRegHandler.Blocks.INCORRECT_FOR_LAPIS_LAZULI_TOOL)
                .addOptionalTag(BlockTags.NEEDS_IRON_TOOL)
                .addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(TagRegHandler.Blocks.NEEDS_REDSTONE_TOOL)
                .addOptionalTag(BlockTags.NEEDS_IRON_TOOL);

        tag(TagRegHandler.Blocks.INCORRECT_FOR_REDSTONE_TOOL)
                .addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(TagRegHandler.Blocks.NEEDS_QUARTZ_TOOL)
                .addOptionalTag(BlockTags.NEEDS_IRON_TOOL);

        tag(TagRegHandler.Blocks.INCORRECT_FOR_QUARTZ_TOOL)
                .addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(TagRegHandler.Blocks.NEEDS_EMPOWERED_NETHERITE_TOOL)
                .addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(getRK(BlockRegHandler.EMPOWERED_NETHERITE_BLOCK));

        // --- Block Collections (Consolidated Loops) ---
        addCollection(DYED_TERRACOTTA_STAIRS.values(), BlockTags.STAIRS, BlockTags.MINEABLE_WITH_PICKAXE);
        addCollection(DYED_TERRACOTTA_SLAB.values(), BlockTags.SLABS, BlockTags.MINEABLE_WITH_PICKAXE);
        addCollection(DYED_TERRACOTTA_WALL.values(), BlockTags.WALLS, BlockTags.MINEABLE_WITH_PICKAXE);

        addCollection(DYED_WOOL_WALL.values(), BlockTags.WALLS, BlockTags.SHEARS_MAJOR_BREAKING_SPEED);

        addCollection(DYED_CONCRETE_WALL.values(), BlockTags.WALLS, BlockTags.MINEABLE_WITH_PICKAXE);
    }

    private void addBlock(TagKey<Block> tagKey, Block block) {
        var builder = tag(tagKey);
            builder.add(getRK(block));
    }

    private void addBlocks(TagKey<Block> tagKey, Block... blocks) {
        var builder = tag(tagKey);
        for (Block block : blocks) {
            builder.add(getRK(block));
        }
    }

    @SafeVarargs
    private void addCollection(Collection<Block> blocks, TagKey<Block>... tagKeys) {
        for (TagKey<Block> tagKey : tagKeys) {
            var builder = tag(tagKey);
            for (Block block : blocks) {
                builder.add(getRK(block));
            }
        }
    }
}
