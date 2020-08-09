package com.winkeyface14.vanillaexpansion.blocks;

import com.winkeyface14.vanillaexpansion.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.Half;
import net.minecraft.state.properties.StairsShape;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class QuartzFamilyStairs extends StairsBlock {

    private static final DirectionProperty FACING = StairsBlock.FACING;

    public QuartzFamilyStairs() {
        super(() -> RegistryHandler.SMOKED_QUARTZ_BLOCK.get().getDefaultState(),
                Properties.from(RegistryHandler.SMOKED_QUARTZ_BLOCK.get())
                .hardnessAndResistance(0.8f,0.8f)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE));
    }

}

