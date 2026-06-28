package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.winkeyface14.vanilla_expansion.util.BlockRegHandler;
import net.winkeyface14.vanilla_expansion.util.ItemRegHandler;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ItemTags.SWORDS)
                .add(ItemRegHandler.getRK(ItemRegHandler.EMERALD_SWORD))
                .add(ItemRegHandler.getRK(ItemRegHandler.LAPIS_LAZULI_SWORD))
                .add(ItemRegHandler.getRK(ItemRegHandler.REDSTONE_SWORD))
                .add(ItemRegHandler.getRK(ItemRegHandler.QUARTZ_SWORD))
                .add(ItemRegHandler.getRK(ItemRegHandler.SMOKED_QUARTZ_SWORD))
                .add(ItemRegHandler.getRK(ItemRegHandler.BURNT_QUARTZ_SWORD))
                .add(ItemRegHandler.getRK(ItemRegHandler.EMPOWERED_NETHERITE_SWORD));

        tag(ItemTags.SHOVELS)
                .add(ItemRegHandler.getRK(ItemRegHandler.EMERALD_SHOVEL))
                .add(ItemRegHandler.getRK(ItemRegHandler.LAPIS_LAZULI_SHOVEL))
                .add(ItemRegHandler.getRK(ItemRegHandler.REDSTONE_SHOVEL))
                .add(ItemRegHandler.getRK(ItemRegHandler.QUARTZ_SHOVEL))
                .add(ItemRegHandler.getRK(ItemRegHandler.SMOKED_QUARTZ_SHOVEL))
                .add(ItemRegHandler.getRK(ItemRegHandler.BURNT_QUARTZ_SHOVEL))
                .add(ItemRegHandler.getRK(ItemRegHandler.EMPOWERED_NETHERITE_SHOVEL));

        tag(ItemTags.PICKAXES)
                .add(ItemRegHandler.getRK(ItemRegHandler.EMERALD_PICKAXE))
                .add(ItemRegHandler.getRK(ItemRegHandler.LAPIS_LAZULI_PICKAXE))
                .add(ItemRegHandler.getRK(ItemRegHandler.REDSTONE_PICKAXE))
                .add(ItemRegHandler.getRK(ItemRegHandler.QUARTZ_PICKAXE))
                .add(ItemRegHandler.getRK(ItemRegHandler.SMOKED_QUARTZ_PICKAXE))
                .add(ItemRegHandler.getRK(ItemRegHandler.BURNT_QUARTZ_PICKAXE))
                .add(ItemRegHandler.getRK(ItemRegHandler.EMPOWERED_NETHERITE_PICKAXE));

        tag(ItemTags.AXES)
                .add(ItemRegHandler.getRK(ItemRegHandler.EMERALD_AXE))
                .add(ItemRegHandler.getRK(ItemRegHandler.LAPIS_LAZULI_AXE))
                .add(ItemRegHandler.getRK(ItemRegHandler.REDSTONE_AXE))
                .add(ItemRegHandler.getRK(ItemRegHandler.QUARTZ_AXE))
                .add(ItemRegHandler.getRK(ItemRegHandler.SMOKED_QUARTZ_AXE))
                .add(ItemRegHandler.getRK(ItemRegHandler.BURNT_QUARTZ_AXE))
                .add(ItemRegHandler.getRK(ItemRegHandler.EMPOWERED_NETHERITE_AXE));

        tag(ItemTags.HOES)
                .add(ItemRegHandler.getRK(ItemRegHandler.EMERALD_HOE))
                .add(ItemRegHandler.getRK(ItemRegHandler.LAPIS_LAZULI_HOE))
                .add(ItemRegHandler.getRK(ItemRegHandler.REDSTONE_HOE))
                .add(ItemRegHandler.getRK(ItemRegHandler.QUARTZ_HOE))
                .add(ItemRegHandler.getRK(ItemRegHandler.SMOKED_QUARTZ_HOE))
                .add(ItemRegHandler.getRK(ItemRegHandler.BURNT_QUARTZ_HOE))
                .add(ItemRegHandler.getRK(ItemRegHandler.EMPOWERED_NETHERITE_HOE));
    }
}
