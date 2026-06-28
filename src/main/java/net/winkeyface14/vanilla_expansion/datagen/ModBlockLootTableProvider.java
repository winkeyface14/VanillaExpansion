package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.winkeyface14.vanilla_expansion.util.BlockRegHandler;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(BlockRegHandler.CHARCOAL_BLOCK);
        dropSelf(BlockRegHandler.BUNDLED_STICKS_BLOCK);
        dropSelf(BlockRegHandler.BARREL_OF_APPLES_BLOCK);
        dropSelf(BlockRegHandler.BARREL_OF_POTATOES_BLOCK);
        dropSelf(BlockRegHandler.BARREL_OF_CARROTS_BLOCK);
        dropSelf(BlockRegHandler.BARREL_OF_SWEETBERRY_BLOCK);
        dropSelf(BlockRegHandler.BARREL_OF_CHORUS_BLOCK);
        dropSelf(BlockRegHandler.EMPOWERED_NETHERITE_BLOCK);
        dropSelf(BlockRegHandler.FIRED_BRICKS);
        dropSelf(BlockRegHandler.FIRED_BRICKS_STAIRS);
        dropSelf(BlockRegHandler.FIRED_BRICKS_SLAB);
        dropSelf(BlockRegHandler.FIRED_BRICKS_WALL);
        dropSelf(BlockRegHandler.QUARTZ_WALL);
        dropSelf(BlockRegHandler.SMOKED_QUARTZ_BLOCK);
        dropSelf(BlockRegHandler.SMOOTH_SMOKED_QUARTZ);
        dropSelf(BlockRegHandler.CHISELED_SMOKED_QUARTZ_BLOCK);
        dropSelf(BlockRegHandler.SMOKED_QUARTZ_BRICKS);
        dropSelf(BlockRegHandler.SMOKED_QUARTZ_PILLAR);
        dropSelf(BlockRegHandler.SMOKED_QUARTZ_STAIRS);
        dropSelf(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_STAIRS);
        dropSelf(BlockRegHandler.SMOKED_QUARTZ_BRICKS_STAIRS);
        dropSelf(BlockRegHandler.SMOKED_QUARTZ_SLAB);
        dropSelf(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_SLAB);
        dropSelf(BlockRegHandler.SMOKED_QUARTZ_BRICKS_SLAB);
        dropSelf(BlockRegHandler.SMOKED_QUARTZ_WALL);
        dropSelf(BlockRegHandler.BURNT_QUARTZ_BLOCK);
        dropSelf(BlockRegHandler.SMOOTH_BURNT_QUARTZ);
        dropSelf(BlockRegHandler.CHISELED_BURNT_QUARTZ_BLOCK);
        dropSelf(BlockRegHandler.BURNT_QUARTZ_BRICKS);
        dropSelf(BlockRegHandler.BURNT_QUARTZ_PILLAR);
        dropSelf(BlockRegHandler.BURNT_QUARTZ_STAIRS);
        dropSelf(BlockRegHandler.SMOOTH_BURNT_QUARTZ_STAIRS);
        dropSelf(BlockRegHandler.BURNT_QUARTZ_BRICKS_STAIRS);
        dropSelf(BlockRegHandler.BURNT_QUARTZ_SLAB);
        dropSelf(BlockRegHandler.SMOOTH_BURNT_QUARTZ_SLAB);
        dropSelf(BlockRegHandler.BURNT_QUARTZ_BRICKS_SLAB);
        dropSelf(BlockRegHandler.BURNT_QUARTZ_WALL);
    }
}
