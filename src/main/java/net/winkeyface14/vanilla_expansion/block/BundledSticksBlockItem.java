package net.winkeyface14.vanilla_expansion.block;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class BundledSticksBlockItem extends BlockItem {

    public BundledSticksBlockItem(Block block) {
        super(block, new Properties().group(VanillaExpansion.BLOCK_TAB));
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 8100;
    }
}
