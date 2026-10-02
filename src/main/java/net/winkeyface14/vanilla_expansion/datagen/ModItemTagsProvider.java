package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.BlockItemIds;
import net.minecraft.references.ItemIds;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.winkeyface14.vanilla_expansion.tags.TagRegHandler;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

// Static import lets us drop "ItemRegHandler." everywhere
import static net.winkeyface14.vanilla_expansion.item.ItemRegHandler.*;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {

    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider registries) {

        // --- Tools ---
        addItems(ItemTags.SWORDS,
                EMERALD_SWORD,
                LAPIS_LAZULI_SWORD,
                REDSTONE_SWORD,
                QUARTZ_SWORD,
                SMOKED_QUARTZ_SWORD,
                BURNT_QUARTZ_SWORD,
                EMPOWERED_NETHERITE_SWORD
        );

        addItems(ItemTags.SHOVELS,
                EMERALD_SHOVEL,
                LAPIS_LAZULI_SHOVEL,
                REDSTONE_SHOVEL,
                QUARTZ_SHOVEL,
                SMOKED_QUARTZ_SHOVEL,
                BURNT_QUARTZ_SHOVEL,
                EMPOWERED_NETHERITE_SHOVEL
        );

        addItems(ItemTags.PICKAXES,
                EMERALD_PICKAXE,
                LAPIS_LAZULI_PICKAXE,
                REDSTONE_PICKAXE,
                QUARTZ_PICKAXE,
                SMOKED_QUARTZ_PICKAXE,
                BURNT_QUARTZ_PICKAXE,
                EMPOWERED_NETHERITE_PICKAXE
        );

        addItems(ItemTags.AXES,
                EMERALD_AXE,
                LAPIS_LAZULI_AXE,
                REDSTONE_AXE,
                QUARTZ_AXE,
                SMOKED_QUARTZ_AXE,
                BURNT_QUARTZ_AXE,
                EMPOWERED_NETHERITE_AXE
        );

        addItems(ItemTags.HOES,
                EMERALD_HOE,
                LAPIS_LAZULI_HOE,
                REDSTONE_HOE,
                QUARTZ_HOE,
                SMOKED_QUARTZ_HOE,
                BURNT_QUARTZ_HOE,
                EMPOWERED_NETHERITE_HOE
        );

        addItems(ItemTags.SPEARS,
                EMERALD_SPEAR,
                LAPIS_LAZULI_SPEAR,
                REDSTONE_SPEAR,
                QUARTZ_SPEAR,
                SMOKED_QUARTZ_SPEAR,
                BURNT_QUARTZ_SPEAR,
                EMPOWERED_NETHERITE_SPEAR
        );

        // --- Armor ---
        addItems(ItemTags.HEAD_ARMOR,
                EMERALD_HELMET,
                LAPIS_LAZULI_HELMET,
                ARMADILLO_SCUTE_HELMET,
                EMPOWERED_NETHERITE_HELMET,
                REINFORCED_LEATHER_HELMET
        );

        addItems(ItemTags.CHEST_ARMOR,
                EMERALD_CHESTPLATE,
                LAPIS_LAZULI_CHESTPLATE,
                ARMADILLO_SCUTE_CHESTPLATE,
                EMPOWERED_NETHERITE_CHESTPLATE,
                REINFORCED_LEATHER_CHESTPLATE
        );

        addItems(ItemTags.LEG_ARMOR,
                EMERALD_LEGGINGS,
                LAPIS_LAZULI_LEGGINGS,
                ARMADILLO_SCUTE_LEGGINGS,
                EMPOWERED_NETHERITE_LEGGINGS,
                REINFORCED_LEATHER_LEGGINGS
        );

        addItems(ItemTags.FOOT_ARMOR,
                EMERALD_BOOTS,
                LAPIS_LAZULI_BOOTS,
                ARMADILLO_SCUTE_BOOTS,
                EMPOWERED_NETHERITE_BOOTS,
                REINFORCED_LEATHER_BOOTS
        );

        // --- Repair Materials ---
        tag(TagRegHandler.Items.EMERALD_REPAIR).add(ItemIds.EMERALD);
        tag(TagRegHandler.Items.LAPIS_LAZULI_REPAIR).add(ItemIds.LAPIS_LAZULI);
        tag(TagRegHandler.Items.REDSTONE_REPAIR).add(BlockItemIds.REDSTONE_BLOCK.item());
        tag(TagRegHandler.Items.QUARTZ_REPAIR).add(ItemIds.QUARTZ);
        tag(TagRegHandler.Items.ARMADILLO_SCUTE_REPAIR).add(ItemIds.ARMADILLO_SCUTE);

        tag(TagRegHandler.Items.SMOKED_QUARTZ_REPAIR).add(getRK(SMOKED_QUARTZ));
        tag(TagRegHandler.Items.BURNT_QUARTZ_REPAIR).add(getRK(BURNT_QUARTZ));
        tag(TagRegHandler.Items.EMPOWERED_NETHERITE_REPAIR).add(getRK(EMPOWERED_NETHERITE));
        tag(TagRegHandler.Items.REINFORCED_LEATHER_REPAIR).add(getRK(REINFORCED_LEATHER));
    }

    private void addItems(TagKey<Item> tagKey, Item... items) {
        var builder = tag(tagKey);
        for (Item item : items) {
            builder.add(getRK(item));
        }
    }
}