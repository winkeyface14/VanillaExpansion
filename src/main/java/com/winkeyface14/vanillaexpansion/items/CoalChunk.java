package com.winkeyface14.vanillaexpansion.items;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CoalChunk extends Item {

    public CoalChunk() {
        super(new Item.Properties().group(VanillaExpansion.ITEM_TAB));
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 200;
    }
}

