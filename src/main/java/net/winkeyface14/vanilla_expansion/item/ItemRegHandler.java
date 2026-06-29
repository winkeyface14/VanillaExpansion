package net.winkeyface14.vanilla_expansion.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.equipment.ArmorType;
import net.winkeyface14.vanilla_expansion.TheVanillaExpansion;

import java.util.function.Function;

public class ItemRegHandler {
    //Regular Items
    public static final Item COAL_CHUNK = registerItem("coal_chunk", Item::new);
    public static final Item CHARCOAL_CHUNK = registerItem("charcoal_chunk", Item::new);
    public static final Item BUNDLED_STICKS = registerItem("bundled_sticks", Item::new);
    public static final Item EMERALD_SHARD = registerItem("emerald_shard", Item::new);
    public static final Item DIAMOND_SHARD = registerItem("diamond_shard", Item::new);
    public static final Item SMOKED_QUARTZ = registerItem("smoked_quartz", Item::new);
    public static final Item BURNT_QUARTZ = registerItem("burnt_quartz", Item::new);
    public static final Item QUARTZ_SHARD = registerItem("quartz_shard", Item::new);
    public static final Item SMOKED_QUARTZ_SHARD = registerItem("smoked_quartz_shard", Item::new);
    public static final Item BURNT_QUARTZ_SHARD = registerItem("burnt_quartz_shard", Item::new);
    public static final Item RAW_REINFORCED_LEATHER = registerItem("raw_reinforced_leather", Item::new);
    public static final Item REINFORCED_LEATHER = registerItem("reinforced_leather", Item::new);
    public static final Item EMPOWERED_NETHERITE = registerItem("empowered_netherite_ingot", Item::new);
    public static final Item PAPER_PILE = registerItem("pile_of_paper", Item::new);
    public static final Item FIRED_BRICK = registerItem("fired_brick", Item::new);
    public static final Item EMPOWERED_NETHERITE_SCRAP = registerItem("empowered_netherite_scrap", Item::new);

    // Tool Heads and Sword Blades
    public static final Item STONE_SWORD_BLADE = registerItem("stone_sword_blade", Item::new);
    public static final Item STONE_PICKAXE_HEAD = registerItem("stone_pickaxe_head", Item::new);
    public static final Item STONE_AXE_HEAD = registerItem("stone_axe_head", Item::new);
    public static final Item STONE_SHOVEL_HEAD = registerItem("stone_shovel_head", Item::new);
    public static final Item STONE_HOE_HEAD = registerItem("stone_hoe_head", Item::new);

    public static final Item IRON_SWORD_BLADE = registerItem("iron_sword_blade", Item::new);
    public static final Item IRON_PICKAXE_HEAD = registerItem("iron_pickaxe_head", Item::new);
    public static final Item IRON_AXE_HEAD = registerItem("iron_axe_head", Item::new);
    public static final Item IRON_SHOVEL_HEAD = registerItem("iron_shovel_head", Item::new);
    public static final Item IRON_HOE_HEAD = registerItem("iron_hoe_head", Item::new);

    public static final Item GOLD_SWORD_BLADE = registerItem("golden_sword_blade", Item::new);
    public static final Item GOLD_PICKAXE_HEAD = registerItem("golden_pickaxe_head", Item::new);
    public static final Item GOLD_AXE_HEAD = registerItem("golden_axe_head", Item::new);
    public static final Item GOLD_SHOVEL_HEAD = registerItem("golden_shovel_head", Item::new);
    public static final Item GOLD_HOE_HEAD = registerItem("golden_hoe_head", Item::new);

    public static final Item DIAMOND_SWORD_BLADE = registerItem("diamond_sword_blade", Item::new);
    public static final Item DIAMOND_PICKAXE_HEAD = registerItem("diamond_pickaxe_head", Item::new);
    public static final Item DIAMOND_AXE_HEAD = registerItem("diamond_axe_head", Item::new);
    public static final Item DIAMOND_SHOVEL_HEAD = registerItem("diamond_shovel_head", Item::new);
    public static final Item DIAMOND_HOE_HEAD = registerItem("diamond_hoe_head", Item::new);

    public static final Item NETHERITE_SWORD_BLADE = registerItem("netherite_sword_blade", Item::new);
    public static final Item NETHERITE_PICKAXE_HEAD = registerItem("netherite_pickaxe_head", Item::new);
    public static final Item NETHERITE_AXE_HEAD = registerItem("netherite_axe_head", Item::new);
    public static final Item NETHERITE_SHOVEL_HEAD = registerItem("netherite_shovel_head", Item::new);
    public static final Item NETHERITE_HOE_HEAD = registerItem("netherite_hoe_head", Item::new);

    public static final Item REDSTONE_SWORD_BLADE = registerItem("redstone_sword_blade", Item::new);
    public static final Item REDSTONE_PICKAXE_HEAD = registerItem("redstone_pickaxe_head", Item::new);
    public static final Item REDSTONE_AXE_HEAD = registerItem("redstone_axe_head", Item::new);
    public static final Item REDSTONE_SHOVEL_HEAD = registerItem("redstone_shovel_head", Item::new);
    public static final Item REDSTONE_HOE_HEAD = registerItem("redstone_hoe_head", Item::new);

