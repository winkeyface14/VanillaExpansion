package com.winkeyface14.vanillaexpansion.blocks;

import net.minecraft.block.StairsBlock;

public class QuartzFamilyStairs extends StairsBlock {

    public QuartzFamilyStairs() {
        super(() -> BlockHandler.SMOKED_QUARTZ_BLOCK.get().getDefaultState(),
                Properties.from(BlockHandler.SMOKED_QUARTZ_BLOCK.get()));
    }

}

