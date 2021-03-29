package com.winkeyface14.vanillaexpansion.util;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import com.winkeyface14.vanillaexpansion.armor.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmorHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VanillaExpansion.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

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

    public static final RegistryObject<ArmorItem> EMP_NETHERITE_HELMET = ITEMS.register("empowered_netherite_helmet", () ->
            new ArmorItem(ModArmorMaterial.EMP_NETHERITE, EquipmentSlotType.HEAD, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> EMP_NETHERITE_CHEST = ITEMS.register("empowered_netherite_chestplate", () ->
            new ArmorItem(ModArmorMaterial.EMP_NETHERITE, EquipmentSlotType.CHEST, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> EMP_NETHERITE_LEGGINGS = ITEMS.register("empowered_netherite_leggings", () ->
            new ArmorItem(ModArmorMaterial.EMP_NETHERITE, EquipmentSlotType.LEGS, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> EMP_NETHERITE_BOOTS = ITEMS.register("empowered_netherite_boots", () ->
            new ArmorItem(ModArmorMaterial.EMP_NETHERITE, EquipmentSlotType.FEET, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

    public static final RegistryObject<ArmorItem> REINFORCED_LEATHER_HELMET = ITEMS.register("reinforced_leather_helmet", () ->
            new ArmorItem(ModArmorMaterial.REINFORCED_LEATHER, EquipmentSlotType.HEAD, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> REINFORCED_LEATHER_CHEST = ITEMS.register("reinforced_leather_chestplate", () ->
            new ArmorItem(ModArmorMaterial.REINFORCED_LEATHER, EquipmentSlotType.CHEST, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> REINFORCED_LEATHER_LEGGINGS = ITEMS.register("reinforced_leather_leggings", () ->
            new ArmorItem(ModArmorMaterial.REINFORCED_LEATHER, EquipmentSlotType.LEGS, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ArmorItem> REINFORCED_LEATHER_BOOTS = ITEMS.register("reinforced_leather_boots", () ->
            new ArmorItem(ModArmorMaterial.REINFORCED_LEATHER, EquipmentSlotType.FEET, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

}
