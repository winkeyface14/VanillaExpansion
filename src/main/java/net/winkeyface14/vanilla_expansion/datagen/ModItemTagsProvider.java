package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
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
        valueLookupBuilder(ItemTags.SWORDS)
                .add(ItemRegHandler.EMERALD_SWORD)
                .add(ItemRegHandler.LAPIS_LAZULI_SWORD)
                .add(ItemRegHandler.REDSTONE_SWORD)
                .add(ItemRegHandler.QUARTZ_SWORD)
                .add(ItemRegHandler.SMOKED_QUARTZ_SWORD)
                .add(ItemRegHandler.BURNT_QUARTZ_SWORD)
                .add(ItemRegHandler.EMPOWERED_NETHERITE_SWORD);

        valueLookupBuilder(ItemTags.SHOVELS)
                .add(ItemRegHandler.EMERALD_SHOVEL)
                .add(ItemRegHandler.LAPIS_LAZULI_SHOVEL)
                .add(ItemRegHandler.REDSTONE_SHOVEL)
                .add(ItemRegHandler.QUARTZ_SHOVEL)
                .add(ItemRegHandler.SMOKED_QUARTZ_SHOVEL)
                .add(ItemRegHandler.BURNT_QUARTZ_SHOVEL)
                .add(ItemRegHandler.EMPOWERED_NETHERITE_SHOVEL);

        valueLookupBuilder(ItemTags.PICKAXES)
                .add(ItemRegHandler.EMERALD_PICKAXE)
                .add(ItemRegHandler.LAPIS_LAZULI_PICKAXE)
                .add(ItemRegHandler.REDSTONE_PICKAXE)
                .add(ItemRegHandler.QUARTZ_PICKAXE)
                .add(ItemRegHandler.SMOKED_QUARTZ_PICKAXE)
                .add(ItemRegHandler.BURNT_QUARTZ_PICKAXE)
                .add(ItemRegHandler.EMPOWERED_NETHERITE_PICKAXE);

        valueLookupBuilder(ItemTags.AXES)
                .add(ItemRegHandler.EMERALD_AXE)
                .add(ItemRegHandler.LAPIS_LAZULI_AXE)
                .add(ItemRegHandler.REDSTONE_AXE)
                .add(ItemRegHandler.QUARTZ_AXE)
                .add(ItemRegHandler.SMOKED_QUARTZ_AXE)
                .add(ItemRegHandler.BURNT_QUARTZ_AXE)
                .add(ItemRegHandler.EMPOWERED_NETHERITE_AXE);

        valueLookupBuilder(ItemTags.HOES)
                .add(ItemRegHandler.EMERALD_HOE)
                .add(ItemRegHandler.LAPIS_LAZULI_HOE)
                .add(ItemRegHandler.REDSTONE_HOE)
                .add(ItemRegHandler.QUARTZ_HOE)
                .add(ItemRegHandler.SMOKED_QUARTZ_HOE)
                .add(ItemRegHandler.BURNT_QUARTZ_HOE)
                .add(ItemRegHandler.EMPOWERED_NETHERITE_HOE);

        valueLookupBuilder(ItemTags.SPEARS)
                .add(ItemRegHandler.EMERALD_SPEAR)
                .add(ItemRegHandler.LAPIS_LAZULI_SPEAR)
                .add(ItemRegHandler.REDSTONE_SPEAR)
                .add(ItemRegHandler.QUARTZ_SPEAR)
                .add(ItemRegHandler.SMOKED_QUARTZ_SPEAR)
                .add(ItemRegHandler.BURNT_QUARTZ_SPEAR)
                .add(ItemRegHandler.EMPOWERED_NETHERITE_SPEAR);

        valueLookupBuilder(ItemTags.HEAD_ARMOR)
                .add(ItemRegHandler.EMERALD_HELMET)
                .add(ItemRegHandler.LAPIS_LAZULI_HELMET)
                .add(ItemRegHandler.EMPOWERED_NETHERITE_HELMET);
        //.add(ItemRegHandler.REINFORCED_LEATHER_HELMET);

        valueLookupBuilder(ItemTags.CHEST_ARMOR)
                .add(ItemRegHandler.EMERALD_CHESTPLATE)
                .add(ItemRegHandler.LAPIS_LAZULI_CHESTPLATE)
                .add(ItemRegHandler.EMPOWERED_NETHERITE_CHESTPLATE);
        //.add(ItemRegHandler.REINFORCED_LEATHER_CHESTPLATE);

        valueLookupBuilder(ItemTags.LEG_ARMOR)
                .add(ItemRegHandler.EMERALD_LEGGINGS)
                .add(ItemRegHandler.LAPIS_LAZULI_LEGGINGS)
                .add(ItemRegHandler.EMPOWERED_NETHERITE_LEGGINGS);
        //.add(ItemRegHandler.REINFORCED_LEATHER_LEGGINGS);

        valueLookupBuilder(ItemTags.FOOT_ARMOR)
                .add(ItemRegHandler.EMERALD_BOOTS)
                .add(ItemRegHandler.LAPIS_LAZULI_BOOTS)
                .add(ItemRegHandler.EMPOWERED_NETHERITE_BOOTS);
        //.add(ItemRegHandler.REINFORCED_LEATHER_BOOTS);



        valueLookupBuilder(TagRegHandler.Items.EMERALD_REPAIR)
                .add(Items.EMERALD);

        valueLookupBuilder(TagRegHandler.Items.LAPIS_LAZULI_REPAIR)
                .add(Items.LAPIS_LAZULI);

        valueLookupBuilder(TagRegHandler.Items.REDSTONE_REPAIR)
                .add(Items.REDSTONE_BLOCK);

        valueLookupBuilder(TagRegHandler.Items.QUARTZ_REPAIR)
                .add(Items.QUARTZ);

        valueLookupBuilder(TagRegHandler.Items.SMOKED_QUARTZ_REPAIR)
                .add(ItemRegHandler.SMOKED_QUARTZ);

        valueLookupBuilder(TagRegHandler.Items.BURNT_QUARTZ_REPAIR)
                .add(ItemRegHandler.BURNT_QUARTZ);

        valueLookupBuilder(TagRegHandler.Items.EMPOWERED_NETHERITE_REPAIR)
                .add(ItemRegHandler.EMPOWERED_NETHERITE);

        valueLookupBuilder(TagRegHandler.Items.REINFORCED_LEATHER_REPAIR)
                .add(ItemRegHandler.REINFORCED_LEATHER);
    }
}
