package net.winkeyface14.vanilla_expansion.item;

import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.winkeyface14.vanilla_expansion.VanillaExpansion;
import net.winkeyface14.vanilla_expansion.tags.TagRegHandler;

public class ArmorMaterialBase {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> EMERALD_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "emerald"));
    public static final ResourceKey<EquipmentAsset> LAPIS_LAZULI_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "lapis_lazuli"));
    public static final ResourceKey<EquipmentAsset> REINFORCED_LEATHER_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "reinforced_leather"));
    public static final ResourceKey<EquipmentAsset> EMPOWERED_NETHERITE_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "empowered_netherite"));

    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(28, ArmorMaterials.makeDefense(2,5,7,2,10),10, SoundEvents.ARMOR_EQUIP_DIAMOND,1f,0, TagRegHandler.Items.EMERALD_REPAIR, EMERALD_KEY);
    public static final ArmorMaterial LAPIS_LAZULI_ARMOR_MATERIAL = new ArmorMaterial(12, ArmorMaterials.makeDefense(2, 5, 6, 2,4),27, SoundEvents.ARMOR_EQUIP_IRON,0.0f,0.05f, TagRegHandler.Items.LAPIS_LAZULI_REPAIR, LAPIS_LAZULI_KEY);
    public static final ArmorMaterial REINFORCED_LEATHER_ARMOR_MATERIAL = new ArmorMaterial(12, ArmorMaterials.makeDefense(1, 2, 3, 1,5),12, SoundEvents.ARMOR_EQUIP_IRON,0.0f,0, TagRegHandler.Items.REINFORCED_LEATHER_REPAIR, REINFORCED_LEATHER_KEY);
    public static final ArmorMaterial EMPOWERED_NETHERITE_ARMOR_MATERIAL = new ArmorMaterial(37, ArmorMaterials.makeDefense(3, 6, 8, 3, 19),15, SoundEvents.ARMOR_EQUIP_NETHERITE,3.0f,0.1F, TagRegHandler.Items.EMPOWERED_NETHERITE_REPAIR, EMPOWERED_NETHERITE_KEY);
}
