package com.winkeyface14.vanillaexpansion.blocks;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Properties().tab(VanillaExpansion.BLOCK_TAB));
    }
}
