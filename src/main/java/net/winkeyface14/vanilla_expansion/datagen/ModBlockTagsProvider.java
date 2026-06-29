package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.winkeyface14.vanilla_expansion.tags.TagRegHandler;
import net.winkeyface14.vanilla_expansion.block.BlockRegHandler;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {

    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockRegHandler.getRK(BlockRegHandler.CHARCOAL_BLOCK))
                .add(BlockRegHandler.getRK(BlockRegHandler.EMPOWERED_NETHERITE_BLOCK))
                .add(BlockRegHandler.getRK(BlockRegHandler.FIRED_BRICKS))
                .add(BlockRegHandler.getRK(BlockRegHandler.FIRED_BRICKS_STAIRS))
                .add(BlockRegHandler.getRK(BlockRegHandler.FIRED_BRICKS_SLAB))
                .add(BlockRegHandler.getRK(BlockRegHandler.FIRED_BRICKS_WALL))
                .add(BlockRegHandler.getRK(BlockRegHandler.QUARTZ_WALL))
                .add(BlockRegHandler.getRK(BlockRegHandler.QUARTZ_BRICKS_WALL))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_BLOCK))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOOTH_SMOKED_QUARTZ))
                .add(BlockRegHandler.getRK(BlockRegHandler.CHISELED_SMOKED_QUARTZ_BLOCK))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_BRICKS))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_PILLAR))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_STAIRS))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_BRICKS_STAIRS))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_STAIRS))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_BRICKS_STAIRS))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_SLAB))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_SLAB))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_BRICKS_SLAB))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_WALL))
                .add(BlockRegHandler.getRK(BlockRegHandler.BURNT_QUARTZ_BLOCK))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOOTH_BURNT_QUARTZ))
                .add(BlockRegHandler.getRK(BlockRegHandler.CHISELED_BURNT_QUARTZ_BLOCK))
                .add(BlockRegHandler.getRK(BlockRegHandler.BURNT_QUARTZ_BRICKS))
                .add(BlockRegHandler.getRK(BlockRegHandler.BURNT_QUARTZ_PILLAR))
                .add(BlockRegHandler.getRK(BlockRegHandler.BURNT_QUARTZ_STAIRS))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOOTH_BURNT_QUARTZ_STAIRS))
                .add(BlockRegHandler.getRK(BlockRegHandler.BURNT_QUARTZ_BRICKS_STAIRS))
                .add(BlockRegHandler.getRK(BlockRegHandler.BURNT_QUARTZ_SLAB))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOOTH_BURNT_QUARTZ_SLAB))
                .add(BlockRegHandler.getRK(BlockRegHandler.BURNT_QUARTZ_BRICKS_SLAB))
                .add(BlockRegHandler.getRK(BlockRegHandler.BURNT_QUARTZ_WALL))
                .add(BlockRegHandler.getRK(BlockRegHandler.BURNT_QUARTZ_BRICKS_WALL));

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockRegHandler.getRK(BlockRegHandler.EMPOWERED_NETHERITE_BLOCK));

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(BlockRegHandler.getRK(BlockRegHandler.BUNDLED_STICKS_BLOCK))
                .add(BlockRegHandler.getRK(BlockRegHandler.BARREL_OF_APPLES_BLOCK))
                .add(BlockRegHandler.getRK(BlockRegHandler.BARREL_OF_POTATOES_BLOCK))
                .add(BlockRegHandler.getRK(BlockRegHandler.BARREL_OF_CARROTS_BLOCK))
                .add(BlockRegHandler.getRK(BlockRegHandler.BARREL_OF_SWEETBERRY_BLOCK))
                .add(BlockRegHandler.getRK(BlockRegHandler.BARREL_OF_CHORUS_BLOCK));

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
                .add(BlockRegHandler.getRK(BlockRegHandler.EMPOWERED_NETHERITE_BLOCK));

        tag(BlockTags.WALLS)
                .add(BlockRegHandler.getRK(BlockRegHandler.QUARTZ_WALL))
                .add(BlockRegHandler.getRK(BlockRegHandler.QUARTZ_BRICKS_WALL))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_WALL))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_BRICKS_WALL))
                .add(BlockRegHandler.getRK(BlockRegHandler.BURNT_QUARTZ_WALL))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_BRICKS_WALL))
                .add(BlockRegHandler.getRK(BlockRegHandler.FIRED_BRICKS_WALL));

        tag(BlockTags.STAIRS)
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_STAIRS))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_BRICKS_STAIRS))
                .add(BlockRegHandler.getRK(BlockRegHandler.BURNT_QUARTZ_STAIRS))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_BRICKS_STAIRS))
                .add(BlockRegHandler.getRK(BlockRegHandler.FIRED_BRICKS_STAIRS));

        tag(BlockTags.SLABS)
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_SLAB))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_BRICKS_SLAB))
                .add(BlockRegHandler.getRK(BlockRegHandler.BURNT_QUARTZ_SLAB))
                .add(BlockRegHandler.getRK(BlockRegHandler.SMOKED_QUARTZ_BRICKS_SLAB))
                .add(BlockRegHandler.getRK(BlockRegHandler.FIRED_BRICKS_SLAB));
    }
}
