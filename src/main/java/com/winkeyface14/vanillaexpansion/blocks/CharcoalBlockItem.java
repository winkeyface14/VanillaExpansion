package com.winkeyface14.vanillaexpansion.blocks;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class CharcoalBlockItem extends BlockItem {

    public CharcoalBlockItem(Block block) {
        super(block, new Properties().tab(VanillaExpansion.BLOCK_TAB));
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 14400;
    }
}
