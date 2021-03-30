package com.winkeyface14.vanillaexpansion;

import com.winkeyface14.vanillaexpansion.util.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("vanilla_expansion")
public class VanillaExpansion
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "vanilla_expansion";

    public VanillaExpansion() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ArmorHandler.init();
        BlockHandler.init();
        ItemHandler.init();
        ToolHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup ITEM_TAB = new ItemGroup("VEItemsTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemHandler.COAL_CHUNK.get());
        }

        @Override
        public void fill(NonNullList<ItemStack> items) {
            items.add(ItemHandler.COAL_CHUNK.get().getDefaultInstance());
            items.add(ItemHandler.CHARCOAL_CHUNK.get().getDefaultInstance());
            items.add(ItemHandler.BUNDLED_STICKS.get().getDefaultInstance());
            items.add(ItemHandler.PAPER_PILE.get().getDefaultInstance());
            items.add(ItemHandler.RAW_REINFORCED_LEATHER.get().getDefaultInstance());
            items.add(ItemHandler.REINFORCED_LEATHER.get().getDefaultInstance());
            items.add(ItemHandler.FIRED_BRICK.get().getDefaultInstance());
            items.add(ItemHandler.QUARTZ_SHARD.get().getDefaultInstance());
            items.add(ItemHandler.SMOKED_QUARTZ_SHARD.get().getDefaultInstance());
            items.add(ItemHandler.BURNT_QUARTZ_SHARD.get().getDefaultInstance());
            items.add(ItemHandler.SMOKED_QUARTZ.get().getDefaultInstance());
            items.add(ItemHandler.BURNT_QUARTZ.get().getDefaultInstance());
            items.add(ItemHandler.DIAMOND_SHARD.get().getDefaultInstance());
            items.add(ItemHandler.EMERALD_SHARD.get().getDefaultInstance());
            items.add(ItemHandler.EMPOWERED_NETHERITE_SCRAP.get().getDefaultInstance());
            items.add(ItemHandler.EMPOWERED_NETHERITE.get().getDefaultInstance());
            items.add(ItemHandler.STONE_SWORD_BLADE.get().getDefaultInstance());
            items.add(ItemHandler.STONE_SHOVEL_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.STONE_PICKAXE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.STONE_AXE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.STONE_HOE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.IRON_SWORD_BLADE.get().getDefaultInstance());
            items.add(ItemHandler.IRON_SHOVEL_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.IRON_PICKAXE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.IRON_AXE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.IRON_HOE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.GOLD_SWORD_BLADE.get().getDefaultInstance());
            items.add(ItemHandler.GOLD_SHOVEL_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.GOLD_PICKAXE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.GOLD_AXE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.GOLD_HOE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.DIAMOND_SWORD_BLADE.get().getDefaultInstance());
            items.add(ItemHandler.DIAMOND_SHOVEL_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.DIAMOND_PICKAXE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.DIAMOND_AXE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.DIAMOND_HOE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.NETHERITE_SWORD_BLADE.get().getDefaultInstance());
            items.add(ItemHandler.NETHERITE_SHOVEL_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.NETHERITE_PICKAXE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.NETHERITE_AXE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.NETHERITE_HOE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.REDSTONE_SWORD_BLADE.get().getDefaultInstance());
            items.add(ItemHandler.REDSTONE_SHOVEL_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.REDSTONE_PICKAXE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.REDSTONE_AXE_HEAD.get().getDefaultInstance());
            items.add(ItemHandler.REDSTONE_HOE_HEAD.get().getDefaultInstance());
        }
    };

    public static final ItemGroup TOOL_TAB = new ItemGroup("VEToolsTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ToolHandler.EMERALD_PICKAXE.get());
        }

        @Override
        public void fill(NonNullList<ItemStack> items) {
            items.add(ToolHandler.QUARTZ_SWORD.get().getDefaultInstance());
            items.add(ToolHandler.QUARTZ_SHOVEL.get().getDefaultInstance());
            items.add(ToolHandler.QUARTZ_PICKAXE.get().getDefaultInstance());
            items.add(ToolHandler.QUARTZ_AXE.get().getDefaultInstance());
            items.add(ToolHandler.QUARTZ_HOE.get().getDefaultInstance());
            items.add(ToolHandler.SQUARTZ_SWORD.get().getDefaultInstance());
            items.add(ToolHandler.SQUARTZ_SHOVEL.get().getDefaultInstance());
            items.add(ToolHandler.SQUARTZ_PICKAXE.get().getDefaultInstance());
            items.add(ToolHandler.SQUARTZ_AXE.get().getDefaultInstance());
            items.add(ToolHandler.SQUARTZ_HOE.get().getDefaultInstance());
            items.add(ToolHandler.BQUARTZ_SWORD.get().getDefaultInstance());
            items.add(ToolHandler.BQUARTZ_SHOVEL.get().getDefaultInstance());
            items.add(ToolHandler.BQUARTZ_PICKAXE.get().getDefaultInstance());
            items.add(ToolHandler.BQUARTZ_AXE.get().getDefaultInstance());
            items.add(ToolHandler.BQUARTZ_HOE.get().getDefaultInstance());
            items.add(ToolHandler.REDSTONE_SWORD.get().getDefaultInstance());
            items.add(ToolHandler.REDSTONE_SHOVEL.get().getDefaultInstance());
            items.add(ToolHandler.REDSTONE_PICKAXE.get().getDefaultInstance());
            items.add(ToolHandler.REDSTONE_AXE.get().getDefaultInstance());
            items.add(ToolHandler.REDSTONE_HOE.get().getDefaultInstance());
            items.add(ToolHandler.EMERALD_SWORD.get().getDefaultInstance());
            items.add(ToolHandler.EMERALD_SHOVEL.get().getDefaultInstance());
            items.add(ToolHandler.EMERALD_PICKAXE.get().getDefaultInstance());
            items.add(ToolHandler.EMERALD_AXE.get().getDefaultInstance());
            items.add(ToolHandler.EMERALD_HOE.get().getDefaultInstance());
            items.add(ToolHandler.EMP_NETHERITE_SWORD.get().getDefaultInstance());
            items.add(ToolHandler.EMP_NETHERITE_SHOVEL.get().getDefaultInstance());
            items.add(ToolHandler.EMP_NETHERITE_PICKAXE.get().getDefaultInstance());
            items.add(ToolHandler.EMP_NETHERITE_AXE.get().getDefaultInstance());
            items.add(ToolHandler.EMP_NETHERITE_HOE.get().getDefaultInstance());
            items.add(ArmorHandler.REINFORCED_LEATHER_HELMET.get().getDefaultInstance());
            items.add(ArmorHandler.REINFORCED_LEATHER_CHEST.get().getDefaultInstance());
            items.add(ArmorHandler.REINFORCED_LEATHER_LEGGINGS.get().getDefaultInstance());
            items.add(ArmorHandler.REINFORCED_LEATHER_BOOTS.get().getDefaultInstance());
            items.add(ArmorHandler.LAPIS_HELMET.get().getDefaultInstance());
            items.add(ArmorHandler.LAPIS_CHEST.get().getDefaultInstance());
            items.add(ArmorHandler.LAPIS_LEGGINGS.get().getDefaultInstance());
            items.add(ArmorHandler.LAPIS_BOOTS.get().getDefaultInstance());
            items.add(ArmorHandler.EMERALD_HELMET.get().getDefaultInstance());
            items.add(ArmorHandler.EMERALD_CHEST.get().getDefaultInstance());
            items.add(ArmorHandler.EMERALD_LEGGINGS.get().getDefaultInstance());
            items.add(ArmorHandler.EMERALD_BOOTS.get().getDefaultInstance());
            items.add(ArmorHandler.EMP_NETHERITE_HELMET.get().getDefaultInstance());
            items.add(ArmorHandler.EMP_NETHERITE_CHEST.get().getDefaultInstance());
            items.add(ArmorHandler.EMP_NETHERITE_LEGGINGS.get().getDefaultInstance());
            items.add(ArmorHandler.EMP_NETHERITE_BOOTS.get().getDefaultInstance());
        }
    };

    public static final ItemGroup BLOCK_TAB = new ItemGroup("VEBlocksTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockHandler.CHARCOAL_BLOCK.get());
        }

        @Override
        public void fill(NonNullList<ItemStack> items) {
            items.add(ItemHandler.CHARCOAL_BLOCK_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.BUNDLED_STICKS_BLOCK_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.BARREL_OF_APPLES_BLOCK_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.BARREL_OF_POTATOES_BLOCK_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.BARREL_OF_CARROTS_BLOCK_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.BARREL_OF_SWTBRY_BLOCK_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.BARREL_OF_CHORUS_BLOCK_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.EMPOWERED_NETHERITE_BLOCK_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.FIRED_BRICKS_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.FIRED_BRICKS_STAIRS_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.FIRED_BRICKS_SLAB_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.FIRED_BRICKS_WALL_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.SMOKED_QUARTZ_BLOCK_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.SMOOTH_SMOKED_QUARTZ_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.CHISELED_SMOKED_QUARTZ_BLOCK_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.SMOKED_QUARTZ_BRICKS_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.SMOKED_QUARTZ_PILLAR_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.SMOKED_QUARTZ_STAIRS_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.SMOOTH_SMOKED_QUARTZ_STAIRS_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.SMOKED_QUARTZ_SLAB_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.SMOOTH_SMOKED_QUARTZ_SLAB_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.SMOKED_QUARTZ_WALL_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.BURNT_QUARTZ_BLOCK_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.SMOOTH_BURNT_QUARTZ_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.CHISELED_BURNT_QUARTZ_BLOCK_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.BURNT_QUARTZ_BRICKS_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.BURNT_QUARTZ_PILLAR_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.BURNT_QUARTZ_STAIRS_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.SMOOTH_BURNT_QUARTZ_STAIRS_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.BURNT_QUARTZ_SLAB_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.SMOOTH_BURNT_QUARTZ_SLAB_ITEM.get().getDefaultInstance());
            items.add(ItemHandler.BURNT_QUARTZ_WALL_ITEM.get().getDefaultInstance());
        }
    };

}
