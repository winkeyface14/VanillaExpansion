package com.winkeyface14.vanillaexpansion.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraftforge.common.ToolType;

public class QuartzFamilyPillar extends HorizontalBlock {

    private static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;

    public QuartzFamilyPillar() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(0.8f,0.8f)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        switch(rot) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch((Direction.Axis)state.get(AXIS)) {
                    case X:
                        return state.with(AXIS, Direction.Axis.Z);
                    case Z:
                        return state.with(AXIS, Direction.Axis.X);
                    default:
                        return state;
                }
            default:
                return state;
        }
    }

    public void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AXIS);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(AXIS, context.getFace().getAxis());
    }

}