package com.winkeyface14.vanillaexpansion.util;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import com.winkeyface14.vanillaexpansion.blocks.*;
import com.winkeyface14.vanillaexpansion.items.BundledSticks;
import com.winkeyface14.vanillaexpansion.items.CharcoalChunk;
import com.winkeyface14.vanillaexpansion.items.CoalChunk;
import com.winkeyface14.vanillaexpansion.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VanillaExpansion.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> COAL_CHUNK = ITEMS.register("coal_chunk", CoalChunk::new);
    public static final RegistryObject<Item> CHARCOAL_CHUNK = ITEMS.register("charcoal_chunk", CharcoalChunk::new);
    public static final RegistryObject<Item> BUNDLED_STICKS = ITEMS.register("bundle_of_sticks", BundledSticks::new);
    public static final RegistryObject<Item> EMERALD_SHARD = ITEMS.register("emerald_shard", ItemBase::new);
    public static final RegistryObject<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard", ItemBase::new);
    public static final RegistryObject<Item> SMOKED_QUARTZ = ITEMS.register("smoked_quartz", ItemBase::new);
    public static final RegistryObject<Item> BURNT_QUARTZ = ITEMS.register("burnt_quartz", ItemBase::new);
    public static final RegistryObject<Item> QUARTZ_SHARD = ITEMS.register("quartz_shard", ItemBase::new);
    public static final RegistryObject<Item> SMOKED_QUARTZ_SHARD = ITEMS.register("smoked_quartz_shard", ItemBase::new);
    public static final RegistryObject<Item> BURNT_QUARTZ_SHARD = ITEMS.register("burnt_quartz_shard", ItemBase::new);
    public static final RegistryObject<Item> RAW_REINFORCED_LEATHER = ITEMS.register("raw_reinforced_leather", ItemBase::new);
    public static final RegistryObject<Item> REINFORCED_LEATHER = ITEMS.register("reinforced_leather", ItemBase::new);
    public static final RegistryObject<Item> EMPOWERED_NETHERITE = ITEMS.register("empowered_netherite_ingot", ItemBase::new);
    public static final RegistryObject<Item> PAPER_PILE = ITEMS.register("pile_of_paper", ItemBase::new);
    public static final RegistryObject<Item> FIRED_BRICK = ITEMS.register("fired_brick", ItemBase::new);
    public static final RegistryObject<Item> EMPOWERED_NETHERITE_SCRAP = ITEMS.register("empowered_netherite_scrap", ItemBase::new);


    // Tool Head and Sword Blade
    public static final RegistryObject<Item> STONE_SWORD_BLADE = ITEMS.register("stone_sword_blade", ItemBase::new);
    public static final RegistryObject<Item> STONE_PICKAXE_HEAD = ITEMS.register("stone_pickaxe_head", ItemBase::new);
    public static final RegistryObject<Item> STONE_AXE_HEAD = ITEMS.register("stone_axe_head", ItemBase::new);
    public static final RegistryObject<Item> STONE_SHOVEL_HEAD = ITEMS.register("stone_shovel_head", ItemBase::new);
    public static final RegistryObject<Item> STONE_HOE_HEAD = ITEMS.register("stone_hoe_head", ItemBase::new);
    public static final RegistryObject<Item> IRON_SWORD_BLADE = ITEMS.register("iron_sword_blade", ItemBase::new);
    public static final RegistryObject<Item> IRON_PICKAXE_HEAD = ITEMS.register("iron_pickaxe_head", ItemBase::new);
    public static final RegistryObject<Item> IRON_AXE_HEAD = ITEMS.register("iron_axe_head", ItemBase::new);
    public static final RegistryObject<Item> IRON_SHOVEL_HEAD = ITEMS.register("iron_shovel_head", ItemBase::new);
    public static final RegistryObject<Item> IRON_HOE_HEAD = ITEMS.register("iron_hoe_head", ItemBase::new);
    public static final RegistryObject<Item> GOLD_SWORD_BLADE = ITEMS.register("golden_sword_blade", ItemBase::new);
    public static final RegistryObject<Item> GOLD_PICKAXE_HEAD = ITEMS.register("golden_pickaxe_head", ItemBase::new);
    public static final RegistryObject<Item> GOLD_AXE_HEAD = ITEMS.register("golden_axe_head", ItemBase::new);
    public static final RegistryObject<Item> GOLD_SHOVEL_HEAD = ITEMS.register("golden_shovel_head", ItemBase::new);
    public static final RegistryObject<Item> GOLD_HOE_HEAD = ITEMS.register("golden_hoe_head", ItemBase::new);
    public static final RegistryObject<Item> DIAMOND_SWORD_BLADE = ITEMS.register("diamond_sword_blade", ItemBase::new);
    public static final RegistryObject<Item> DIAMOND_PICKAXE_HEAD = ITEMS.register("diamond_pickaxe_head", ItemBase::new);
    public static final RegistryObject<Item> DIAMOND_AXE_HEAD = ITEMS.register("diamond_axe_head", ItemBase::new);
    public static final RegistryObject<Item> DIAMOND_SHOVEL_HEAD = ITEMS.register("diamond_shovel_head", ItemBase::new);
    public static final RegistryObject<Item> DIAMOND_HOE_HEAD = ITEMS.register("diamond_hoe_head", ItemBase::new);
    public static final RegistryObject<Item> NETHERITE_SWORD_BLADE = ITEMS.register("netherite_sword_blade", ItemBase::new);
    public static final RegistryObject<Item> NETHERITE_PICKAXE_HEAD = ITEMS.register("netherite_pickaxe_head", ItemBase::new);
    public static final RegistryObject<Item> NETHERITE_AXE_HEAD = ITEMS.register("netherite_axe_head", ItemBase::new);
    public static final RegistryObject<Item> NETHERITE_SHOVEL_HEAD = ITEMS.register("netherite_shovel_head", ItemBase::new);
    public static final RegistryObject<Item> NETHERITE_HOE_HEAD = ITEMS.register("netherite_hoe_head", ItemBase::new);
    public static final RegistryObject<Item> REDSTONE_SWORD_BLADE = ITEMS.register("redstone_sword_blade", ItemBase::new);
    public static final RegistryObject<Item> REDSTONE_PICKAXE_HEAD = ITEMS.register("redstone_pickaxe_head", ItemBase::new);
    public static final RegistryObject<Item> REDSTONE_AXE_HEAD = ITEMS.register("redstone_axe_head", ItemBase::new);
    public static final RegistryObject<Item> REDSTONE_SHOVEL_HEAD = ITEMS.register("redstone_shovel_head", ItemBase::new);
    public static final RegistryObject<Item> REDSTONE_HOE_HEAD = ITEMS.register("redstone_hoe_head", ItemBase::new);

    // Block Items
    public static final RegistryObject<Item> CHARCOAL_BLOCK_ITEM = ITEMS.register("charcoal_block", () -> new CharcoalBlockItem(BlockHandler.CHARCOAL_BLOCK.get()));
    public static final RegistryObject<Item> BUNDLED_STICKS_BLOCK_ITEM = ITEMS.register("block_of_bundled_sticks", () -> new BundledSticksBlockItem(BlockHandler.BUNDLED_STICKS_BLOCK.get()));
    public static final RegistryObject<Item> BARREL_OF_APPLES_BLOCK_ITEM = ITEMS.register("barrel_of_apples", () -> new BarrelOfAnyBlockItem(BlockHandler.BARREL_OF_APPLES_BLOCK.get()));
    public static final RegistryObject<Item> BARREL_OF_POTATOES_BLOCK_ITEM = ITEMS.register("barrel_of_potatoes", () -> new BarrelOfAnyBlockItem(BlockHandler.BARREL_OF_POTATOES_BLOCK.get()));
    public static final RegistryObject<Item> BARREL_OF_CARROTS_BLOCK_ITEM = ITEMS.register("barrel_of_carrots", () -> new BarrelOfAnyBlockItem(BlockHandler.BARREL_OF_CARROTS_BLOCK.get()));
    public static final RegistryObject<Item> BARREL_OF_CHORUS_BLOCK_ITEM = ITEMS.register("barrel_of_chorus_fruits", () -> new BarrelOfAnyBlockItem(BlockHandler.BARREL_OF_CHORUS_BLOCK.get()));
    public static final RegistryObject<Item> BARREL_OF_SWTBRY_BLOCK_ITEM = ITEMS.register("barrel_of_sweet_berries", () -> new BarrelOfAnyBlockItem(BlockHandler.BARREL_OF_SWTBRY_BLOCK.get()));
    public static final RegistryObject<Item> SMOKED_QUARTZ_BLOCK_ITEM = ITEMS.register("smoked_quartz_block", () -> new BlockItemBase(BlockHandler.SMOKED_QUARTZ_BLOCK.get()));
    public static final RegistryObject<Item> SMOKED_QUARTZ_PILLAR_ITEM = ITEMS.register("smoked_quartz_pillar", () -> new BlockItemBase(BlockHandler.SMOKED_QUARTZ_PILLAR.get()));
    public static final RegistryObject<Item> CHISELED_SMOKED_QUARTZ_BLOCK_ITEM = ITEMS.register("chiseled_smoked_quartz_block", () -> new BlockItemBase(BlockHandler.CHISELED_SMOKED_QUARTZ_BLOCK.get()));
    public static final RegistryObject<Item> SMOOTH_SMOKED_QUARTZ_ITEM = ITEMS.register("smooth_smoked_quartz", () -> new BlockItemBase(BlockHandler.SMOOTH_SMOKED_QUARTZ.get()));
    public static final RegistryObject<Item> SMOKED_QUARTZ_BRICKS_ITEM = ITEMS.register("smoked_quartz_bricks", () -> new BlockItemBase(BlockHandler.SMOKED_QUARTZ_BRICKS.get()));
    public static final RegistryObject<Item> BURNT_QUARTZ_BLOCK_ITEM = ITEMS.register("burnt_quartz_block", () -> new BlockItemBase(BlockHandler.BURNT_QUARTZ_BLOCK.get()));
    public static final RegistryObject<Item> BURNT_QUARTZ_PILLAR_ITEM = ITEMS.register("burnt_quartz_pillar", () -> new BlockItemBase(BlockHandler.BURNT_QUARTZ_PILLAR.get()));
    public static final RegistryObject<Item> CHISELED_BURNT_QUARTZ_BLOCK_ITEM = ITEMS.register("chiseled_burnt_quartz_block", () -> new BlockItemBase(BlockHandler.CHISELED_BURNT_QUARTZ_BLOCK.get()));
    public static final RegistryObject<Item> SMOOTH_BURNT_QUARTZ_ITEM = ITEMS.register("smooth_burnt_quartz", () -> new BlockItemBase(BlockHandler.SMOOTH_BURNT_QUARTZ.get()));
    public static final RegistryObject<Item> BURNT_QUARTZ_BRICKS_ITEM = ITEMS.register("burnt_quartz_bricks", () -> new BlockItemBase(BlockHandler.BURNT_QUARTZ_BRICKS.get()));
    public static final RegistryObject<Item> FIRED_BRICKS_ITEM = ITEMS.register("fired_bricks", () -> new BlockItemBase(BlockHandler.FIRED_BRICKS.get()));
    public static final RegistryObject<Item> EMPOWERED_NETHERITE_BLOCK_ITEM = ITEMS.register("empowered_netherite_block", () -> new EmpNetheriteBlockItem(BlockHandler.EMPOWERED_NETHERITE_BLOCK.get()));

    // Stairs Item
    public static final RegistryObject<Item> SMOKED_QUARTZ_STAIRS_ITEM = ITEMS.register("smoked_quartz_stairs", () -> new BlockItemBase(BlockHandler.SMOKED_QUARTZ_STAIRS.get()));
    public static final RegistryObject<Item> SMOOTH_SMOKED_QUARTZ_STAIRS_ITEM = ITEMS.register("smooth_smoked_quartz_stairs", () -> new BlockItemBase(BlockHandler.SMOOTH_SMOKED_QUARTZ_STAIRS.get()));
    public static final RegistryObject<Item> BURNT_QUARTZ_STAIRS_ITEM = ITEMS.register("burnt_quartz_stairs", () -> new BlockItemBase(BlockHandler.BURNT_QUARTZ_STAIRS.get()));
    public static final RegistryObject<Item> SMOOTH_BURNT_QUARTZ_STAIRS_ITEM = ITEMS.register("smooth_burnt_quartz_stairs", () -> new BlockItemBase(BlockHandler.SMOOTH_BURNT_QUARTZ_STAIRS.get()));
    public static final RegistryObject<Item> FIRED_BRICKS_STAIRS_ITEM = ITEMS.register("fired_bricks_stairs", () -> new BlockItemBase(BlockHandler.FIRED_BRICKS_STAIRS.get()));

    // Walls Item
    public static final RegistryObject<Item> SMOKED_QUARTZ_WALL_ITEM = ITEMS.register("smoked_quartz_wall", () -> new BlockItemBase(BlockHandler.SMOKED_QUARTZ_WALL.get()));
    public static final RegistryObject<Item> QUARTZ_WALL_ITEM = ITEMS.register("quartz_wall", () -> new BlockItemBase(BlockHandler.QUARTZ_WALL.get()));
    public static final RegistryObject<Item> BURNT_QUARTZ_WALL_ITEM = ITEMS.register("burnt_quartz_wall", () -> new BlockItemBase(BlockHandler.BURNT_QUARTZ_WALL.get()));
    public static final RegistryObject<Item> FIRED_BRICKS_WALL_ITEM = ITEMS.register("fired_bricks_wall", () -> new BlockItemBase(BlockHandler.FIRED_BRICKS_WALL.get()));

    // Slab Item
    public static final RegistryObject<Item> SMOKED_QUARTZ_SLAB_ITEM = ITEMS.register("smoked_quartz_slab", () -> new BlockItemBase(BlockHandler.SMOKED_QUARTZ_SLAB.get()));
    public static final RegistryObject<Item> SMOOTH_SMOKED_QUARTZ_SLAB_ITEM = ITEMS.register("smooth_smoked_quartz_slab", () -> new BlockItemBase(BlockHandler.SMOOTH_SMOKED_QUARTZ_SLAB.get()));
    public static final RegistryObject<Item> QUARTZ_BRICKS_SLAB_ITEM = ITEMS.register("quartz_bricks_slab", () -> new BlockItemBase(BlockHandler.QUARTZ_BRICKS_SLAB.get()));
    public static final RegistryObject<Item> SMOKED_QUARTZ_BRICKS_SLAB_ITEM = ITEMS.register("smoked_quartz_bricks_slab", () -> new BlockItemBase(BlockHandler.SMOKED_QUARTZ_BRICKS_SLAB.get()));
    public static final RegistryObject<Item> BURNT_QUARTZ_SLAB_ITEM = ITEMS.register("burnt_quartz_slab", () -> new BlockItemBase(BlockHandler.BURNT_QUARTZ_SLAB.get()));
    public static final RegistryObject<Item> SMOOTH_BURNT_QUARTZ_SLAB_ITEM = ITEMS.register("smooth_burnt_quartz_slab", () -> new BlockItemBase(BlockHandler.SMOOTH_BURNT_QUARTZ_SLAB.get()));
    public static final RegistryObject<Item> BURNT_QUARTZ_BRICKS_SLAB_ITEM = ITEMS.register("burnt_quartz_bricks_slab", () -> new BlockItemBase(BlockHandler.BURNT_QUARTZ_BRICKS_SLAB.get()));
    public static final RegistryObject<Item> FIRED_BRICKS_SLAB_ITEM = ITEMS.register("fired_bricks_slab", () -> new BlockItemBase(BlockHandler.FIRED_BRICKS_SLAB.get()));

}
