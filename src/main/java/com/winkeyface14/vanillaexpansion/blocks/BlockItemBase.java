package com.winkeyface14.vanillaexpansion.blocks;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Properties().group(VanillaExpansion.BLOCK_TAB));
    }
}
