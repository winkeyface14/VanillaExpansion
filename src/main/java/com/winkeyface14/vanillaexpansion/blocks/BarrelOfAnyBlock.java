package com.winkeyface14.vanillaexpansion.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class BarrelOfAnyBlock extends DirectionalBlock {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public BarrelOfAnyBlock() {
        super(AbstractBlock.Properties.create(Material.WOOD)
                .hardnessAndResistance(2f, 4.0f)
                .sound(SoundType.WOOD)
                .setRequiresTool()
                .harvestLevel(0)
                .harvestTool(ToolType.AXE));
    }

    @SuppressWarnings("deprecation")
    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}