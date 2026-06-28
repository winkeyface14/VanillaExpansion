package com.winkeyface14.vanillaexpansion.blocks;

import net.minecraft.block.StairsBlock;

public class FiredBricksStairs extends StairsBlock {

    public FiredBricksStairs() {
        super(() -> BlockHandler.FIRED_BRICKS.get().getDefaultState(),
                Properties.from(BlockHandler.FIRED_BRICKS.get()));
    }

}

