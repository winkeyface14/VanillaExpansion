package com.winkeyface14.vanillaexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SpecialBlock extends Block {

    public SpecialBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(4f,80f)
                .sound(SoundType.METAL)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
