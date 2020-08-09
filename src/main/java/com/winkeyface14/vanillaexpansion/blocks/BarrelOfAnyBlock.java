package com.winkeyface14.vanillaexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;


public class BarrelOfAnyBlock extends Block {

    public BarrelOfAnyBlock() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(2f, 4.0f)
                .sound(SoundType.WOOD)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE));
    }

}