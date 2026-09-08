package net.winkeyface14.vanilla_expansion.creativetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.winkeyface14.vanilla_expansion.VanillaExpansion;
import net.winkeyface14.vanilla_expansion.block.BlockRegHandler;
import net.winkeyface14.vanilla_expansion.item.ItemRegHandler;

import static net.winkeyface14.vanilla_expansion.util.ConfigHandler.*;

public class CreativeTab {
    public static final CreativeModeTab TVE_ITEMS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "tve_items"), FabricCreativeModeTab.builder().icon(() -> new ItemStack(ItemRegHandler.COAL_CHUNK))
            .title(Component.translatable("creativetab.vanilla_expansion.items"))
            .displayItems((parameters, output) -> {
                if(enableCoalChunk)output.accept(ItemRegHandler.COAL_CHUNK);
                if(enableCharcoalChunk)output.accept(ItemRegHandler.CHARCOAL_CHUNK);

                if(enableDiamondShard)output.accept(ItemRegHandler.DIAMOND_SHARD);
                if(enableEmeraldShard)output.accept(ItemRegHandler.EMERALD_SHARD);
                if(enableQuartzShard)output.accept(ItemRegHandler.QUARTZ_SHARD);

                if(enableSmokedQuartz)output.accept(ItemRegHandler.SMOKED_QUARTZ);
                if(isModdedShardEnabled(enableSmokedQuartz, enableSmokedQuartzShard)) {
                    output.accept(ItemRegHandler.SMOKED_QUARTZ_SHARD);
                }

                if(isModdedShardEnabled(enableBurntQuartz, enableBurntQuartzShard)) {
                    output.accept(ItemRegHandler.BURNT_QUARTZ);
                    output.accept(ItemRegHandler.BURNT_QUARTZ_SHARD);
                }

                if(enableFiredBricks)output.accept(ItemRegHandler.FIRED_BRICK);

                if(enableReinforcedLeather){
                    output.accept(ItemRegHandler.RAW_REINFORCED_LEATHER);
                    output.accept(ItemRegHandler.REINFORCED_LEATHER);
                }

                if (enableEmpoweredNetherite)output.accept(ItemRegHandler.EMPOWERED_NETHERITE);
                if (enableEmpoweredNetherite)output.accept(ItemRegHandler.EMPOWERED_NETHERITE_SCRAP);

                if (enableBundledSticks)output.accept(ItemRegHandler.BUNDLED_STICKS);
                if (enablePileOfPaper)output.accept(ItemRegHandler.PAPER_PILE);

                if (enableBaseTemplate){
                    output.accept(ItemRegHandler.BASE_TEMPLATE);
                }

                if (isVanillaHeadsEnabled(enableStoneHeads, true)){
                    output.accept(ItemRegHandler.STONE_SWORD_BLADE);
                    output.accept(ItemRegHandler.STONE_SPEAR_TIP);
                    output.accept(ItemRegHandler.STONE_PICKAXE_HEAD);
                    output.accept(ItemRegHandler.STONE_AXE_HEAD);
                    output.accept(ItemRegHandler.STONE_SHOVEL_HEAD);
                    output.accept(ItemRegHandler.STONE_HOE_HEAD);
                }

                if (isVanillaHeadsEnabled(enableCopperHeads, true)){
                    output.accept(ItemRegHandler.COPPER_SWORD_BLADE);
                    output.accept(ItemRegHandler.COPPER_SPEAR_TIP);
                    output.accept(ItemRegHandler.COPPER_PICKAXE_HEAD);
                    output.accept(ItemRegHandler.COPPER_AXE_HEAD);
                    output.accept(ItemRegHandler.COPPER_SHOVEL_HEAD);
                    output.accept(ItemRegHandler.COPPER_HOE_HEAD);
                }

                if (isVanillaHeadsEnabled(enableIronHeads, true)){
                    output.accept(ItemRegHandler.IRON_SWORD_BLADE);
                    output.accept(ItemRegHandler.IRON_SPEAR_TIP);
                    output.accept(ItemRegHandler.IRON_PICKAXE_HEAD);
                    output.accept(ItemRegHandler.IRON_AXE_HEAD);
                    output.accept(ItemRegHandler.IRON_SHOVEL_HEAD);
                    output.accept(ItemRegHandler.IRON_HOE_HEAD);
                }

                if (isVanillaHeadsEnabled(enableGoldenHeads, true)){
                    output.accept(ItemRegHandler.GOLD_SWORD_BLADE);
                    output.accept(ItemRegHandler.GOLD_SPEAR_TIP);
                    output.accept(ItemRegHandler.GOLD_PICKAXE_HEAD);
                    output.accept(ItemRegHandler.GOLD_AXE_HEAD);
                    output.accept(ItemRegHandler.GOLD_SHOVEL_HEAD);
                    output.accept(ItemRegHandler.GOLD_HOE_HEAD);
                }

                if (isVanillaHeadsEnabled(enableDiamondHeads, true)){
                    output.accept(ItemRegHandler.DIAMOND_SWORD_BLADE);
                    output.accept(ItemRegHandler.DIAMOND_SPEAR_TIP);
                    output.accept(ItemRegHandler.DIAMOND_PICKAXE_HEAD);
                    output.accept(ItemRegHandler.DIAMOND_AXE_HEAD);
                    output.accept(ItemRegHandler.DIAMOND_SHOVEL_HEAD);
                    output.accept(ItemRegHandler.DIAMOND_HOE_HEAD);
                }

                if (isVanillaHeadsEnabled(enableLapisLazuliHeads, enableLapisLazuliTools)){
                    output.accept(ItemRegHandler.LAPIS_LAZULI_SWORD_BLADE);
                    output.accept(ItemRegHandler.LAPIS_LAZULI_SPEAR_TIP);
                    output.accept(ItemRegHandler.LAPIS_LAZULI_PICKAXE_HEAD);
                    output.accept(ItemRegHandler.LAPIS_LAZULI_AXE_HEAD);
                    output.accept(ItemRegHandler.LAPIS_LAZULI_SHOVEL_HEAD);
                    output.accept(ItemRegHandler.LAPIS_LAZULI_HOE_HEAD);
                }

                if (isVanillaHeadsEnabled(enableQuartzHeads, enableQuartzTools)){
                    output.accept(ItemRegHandler.QUARTZ_SWORD_BLADE);
                    output.accept(ItemRegHandler.QUARTZ_SPEAR_TIP);
                    output.accept(ItemRegHandler.QUARTZ_PICKAXE_HEAD);
                    output.accept(ItemRegHandler.QUARTZ_AXE_HEAD);
                    output.accept(ItemRegHandler.QUARTZ_SHOVEL_HEAD);
                    output.accept(ItemRegHandler.QUARTZ_HOE_HEAD);
                }

                if (isModdedHeadsEnabled(enableSmokedQuartz, enableSmokedQuartzHeads, enableSmokedQuartzTools)){
                    output.accept(ItemRegHandler.SMOKED_QUARTZ_SWORD_BLADE);
                    output.accept(ItemRegHandler.SMOKED_QUARTZ_SPEAR_TIP);
                    output.accept(ItemRegHandler.SMOKED_QUARTZ_PICKAXE_HEAD);
                    output.accept(ItemRegHandler.SMOKED_QUARTZ_AXE_HEAD);
                    output.accept(ItemRegHandler.SMOKED_QUARTZ_SHOVEL_HEAD);
                    output.accept(ItemRegHandler.SMOKED_QUARTZ_HOE_HEAD);
                }

                if (isModdedHeadsEnabled(enableBurntQuartz, enableBurntQuartzHeads, enableBurntQuartzTools)){
                    output.accept(ItemRegHandler.BURNT_QUARTZ_SWORD_BLADE);
                    output.accept(ItemRegHandler.BURNT_QUARTZ_SPEAR_TIP);
                    output.accept(ItemRegHandler.BURNT_QUARTZ_PICKAXE_HEAD);
                    output.accept(ItemRegHandler.BURNT_QUARTZ_AXE_HEAD);
                    output.accept(ItemRegHandler.BURNT_QUARTZ_SHOVEL_HEAD);
                    output.accept(ItemRegHandler.BURNT_QUARTZ_HOE_HEAD);
                }

                if (isVanillaHeadsEnabled(enableRedstoneHeads, enableRedstoneTools)){
                    output.accept(ItemRegHandler.REDSTONE_SWORD_BLADE);
                    output.accept(ItemRegHandler.REDSTONE_SPEAR_TIP);
                    output.accept(ItemRegHandler.REDSTONE_PICKAXE_HEAD);
                    output.accept(ItemRegHandler.REDSTONE_AXE_HEAD);
                    output.accept(ItemRegHandler.REDSTONE_SHOVEL_HEAD);
                    output.accept(ItemRegHandler.REDSTONE_HOE_HEAD);
                }

                if (isVanillaHeadsEnabled(enableEmeraldHeads, enableEmeraldTools)){
                    output.accept(ItemRegHandler.EMERALD_SWORD_BLADE);
                    output.accept(ItemRegHandler.EMERALD_SPEAR_TIP);
                    output.accept(ItemRegHandler.EMERALD_PICKAXE_HEAD);
                    output.accept(ItemRegHandler.EMERALD_AXE_HEAD);
                    output.accept(ItemRegHandler.EMERALD_SHOVEL_HEAD);
                    output.accept(ItemRegHandler.EMERALD_HOE_HEAD);
                }
            }).build());

    public static final CreativeModeTab TVE_TOOLSANDARMOR_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "tve_tools_and_armor"), FabricCreativeModeTab.builder().icon(() -> new ItemStack(ItemRegHandler.EMERALD_SWORD))
            .title(Component.translatable("creativetab.vanilla_expansion.tools_and_armor"))
            .displayItems((parameters, output) -> {
                if(enableLapisLazuliTools){
                    output.accept(ItemRegHandler.LAPIS_LAZULI_SWORD);
                    output.accept(ItemRegHandler.LAPIS_LAZULI_SPEAR);
                    output.accept(ItemRegHandler.LAPIS_LAZULI_SHOVEL);
                    output.accept(ItemRegHandler.LAPIS_LAZULI_PICKAXE);
                    output.accept(ItemRegHandler.LAPIS_LAZULI_AXE);
                    output.accept(ItemRegHandler.LAPIS_LAZULI_HOE);
                }

                if (enableQuartzTools){
                    output.accept(ItemRegHandler.QUARTZ_SWORD);
                    output.accept(ItemRegHandler.QUARTZ_SPEAR);
                    output.accept(ItemRegHandler.QUARTZ_SHOVEL);
                    output.accept(ItemRegHandler.QUARTZ_PICKAXE);
                    output.accept(ItemRegHandler.QUARTZ_AXE);
                    output.accept(ItemRegHandler.QUARTZ_HOE);
                }

                if (isModdedToolsEnabled(enableSmokedQuartz, enableSmokedQuartzTools)){
                    output.accept(ItemRegHandler.SMOKED_QUARTZ_SWORD);
                    output.accept(ItemRegHandler.SMOKED_QUARTZ_SPEAR);
                    output.accept(ItemRegHandler.SMOKED_QUARTZ_SHOVEL);
                    output.accept(ItemRegHandler.SMOKED_QUARTZ_PICKAXE);
                    output.accept(ItemRegHandler.SMOKED_QUARTZ_AXE);
                    output.accept(ItemRegHandler.SMOKED_QUARTZ_HOE);
                }

                if (isModdedToolsEnabled(enableBurntQuartz, enableBurntQuartzTools)){
                    output.accept(ItemRegHandler.BURNT_QUARTZ_SWORD);
                    output.accept(ItemRegHandler.BURNT_QUARTZ_SPEAR);
                    output.accept(ItemRegHandler.BURNT_QUARTZ_SHOVEL);
                    output.accept(ItemRegHandler.BURNT_QUARTZ_PICKAXE);
                    output.accept(ItemRegHandler.BURNT_QUARTZ_AXE);
                    output.accept(ItemRegHandler.BURNT_QUARTZ_HOE);
                }

                if (enableRedstoneTools){
                    output.accept(ItemRegHandler.REDSTONE_SWORD);
                    output.accept(ItemRegHandler.REDSTONE_SPEAR);
                    output.accept(ItemRegHandler.REDSTONE_SHOVEL);
                    output.accept(ItemRegHandler.REDSTONE_PICKAXE);
                    output.accept(ItemRegHandler.REDSTONE_AXE);
                    output.accept(ItemRegHandler.REDSTONE_HOE);
                }

                if (enableEmeraldTools){
                    output.accept(ItemRegHandler.EMERALD_SWORD);
                    output.accept(ItemRegHandler.EMERALD_SPEAR);
                    output.accept(ItemRegHandler.EMERALD_SHOVEL);
                    output.accept(ItemRegHandler.EMERALD_PICKAXE);
                    output.accept(ItemRegHandler.EMERALD_AXE);
                    output.accept(ItemRegHandler.EMERALD_HOE);
                }

                if (isModdedToolsEnabled(enableEmpoweredNetherite, enableEmpoweredNetheriteTools)){
                    output.accept(ItemRegHandler.EMPOWERED_NETHERITE_SWORD);
                    output.accept(ItemRegHandler.EMPOWERED_NETHERITE_SPEAR);
                    output.accept(ItemRegHandler.EMPOWERED_NETHERITE_SHOVEL);
                    output.accept(ItemRegHandler.EMPOWERED_NETHERITE_PICKAXE);
                    output.accept(ItemRegHandler.EMPOWERED_NETHERITE_AXE);
                    output.accept(ItemRegHandler.EMPOWERED_NETHERITE_HOE);
                }

                if (isModdedArmorEnabled(enableReinforcedLeather, enableReinforcedLeatherArmor)){
                    output.accept(ItemRegHandler.REINFORCED_LEATHER_HELMET);
                    output.accept(ItemRegHandler.REINFORCED_LEATHER_CHESTPLATE);
                    output.accept(ItemRegHandler.REINFORCED_LEATHER_LEGGINGS);
                    output.accept(ItemRegHandler.REINFORCED_LEATHER_BOOTS);
                }

                if (enableArmadilloScuteArmor){
                    output.accept(ItemRegHandler.ARMADILLO_SCUTE_HELMET);
                    output.accept(ItemRegHandler.ARMADILLO_SCUTE_CHESTPLATE);
                    output.accept(ItemRegHandler.ARMADILLO_SCUTE_LEGGINGS);
                    output.accept(ItemRegHandler.ARMADILLO_SCUTE_BOOTS);
                }

                if (enableLapisLazuliArmor){
                    output.accept(ItemRegHandler.LAPIS_LAZULI_HELMET);
                    output.accept(ItemRegHandler.LAPIS_LAZULI_CHESTPLATE);
                    output.accept(ItemRegHandler.LAPIS_LAZULI_LEGGINGS);
                    output.accept(ItemRegHandler.LAPIS_LAZULI_BOOTS);
                }

                if (enableEmeraldArmor){
                    output.accept(ItemRegHandler.EMERALD_HELMET);
                    output.accept(ItemRegHandler.EMERALD_CHESTPLATE);
                    output.accept(ItemRegHandler.EMERALD_LEGGINGS);
                    output.accept(ItemRegHandler.EMERALD_BOOTS);
                }

                if (isModdedArmorEnabled(enableEmpoweredNetherite, enableEmpoweredNetheriteArmor)){
                    output.accept(ItemRegHandler.EMPOWERED_NETHERITE_HELMET);
                    output.accept(ItemRegHandler.EMPOWERED_NETHERITE_CHESTPLATE);
                    output.accept(ItemRegHandler.EMPOWERED_NETHERITE_LEGGINGS);
                    output.accept(ItemRegHandler.EMPOWERED_NETHERITE_BOOTS);
                }
            }).build());

    public static final CreativeModeTab TVE_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "tve_blocks"), FabricCreativeModeTab.builder().icon(() -> new ItemStack(BlockRegHandler.CHARCOAL_BLOCK))
            .title(Component.translatable("creativetab.vanilla_expansion.blocks"))
            .displayItems((parameters, output) -> {
                if (enableCharcoalBlock){
                    output.accept(BlockRegHandler.CHARCOAL_BLOCK);
                }
                if(isBlockSetEnabled(enableBundledSticks, enableBlockOfBundledSticks)){
                    output.accept(BlockRegHandler.BUNDLED_STICKS_BLOCK);
                }

                if (enableCompactCropBlocks){
                    output.accept(BlockRegHandler.BARREL_OF_APPLES_BLOCK);
                    output.accept(BlockRegHandler.BARREL_OF_POTATOES_BLOCK);
                    output.accept(BlockRegHandler.BARREL_OF_CARROTS_BLOCK);
                    output.accept(BlockRegHandler.BARREL_OF_BEETROOTS_BLOCK);
                    output.accept(BlockRegHandler.BARREL_OF_SWEETBERRIES_BLOCK);
                    output.accept(BlockRegHandler.BARREL_OF_CHORUS_BLOCK);
                }

                if (enableEmpoweredNetherite)output.accept(BlockRegHandler.EMPOWERED_NETHERITE_BLOCK);

                if (isBlockSetEnabled(enableFiredBricks, enableFiredBricksBlockSet)){
                    output.accept(BlockRegHandler.FIRED_BRICKS);
                    output.accept(BlockRegHandler.FIRED_BRICK_STAIRS);
                    output.accept(BlockRegHandler.FIRED_BRICK_SLAB);
                    output.accept(BlockRegHandler.FIRED_BRICK_WALL);
                }

                if(enableAddSmoothStoneBlockSet){
                    output.accept(BlockRegHandler.SMOOTH_STONE_STAIRS);
                    output.accept(BlockRegHandler.SMOOTH_STONE_WALL);
                }

                if(enableAddSmoothSandstoneBlockSet)output.accept(BlockRegHandler.SMOOTH_SANDSTONE_WALL);
                if(enableAddSmoothRedSandstoneBlockSet)output.accept(BlockRegHandler.SMOOTH_RED_SANDSTONE_WALL);

                if(enableAddCutSandstoneBlockSet){
                    output.accept(BlockRegHandler.CUT_SANDSTONE_STAIRS);
                    output.accept(BlockRegHandler.CUT_SANDSTONE_WALL);
                }

                if(enableAddCutRedSandstoneBlockSet){
                    output.accept(BlockRegHandler.CUT_RED_SANDSTONE_STAIRS);
                    output.accept(BlockRegHandler.CUT_RED_SANDSTONE_WALL);
                }

                if(enableAddQuartzBlockSet){
                    output.accept(BlockRegHandler.QUARTZ_WALL);
                    output.accept(BlockRegHandler.SMOOTH_QUARTZ_WALL);
                    output.accept(BlockRegHandler.QUARTZ_BRICK_STAIRS);
                    output.accept(BlockRegHandler.QUARTZ_BRICK_SLAB);
                    output.accept(BlockRegHandler.QUARTZ_BRICK_WALL);
                }

                if(isBlockSetEnabled(enableSmokedQuartz, enableSmokedQuartzBlockSet)){
                    output.accept(BlockRegHandler.SMOKED_QUARTZ_BLOCK);
                    output.accept(BlockRegHandler.SMOKED_QUARTZ_STAIRS);
                    output.accept(BlockRegHandler.SMOKED_QUARTZ_SLAB);
                    output.accept(BlockRegHandler.SMOKED_QUARTZ_WALL);

                    output.accept(BlockRegHandler.CHISELED_SMOKED_QUARTZ_BLOCK);
                    output.accept(BlockRegHandler.SMOKED_QUARTZ_BRICKS);
                    output.accept(BlockRegHandler.SMOKED_QUARTZ_BRICK_STAIRS);
                    output.accept(BlockRegHandler.SMOKED_QUARTZ_BRICK_SLAB);
                    output.accept(BlockRegHandler.SMOKED_QUARTZ_BRICK_WALL);

                    output.accept(BlockRegHandler.SMOKED_QUARTZ_PILLAR);

                    output.accept(BlockRegHandler.SMOOTH_SMOKED_QUARTZ);
                    output.accept(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_STAIRS);
                    output.accept(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_SLAB);
                    output.accept(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_WALL);
                }

                if(isBlockSetEnabled(enableBurntQuartz, enableBurntQuartzBlockSet)){
                    output.accept(BlockRegHandler.BURNT_QUARTZ_BLOCK);
                    output.accept(BlockRegHandler.BURNT_QUARTZ_STAIRS);
                    output.accept(BlockRegHandler.BURNT_QUARTZ_SLAB);
                    output.accept(BlockRegHandler.BURNT_QUARTZ_WALL);

                    output.accept(BlockRegHandler.CHISELED_BURNT_QUARTZ_BLOCK);
                    output.accept(BlockRegHandler.BURNT_QUARTZ_BRICKS);
                    output.accept(BlockRegHandler.BURNT_QUARTZ_BRICK_STAIRS);
                    output.accept(BlockRegHandler.BURNT_QUARTZ_BRICK_SLAB);
                    output.accept(BlockRegHandler.BURNT_QUARTZ_BRICK_WALL);

                    output.accept(BlockRegHandler.BURNT_QUARTZ_PILLAR);

                    output.accept(BlockRegHandler.SMOOTH_BURNT_QUARTZ);
                    output.accept(BlockRegHandler.SMOOTH_BURNT_QUARTZ_STAIRS);
                    output.accept(BlockRegHandler.SMOOTH_BURNT_QUARTZ_SLAB);
                    output.accept(BlockRegHandler.SMOOTH_BURNT_QUARTZ_WALL);
                }

                if(enableAddWoolBlockSet){
                    for (DyeColor color : DyeColor.values()){
                        output.accept(BlockRegHandler.DYED_WOOL_STAIRS.get(color));
                        output.accept(BlockRegHandler.DYED_WOOL_SLAB.get(color));
                        output.accept(BlockRegHandler.DYED_WOOL_WALL.get(color));
                    }
                }

                if(enableAddTerracottaBlockSet){
                    output.accept(BlockRegHandler.TERRACOTTA_STAIRS);
                    output.accept(BlockRegHandler.TERRACOTTA_SLAB);
                    output.accept(BlockRegHandler.TERRACOTTA_WALL);
                    for (DyeColor color : DyeColor.values()){
                        output.accept(BlockRegHandler.DYED_TERRACOTTA_STAIRS.get(color));
                        output.accept(BlockRegHandler.DYED_TERRACOTTA_SLAB.get(color));
                        output.accept(BlockRegHandler.DYED_TERRACOTTA_WALL.get(color));
                    }
                }

                if(enableAddConcreteBlockSet){
                    for (DyeColor color : DyeColor.values()){
                        output.accept(BlockRegHandler.DYED_CONCRETE_STAIRS.get(color));
                        output.accept(BlockRegHandler.DYED_CONCRETE_SLAB.get(color));
                        output.accept(BlockRegHandler.DYED_CONCRETE_WALL.get(color));
                    }
                }

            }).build());


    public static void registerModCreativeTabs(){
        VanillaExpansion.LOGGER.info("Registering Creative Mode Tabs for " + VanillaExpansion.MOD_ID);
    }
}
