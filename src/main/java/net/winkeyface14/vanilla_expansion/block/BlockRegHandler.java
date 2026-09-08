package net.winkeyface14.vanilla_expansion.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.winkeyface14.vanilla_expansion.VanillaExpansion;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class BlockRegHandler {
    public static final Map<DyeColor, Block> DYED_TERRACOTTA_STAIRS = new EnumMap<>(DyeColor.class);
    public static final Map<DyeColor, Block> DYED_TERRACOTTA_SLAB = new EnumMap<>(DyeColor.class);
    public static final Map<DyeColor, Block> DYED_TERRACOTTA_WALL = new EnumMap<>(DyeColor.class);
    public static final Map<DyeColor, Block> DYED_WOOL_STAIRS = new EnumMap<>(DyeColor.class);
    public static final Map<DyeColor, Block> DYED_WOOL_SLAB = new EnumMap<>(DyeColor.class);
    public static final Map<DyeColor, Block> DYED_WOOL_WALL = new EnumMap<>(DyeColor.class);
    public static final Map<DyeColor, Block> DYED_CONCRETE_STAIRS = new EnumMap<>(DyeColor.class);
    public static final Map<DyeColor, Block> DYED_CONCRETE_SLAB = new EnumMap<>(DyeColor.class);
    public static final Map<DyeColor, Block> DYED_CONCRETE_WALL = new EnumMap<>(DyeColor.class);

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
            .strength(1.0f, 4.0f)
            .sound(SoundType.WOOD)));
    public static final Block BARREL_OF_POTATOES_BLOCK = registerBlock("barrel_of_potatoes", properties -> new RotatedPillarBlock(properties
            .strength(1.0f, 4.0f)
            .sound(SoundType.WOOD)));
    public static final Block BARREL_OF_CARROTS_BLOCK = registerBlock("barrel_of_carrots", properties -> new RotatedPillarBlock(properties
            .strength(1.0f, 4.0f)
            .sound(SoundType.WOOD)));
    public static final Block BARREL_OF_CHORUS_BLOCK = registerBlock("barrel_of_chorus_fruits", properties -> new RotatedPillarBlock(properties
            .strength(1.0f, 4.0f)
            .sound(SoundType.WOOD)));
    public static final Block BARREL_OF_SWEETBERRIES_BLOCK = registerBlock("barrel_of_sweet_berries", properties -> new RotatedPillarBlock(properties
            .strength(1.0f, 4.0f)
            .sound(SoundType.WOOD)));
    public static final Block BARREL_OF_BEETROOTS_BLOCK = registerBlock("barrel_of_beetroots", properties -> new RotatedPillarBlock(properties
            .strength(1.0f, 4.0f)
            .sound(SoundType.WOOD)));
    public static final Block BUNDLED_STICKS_BLOCK = registerBlock("block_of_bundled_sticks", properties -> new RotatedPillarBlock(properties
            .strength(0.5f, 4.0f)
            .sound(SoundType.WOOD)));

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

    //Smooth Stone
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs", properties -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(),
            properties.strength(0.8f,0.8f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

    //Smooth Sandstone
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

    //Cut Sandstone
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs", properties -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(),
            properties.strength(0.8f,0.8f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

    //Cut Red Sandstone
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs", properties -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(),
            properties.strength(0.8f,0.8f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall", properties -> new WallBlock(properties
            .strength(0.8f,0.8f)
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

    //Dyed Blocks

    //Terracotta
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs", properties -> new StairBlock(Blocks.TERRACOTTA.defaultBlockState(), properties
            .strength(1.25f,4.2f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

    public static void registerDyedStairs() {
        for (DyeColor color : DyeColor.values()) {
            String blockTerracotta = color.getName() + "_terracotta_stairs";
            String blockWool = color.getName() + "_wool_stairs";
            String blockConcrete = color.getName() + "_concrete_stairs";

            Block baseTerracotta = BuiltInRegistries.BLOCK.getValue(
                    Identifier.fromNamespaceAndPath("minecraft", color.getName() + "_terracotta")
            );
            Block baseWool = BuiltInRegistries.BLOCK.getValue(
                    Identifier.fromNamespaceAndPath("minecraft", color.getName() + "_wool")
            );
            Block baseConcrete = BuiltInRegistries.BLOCK.getValue(
                    Identifier.fromNamespaceAndPath("minecraft", color.getName() + "_concrete")
            );

            Block stairsTerracotta = registerBlock(blockTerracotta, properties ->
                    new StairBlock(baseTerracotta.defaultBlockState(), properties
                            .strength(1.25f, 4.2f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            );
            Block stairsWool = registerBlock(blockWool, properties ->
                    new StairBlock(baseWool.defaultBlockState(), properties
                            .strength(0.8f, 0.8f)
                            .sound(SoundType.WOOL)
                            .requiresCorrectToolForDrops())
            );
            Block stairsConcrete = registerBlock(blockConcrete, properties ->
                    new StairBlock(baseConcrete.defaultBlockState(), properties
                            .strength(1.8f, 1.8f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            );

            DYED_TERRACOTTA_STAIRS.put(color, stairsTerracotta);
            DYED_WOOL_STAIRS.put(color, stairsWool);
            DYED_CONCRETE_STAIRS.put(color, stairsConcrete);
        }
    }

    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab", properties -> new SlabBlock(properties
            .strength(1.25f,4.2f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

    public static void registerDyedSlabs() {
        for (DyeColor color : DyeColor.values()) {
            String blockTerracotta = color.getName() + "_terracotta_slab";
            String blockWool = color.getName() + "_wool_slab";
            String blockConcrete = color.getName() + "_concrete_slab";

            Block slabTerracotta = registerBlock(blockTerracotta, properties ->
                    new SlabBlock(properties
                            .strength(1.25f, 4.2f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            );
            Block slabWool = registerBlock(blockWool, properties ->
                    new SlabBlock(properties
                            .strength(0.8f, 0.8f)
                            .sound(SoundType.WOOL)
                            .requiresCorrectToolForDrops())
            );
            Block slabConcrete = registerBlock(blockConcrete, properties ->
                    new SlabBlock(properties
                            .strength(1.8f, 1.8f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            );

            DYED_TERRACOTTA_SLAB.put(color, slabTerracotta);
            DYED_WOOL_SLAB.put(color, slabWool);
            DYED_CONCRETE_SLAB.put(color, slabConcrete);
        }
    }

    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall", properties -> new WallBlock(properties
            .strength(1.25f,4.2f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

    public static void registerDyedWall() {
        for (DyeColor color : DyeColor.values()) {
            String blockTerracotta = color.getName() + "_terracotta_wall";
            String blockWool = color.getName() + "_wool_wall";
            String blockConcrete = color.getName() + "_concrete_wall";

            Block wallTerracotta = registerBlock(blockTerracotta, properties ->
                    new WallBlock(properties
                            .strength(1.25f, 4.2f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            );
            Block wallWool = registerBlock(blockWool, properties ->
                    new WallBlock(properties
                            .strength(0.8f, 0.8f)
                            .sound(SoundType.WOOL)
                            .requiresCorrectToolForDrops())
            );
            Block wallConcrete = registerBlock(blockConcrete, properties ->
                    new WallBlock(properties
                            .strength(1.8f, 1.8f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            );

            DYED_TERRACOTTA_WALL.put(color, wallTerracotta);
            DYED_WOOL_WALL.put(color, wallWool);
            DYED_CONCRETE_WALL.put(color, wallConcrete);
        }
    }

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

        registerDyedStairs();
        registerDyedSlabs();
        registerDyedWall();
    }

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }
}
