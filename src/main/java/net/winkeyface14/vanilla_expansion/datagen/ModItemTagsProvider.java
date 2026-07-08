package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.BlockItemIds;
import net.minecraft.references.ItemIds;
import net.minecraft.tags.ItemTags;
import net.winkeyface14.vanilla_expansion.tags.TagRegHandler;
import net.winkeyface14.vanilla_expansion.item.ItemRegHandler;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider registries) {
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

        tag(ItemTags.SPEARS)
                .add(ItemRegHandler.getRK(ItemRegHandler.EMERALD_SPEAR))
                .add(ItemRegHandler.getRK(ItemRegHandler.LAPIS_LAZULI_SPEAR))
                .add(ItemRegHandler.getRK(ItemRegHandler.REDSTONE_SPEAR))
                .add(ItemRegHandler.getRK(ItemRegHandler.QUARTZ_SPEAR))
                .add(ItemRegHandler.getRK(ItemRegHandler.SMOKED_QUARTZ_SPEAR))
                .add(ItemRegHandler.getRK(ItemRegHandler.BURNT_QUARTZ_SPEAR))
                .add(ItemRegHandler.getRK(ItemRegHandler.EMPOWERED_NETHERITE_SPEAR));

        tag(ItemTags.HEAD_ARMOR)
                .add(ItemRegHandler.getRK(ItemRegHandler.EMERALD_HELMET))
                .add(ItemRegHandler.getRK(ItemRegHandler.LAPIS_LAZULI_HELMET))
                .add(ItemRegHandler.getRK(ItemRegHandler.ARMADILLO_SCUTE_HELMET))
                .add(ItemRegHandler.getRK(ItemRegHandler.EMPOWERED_NETHERITE_HELMET))
                .add(ItemRegHandler.getRK(ItemRegHandler.REINFORCED_LEATHER_HELMET));

        tag(ItemTags.CHEST_ARMOR)
                .add(ItemRegHandler.getRK(ItemRegHandler.EMERALD_CHESTPLATE))
                .add(ItemRegHandler.getRK(ItemRegHandler.LAPIS_LAZULI_CHESTPLATE))
                .add(ItemRegHandler.getRK(ItemRegHandler.ARMADILLO_SCUTE_CHESTPLATE))
                .add(ItemRegHandler.getRK(ItemRegHandler.EMPOWERED_NETHERITE_CHESTPLATE))
                .add(ItemRegHandler.getRK(ItemRegHandler.REINFORCED_LEATHER_CHESTPLATE));

        tag(ItemTags.LEG_ARMOR)
                .add(ItemRegHandler.getRK(ItemRegHandler.EMERALD_LEGGINGS))
                .add(ItemRegHandler.getRK(ItemRegHandler.LAPIS_LAZULI_LEGGINGS))
                .add(ItemRegHandler.getRK(ItemRegHandler.ARMADILLO_SCUTE_LEGGINGS))
                .add(ItemRegHandler.getRK(ItemRegHandler.EMPOWERED_NETHERITE_LEGGINGS))
                .add(ItemRegHandler.getRK(ItemRegHandler.REINFORCED_LEATHER_LEGGINGS));

        tag(ItemTags.FOOT_ARMOR)
                .add(ItemRegHandler.getRK(ItemRegHandler.EMERALD_BOOTS))
                .add(ItemRegHandler.getRK(ItemRegHandler.LAPIS_LAZULI_BOOTS))
                .add(ItemRegHandler.getRK(ItemRegHandler.ARMADILLO_SCUTE_BOOTS))
                .add(ItemRegHandler.getRK(ItemRegHandler.EMPOWERED_NETHERITE_BOOTS))
                .add(ItemRegHandler.getRK(ItemRegHandler.REINFORCED_LEATHER_BOOTS));



        tag(TagRegHandler.Items.EMERALD_REPAIR)
                .add(ItemIds.EMERALD);

        tag(TagRegHandler.Items.LAPIS_LAZULI_REPAIR)
                .add(ItemIds.LAPIS_LAZULI);

        tag(TagRegHandler.Items.REDSTONE_REPAIR)
                .add(BlockItemIds.REDSTONE_BLOCK.item());

        tag(TagRegHandler.Items.QUARTZ_REPAIR)
                .add(ItemIds.QUARTZ);

        tag(TagRegHandler.Items.ARMADILLO_SCUTE_REPAIR)
                .add(ItemIds.ARMADILLO_SCUTE);

        tag(TagRegHandler.Items.SMOKED_QUARTZ_REPAIR)
                .add(ItemRegHandler.getRK(ItemRegHandler.SMOKED_QUARTZ));

        tag(TagRegHandler.Items.BURNT_QUARTZ_REPAIR)
                .add(ItemRegHandler.getRK(ItemRegHandler.BURNT_QUARTZ));

        tag(TagRegHandler.Items.EMPOWERED_NETHERITE_REPAIR)
                .add(ItemRegHandler.getRK(ItemRegHandler.EMPOWERED_NETHERITE));

        tag(TagRegHandler.Items.REINFORCED_LEATHER_REPAIR)
                .add(ItemRegHandler.getRK(ItemRegHandler.REINFORCED_LEATHER));
    }
}
