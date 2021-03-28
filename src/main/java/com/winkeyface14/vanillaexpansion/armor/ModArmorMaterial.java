package com.winkeyface14.vanillaexpansion.armor;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import com.winkeyface14.vanillaexpansion.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    EMERALD(VanillaExpansion.MOD_ID + ":emerald", 24, new int[] { 2, 6, 7, 3 }, 18,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 0.5F, () -> { return Ingredient.of(Items.EMERALD); } , 0),
    LAPIS(VanillaExpansion.MOD_ID + ":lapis_lazuli", 15, new int[] { 2, 5, 6, 2 }, 27,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0F, () -> { return Ingredient.of(Items.LAPIS_BLOCK); } , 0),
    EMP_NETHERITE(VanillaExpansion.MOD_ID + ":empowered_netherite", 37, new int[] { 3, 6, 8, 3 }, 12,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, () -> { return Ingredient.of(RegistryHandler.EMPOWERED_NETHERITE.get());} , 0.1F),
    REINFORCED_LEATHER(VanillaExpansion.MOD_ID + ":reinforced_leather", 7, new int[] { 1, 2, 3, 1 }, 16,
    SoundEvents.ARMOR_EQUIP_LEATHER, 1.0F, () -> { return Ingredient.of(RegistryHandler.REINFORCED_LEATHER.get());} , 0.1F);

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantabillity;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantabillity,
                     SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantabillity = enchantabillity;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;
    }


    @Override
    public int getDurabilityForSlot(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantabillity;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
