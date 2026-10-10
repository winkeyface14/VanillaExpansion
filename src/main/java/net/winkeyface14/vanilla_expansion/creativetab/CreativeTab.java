package net.winkeyface14.vanilla_expansion.creativetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.winkeyface14.vanilla_expansion.VanillaExpansion;

// Static imports to remove the class prefixes
import static net.winkeyface14.vanilla_expansion.block.BlockRegHandler.*;
import static net.winkeyface14.vanilla_expansion.item.ItemRegHandler.*;
import static net.winkeyface14.vanilla_expansion.util.ConfigHandler.*;

public class CreativeTab {

    public static final CreativeModeTab TVE_ITEMS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "tve_items"), FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(COAL_CHUNK))
            .title(Component.translatable("creativetab.vanilla_expansion.items"))
            .displayItems((parameters, output) -> {
                addIf(enableCoalChunk, output, COAL_CHUNK);
                addIf(enableCharcoalChunk, output, CHARCOAL_CHUNK);

                addIf(enableDiamondShard, output, DIAMOND_SHARD);
                addIf(enableEmeraldShard, output, EMERALD_SHARD);
                addIf(enableQuartzShard, output, QUARTZ_SHARD);

                addIf(enableSmokedQuartz, output, SMOKED_QUARTZ);
                addIf(isModdedShardEnabled(enableSmokedQuartz, enableSmokedQuartzShard), output, SMOKED_QUARTZ_SHARD);

                addIf(isModdedShardEnabled(enableBurntQuartz, enableBurntQuartzShard), output, BURNT_QUARTZ, BURNT_QUARTZ_SHARD);

                addIf(enableFiredBricks, output, FIRED_BRICK);

                addIf(enableReinforcedLeather, output, RAW_REINFORCED_LEATHER, REINFORCED_LEATHER);

                addIf(enableEmpoweredNetherite, output, EMPOWERED_NETHERITE, EMPOWERED_NETHERITE_SCRAP);

                addIf(enableBundledSticks, output, BUNDLED_STICKS);
                addIf(enablePileOfPaper, output, PAPER_PILE);
                addIf(enableBaseTemplate, output, BASE_TEMPLATE);

                // --- Tool Heads ---
                addIf(isVanillaHeadsEnabled(enableStoneHeads, true), output,
                        STONE_SWORD_BLADE,
                        STONE_SPEAR_TIP,
                        STONE_PICKAXE_HEAD,
                        STONE_AXE_HEAD,
                        STONE_SHOVEL_HEAD,
                        STONE_HOE_HEAD);

                addIf(isVanillaHeadsEnabled(enableCopperHeads, true), output,
                        COPPER_SWORD_BLADE,
                        COPPER_SPEAR_TIP,
                        COPPER_PICKAXE_HEAD,
                        COPPER_AXE_HEAD,
                        COPPER_SHOVEL_HEAD,
                        COPPER_HOE_HEAD);

                addIf(isVanillaHeadsEnabled(enableIronHeads, true), output,
                        IRON_SWORD_BLADE,
                        IRON_SPEAR_TIP,
                        IRON_PICKAXE_HEAD,
                        IRON_AXE_HEAD,
                        IRON_SHOVEL_HEAD,
                        IRON_HOE_HEAD);

                addIf(isVanillaHeadsEnabled(enableGoldenHeads, true), output,
                        GOLD_SWORD_BLADE,
                        GOLD_SPEAR_TIP,
                        GOLD_PICKAXE_HEAD,
                        GOLD_AXE_HEAD,
                        GOLD_SHOVEL_HEAD,
                        GOLD_HOE_HEAD);

                addIf(isVanillaHeadsEnabled(enableDiamondHeads, true), output,
                        DIAMOND_SWORD_BLADE,
                        DIAMOND_SPEAR_TIP,
                        DIAMOND_PICKAXE_HEAD,
                        DIAMOND_AXE_HEAD,
                        DIAMOND_SHOVEL_HEAD,
                        DIAMOND_HOE_HEAD);

                addIf(isVanillaHeadsEnabled(enableLapisLazuliHeads, enableLapisLazuliTools), output,
                        LAPIS_LAZULI_SWORD_BLADE,
                        LAPIS_LAZULI_SPEAR_TIP,
                        LAPIS_LAZULI_PICKAXE_HEAD,
                        LAPIS_LAZULI_AXE_HEAD,
                        LAPIS_LAZULI_SHOVEL_HEAD,
                        LAPIS_LAZULI_HOE_HEAD);

                addIf(isVanillaHeadsEnabled(enableQuartzHeads, enableQuartzTools), output,
                        QUARTZ_SWORD_BLADE,
                        QUARTZ_SPEAR_TIP,
                        QUARTZ_PICKAXE_HEAD,
                        QUARTZ_AXE_HEAD,
                        QUARTZ_SHOVEL_HEAD,
                        QUARTZ_HOE_HEAD);

                addIf(isModdedHeadsEnabled(enableSmokedQuartz, enableSmokedQuartzHeads, enableSmokedQuartzTools), output,
                        SMOKED_QUARTZ_SWORD_BLADE,
                        SMOKED_QUARTZ_SPEAR_TIP,
                        SMOKED_QUARTZ_PICKAXE_HEAD,
                        SMOKED_QUARTZ_AXE_HEAD,
                        SMOKED_QUARTZ_SHOVEL_HEAD,
                        SMOKED_QUARTZ_HOE_HEAD);

                addIf(isModdedHeadsEnabled(enableBurntQuartz, enableBurntQuartzHeads, enableBurntQuartzTools), output,
                        BURNT_QUARTZ_SWORD_BLADE,
                        BURNT_QUARTZ_SPEAR_TIP,
                        BURNT_QUARTZ_PICKAXE_HEAD,
                        BURNT_QUARTZ_AXE_HEAD,
                        BURNT_QUARTZ_SHOVEL_HEAD,
                        BURNT_QUARTZ_HOE_HEAD);

                addIf(isVanillaHeadsEnabled(enableRedstoneHeads, enableRedstoneTools), output,
                        REDSTONE_SWORD_BLADE,
                        REDSTONE_SPEAR_TIP,
                        REDSTONE_PICKAXE_HEAD,
                        REDSTONE_AXE_HEAD,
                        REDSTONE_SHOVEL_HEAD,
                        REDSTONE_HOE_HEAD);

                addIf(isVanillaHeadsEnabled(enableEmeraldHeads, enableEmeraldTools), output,
                        EMERALD_SWORD_BLADE,
                        EMERALD_SPEAR_TIP,
                        EMERALD_PICKAXE_HEAD,
                        EMERALD_AXE_HEAD,
                        EMERALD_SHOVEL_HEAD,
                        EMERALD_HOE_HEAD);
            }).build());

    public static final CreativeModeTab TVE_TOOLSANDARMOR_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "tve_tools_and_armor"), FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(EMERALD_SWORD))
            .title(Component.translatable("creativetab.vanilla_expansion.tools_and_armor"))
            .displayItems((parameters, output) -> {
                // Tools and Weapons
                addIf(enableLapisLazuliTools, output,
                        LAPIS_LAZULI_SWORD,
                        LAPIS_LAZULI_SPEAR,
                        LAPIS_LAZULI_SHOVEL,
                        LAPIS_LAZULI_PICKAXE,
                        LAPIS_LAZULI_AXE,
                        LAPIS_LAZULI_HOE);

                addIf(enableQuartzTools, output,
                        QUARTZ_SWORD,
                        QUARTZ_SPEAR,
                        QUARTZ_SHOVEL,
                        QUARTZ_PICKAXE,
                        QUARTZ_AXE,
                        QUARTZ_HOE);

                addIf(isModdedToolsEnabled(enableSmokedQuartz, enableSmokedQuartzTools), output,
                        SMOKED_QUARTZ_SWORD,
                        SMOKED_QUARTZ_SPEAR,
                        SMOKED_QUARTZ_SHOVEL,
                        SMOKED_QUARTZ_PICKAXE,
                        SMOKED_QUARTZ_AXE,
                        SMOKED_QUARTZ_HOE);

                addIf(isModdedToolsEnabled(enableBurntQuartz, enableBurntQuartzTools), output,
                        BURNT_QUARTZ_SWORD,
                        BURNT_QUARTZ_SPEAR,
                        BURNT_QUARTZ_SHOVEL,
                        BURNT_QUARTZ_PICKAXE,
                        BURNT_QUARTZ_AXE,
                        BURNT_QUARTZ_HOE);

                addIf(enableRedstoneTools, output,
                        REDSTONE_SWORD,
                        REDSTONE_SPEAR,
                        REDSTONE_SHOVEL,
                        REDSTONE_PICKAXE,
                        REDSTONE_AXE,
                        REDSTONE_HOE);

                addIf(enableEmeraldTools, output,
                        EMERALD_SWORD,
                        EMERALD_SPEAR,
                        EMERALD_SHOVEL,
                        EMERALD_PICKAXE,
                        EMERALD_AXE,
                        EMERALD_HOE);

                addIf(isModdedToolsEnabled(enableEmpoweredNetherite, enableEmpoweredNetheriteTools), output,
                        EMPOWERED_NETHERITE_SWORD,
                        EMPOWERED_NETHERITE_SPEAR,
                        EMPOWERED_NETHERITE_SHOVEL,
                        EMPOWERED_NETHERITE_PICKAXE,
                        EMPOWERED_NETHERITE_AXE,
                        EMPOWERED_NETHERITE_HOE);

                // Armor
                addIf(isModdedArmorEnabled(enableReinforcedLeather, enableReinforcedLeatherArmor), output,
                        REINFORCED_LEATHER_HELMET,
                        REINFORCED_LEATHER_CHESTPLATE,
                        REINFORCED_LEATHER_LEGGINGS,
                        REINFORCED_LEATHER_BOOTS);

                addIf(enableArmadilloScuteArmor, output,
                        ARMADILLO_SCUTE_HELMET,
                        ARMADILLO_SCUTE_CHESTPLATE,
                        ARMADILLO_SCUTE_LEGGINGS,
                        ARMADILLO_SCUTE_BOOTS);

                addIf(enableLapisLazuliArmor, output,
                        LAPIS_LAZULI_HELMET,
                        LAPIS_LAZULI_CHESTPLATE,
                        LAPIS_LAZULI_LEGGINGS,
                        LAPIS_LAZULI_BOOTS);

                addIf(enableEmeraldArmor, output,
                        EMERALD_HELMET,
                        EMERALD_CHESTPLATE,
                        EMERALD_LEGGINGS,
                        EMERALD_BOOTS);

                addIf(isModdedArmorEnabled(enableEmpoweredNetherite, enableEmpoweredNetheriteArmor), output, EMPOWERED_NETHERITE_HELMET, EMPOWERED_NETHERITE_CHESTPLATE, EMPOWERED_NETHERITE_LEGGINGS, EMPOWERED_NETHERITE_BOOTS);
            }).build());

    public static final CreativeModeTab TVE_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "tve_blocks"), FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(CHARCOAL_BLOCK))
            .title(Component.translatable("creativetab.vanilla_expansion.blocks"))
            .displayItems((parameters, output) -> {

                addIf(enableCharcoalBlock, output, CHARCOAL_BLOCK);

                addIf(isBlockSetEnabled(enableBundledSticks, enableBlockOfBundledSticks), output, BUNDLED_STICKS_BLOCK);

                addIf(enableCompactCropBlocks, output,
                        BARREL_OF_APPLES_BLOCK,
                        BARREL_OF_POTATOES_BLOCK,
                        BARREL_OF_CARROTS_BLOCK,
                        BARREL_OF_BEETROOTS_BLOCK,
                        BARREL_OF_SWEETBERRIES_BLOCK,
                        BARREL_OF_CHORUS_BLOCK);

                addIf(enableAddWoodBlockSet, output,
                        OAK_WOOD_STAIRS,
                        OAK_WOOD_SLAB,
                        OAK_WOOD_FENCE,
                        STRIPPED_OAK_WOOD_STAIRS,
                        STRIPPED_OAK_WOOD_SLAB,
                        STRIPPED_OAK_WOOD_FENCE,

                        BIRCH_WOOD_STAIRS,
                        BIRCH_WOOD_SLAB,
                        BIRCH_WOOD_FENCE,
                        STRIPPED_BIRCH_WOOD_STAIRS,
                        STRIPPED_BIRCH_WOOD_SLAB,
                        STRIPPED_BIRCH_WOOD_FENCE,

                        SPRUCE_WOOD_STAIRS,
                        SPRUCE_WOOD_SLAB,
                        SPRUCE_WOOD_FENCE,
                        STRIPPED_SPRUCE_WOOD_STAIRS,
                        STRIPPED_SPRUCE_WOOD_SLAB,
                        STRIPPED_SPRUCE_WOOD_FENCE,

                        JUNGLE_WOOD_STAIRS,
                        JUNGLE_WOOD_SLAB,
                        JUNGLE_WOOD_FENCE,
                        STRIPPED_JUNGLE_WOOD_STAIRS,
                        STRIPPED_JUNGLE_WOOD_SLAB,
                        STRIPPED_JUNGLE_WOOD_FENCE,

                        ACACIA_WOOD_STAIRS,
                        ACACIA_WOOD_SLAB,
                        ACACIA_WOOD_FENCE,
                        STRIPPED_ACACIA_WOOD_STAIRS,
                        STRIPPED_ACACIA_WOOD_SLAB,
                        STRIPPED_ACACIA_WOOD_FENCE,

                        DARK_OAK_WOOD_STAIRS,
                        DARK_OAK_WOOD_SLAB,
                        DARK_OAK_WOOD_FENCE,
                        STRIPPED_DARK_OAK_WOOD_STAIRS,
                        STRIPPED_DARK_OAK_WOOD_SLAB,
                        STRIPPED_DARK_OAK_WOOD_FENCE,

                        MANGROVE_WOOD_STAIRS,
                        MANGROVE_WOOD_SLAB,
                        MANGROVE_WOOD_FENCE,
                        STRIPPED_MANGROVE_WOOD_STAIRS,
                        STRIPPED_MANGROVE_WOOD_SLAB,
                        STRIPPED_MANGROVE_WOOD_FENCE,

                        CHERRY_WOOD_STAIRS,
                        CHERRY_WOOD_SLAB,
                        CHERRY_WOOD_FENCE,
                        STRIPPED_CHERRY_WOOD_STAIRS,
                        STRIPPED_CHERRY_WOOD_SLAB,
                        STRIPPED_CHERRY_WOOD_FENCE,

                        PALE_OAK_WOOD_STAIRS,
                        PALE_OAK_WOOD_SLAB,
                        PALE_OAK_WOOD_FENCE,
                        STRIPPED_PALE_OAK_WOOD_STAIRS,
                        STRIPPED_PALE_OAK_WOOD_SLAB,
                        STRIPPED_PALE_OAK_WOOD_FENCE,

                        POPLAR_WOOD_STAIRS,
                        POPLAR_WOOD_SLAB,
                        POPLAR_WOOD_FENCE,
                        STRIPPED_POPLAR_WOOD_STAIRS,
                        STRIPPED_POPLAR_WOOD_SLAB,
                        STRIPPED_POPLAR_WOOD_FENCE,

                        CRIMSON_HYPHAE_STAIRS,
                        CRIMSON_HYPHAE_SLAB,
                        CRIMSON_HYPHAE_FENCE,
                        STRIPPED_CRIMSON_HYPHAE_STAIRS,
                        STRIPPED_CRIMSON_HYPHAE_SLAB,
                        STRIPPED_CRIMSON_HYPHAE_FENCE,

                        WARPED_HYPHAE_STAIRS,
                        WARPED_HYPHAE_SLAB,
                        WARPED_HYPHAE_FENCE,
                        STRIPPED_WARPED_HYPHAE_STAIRS,
                        STRIPPED_WARPED_HYPHAE_SLAB,
                        STRIPPED_WARPED_HYPHAE_FENCE
                );

                addIf(enableEmpoweredNetherite, output, EMPOWERED_NETHERITE_BLOCK);
                addIf(isBlockSetEnabled(enableFiredBricks, enableFiredBricksBlockSet), output, FIRED_BRICKS, FIRED_BRICK_STAIRS, FIRED_BRICK_SLAB, FIRED_BRICK_WALL);
                addIf(enableAddSmoothStoneBlockSet, output, SMOOTH_STONE_STAIRS, SMOOTH_STONE_WALL);
                addIf(enableAddSmoothSandstoneBlockSet, output, SMOOTH_SANDSTONE_WALL);
                addIf(enableAddSmoothRedSandstoneBlockSet, output, SMOOTH_RED_SANDSTONE_WALL);
                addIf(enableAddCutSandstoneBlockSet, output, CUT_SANDSTONE_STAIRS, CUT_SANDSTONE_WALL);
                addIf(enableAddCutRedSandstoneBlockSet, output, CUT_RED_SANDSTONE_STAIRS, CUT_RED_SANDSTONE_WALL);
                addIf(enableAddQuartzBlockSet, output, QUARTZ_WALL, SMOOTH_QUARTZ_WALL, QUARTZ_BRICK_STAIRS, QUARTZ_BRICK_SLAB, QUARTZ_BRICK_WALL);

                addIf(isBlockSetEnabled(enableSmokedQuartz, enableSmokedQuartzBlockSet), output,
                        SMOKED_QUARTZ_BLOCK,
                        SMOKED_QUARTZ_STAIRS,
                        SMOKED_QUARTZ_SLAB,
                        SMOKED_QUARTZ_WALL,
                        CHISELED_SMOKED_QUARTZ_BLOCK,
                        SMOKED_QUARTZ_BRICKS,
                        SMOKED_QUARTZ_BRICK_STAIRS,
                        SMOKED_QUARTZ_BRICK_SLAB,
                        SMOKED_QUARTZ_BRICK_WALL,
                        SMOKED_QUARTZ_PILLAR,
                        SMOOTH_SMOKED_QUARTZ,
                        SMOOTH_SMOKED_QUARTZ_STAIRS,
                        SMOOTH_SMOKED_QUARTZ_SLAB,
                        SMOOTH_SMOKED_QUARTZ_WALL);

                addIf(isBlockSetEnabled(enableBurntQuartz, enableBurntQuartzBlockSet), output,
                        BURNT_QUARTZ_BLOCK,
                        BURNT_QUARTZ_STAIRS,
                        BURNT_QUARTZ_SLAB,
                        BURNT_QUARTZ_WALL,
                        CHISELED_BURNT_QUARTZ_BLOCK,
                        BURNT_QUARTZ_BRICKS,
                        BURNT_QUARTZ_BRICK_STAIRS,
                        BURNT_QUARTZ_BRICK_SLAB,
                        BURNT_QUARTZ_BRICK_WALL,
                        BURNT_QUARTZ_PILLAR,
                        SMOOTH_BURNT_QUARTZ,
                        SMOOTH_BURNT_QUARTZ_STAIRS,
                        SMOOTH_BURNT_QUARTZ_SLAB,
                        SMOOTH_BURNT_QUARTZ_WALL);

                // --- Colored Blocks Loops ---
                if (enableAddWoolBlockSet) {
                    for (DyeColor color : DyeColor.values()) {
                        output.accept(DYED_WOOL_WALL.get(color));
                    }
                }

                if (enableAddTerracottaBlockSet) {
                    output.accept(TERRACOTTA_STAIRS);
                    output.accept(TERRACOTTA_SLAB);
                    output.accept(TERRACOTTA_WALL);
                    for (DyeColor color : DyeColor.values()) {
                        output.accept(DYED_TERRACOTTA_STAIRS.get(color));
                        output.accept(DYED_TERRACOTTA_SLAB.get(color));
                        output.accept(DYED_TERRACOTTA_WALL.get(color));
                    }
                }

                if (enableAddConcreteBlockSet) {
                    for (DyeColor color : DyeColor.values()) {
                        output.accept(DYED_CONCRETE_WALL.get(color));
                    }
                }
            }).build());

    public static void registerModCreativeTabs() {
        VanillaExpansion.LOGGER.info("Registering Creative Mode Tabs for " + VanillaExpansion.MOD_ID);
    }

    private static void addIf(boolean condition, CreativeModeTab.Output output, ItemLike... items) {
        if (condition) {
            for (ItemLike item : items) {
                output.accept(item);
            }
        }
    }
}