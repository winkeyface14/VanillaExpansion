package net.winkeyface14.vanilla_expansion.creativetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.winkeyface14.vanilla_expansion.TheVanillaExpansion;
import net.winkeyface14.vanilla_expansion.block.BlockRegHandler;
import net.winkeyface14.vanilla_expansion.item.ItemRegHandler;

public class CreativeTab {
    public static final CreativeModeTab TVE_ITEMS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(TheVanillaExpansion.MOD_ID, "tve_items"), FabricCreativeModeTab.builder().icon(() -> new ItemStack(ItemRegHandler.COAL_CHUNK))
            .title(Component.translatable("creativetab.vanilla_expansion.items"))
            .displayItems((parameters, output) -> {
                output.accept(ItemRegHandler.COAL_CHUNK);
                output.accept(ItemRegHandler.CHARCOAL_CHUNK);
                output.accept(ItemRegHandler.BUNDLED_STICKS);
                output.accept(ItemRegHandler.DIAMOND_SHARD);
                output.accept(ItemRegHandler.EMERALD_SHARD);
                output.accept(ItemRegHandler.SMOKED_QUARTZ);
                output.accept(ItemRegHandler.BURNT_QUARTZ);
                output.accept(ItemRegHandler.QUARTZ_SHARD);
                output.accept(ItemRegHandler.SMOKED_QUARTZ_SHARD);
                output.accept(ItemRegHandler.BURNT_QUARTZ_SHARD);
                output.accept(ItemRegHandler.RAW_REINFORCED_LEATHER);
                output.accept(ItemRegHandler.REINFORCED_LEATHER);
                output.accept(ItemRegHandler.EMPOWERED_NETHERITE);
                output.accept(ItemRegHandler.EMPOWERED_NETHERITE_SCRAP);
                output.accept(ItemRegHandler.PAPER_PILE);
                output.accept(ItemRegHandler.FIRED_BRICK);
            }).build());

    public static final CreativeModeTab TVE_TOOLSANDARMOR_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(TheVanillaExpansion.MOD_ID, "tve_tools_and_armor"), FabricCreativeModeTab.builder().icon(() -> new ItemStack(ItemRegHandler.STONE_PICKAXE_HEAD))
            .title(Component.translatable("creativetab.vanilla_expansion.tools_and_armor"))
            .displayItems((parameters, output) -> {
                output.accept(ItemRegHandler.QUARTZ_SWORD);
                output.accept(ItemRegHandler.QUARTZ_SHOVEL);
                output.accept(ItemRegHandler.QUARTZ_PICKAXE);
                output.accept(ItemRegHandler.QUARTZ_AXE);
                output.accept(ItemRegHandler.QUARTZ_HOE);

                output.accept(ItemRegHandler.SMOKED_QUARTZ_SWORD);
                output.accept(ItemRegHandler.SMOKED_QUARTZ_SHOVEL);
                output.accept(ItemRegHandler.SMOKED_QUARTZ_PICKAXE);
                output.accept(ItemRegHandler.SMOKED_QUARTZ_AXE);
                output.accept(ItemRegHandler.SMOKED_QUARTZ_HOE);

                output.accept(ItemRegHandler.BURNT_QUARTZ_SWORD);
                output.accept(ItemRegHandler.BURNT_QUARTZ_SHOVEL);
                output.accept(ItemRegHandler.BURNT_QUARTZ_PICKAXE);
                output.accept(ItemRegHandler.BURNT_QUARTZ_AXE);
                output.accept(ItemRegHandler.BURNT_QUARTZ_HOE);

                output.accept(ItemRegHandler.REDSTONE_SWORD);
                output.accept(ItemRegHandler.REDSTONE_SHOVEL);
                output.accept(ItemRegHandler.REDSTONE_PICKAXE);
                output.accept(ItemRegHandler.REDSTONE_AXE);
                output.accept(ItemRegHandler.REDSTONE_HOE);

                output.accept(ItemRegHandler.LAPIS_LAZULI_SWORD);
                output.accept(ItemRegHandler.LAPIS_LAZULI_SHOVEL);
                output.accept(ItemRegHandler.LAPIS_LAZULI_PICKAXE);
                output.accept(ItemRegHandler.LAPIS_LAZULI_AXE);
                output.accept(ItemRegHandler.LAPIS_LAZULI_HOE);

                output.accept(ItemRegHandler.EMERALD_SWORD);
                output.accept(ItemRegHandler.EMERALD_SHOVEL);
                output.accept(ItemRegHandler.EMERALD_PICKAXE);
                output.accept(ItemRegHandler.EMERALD_AXE);
                output.accept(ItemRegHandler.EMERALD_HOE);

                output.accept(ItemRegHandler.EMPOWERED_NETHERITE_SWORD);
                output.accept(ItemRegHandler.EMPOWERED_NETHERITE_SHOVEL);
                output.accept(ItemRegHandler.EMPOWERED_NETHERITE_PICKAXE);
                output.accept(ItemRegHandler.EMPOWERED_NETHERITE_AXE);
                output.accept(ItemRegHandler.EMPOWERED_NETHERITE_HOE);

                output.accept(ItemRegHandler.REINFORCED_LEATHER_HELMET);
                output.accept(ItemRegHandler.REINFORCED_LEATHER_CHESTPLATE);
                output.accept(ItemRegHandler.REINFORCED_LEATHER_LEGGINGS);
                output.accept(ItemRegHandler.REINFORCED_LEATHER_BOOTS);

                output.accept(ItemRegHandler.LAPIS_LAZULI_HELMET);
                output.accept(ItemRegHandler.LAPIS_LAZULI_CHESTPLATE);
                output.accept(ItemRegHandler.LAPIS_LAZULI_LEGGINGS);
                output.accept(ItemRegHandler.LAPIS_LAZULI_BOOTS);

                output.accept(ItemRegHandler.EMERALD_HELMET);
                output.accept(ItemRegHandler.EMERALD_CHESTPLATE);
                output.accept(ItemRegHandler.EMERALD_LEGGINGS);
                output.accept(ItemRegHandler.EMERALD_BOOTS);

                output.accept(ItemRegHandler.EMPOWERED_NETHERITE_HELMET);
                output.accept(ItemRegHandler.EMPOWERED_NETHERITE_CHESTPLATE);
                output.accept(ItemRegHandler.EMPOWERED_NETHERITE_LEGGINGS);
                output.accept(ItemRegHandler.EMPOWERED_NETHERITE_BOOTS);
            }).build());

    public static final CreativeModeTab TVE_TEMPLATES_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(TheVanillaExpansion.MOD_ID, "tve_templates"), FabricCreativeModeTab.builder().icon(() -> new ItemStack(ItemRegHandler.STONE_PICKAXE_HEAD))
            .title(Component.translatable("creativetab.vanilla_expansion.templates"))
            .displayItems((parameters, output) -> {
                output.accept(ItemRegHandler.BASE_TEMPLATE);

                output.accept(ItemRegHandler.STONE_SWORD_BLADE);
                output.accept(ItemRegHandler.STONE_PICKAXE_HEAD);
                output.accept(ItemRegHandler.STONE_AXE_HEAD);
                output.accept(ItemRegHandler.STONE_SHOVEL_HEAD);
                output.accept(ItemRegHandler.STONE_HOE_HEAD);

                output.accept(ItemRegHandler.IRON_SWORD_BLADE);
                output.accept(ItemRegHandler.IRON_PICKAXE_HEAD);
                output.accept(ItemRegHandler.IRON_AXE_HEAD);
                output.accept(ItemRegHandler.IRON_SHOVEL_HEAD);
                output.accept(ItemRegHandler.IRON_HOE_HEAD);

                output.accept(ItemRegHandler.GOLD_SWORD_BLADE);
                output.accept(ItemRegHandler.GOLD_PICKAXE_HEAD);
                output.accept(ItemRegHandler.GOLD_AXE_HEAD);
                output.accept(ItemRegHandler.GOLD_SHOVEL_HEAD);
                output.accept(ItemRegHandler.GOLD_HOE_HEAD);

                output.accept(ItemRegHandler.DIAMOND_SWORD_BLADE);
                output.accept(ItemRegHandler.DIAMOND_PICKAXE_HEAD);
                output.accept(ItemRegHandler.DIAMOND_AXE_HEAD);
                output.accept(ItemRegHandler.DIAMOND_SHOVEL_HEAD);
                output.accept(ItemRegHandler.DIAMOND_HOE_HEAD);

                output.accept(ItemRegHandler.NETHERITE_SWORD_BLADE);
                output.accept(ItemRegHandler.NETHERITE_PICKAXE_HEAD);
                output.accept(ItemRegHandler.NETHERITE_AXE_HEAD);
                output.accept(ItemRegHandler.NETHERITE_SHOVEL_HEAD);
                output.accept(ItemRegHandler.NETHERITE_HOE_HEAD);

                output.accept(ItemRegHandler.REDSTONE_SWORD_BLADE);
                output.accept(ItemRegHandler.REDSTONE_PICKAXE_HEAD);
                output.accept(ItemRegHandler.REDSTONE_AXE_HEAD);
                output.accept(ItemRegHandler.REDSTONE_SHOVEL_HEAD);
                output.accept(ItemRegHandler.REDSTONE_HOE_HEAD);
            }).build());

    public static final CreativeModeTab TVE_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(TheVanillaExpansion.MOD_ID, "tve_blocks"), FabricCreativeModeTab.builder().icon(() -> new ItemStack(BlockRegHandler.CHARCOAL_BLOCK))
            .title(Component.translatable("creativetab.vanilla_expansion.blocks"))
            .displayItems((parameters, output) -> {
                output.accept(BlockRegHandler.CHARCOAL_BLOCK);
                output.accept(BlockRegHandler.BUNDLED_STICKS_BLOCK);
                output.accept(BlockRegHandler.BARREL_OF_APPLES_BLOCK);
                output.accept(BlockRegHandler.BARREL_OF_POTATOES_BLOCK);
                output.accept(BlockRegHandler.BARREL_OF_CARROTS_BLOCK);
                output.accept(BlockRegHandler.BARREL_OF_SWEETBERRY_BLOCK);
                output.accept(BlockRegHandler.BARREL_OF_CHORUS_BLOCK);
                output.accept(BlockRegHandler.EMPOWERED_NETHERITE_BLOCK);
                output.accept(BlockRegHandler.FIRED_BRICKS);
                output.accept(BlockRegHandler.FIRED_BRICKS_STAIRS);
                output.accept(BlockRegHandler.FIRED_BRICKS_SLAB);
                output.accept(BlockRegHandler.FIRED_BRICKS_WALL);
                output.accept(BlockRegHandler.QUARTZ_WALL);
                output.accept(BlockRegHandler.QUARTZ_BRICKS_WALL);
                output.accept(BlockRegHandler.SMOKED_QUARTZ_BLOCK);
                output.accept(BlockRegHandler.SMOOTH_SMOKED_QUARTZ);
                output.accept(BlockRegHandler.CHISELED_SMOKED_QUARTZ_BLOCK);
                output.accept(BlockRegHandler.SMOKED_QUARTZ_BRICKS);
                output.accept(BlockRegHandler.SMOKED_QUARTZ_PILLAR);
                output.accept(BlockRegHandler.SMOKED_QUARTZ_STAIRS);
                output.accept(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_STAIRS);
                output.accept(BlockRegHandler.SMOKED_QUARTZ_BRICKS_STAIRS);
                output.accept(BlockRegHandler.SMOKED_QUARTZ_SLAB);
                output.accept(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_SLAB);
                output.accept(BlockRegHandler.SMOKED_QUARTZ_BRICKS_SLAB);
                output.accept(BlockRegHandler.SMOKED_QUARTZ_WALL);
                output.accept(BlockRegHandler.BURNT_QUARTZ_BLOCK);
                output.accept(BlockRegHandler.SMOOTH_BURNT_QUARTZ);
                output.accept(BlockRegHandler.CHISELED_BURNT_QUARTZ_BLOCK);
                output.accept(BlockRegHandler.BURNT_QUARTZ_BRICKS);
                output.accept(BlockRegHandler.BURNT_QUARTZ_PILLAR);
                output.accept(BlockRegHandler.BURNT_QUARTZ_STAIRS);
                output.accept(BlockRegHandler.SMOOTH_BURNT_QUARTZ_STAIRS);
                output.accept(BlockRegHandler.BURNT_QUARTZ_BRICKS_STAIRS);
                output.accept(BlockRegHandler.BURNT_QUARTZ_SLAB);
                output.accept(BlockRegHandler.SMOOTH_BURNT_QUARTZ_SLAB);
                output.accept(BlockRegHandler.BURNT_QUARTZ_BRICKS_SLAB);
                output.accept(BlockRegHandler.BURNT_QUARTZ_WALL);
            }).build());


    public static void registerModCreativeTabs(){
        TheVanillaExpansion.LOGGER.info("Registering Creative Mode Tabs for " + TheVanillaExpansion.MOD_ID);
    }
}
