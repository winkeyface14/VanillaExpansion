package net.winkeyface14.vanilla_expansion.block;

import net.minecraft.world.level.block.state.BlockBehaviour;


public class QuartzFamilyBlock extends BlockItemBase{

    public QuartzFamilyBlock() {
        BlockBehaviour.Properties properties = null;
        Block(properties
                .strength(2.0f, 4.0f)
                .sound(net.minecraft.world.level.block.SoundType.WOOD)
                .requiresCorrectToolForDrops());
    }

    public QuartzFamilyBlock(BlockBehaviour.Properties properties) {
    }

    private void Block(BlockBehaviour.Properties properties) {
    }
}
