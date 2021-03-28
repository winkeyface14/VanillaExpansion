package com.winkeyface14.vanillaexpansion.blocks;

import com.winkeyface14.vanillaexpansion.util.RegistryHandler;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class QuartzFamilyWall extends WallBlock {

    public QuartzFamilyWall() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(0.8f,0.8f)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
}
