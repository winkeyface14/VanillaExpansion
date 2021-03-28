package com.winkeyface14.vanillaexpansion.items;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BundledSticks extends Item {

    public BundledSticks() {
        super(new Properties().group(VanillaExpansion.ITEM_TAB));
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 900;
    }
}

