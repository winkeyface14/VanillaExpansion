package com.winkeyface14.vanillaexpansion.tools;

import com.winkeyface14.vanillaexpansion.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    EMERALD(3, 946, 7.0F, 3.5F, 16, () -> {
        return Ingredient.fromItems(Items.EMERALD);
    }),
    EMERALD_HOE(3, 946, 7.0F, 0F, 16, () -> {
        return Ingredient.fromItems(Items.EMERALD);
    }),
    REDSTONE(2, 190, 18.0F, 2.5F, 6, () -> {
        return Ingredient.fromItems(Items.REDSTONE_BLOCK);
    }),
    REDSTONE_HOE(2, 190, 18.0F, 0F, 6, () -> {
        return Ingredient.fromItems(Items.REDSTONE_BLOCK);
    }),
    QUARTZ(2, 46, 6.5F, 6F, 5, () -> {
        return Ingredient.fromItems(Items.REDSTONE_BLOCK);
    }),
    QUARTZ_HOE(2, 46, 6.5F, 0F, 5, () -> {
        return Ingredient.fromItems(Items.REDSTONE_BLOCK);
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float effeciency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float effeciency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.effeciency = effeciency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return effeciency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
