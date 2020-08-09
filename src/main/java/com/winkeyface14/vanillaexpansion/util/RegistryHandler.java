package com.winkeyface14.vanillaexpansion.util;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import com.winkeyface14.vanillaexpansion.armor.ModArmorMaterial;
import com.winkeyface14.vanillaexpansion.blocks.*;
import com.winkeyface14.vanillaexpansion.items.*;
import com.winkeyface14.vanillaexpansion.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.*;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VanillaExpansion.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VanillaExpansion.MOD_ID);
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, VanillaExpansion.MOD_ID);
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, VanillaExpansion.MOD_ID);

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


    // Tool Head and Sword Blade
    public static final RegistryObject<Item> STONE_SWORD_BLADE = ITEMS.register("stone_sword_blade", ItemBase::new);
    public static final RegistryObject<Item> STONE_PICKAXE_HEAD = ITEMS.register("stone_pickaxe_head", ItemBase::new);
    public static final RegistryObject<Item> STONE_AXE_HEAD = ITEMS.register("stone_axe_head", ItemBase::new);
    public static final RegistryObject<Item> STONE_SHOVEL_HEAD = ITEMS.register("stone_shovel_head", ItemBase::new);
    public static final RegistryObject<Item> STONE_HOE_HEAD = ITEMS.register("stone_hoe_head", ItemBase::new);


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
            new HoeItem(ModItemTier.EMERALD_HOE, -3, -0.5F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

    public static final RegistryObject<SwordItem> REDSTONE_SWORD = ITEMS.register("redstone_sword", () ->
            new SwordItem(ModItemTier.REDSTONE, 2, -1.4F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<PickaxeItem> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", () ->
            new PickaxeItem(ModItemTier.REDSTONE, 0, -2.8F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<AxeItem> REDSTONE_AXE = ITEMS.register("redstone_axe", () ->
            new AxeItem(ModItemTier.REDSTONE, 4.5F, -2.8F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ShovelItem> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel", () ->
            new ShovelItem(ModItemTier.REDSTONE, 0.5F, -3F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<HoeItem> REDSTONE_HOE = ITEMS.register("redstone_hoe", () ->
            new HoeItem(ModItemTier.REDSTONE_HOE, -3, -0.5F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_CHEST = ITEMS.register("emerald_chestplate", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

    // Blocks
    public static final RegistryObject<Block> CHARCOAL_BLOCK = BLOCKS.register("charcoal_block", CharcoalBlock::new);
    public static final RegistryObject<Block> BUNDLED_STICKS_BLOCK = BLOCKS.register("block_of_bundled_sticks", BundledSticksBlock::new);
    public static final RegistryObject<Block> BARREL_OF_APPLES_BLOCK = BLOCKS.register("barrel_of_apples", BarrelOfAnyBlock::new);
    public static final RegistryObject<Block> BARREL_OF_POTATOES_BLOCK = BLOCKS.register("barrel_of_potatoes", BarrelOfAnyBlock::new);
    public static final RegistryObject<Block> BARREL_OF_CARROTS_BLOCK = BLOCKS.register("barrel_of_carrots", BarrelOfAnyBlock::new);
    public static final RegistryObject<Block> BARREL_OF_CHORUS_BLOCK = BLOCKS.register("barrel_of_chorus_fruits", BarrelOfAnyBlock::new);

    // Block Items
    public static final RegistryObject<Item> CHARCOAL_BLOCK_ITEM = ITEMS.register("charcoal_block", () -> new CharcoalBlockItem(CHARCOAL_BLOCK.get()));
    public static final RegistryObject<Item> BUNDLED_STICKS_BLOCK_ITEM = ITEMS.register("block_of_bundled_sticks", () -> new BundledSticksBlockItem(BUNDLED_STICKS_BLOCK.get()));
    public static final RegistryObject<Item> BARREL_OF_APPLES_BLOCK_ITEM = ITEMS.register("barrel_of_apples", () -> new BarrelOfAnyBlockItem(BARREL_OF_APPLES_BLOCK.get()));
    public static final RegistryObject<Item> BARREL_OF_POTATOES_BLOCK_ITEM = ITEMS.register("barrel_of_potatoes", () -> new BarrelOfAnyBlockItem(BARREL_OF_POTATOES_BLOCK.get()));
    public static final RegistryObject<Item> BARREL_OF_CARROTS_BLOCK_ITEM = ITEMS.register("barrel_of_carrots", () -> new BarrelOfAnyBlockItem(BARREL_OF_CARROTS_BLOCK.get()));
    public static final RegistryObject<Item> BARREL_OF_CHORUS_BLOCK_ITEM = ITEMS.register("barrel_of_chorus_fruits", () -> new BarrelOfAnyBlockItem(BARREL_OF_CHORUS_BLOCK.get()));

    // Tile Entity

    // Containers

}


