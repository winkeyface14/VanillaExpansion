package com.winkeyface14.vanillaexpansion.items;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.BookItem;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;

public class MagnifiedBook extends BookItem {

    public MagnifiedBook() {
        super(new Properties().group(VanillaExpansion.ITEM_TAB));
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return true;
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return true;
    }

    @Override
    public int getItemEnchantability() {
        return 3;
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}