    //Tool Upgrade Template
    public static final Item BASE_TEMPLATE = registerItem("base_template", Item::new);

    //Emerald Tools and Armor
    public static final Item EMERALD_SWORD = registerItem("emerald_sword", properties -> new Item(properties
            .sword(ToolMaterialsBase.EMERALD,3, -2.4f)));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel", properties -> new ShovelItem(ToolMaterialsBase.EMERALD,1.5f, -3, properties));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", properties -> new Item(properties
            .pickaxe(ToolMaterialsBase.EMERALD,1, -2.8f)));
    public static final Item EMERALD_AXE = registerItem("emerald_axe", properties -> new AxeItem(ToolMaterialsBase.EMERALD,6, -3.1f, properties));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe", properties -> new HoeItem(ToolMaterialsBase.EMERALD,-3, 0, properties));
    /*public static final Item EMERALD_SPEAR = registerItem("emerald_sword", properties -> new Item(properties
            .spear(ToolMaterialsBase.EMERALD,3, -2.4f,)));*/

    public static final Item EMERALD_HELMET = registerItem("emerald_helmet", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.EMERALD_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.EMERALD_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.EMERALD_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.EMERALD_ARMOR_MATERIAL, ArmorType.BOOTS)));

    //Lapis Lazuli Tools and Armor
    public static final Item LAPIS_LAZULI_SWORD = registerItem("lapis_lazuli_sword", properties -> new Item(properties
            .sword(ToolMaterialsBase.LAPIS_LAZULI,3, -2.4f)));
    public static final Item LAPIS_LAZULI_SHOVEL = registerItem("lapis_lazuli_shovel", properties -> new ShovelItem(ToolMaterialsBase.LAPIS_LAZULI,1.5f, -3,properties));
    public static final Item LAPIS_LAZULI_PICKAXE = registerItem("lapis_lazuli_pickaxe", properties -> new Item(properties
            .pickaxe(ToolMaterialsBase.LAPIS_LAZULI,1, -2.8f)));
    public static final Item LAPIS_LAZULI_AXE = registerItem("lapis_lazuli_axe", properties -> new AxeItem(ToolMaterialsBase.LAPIS_LAZULI,7, -3.2f,properties));
    public static final Item LAPIS_LAZULI_HOE = registerItem("lapis_lazuli_hoe", properties -> new HoeItem(ToolMaterialsBase.LAPIS_LAZULI,-1, -2,properties));

    public static final Item LAPIS_LAZULI_HELMET = registerItem("lapis_lazuli_helmet", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.LAPIS_LAZULI_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item LAPIS_LAZULI_CHESTPLATE = registerItem("lapis_lazuli_chestplate", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.LAPIS_LAZULI_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item LAPIS_LAZULI_LEGGINGS = registerItem("lapis_lazuli_leggings", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.LAPIS_LAZULI_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item LAPIS_LAZULI_BOOTS = registerItem("lapis_lazuli_boots", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.LAPIS_LAZULI_ARMOR_MATERIAL, ArmorType.BOOTS)));

    //Redstone Tools
    public static final Item REDSTONE_SWORD = registerItem("redstone_sword", properties -> new Item(properties
            .sword(ToolMaterialsBase.REDSTONE,3, -2.2f)));
    public static final Item REDSTONE_SHOVEL = registerItem("redstone_shovel", properties -> new ShovelItem(ToolMaterialsBase.REDSTONE,1.5f, -3, properties));
    public static final Item REDSTONE_PICKAXE = registerItem("redstone_pickaxe", properties -> new Item(properties
            .pickaxe(ToolMaterialsBase.REDSTONE,1, -2.8f)));
    public static final Item REDSTONE_AXE = registerItem("redstone_axe", properties -> new AxeItem(ToolMaterialsBase.REDSTONE,5, -3f, properties));
    public static final Item REDSTONE_HOE = registerItem("redstone_hoe", properties -> new HoeItem(ToolMaterialsBase.REDSTONE,-1, -2,properties));

    //Quartz Tools
    public static final Item QUARTZ_SWORD = registerItem("quartz_sword", properties -> new Item(properties
            .sword(ToolMaterialsBase.QUARTZ,3, -2.4f)));
    public static final Item QUARTZ_SHOVEL = registerItem("quartz_shovel", properties -> new ShovelItem(ToolMaterialsBase.QUARTZ,1.5f, -3,properties));
    public static final Item QUARTZ_PICKAXE = registerItem("quartz_pickaxe", properties -> new Item(properties
            .pickaxe(ToolMaterialsBase.QUARTZ,1, -2.8f)));
    public static final Item QUARTZ_AXE = registerItem("quartz_axe", properties -> new AxeItem(ToolMaterialsBase.QUARTZ,6, -3f,properties));
    public static final Item QUARTZ_HOE = registerItem("quartz_hoe", properties -> new HoeItem(ToolMaterialsBase.QUARTZ,-2, -1,properties));

    //Smoked Quartz Tools
    public static final Item SMOKED_QUARTZ_SWORD = registerItem("smoked_quartz_sword", properties -> new Item(properties
            .sword(ToolMaterialsBase.SMOKED_QUARTZ,3, -2.4f)));
    public static final Item SMOKED_QUARTZ_SHOVEL = registerItem("smoked_quartz_shovel", properties -> new ShovelItem(ToolMaterialsBase.SMOKED_QUARTZ,1.5f, -3,properties));
    public static final Item SMOKED_QUARTZ_PICKAXE = registerItem("smoked_quartz_pickaxe", properties -> new Item(properties
            .pickaxe(ToolMaterialsBase.SMOKED_QUARTZ,1, -2.8f)));
    public static final Item SMOKED_QUARTZ_AXE = registerItem("smoked_quartz_axe", properties -> new AxeItem(ToolMaterialsBase.SMOKED_QUARTZ,6, -3f,properties));
    public static final Item SMOKED_QUARTZ_HOE = registerItem("smoked_quartz_hoe", properties -> new HoeItem(ToolMaterialsBase.SMOKED_QUARTZ,-2, -1,properties));

    //Burnt Quartz Tools
    public static final Item BURNT_QUARTZ_SWORD = registerItem("burnt_quartz_sword", properties -> new Item(properties
            .sword(ToolMaterialsBase.BURNT_QUARTZ,3, -2.4f)));
    public static final Item BURNT_QUARTZ_SHOVEL = registerItem("burnt_quartz_shovel", properties -> new ShovelItem(ToolMaterialsBase.BURNT_QUARTZ,1.5f, -3,properties));
    public static final Item BURNT_QUARTZ_PICKAXE = registerItem("burnt_quartz_pickaxe", properties -> new Item(properties
            .pickaxe(ToolMaterialsBase.BURNT_QUARTZ,1, -2.8f)));
    public static final Item BURNT_QUARTZ_AXE = registerItem("burnt_quartz_axe", properties -> new AxeItem(ToolMaterialsBase.BURNT_QUARTZ,6, -3f,properties));
    public static final Item BURNT_QUARTZ_HOE = registerItem("burnt_quartz_hoe", properties -> new HoeItem(ToolMaterialsBase.BURNT_QUARTZ,-2, -1,properties));

    //Empowered Netherite Tools and Armor
    public static final Item EMPOWERED_NETHERITE_SWORD = registerItem("empowered_netherite_sword", properties -> new Item(properties
            .sword(ToolMaterialsBase.EMPOWERED_NETHERITE,3, -2f).fireResistant()));
    public static final Item EMPOWERED_NETHERITE_SHOVEL = registerItem("empowered_netherite_shovel", properties -> new ShovelItem(ToolMaterialsBase.EMPOWERED_NETHERITE,1.5f, -3, properties.fireResistant()));
    public static final Item EMPOWERED_NETHERITE_PICKAXE = registerItem("empowered_netherite_pickaxe", properties -> new Item(properties
            .pickaxe(ToolMaterialsBase.EMPOWERED_NETHERITE,1, -2.8f).fireResistant()));
    public static final Item EMPOWERED_NETHERITE_AXE = registerItem("empowered_netherite_axe", properties -> new AxeItem(ToolMaterialsBase.EMPOWERED_NETHERITE,5, -3f,properties.fireResistant()));
    public static final Item EMPOWERED_NETHERITE_HOE = registerItem("empowered_netherite_hoe", properties -> new HoeItem(ToolMaterialsBase.EMPOWERED_NETHERITE,-3, 0, properties.fireResistant()));

    public static final Item EMPOWERED_NETHERITE_HELMET = registerItem("empowered_netherite_helmet", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.EMPOWERED_NETHERITE_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item EMPOWERED_NETHERITE_CHESTPLATE = registerItem("empowered_netherite_chestplate", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.EMPOWERED_NETHERITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item EMPOWERED_NETHERITE_LEGGINGS = registerItem("empowered_netherite_leggings", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.EMPOWERED_NETHERITE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item EMPOWERED_NETHERITE_BOOTS = registerItem("empowered_netherite_boots", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.EMPOWERED_NETHERITE_ARMOR_MATERIAL, ArmorType.BOOTS)));

    //Reinforced Leather Armors
    public static final Item REINFORCED_LEATHER_HELMET = registerItem("reinforced_leather_helmet", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.REINFORCED_LEATHER_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item REINFORCED_LEATHER_CHESTPLATE = registerItem("reinforced_leather_chestplate", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.REINFORCED_LEATHER_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item REINFORCED_LEATHER_LEGGINGS = registerItem("reinforced_leather_leggings", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.REINFORCED_LEATHER_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item REINFORCED_LEATHER_BOOTS = registerItem("reinforced_leather_boots", properties -> new Item(properties.humanoidArmor(ArmorMaterialBase.REINFORCED_LEATHER_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TheVanillaExpansion.MOD_ID, name), function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TheVanillaExpansion.MOD_ID, name)))));
    }

    public static void registerModItems() {
        TheVanillaExpansion.LOGGER.info("Registering Item for " + TheVanillaExpansion.MOD_ID);
    }

    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }
}
