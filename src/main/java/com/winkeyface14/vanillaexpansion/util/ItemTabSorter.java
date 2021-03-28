package com.winkeyface14.vanillaexpansion.util;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemTabSorter extends ItemGroup {

    public ItemTabSorter(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return null;
    }
}
