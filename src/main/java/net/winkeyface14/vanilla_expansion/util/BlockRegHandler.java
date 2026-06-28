package net.winkeyface14.vanilla_expansion.util;

import net.minecraft.world.level.block.*;
import net.winkeyface14.vanilla_expansion.block.BlockItemBase;

public class BlockRegHandler extends BlockItemBase {
    // Full Blocks
    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block", properties -> new Block(properties
            .strength(5.0f, 6.0f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block EMPOWERED_NETHERITE_BLOCK = registerBlock("empowered_netherite_block", properties -> new Block(properties
            .strength(50.0f,1200.0f)
            .sound(SoundType.NETHERITE_BLOCK)
            .requiresCorrectToolForDrops()));
    public static final Block BARREL_OF_APPLES_BLOCK = registerBlock("barrel_of_apples", properties -> new Block(properties
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)
            .requiresCorrectToolForDrops()));
    public static final Block BARREL_OF_POTATOES_BLOCK = registerBlock("barrel_of_potatoes", properties -> new Block(properties
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)
            .requiresCorrectToolForDrops()));
    public static final Block BARREL_OF_CARROTS_BLOCK = registerBlock("barrel_of_carrots", properties -> new Block(properties
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)
            .requiresCorrectToolForDrops()));
    public static final Block BARREL_OF_CHORUS_BLOCK = registerBlock("barrel_of_chorus_fruits", properties -> new Block(properties
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)
            .requiresCorrectToolForDrops()));
    public static final Block BARREL_OF_SWEETBERRY_BLOCK = registerBlock("barrel_of_sweet_berries", properties -> new Block(properties
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)
            .requiresCorrectToolForDrops()));
    public static final Block BUNDLED_STICKS_BLOCK = registerBlock("block_of_bundled_sticks", properties -> new Block(properties
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)
            .requiresCorrectToolForDrops()));

    //Fired Bricks
    public static final Block FIRED_BRICKS = registerBlock("fired_bricks", properties -> new Block(properties
            .strength(2.0f, 6.0f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block FIRED_BRICKS_STAIRS = registerBlock("fired_bricks_stairs", properties -> new Block(properties
            .strength(2.0f, 6.0f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block FIRED_BRICKS_SLAB = registerBlock("fired_bricks_slab", properties -> new SlabBlock(properties.strength(2.0f, 6.0f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block FIRED_BRICKS_WALL = registerBlock("fired_bricks_wall", properties -> new WallBlock(properties
            .strength(2.0f, 6.0f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

    //Regular Quartz
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block QUARTZ_BRICKS_WALL = registerBlock("quartz_bricks_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));


    //Smoked Quartz
    public static final Block SMOKED_QUARTZ_BLOCK = registerBlock("smoked_quartz_block", properties -> new Block(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOKED_QUARTZ_PILLAR = registerBlock("chiseled_smoked_quartz_block", properties -> new Block(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOOTH_SMOKED_QUARTZ = registerBlock("smooth_smoked_quartz", properties -> new Block(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOKED_QUARTZ_BRICKS = registerBlock("smoked_quartz_bricks", properties -> new Block(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block CHISELED_SMOKED_QUARTZ_BLOCK = registerBlock("chiseled_smoked_quartz_block", properties -> new Block(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOKED_QUARTZ_STAIRS = registerBlock("smoked_quartz_stairs", properties -> new StairBlock(BlockRegHandler.SMOKED_QUARTZ_BLOCK.defaultBlockState(),
            properties.strength(0.8f,0.8f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));
    public static final Block SMOOTH_SMOKED_QUARTZ_STAIRS = registerBlock("smooth_smoked_quartz_stairs", properties -> new StairBlock(BlockRegHandler.SMOOTH_SMOKED_QUARTZ.defaultBlockState(),
            properties.strength(0.8f,0.8f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));
    public static final Block SMOKED_QUARTZ_BRICKS_STAIRS = registerBlock("smoked_quartz_bricks_stairs", properties -> new StairBlock(BlockRegHandler.SMOKED_QUARTZ_BRICKS.defaultBlockState(),
            properties.strength(0.8f,0.8f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));
    public static final Block SMOKED_QUARTZ_SLAB = registerBlock("smoked_quartz_slab", properties -> new SlabBlock(properties.strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOOTH_SMOKED_QUARTZ_SLAB = registerBlock("smooth_smoked_quartz_slab", properties -> new SlabBlock(properties.strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOKED_QUARTZ_BRICKS_SLAB = registerBlock("smoked_quartz_bricks_slab", properties -> new SlabBlock(properties.strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOKED_QUARTZ_WALL = registerBlock("smoked_quartz_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOKED_QUARTZ_BRICKS_WALL = registerBlock("smoked_quartz_bricks_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

    //Burned Quartz
    public static final Block BURNT_QUARTZ_BLOCK = registerBlock("burnt_quartz_block", properties -> new Block(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block BURNT_QUARTZ_PILLAR = registerBlock("chiseled_burnt_quartz_block", properties -> new Block(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOOTH_BURNT_QUARTZ = registerBlock("smooth_burnt_quartz", properties -> new Block(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block BURNT_QUARTZ_BRICKS = registerBlock("burnt_quartz_bricks", properties -> new Block(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block CHISELED_BURNT_QUARTZ_BLOCK = registerBlock("chiseled_burnt_quartz_block", properties -> new Block(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block BURNT_QUARTZ_STAIRS = registerBlock("burnt_quartz_stairs", properties -> new StairBlock(BlockRegHandler.BURNT_QUARTZ_BLOCK.defaultBlockState(),
            properties.strength(0.8f,0.8f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));
    public static final Block SMOOTH_BURNT_QUARTZ_STAIRS = registerBlock("smooth_burnt_quartz_stairs", properties -> new StairBlock(BlockRegHandler.SMOOTH_BURNT_QUARTZ.defaultBlockState(),
            properties.strength(0.8f,0.8f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));
    public static final Block BURNT_QUARTZ_BRICKS_STAIRS = registerBlock("burnt_quartz_bricks_stairs", properties -> new StairBlock(BlockRegHandler.BURNT_QUARTZ_BRICKS.defaultBlockState(),
            properties.strength(0.8f,0.8f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));
    public static final Block BURNT_QUARTZ_SLAB = registerBlock("burnt_quartz_slab", properties -> new SlabBlock(properties.strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOOTH_BURNT_QUARTZ_SLAB = registerBlock("smooth_burnt_quartz_slab", properties -> new SlabBlock(properties.strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block BURNT_QUARTZ_BRICKS_SLAB = registerBlock("burnt_quartz_bricks_slab", properties -> new SlabBlock(properties.strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block BURNT_QUARTZ_WALL = registerBlock("burnt_quartz_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block BURNT_QUARTZ_BRICKS_WALL = registerBlock("burnt_quartz_bricks_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
}
