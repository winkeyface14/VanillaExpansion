package com.winkeyface14.vanillaexpansion.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EmpNetheriteBlock extends Block {

    public EmpNetheriteBlock() {
        super(AbstractBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(50.0f,1200.0f)
                .sound(SoundType.NETHERITE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
        );
    }
}
