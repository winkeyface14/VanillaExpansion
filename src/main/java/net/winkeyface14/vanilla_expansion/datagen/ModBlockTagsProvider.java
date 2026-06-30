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
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockRegHandler.CHARCOAL_BLOCK)
                .add(BlockRegHandler.EMPOWERED_NETHERITE_BLOCK)

                .add(BlockRegHandler.FIRED_BRICKS)
                .add(BlockRegHandler.FIRED_BRICKS_STAIRS)
                .add(BlockRegHandler.FIRED_BRICKS_SLAB)
                .add(BlockRegHandler.FIRED_BRICKS_WALL)

                .add(BlockRegHandler.QUARTZ_WALL)
                .add(BlockRegHandler.QUARTZ_BRICKS_WALL)

                .add(BlockRegHandler.SMOKED_QUARTZ_BLOCK)
                .add(BlockRegHandler.SMOOTH_SMOKED_QUARTZ)
                .add(BlockRegHandler.CHISELED_SMOKED_QUARTZ_BLOCK)
                .add(BlockRegHandler.SMOKED_QUARTZ_BRICKS)
                .add(BlockRegHandler.SMOKED_QUARTZ_PILLAR)

                .add(BlockRegHandler.SMOKED_QUARTZ_STAIRS)
                .add(BlockRegHandler.SMOKED_QUARTZ_BRICKS_STAIRS)
                .add(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_STAIRS)
                .add(BlockRegHandler.SMOKED_QUARTZ_BRICKS_STAIRS)

                .add(BlockRegHandler.SMOKED_QUARTZ_SLAB)
                .add(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_SLAB)
                .add(BlockRegHandler.SMOKED_QUARTZ_BRICKS_SLAB)

                .add(BlockRegHandler.SMOKED_QUARTZ_WALL)
                .add(BlockRegHandler.SMOKED_QUARTZ_BRICKS_WALL)
                .add(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_WALL)

                .add(BlockRegHandler.BURNT_QUARTZ_BLOCK)
                .add(BlockRegHandler.SMOOTH_BURNT_QUARTZ)
                .add(BlockRegHandler.CHISELED_BURNT_QUARTZ_BLOCK)
                .add(BlockRegHandler.BURNT_QUARTZ_BRICKS)
                .add(BlockRegHandler.BURNT_QUARTZ_PILLAR)

                .add(BlockRegHandler.BURNT_QUARTZ_STAIRS)
                .add(BlockRegHandler.SMOOTH_BURNT_QUARTZ_STAIRS)
                .add(BlockRegHandler.BURNT_QUARTZ_BRICKS_STAIRS)

                .add(BlockRegHandler.BURNT_QUARTZ_SLAB)
                .add(BlockRegHandler.SMOOTH_BURNT_QUARTZ_SLAB)
                .add(BlockRegHandler.BURNT_QUARTZ_BRICKS_SLAB)

                .add(BlockRegHandler.BURNT_QUARTZ_WALL)
                .add(BlockRegHandler.BURNT_QUARTZ_BRICKS_WALL)
                .add(BlockRegHandler.SMOOTH_BURNT_QUARTZ_WALL);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockRegHandler.EMPOWERED_NETHERITE_BLOCK);

        valueLookupBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(BlockRegHandler.BUNDLED_STICKS_BLOCK)
                .add(BlockRegHandler.BARREL_OF_APPLES_BLOCK)
                .add(BlockRegHandler.BARREL_OF_POTATOES_BLOCK)
                .add(BlockRegHandler.BARREL_OF_CARROTS_BLOCK)
                .add(BlockRegHandler.BARREL_OF_SWEETBERRY_BLOCK)
                .add(BlockRegHandler.BARREL_OF_CHORUS_BLOCK);

        valueLookupBuilder(TagRegHandler.Blocks.NEEDS_EMERALD_TOOL)
                .addOptionalTag(BlockTags.NEEDS_IRON_TOOL);

        valueLookupBuilder(TagRegHandler.Blocks.INCORRECT_FOR_EMERALD_TOOL)
                .addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        valueLookupBuilder(TagRegHandler.Blocks.NEEDS_LAPIS_LAZULI_TOOL)
                .addOptionalTag(BlockTags.NEEDS_STONE_TOOL);

        valueLookupBuilder(TagRegHandler.Blocks.INCORRECT_FOR_LAPIS_LAZULI_TOOL)
                .addOptionalTag(BlockTags.NEEDS_IRON_TOOL)
                .addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        valueLookupBuilder(TagRegHandler.Blocks.NEEDS_REDSTONE_TOOL)
                .addOptionalTag(BlockTags.NEEDS_IRON_TOOL);

        valueLookupBuilder(TagRegHandler.Blocks.INCORRECT_FOR_REDSTONE_TOOL)
                .addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        valueLookupBuilder(TagRegHandler.Blocks.NEEDS_QUARTZ_TOOL)
                .addOptionalTag(BlockTags.NEEDS_IRON_TOOL);

        valueLookupBuilder(TagRegHandler.Blocks.INCORRECT_FOR_QUARTZ_TOOL)
                .addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        valueLookupBuilder(TagRegHandler.Blocks.NEEDS_EMPOWERED_NETHERITE_TOOL)
                .addOptionalTag(BlockTags.NEEDS_DIAMOND_TOOL);

        valueLookupBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(BlockRegHandler.EMPOWERED_NETHERITE_BLOCK);

        valueLookupBuilder(BlockTags.WALLS)
                .add(BlockRegHandler.QUARTZ_WALL)
                .add(BlockRegHandler.QUARTZ_BRICKS_WALL)

                .add(BlockRegHandler.SMOKED_QUARTZ_WALL)
                .add(BlockRegHandler.SMOKED_QUARTZ_BRICKS_WALL)
                .add(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_WALL)

                .add(BlockRegHandler.BURNT_QUARTZ_WALL)
                .add(BlockRegHandler.BURNT_QUARTZ_BRICKS_WALL)
                .add(BlockRegHandler.SMOOTH_BURNT_QUARTZ_WALL)

                .add(BlockRegHandler.FIRED_BRICKS_WALL);

        valueLookupBuilder(BlockTags.STAIRS)
                .add(BlockRegHandler.SMOKED_QUARTZ_STAIRS)
                .add(BlockRegHandler.SMOKED_QUARTZ_BRICKS_STAIRS)
                .add(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_STAIRS)

                .add(BlockRegHandler.BURNT_QUARTZ_STAIRS)
                .add(BlockRegHandler.BURNT_QUARTZ_BRICKS_STAIRS)
                .add(BlockRegHandler.SMOOTH_BURNT_QUARTZ_STAIRS)

                .add(BlockRegHandler.FIRED_BRICKS_STAIRS);

        valueLookupBuilder(BlockTags.SLABS)
                .add(BlockRegHandler.SMOKED_QUARTZ_SLAB)
                .add(BlockRegHandler.SMOKED_QUARTZ_BRICKS_SLAB)
                .add(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_SLAB)

                .add(BlockRegHandler.BURNT_QUARTZ_SLAB)
                .add(BlockRegHandler.BURNT_QUARTZ_BRICKS_SLAB)
                .add(BlockRegHandler.SMOOTH_BURNT_QUARTZ_SLAB)
                .add(BlockRegHandler.FIRED_BRICKS_SLAB);
    }
}
