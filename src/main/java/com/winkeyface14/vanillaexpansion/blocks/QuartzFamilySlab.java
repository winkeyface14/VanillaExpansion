package com.winkeyface14.vanillaexpansion.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.IntegerProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class QuartzFamilySlab extends SlabBlock {

    public QuartzFamilySlab() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(0.8f,0.8f)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }

    @Override
    public boolean canContainFluid(IBlockReader worldIn, BlockPos pos, BlockState state, Fluid fluidIn) {
        return true;
    }

}

