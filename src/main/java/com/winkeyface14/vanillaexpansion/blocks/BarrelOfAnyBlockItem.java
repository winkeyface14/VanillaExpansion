package com.winkeyface14.vanillaexpansion.blocks;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class BarrelOfAnyBlockItem extends BlockItem {

    public BarrelOfAnyBlockItem(Block block) {
        super(block, new Properties().group(VanillaExpansion.BLOCK_TAB));
    }
}
