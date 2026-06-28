package net.winkeyface14.vanilla_expansion.block;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BarrelOfAnyBlockItem extends BlockItem {

    public BarrelOfAnyBlockItem(Block block) {
        super(block, new Properties().group(VanillaExpansion.BLOCK_TAB));
    }
}
