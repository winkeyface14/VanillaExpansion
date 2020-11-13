package com.winkeyface14.vanillaexpansion.util;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import com.winkeyface14.vanillaexpansion.armor.ModArmorMaterial;
import com.winkeyface14.vanillaexpansion.blocks.*;
import com.winkeyface14.vanillaexpansion.items.*;
import com.winkeyface14.vanillaexpansion.tools.ModItemTier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.*;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VanillaExpansion.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VanillaExpansion.MOD_ID);
    //public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, VanillaExpansion.MOD_ID);
    //public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, VanillaExpansion.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
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
    //will activate after finalized texture
    //public static final RegistryObject<Item> EMPOWERED_NETHERITE = ITEMS.register("empowered_netherite", ItemBase::new);
    public static final RegistryObject<Item> PAPER_PILE = ITEMS.register("pile_of_paper", ItemBase::new);
    public static final RegistryObject<Item> FIRED_BRICK = ITEMS.register("fired_brick", ItemBase::new);



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


    // Tools
    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
            new SwordItem(ModItemTier.EMERALD, 2, -2.4F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
            new PickaxeItem(ModItemTier.EMERALD, 0, -2.8F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () ->
            new AxeItem(ModItemTier.EMERALD, 4.5F, -3.1F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () ->
            new ShovelItem(ModItemTier.EMERALD, 0.5F, -3F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe", () ->
            new HoeItem(ModItemTier.EMERALD_HOE, 0, -0.5F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

    public static final RegistryObject<SwordItem> REDSTONE_SWORD = ITEMS.register("redstone_sword", () ->
            new SwordItem(ModItemTier.REDSTONE, 2, -1.4F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<PickaxeItem> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", () ->
            new PickaxeItem(ModItemTier.REDSTONE, 0, -2.3F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<AxeItem> REDSTONE_AXE = ITEMS.register("redstone_axe", () ->
            new AxeItem(ModItemTier.REDSTONE, 4.5F, -2.3F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ShovelItem> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel", () ->
            new ShovelItem(ModItemTier.REDSTONE, 0.5F, -2.5F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<HoeItem> REDSTONE_HOE = ITEMS.register("redstone_hoe", () ->
            new HoeItem(ModItemTier.REDSTONE_HOE, 0, -0.5F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

    public static final RegistryObject<SwordItem> QUARTZ_SWORD = ITEMS.register("quartz_sword", () ->
            new SwordItem(ModItemTier.QUARTZ, 3, -2.4F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<PickaxeItem> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe", () ->
            new PickaxeItem(ModItemTier.QUARTZ, 0, -2.8F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<AxeItem> QUARTZ_AXE = ITEMS.register("quartz_axe", () ->
            new AxeItem(ModItemTier.QUARTZ, 4F, -3.1F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ShovelItem> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel", () ->
            new ShovelItem(ModItemTier.QUARTZ, 1, -3F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<HoeItem> QUARTZ_HOE = ITEMS.register("quartz_hoe", () ->
            new HoeItem(ModItemTier.QUARTZ_HOE, 0, -1.0F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

    public static final RegistryObject<SwordItem> SQUARTZ_SWORD = ITEMS.register("smoked_quartz_sword", () ->
            new SwordItem(ModItemTier.SQUARTZ, 3, -2.4F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<PickaxeItem> SQUARTZ_PICKAXE = ITEMS.register("smoked_quartz_pickaxe", () ->
            new PickaxeItem(ModItemTier.SQUARTZ, 0, -2.8F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<AxeItem> SQUARTZ_AXE = ITEMS.register("smoked_quartz_axe", () ->
            new AxeItem(ModItemTier.SQUARTZ, 4F, -3.1F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ShovelItem> SQUARTZ_SHOVEL = ITEMS.register("smoked_quartz_shovel", () ->
            new ShovelItem(ModItemTier.SQUARTZ, 1, -3F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<HoeItem> SQUARTZ_HOE = ITEMS.register("smoked_quartz_hoe", () ->
            new HoeItem(ModItemTier.SQUARTZ_HOE, 0, -1.0F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

    public static final RegistryObject<SwordItem> BQUARTZ_SWORD = ITEMS.register("burnt_quartz_sword", () ->
            new SwordItem(ModItemTier.BQUARTZ, 3, -2.4F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<PickaxeItem> BQUARTZ_PICKAXE = ITEMS.register("burnt_quartz_pickaxe", () ->
            new PickaxeItem(ModItemTier.BQUARTZ, 0, -2.8F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<AxeItem> BQUARTZ_AXE = ITEMS.register("burnt_quartz_axe", () ->
            new AxeItem(ModItemTier.BQUARTZ, 4F, -3.1F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ShovelItem> BQUARTZ_SHOVEL = ITEMS.register("burnt_quartz_shovel", () ->
            new ShovelItem(ModItemTier.BQUARTZ, 1, -3F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<HoeItem> BQUARTZ_HOE = ITEMS.register("burnt_quartz_hoe", () ->
            new HoeItem(ModItemTier.BQUARTZ_HOE, 0, -1.0F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

    // FOR FUTURE IMPLEMENTATION OF MORE SHEARS
    //public static final RegistryObject<ShearsItem> GOLDEN_SHEARS = ITEMS.register("golden_shears", () -> new ShearsItem(ItemTier.GOLD, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_CHEST = ITEMS.register("emerald_chestplate", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

    public static final RegistryObject<ArmorItem> LAPIS_HELMET = ITEMS.register("lapis_lazuli_helmet", () ->
            new ArmorItem(ModArmorMaterial.LAPIS, EquipmentSlotType.HEAD, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> LAPIS_CHEST = ITEMS.register("lapis_lazuli_chestplate", () ->
            new ArmorItem(ModArmorMaterial.LAPIS, EquipmentSlotType.CHEST, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> LAPIS_LEGGINGS = ITEMS.register("lapis_lazuli_leggings", () ->
            new ArmorItem(ModArmorMaterial.LAPIS, EquipmentSlotType.LEGS, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> LAPIS_BOOTS = ITEMS.register("lapis_lazuli_boots", () ->
            new ArmorItem(ModArmorMaterial.LAPIS, EquipmentSlotType.FEET, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));


    // Blocks
    public static final RegistryObject<Block> CHARCOAL_BLOCK = BLOCKS.register("charcoal_block", CharcoalBlock::new);
    public static final RegistryObject<Block> BUNDLED_STICKS_BLOCK = BLOCKS.register("block_of_bundled_sticks", BundledSticksBlock::new);
    public static final RegistryObject<Block> BARREL_OF_APPLES_BLOCK = BLOCKS.register("barrel_of_apples", BarrelOfAnyBlock::new);
    public static final RegistryObject<Block> BARREL_OF_POTATOES_BLOCK = BLOCKS.register("barrel_of_potatoes", BarrelOfAnyBlock::new);
    public static final RegistryObject<Block> BARREL_OF_CARROTS_BLOCK = BLOCKS.register("barrel_of_carrots", BarrelOfAnyBlock::new);
    public static final RegistryObject<Block> BARREL_OF_CHORUS_BLOCK = BLOCKS.register("barrel_of_chorus_fruits", BarrelOfAnyBlock::new);
    public static final RegistryObject<Block> SMOKED_QUARTZ_BLOCK = BLOCKS.register("smoked_quartz_block", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> SMOKED_QUARTZ_PILLAR = BLOCKS.register("smoked_quartz_pillar", QuartzFamilyPillar::new);
    public static final RegistryObject<Block> CHISELED_SMOKED_QUARTZ_BLOCK = BLOCKS.register("chiseled_smoked_quartz_block", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> SMOOTH_SMOKED_QUARTZ = BLOCKS.register("smooth_smoked_quartz", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> SMOKED_QUARTZ_BRICKS = BLOCKS.register("smoked_quartz_bricks", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> BURNT_QUARTZ_BLOCK = BLOCKS.register("burnt_quartz_block", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> BURNT_QUARTZ_PILLAR = BLOCKS.register("burnt_quartz_pillar", QuartzFamilyPillar::new);
    public static final RegistryObject<Block> CHISELED_BURNT_QUARTZ_BLOCK = BLOCKS.register("chiseled_burnt_quartz_block", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> SMOOTH_BURNT_QUARTZ = BLOCKS.register("smooth_burnt_quartz", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> BURNT_QUARTZ_BRICKS = BLOCKS.register("burnt_quartz_bricks", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> FIRED_BRICKS = BLOCKS.register("fired_bricks", FiredBricks::new);

    // Block Items
    public static final RegistryObject<Item> CHARCOAL_BLOCK_ITEM = ITEMS.register("charcoal_block", () -> new CharcoalBlockItem(CHARCOAL_BLOCK.get()));
    public static final RegistryObject<Item> BUNDLED_STICKS_BLOCK_ITEM = ITEMS.register("block_of_bundled_sticks", () -> new BundledSticksBlockItem(BUNDLED_STICKS_BLOCK.get()));
    public static final RegistryObject<Item> BARREL_OF_APPLES_BLOCK_ITEM = ITEMS.register("barrel_of_apples", () -> new BarrelOfAnyBlockItem(BARREL_OF_APPLES_BLOCK.get()));
    public static final RegistryObject<Item> BARREL_OF_POTATOES_BLOCK_ITEM = ITEMS.register("barrel_of_potatoes", () -> new BarrelOfAnyBlockItem(BARREL_OF_POTATOES_BLOCK.get()));
    public static final RegistryObject<Item> BARREL_OF_CARROTS_BLOCK_ITEM = ITEMS.register("barrel_of_carrots", () -> new BarrelOfAnyBlockItem(BARREL_OF_CARROTS_BLOCK.get()));
    public static final RegistryObject<Item> BARREL_OF_CHORUS_BLOCK_ITEM = ITEMS.register("barrel_of_chorus_fruits", () -> new BarrelOfAnyBlockItem(BARREL_OF_CHORUS_BLOCK.get()));
    public static final RegistryObject<Item> SMOKED_QUARTZ_BLOCK_ITEM = ITEMS.register("smoked_quartz_block", () -> new BlockItemBase(SMOKED_QUARTZ_BLOCK.get()));
    public static final RegistryObject<Item> SMOKED_QUARTZ_PILLAR_ITEM = ITEMS.register("smoked_quartz_pillar", () -> new BlockItemBase(SMOKED_QUARTZ_PILLAR.get()));
    public static final RegistryObject<Item> CHISELED_SMOKED_QUARTZ_BLOCK_ITEM = ITEMS.register("chiseled_smoked_quartz_block", () -> new BlockItemBase(CHISELED_SMOKED_QUARTZ_BLOCK.get()));
    public static final RegistryObject<Item> SMOOTH_SMOKED_QUARTZ_ITEM = ITEMS.register("smooth_smoked_quartz", () -> new BlockItemBase(SMOOTH_SMOKED_QUARTZ.get()));
    public static final RegistryObject<Item> SMOKED_QUARTZ_BRICKS_ITEM = ITEMS.register("smoked_quartz_bricks", () -> new BlockItemBase(SMOKED_QUARTZ_BRICKS.get()));
    public static final RegistryObject<Item> BURNT_QUARTZ_BLOCK_ITEM = ITEMS.register("burnt_quartz_block", () -> new BlockItemBase(BURNT_QUARTZ_BLOCK.get()));
    public static final RegistryObject<Item> BURNT_QUARTZ_PILLAR_ITEM = ITEMS.register("burnt_quartz_pillar", () -> new BlockItemBase(BURNT_QUARTZ_PILLAR.get()));
    public static final RegistryObject<Item> CHISELED_BURNT_QUARTZ_BLOCK_ITEM = ITEMS.register("chiseled_burnt_quartz_block", () -> new BlockItemBase(CHISELED_BURNT_QUARTZ_BLOCK.get()));
    public static final RegistryObject<Item> SMOOTH_BURNT_QUARTZ_ITEM = ITEMS.register("smooth_burnt_quartz", () -> new BlockItemBase(SMOOTH_BURNT_QUARTZ.get()));
    public static final RegistryObject<Item> BURNT_QUARTZ_BRICKS_ITEM = ITEMS.register("burnt_quartz_bricks", () -> new BlockItemBase(BURNT_QUARTZ_BRICKS.get()));
    public static final RegistryObject<Item> FIRED_BRICKS_ITEM = ITEMS.register("fired_bricks", () -> new BlockItemBase(FIRED_BRICKS.get()));

    // Stairs
    public static final RegistryObject<Block> SMOKED_QUARTZ_STAIRS = BLOCKS.register("smoked_quartz_stairs", QuartzFamilyStairs::new);
    public static final RegistryObject<Block> SMOOTH_SMOKED_QUARTZ_STAIRS = BLOCKS.register("smooth_smoked_quartz_stairs", QuartzFamilyStairs::new);
    public static final RegistryObject<Block> BURNT_QUARTZ_STAIRS = BLOCKS.register("burnt_quartz_stairs", QuartzFamilyStairs::new);
    public static final RegistryObject<Block> SMOOTH_BURNT_QUARTZ_STAIRS = BLOCKS.register("smooth_burnt_quartz_stairs", QuartzFamilyStairs::new);
    public static final RegistryObject<Block> FIRED_BRICKS_STAIRS = BLOCKS.register("fired_bricks_stairs", FiredBricksStairs::new);


    // Stairs Item
    public static final RegistryObject<Item> SMOKED_QUARTZ_STAIRS_ITEM = ITEMS.register("smoked_quartz_stairs", () -> new BlockItemBase(SMOKED_QUARTZ_STAIRS.get()));
    public static final RegistryObject<Item> SMOOTH_SMOKED_QUARTZ_STAIRS_ITEM = ITEMS.register("smooth_smoked_quartz_stairs", () -> new BlockItemBase(SMOOTH_SMOKED_QUARTZ_STAIRS.get()));
    public static final RegistryObject<Item> BURNT_QUARTZ_STAIRS_ITEM = ITEMS.register("burnt_quartz_stairs", () -> new BlockItemBase(BURNT_QUARTZ_STAIRS.get()));
    public static final RegistryObject<Item> SMOOTH_BURNT_QUARTZ_STAIRS_ITEM = ITEMS.register("smooth_burnt_quartz_stairs", () -> new BlockItemBase(SMOOTH_BURNT_QUARTZ_STAIRS.get()));
    public static final RegistryObject<Item> FIRED_BRICKS_STAIRS_ITEM = ITEMS.register("fired_bricks_stairs", () -> new BlockItemBase(FIRED_BRICKS_STAIRS.get()));

    // Walls
    public static final RegistryObject<Block> SMOKED_QUARTZ_WALL = BLOCKS.register("smoked_quartz_wall", QuartzFamilyWall::new);
    public static final RegistryObject<Block> QUARTZ_WALL = BLOCKS.register("quartz_wall", QuartzFamilyWall::new);
    public static final RegistryObject<Block> BURNT_QUARTZ_WALL = BLOCKS.register("burnt_quartz_wall", QuartzFamilyWall::new);
    public static final RegistryObject<Block> FIRED_BRICKS_WALL = BLOCKS.register("fired_bricks_wall", FiredBricksWall::new);

    // Walls Item
    public static final RegistryObject<Item> SMOKED_QUARTZ_WALL_ITEM = ITEMS.register("smoked_quartz_wall", () -> new BlockItemBase(SMOKED_QUARTZ_WALL.get()));
    public static final RegistryObject<Item> QUARTZ_WALL_ITEM = ITEMS.register("quartz_wall", () -> new BlockItemBase(QUARTZ_WALL.get()));
    public static final RegistryObject<Item> BURNT_QUARTZ_WALL_ITEM = ITEMS.register("burnt_quartz_wall", () -> new BlockItemBase(BURNT_QUARTZ_WALL.get()));
    public static final RegistryObject<Item> FIRED_BRICKS_WALL_ITEM = ITEMS.register("fired_bricks_wall", () -> new BlockItemBase(FIRED_BRICKS_WALL.get()));

    // Slabs
    public static final RegistryObject<Block> SMOKED_QUARTZ_SLAB = BLOCKS.register("smoked_quartz_slab", QuartzFamilySlab::new);
    public static final RegistryObject<Block> SMOOTH_SMOKED_QUARTZ_SLAB = BLOCKS.register("smooth_smoked_quartz_slab", QuartzFamilySlab::new);
    public static final RegistryObject<Block> QUARTZ_BRICKS_SLAB = BLOCKS.register("quartz_bricks_slab", QuartzFamilySlab::new);
    public static final RegistryObject<Block> SMOKED_QUARTZ_BRICKS_SLAB = BLOCKS.register("smoked_quartz_bricks_slab", QuartzFamilySlab::new);
    public static final RegistryObject<Block> BURNT_QUARTZ_SLAB = BLOCKS.register("burnt_quartz_slab", QuartzFamilySlab::new);
    public static final RegistryObject<Block> SMOOTH_BURNT_QUARTZ_SLAB = BLOCKS.register("smooth_burnt_quartz_slab", QuartzFamilySlab::new);
    public static final RegistryObject<Block> BURNT_QUARTZ_BRICKS_SLAB = BLOCKS.register("burnt_quartz_bricks_slab", QuartzFamilySlab::new);
    public static final RegistryObject<Block> FIRED_BRICKS_SLAB = BLOCKS.register("fired_bricks_slab", FiredBricksSlab::new);

    // Slab Item
    public static final RegistryObject<Item> SMOKED_QUARTZ_SLAB_ITEM = ITEMS.register("smoked_quartz_slab", () -> new BlockItemBase(SMOKED_QUARTZ_SLAB.get()));
    public static final RegistryObject<Item> SMOOTH_SMOKED_QUARTZ_SLAB_ITEM = ITEMS.register("smooth_smoked_quartz_slab", () -> new BlockItemBase(SMOOTH_SMOKED_QUARTZ_SLAB.get()));
    public static final RegistryObject<Item> QUARTZ_BRICKS_SLAB_ITEM = ITEMS.register("quartz_bricks_slab", () -> new BlockItemBase(QUARTZ_BRICKS_SLAB.get()));
    public static final RegistryObject<Item> SMOKED_QUARTZ_BRICKS_SLAB_ITEM = ITEMS.register("smoked_quartz_bricks_slab", () -> new BlockItemBase(SMOKED_QUARTZ_BRICKS_SLAB.get()));
    public static final RegistryObject<Item> BURNT_QUARTZ_SLAB_ITEM = ITEMS.register("burnt_quartz_slab", () -> new BlockItemBase(BURNT_QUARTZ_SLAB.get()));
    public static final RegistryObject<Item> SMOOTH_BURNT_QUARTZ_SLAB_ITEM = ITEMS.register("smooth_burnt_quartz_slab", () -> new BlockItemBase(SMOOTH_BURNT_QUARTZ_SLAB.get()));
    public static final RegistryObject<Item> BURNT_QUARTZ_BRICKS_SLAB_ITEM = ITEMS.register("burnt_quartz_bricks_slab", () -> new BlockItemBase(BURNT_QUARTZ_BRICKS_SLAB.get()));
    public static final RegistryObject<Item> FIRED_BRICKS_SLAB_ITEM = ITEMS.register("fired_bricks_slab", () -> new BlockItemBase(FIRED_BRICKS_SLAB.get()));

    // Tile Entity

    // Containers

}


