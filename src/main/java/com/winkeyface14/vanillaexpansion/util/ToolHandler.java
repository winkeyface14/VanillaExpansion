package com.winkeyface14.vanillaexpansion.util;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import com.winkeyface14.vanillaexpansion.tools.ModItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ToolHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VanillaExpansion.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

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
            new AxeItem(ModItemTier.BQUARTZ, 4, -3.1F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ShovelItem> BQUARTZ_SHOVEL = ITEMS.register("burnt_quartz_shovel", () ->
            new ShovelItem(ModItemTier.BQUARTZ, 1, -3F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<HoeItem> BQUARTZ_HOE = ITEMS.register("burnt_quartz_hoe", () ->
            new HoeItem(ModItemTier.BQUARTZ_HOE, 0, -1.0F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

    public static final RegistryObject<SwordItem> EMP_NETHERITE_SWORD = ITEMS.register("empowered_netherite_sword", () ->
            new SwordItem(ModItemTier.EMP_NETHERITE, 2, -1.9F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<PickaxeItem> EMP_NETHERITE_PICKAXE = ITEMS.register("empowered_netherite_pickaxe", () ->
            new PickaxeItem(ModItemTier.EMP_NETHERITE, 0, -2.8F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<AxeItem> EMP_NETHERITE_AXE = ITEMS.register("empowered_netherite_axe", () ->
            new AxeItem(ModItemTier.EMP_NETHERITE, 4, -2.8F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<ShovelItem> EMP_NETHERITE_SHOVEL = ITEMS.register("empowered_netherite_shovel", () ->
            new ShovelItem(ModItemTier.EMP_NETHERITE, 0.5F, -3F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));
    public static final RegistryObject<HoeItem> EMP_NETHERITE_HOE = ITEMS.register("empowered_netherite_hoe", () ->
            new HoeItem(ModItemTier.EMP_NETHERITE_HOE, 0, -0.5F, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

}
