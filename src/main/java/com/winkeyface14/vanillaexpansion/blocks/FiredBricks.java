package com.winkeyface14.vanillaexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FiredBricks extends Block {

    public FiredBricks() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(2.0f,6.0f)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
