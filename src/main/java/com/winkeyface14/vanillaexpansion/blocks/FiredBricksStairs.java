package com.winkeyface14.vanillaexpansion.blocks;

import com.winkeyface14.vanillaexpansion.util.RegistryHandler;
import net.minecraft.block.StairsBlock;

public class FiredBricksStairs extends StairsBlock {

    public FiredBricksStairs() {
        super(() -> RegistryHandler.FIRED_BRICKS.get().getDefaultState(),
                Properties.from(RegistryHandler.FIRED_BRICKS.get()));
    }

}

