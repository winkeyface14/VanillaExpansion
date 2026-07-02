package net.winkeyface14.vanilla_expansion.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.winkeyface14.vanilla_expansion.VanillaExpansion;

import java.util.function.Function;

public class BlockRegHandler {
    // Full Blocks
    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block", properties -> new Block(properties
            .strength(5.0f, 6.0f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block EMPOWERED_NETHERITE_BLOCK = registerBlock("empowered_netherite_block", properties -> new Block(properties
            .strength(50.0f,1200.0f)
            .sound(SoundType.NETHERITE_BLOCK)
            .requiresCorrectToolForDrops()));
    public static final Block BARREL_OF_APPLES_BLOCK = registerBlock("barrel_of_apples", properties -> new RotatedPillarBlock(properties
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)
            .requiresCorrectToolForDrops()));
    public static final Block BARREL_OF_POTATOES_BLOCK = registerBlock("barrel_of_potatoes", properties -> new RotatedPillarBlock(properties
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)
            .requiresCorrectToolForDrops()));
    public static final Block BARREL_OF_CARROTS_BLOCK = registerBlock("barrel_of_carrots", properties -> new RotatedPillarBlock(properties
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)
            .requiresCorrectToolForDrops()));
    public static final Block BARREL_OF_CHORUS_BLOCK = registerBlock("barrel_of_chorus_fruits", properties -> new RotatedPillarBlock(properties
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)
            .requiresCorrectToolForDrops()));
    public static final Block BARREL_OF_SWEETBERRIES_BLOCK = registerBlock("barrel_of_sweet_berries", properties -> new RotatedPillarBlock(properties
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)
            .requiresCorrectToolForDrops()));
    public static final Block BARREL_OF_BEETROOTS_BLOCK = registerBlock("barrel_of_beetroots", properties -> new RotatedPillarBlock(properties
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)
            .requiresCorrectToolForDrops()));
    public static final Block BUNDLED_STICKS_BLOCK = registerBlock("block_of_bundled_sticks", properties -> new RotatedPillarBlock(properties
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)
            .requiresCorrectToolForDrops()));

    //Fired Bricks
    public static final Block FIRED_BRICKS = registerBlock("fired_bricks", properties -> new Block(properties
            .strength(2.0f, 6.0f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block FIRED_BRICK_STAIRS = registerBlock("fired_brick_stairs", properties -> new StairBlock(BlockRegHandler.FIRED_BRICKS.defaultBlockState(),
            properties.strength(2.0f, 6.0f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));
    public static final Block FIRED_BRICK_SLAB = registerBlock("fired_brick_slab", properties -> new SlabBlock(properties.strength(2.0f, 6.0f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block FIRED_BRICK_WALL = registerBlock("fired_brick_wall", properties -> new WallBlock(properties
            .strength(2.0f, 6.0f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

    //Regular Quartz
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs", properties -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(),
            properties.strength(0.8f,0.8f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab", properties -> new SlabBlock(properties.strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

    public static final Block QUARTZ_WALL = registerBlock("quartz_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));


    //Smoked Quartz
    public static final Block SMOKED_QUARTZ_BLOCK = registerBlock("smoked_quartz_block", properties -> new Block(properties
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
    public static final Block SMOKED_QUARTZ_PILLAR = registerBlock("smoked_quartz_pillar", properties -> new RotatedPillarBlock(properties
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
    public static final Block SMOKED_QUARTZ_BRICK_STAIRS = registerBlock("smoked_quartz_brick_stairs", properties -> new StairBlock(BlockRegHandler.SMOKED_QUARTZ_BRICKS.defaultBlockState(),
            properties.strength(0.8f,0.8f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    public static final Block SMOKED_QUARTZ_SLAB = registerBlock("smoked_quartz_slab", properties -> new SlabBlock(properties.strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOOTH_SMOKED_QUARTZ_SLAB = registerBlock("smooth_smoked_quartz_slab", properties -> new SlabBlock(properties.strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOKED_QUARTZ_BRICK_SLAB = registerBlock("smoked_quartz_brick_slab", properties -> new SlabBlock(properties.strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

    public static final Block SMOKED_QUARTZ_WALL = registerBlock("smoked_quartz_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOKED_QUARTZ_BRICK_WALL = registerBlock("smoked_quartz_brick_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOOTH_SMOKED_QUARTZ_WALL = registerBlock("smooth_smoked_quartz_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

    //Burned Quartz
    public static final Block BURNT_QUARTZ_BLOCK = registerBlock("burnt_quartz_block", properties -> new Block(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block BURNT_QUARTZ_PILLAR = registerBlock("burnt_quartz_pillar", properties -> new RotatedPillarBlock(properties
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
    public static final Block BURNT_QUARTZ_BRICK_STAIRS = registerBlock("burnt_quartz_brick_stairs", properties -> new StairBlock(BlockRegHandler.BURNT_QUARTZ_BRICKS.defaultBlockState(),
            properties.strength(0.8f,0.8f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));
    public static final Block BURNT_QUARTZ_SLAB = registerBlock("burnt_quartz_slab", properties -> new SlabBlock(properties.strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOOTH_BURNT_QUARTZ_SLAB = registerBlock("smooth_burnt_quartz_slab", properties -> new SlabBlock(properties.strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block BURNT_QUARTZ_BRICK_SLAB = registerBlock("burnt_quartz_brick_slab", properties -> new SlabBlock(properties.strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block BURNT_QUARTZ_WALL = registerBlock("burnt_quartz_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block BURNT_QUARTZ_BRICK_WALL = registerBlock("burnt_quartz_brick_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOOTH_BURNT_QUARTZ_WALL = registerBlock("smooth_burnt_quartz_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function){
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, name), toRegister);
    }

    public static void registerBlockItem(String name, Block block){
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, name)))));
    }

    public static void registerModBlocks(){
        VanillaExpansion.LOGGER.info("Registering Blocks for " + VanillaExpansion.MOD_ID);
    }

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }
}
