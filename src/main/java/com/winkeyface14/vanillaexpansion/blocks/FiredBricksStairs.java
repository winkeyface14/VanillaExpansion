package com.winkeyface14.vanillaexpansion.blocks;

import com.winkeyface14.vanillaexpansion.util.BlockHandler;
import net.minecraft.block.StairsBlock;

public class FiredBricksStairs extends StairsBlock {

    public FiredBricksStairs() {
        super(() -> BlockHandler.FIRED_BRICKS.get().getDefaultState(),
                Properties.from(BlockHandler.FIRED_BRICKS.get()));
    }

}

