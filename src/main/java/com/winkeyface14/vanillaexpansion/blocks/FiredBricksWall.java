package com.winkeyface14.vanillaexpansion.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FiredBricksWall extends WallBlock {

    public FiredBricksWall() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(2f,6f)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }

}

