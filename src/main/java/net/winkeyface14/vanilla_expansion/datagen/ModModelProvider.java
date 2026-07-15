package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.winkeyface14.vanilla_expansion.item.ArmorMaterialBase;
import net.winkeyface14.vanilla_expansion.block.BlockRegHandler;
import net.winkeyface14.vanilla_expansion.item.ItemRegHandler;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        boolean barrelModelGen = true;
        boolean quartzSetModelGen = true;

        TexturedModel.Provider wallCubeProvider = TexturedModel.createDefault(
                block -> TextureMapping.cube(block).put(TextureSlot.WALL, TextureMapping.getBlockTexture(block)),
                ModelTemplates.CUBE_ALL
        );

        blockModelGenerators.createTrivialCube(BlockRegHandler.EMPOWERED_NETHERITE_BLOCK);
        blockModelGenerators.createTrivialCube(BlockRegHandler.CHARCOAL_BLOCK);

        blockModelGenerators.createAxisAlignedPillarBlock(BlockRegHandler.BUNDLED_STICKS_BLOCK, TexturedModel.COLUMN);

        if (barrelModelGen) {
            cropBarrelDataGen(BlockRegHandler.BARREL_OF_APPLES_BLOCK,  blockModelGenerators);
            cropBarrelDataGen(BlockRegHandler.BARREL_OF_POTATOES_BLOCK,  blockModelGenerators);
            cropBarrelDataGen(BlockRegHandler.BARREL_OF_CARROTS_BLOCK,  blockModelGenerators);
            cropBarrelDataGen(BlockRegHandler.BARREL_OF_SWEETBERRIES_BLOCK,  blockModelGenerators);
            cropBarrelDataGen(BlockRegHandler.BARREL_OF_BEETROOTS_BLOCK,  blockModelGenerators);
            cropBarrelDataGen(BlockRegHandler.BARREL_OF_CHORUS_BLOCK,  blockModelGenerators);
        }

        //Quartz
        customWallModelGen(Blocks.QUARTZ_BLOCK, BlockRegHandler.QUARTZ_WALL, "_side", blockModelGenerators);
        customWallModelGen(Blocks.QUARTZ_BLOCK, BlockRegHandler.SMOOTH_QUARTZ_WALL, "_bottom", blockModelGenerators);
        customWallModelGen(Blocks.QUARTZ_BRICKS, BlockRegHandler.QUARTZ_BRICK_WALL, "", blockModelGenerators);

        customStairsModelGen(Blocks.QUARTZ_BRICKS, BlockRegHandler.QUARTZ_BRICK_STAIRS, "", blockModelGenerators);

        customSlabModelGen(Blocks.QUARTZ_BRICKS, BlockRegHandler.QUARTZ_BRICK_SLAB, "", blockModelGenerators);

        //Smooth Stone
        customStairsModelGen(Blocks.SMOOTH_STONE, BlockRegHandler.SMOOTH_STONE_STAIRS, "", blockModelGenerators);
        customWallModelGen(Blocks.SMOOTH_STONE, BlockRegHandler.SMOOTH_STONE_WALL, "", blockModelGenerators);

        //Smooth Sandstone
        customWallModelGen(Blocks.SANDSTONE,BlockRegHandler.SMOOTH_SANDSTONE_WALL, "_top", blockModelGenerators);

        //Smooth Red Sandstone
        customWallModelGen(Blocks.RED_SANDSTONE,BlockRegHandler.SMOOTH_RED_SANDSTONE_WALL, "_top", blockModelGenerators);

        //Cut Sandstone
        customCutSandstoneStairsModelGen(Blocks.CUT_SANDSTONE,Blocks.SANDSTONE, Blocks.SANDSTONE, BlockRegHandler.CUT_SANDSTONE_STAIRS, "_top", "_bottom", blockModelGenerators);
        customWallModelGen(Blocks.CUT_SANDSTONE, BlockRegHandler.CUT_SANDSTONE_WALL, "", blockModelGenerators);

        //Cut Red Sandstone
        customCutSandstoneStairsModelGen(Blocks.CUT_RED_SANDSTONE,Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, BlockRegHandler.CUT_RED_SANDSTONE_STAIRS, "_top", "_bottom", blockModelGenerators);
        customWallModelGen(Blocks.CUT_RED_SANDSTONE, BlockRegHandler.CUT_RED_SANDSTONE_WALL, "", blockModelGenerators);

        blockModelGenerators.family(BlockRegHandler.FIRED_BRICKS)
                .stairs(BlockRegHandler.FIRED_BRICK_STAIRS)
                .slab(BlockRegHandler.FIRED_BRICK_SLAB)
                .wall(BlockRegHandler.FIRED_BRICK_WALL);

        blockModelGenerators.family(BlockRegHandler.SMOKED_QUARTZ_BLOCK)
                .stairs(BlockRegHandler.SMOKED_QUARTZ_STAIRS)
                .slab(BlockRegHandler.SMOKED_QUARTZ_SLAB)
                .wall(BlockRegHandler.SMOKED_QUARTZ_WALL);
        blockModelGenerators.family(BlockRegHandler.SMOOTH_SMOKED_QUARTZ)
                .stairs(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_STAIRS)
                .slab(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_SLAB)
                .wall(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_WALL);
        blockModelGenerators.family(BlockRegHandler.SMOKED_QUARTZ_BRICKS)
                .stairs(BlockRegHandler.SMOKED_QUARTZ_BRICK_STAIRS)
                .slab(BlockRegHandler.SMOKED_QUARTZ_BRICK_SLAB)
                .wall(BlockRegHandler.SMOKED_QUARTZ_BRICK_WALL);
        blockModelGenerators.createTrivialBlock(BlockRegHandler.CHISELED_SMOKED_QUARTZ_BLOCK,TexturedModel.COLUMN);
        blockModelGenerators.createAxisAlignedPillarBlock(BlockRegHandler.SMOKED_QUARTZ_PILLAR, TexturedModel.COLUMN);

        blockModelGenerators.family(BlockRegHandler.BURNT_QUARTZ_BLOCK)
                .stairs(BlockRegHandler.BURNT_QUARTZ_STAIRS)
                .slab(BlockRegHandler.BURNT_QUARTZ_SLAB)
                .wall(BlockRegHandler.BURNT_QUARTZ_WALL);
        blockModelGenerators.family(BlockRegHandler.SMOOTH_BURNT_QUARTZ)
                .stairs(BlockRegHandler.SMOOTH_BURNT_QUARTZ_STAIRS)
                .slab(BlockRegHandler.SMOOTH_BURNT_QUARTZ_SLAB)
                .wall(BlockRegHandler.SMOOTH_BURNT_QUARTZ_WALL);
        blockModelGenerators.family(BlockRegHandler.BURNT_QUARTZ_BRICKS)
                .stairs(BlockRegHandler.BURNT_QUARTZ_BRICK_STAIRS)
                .slab(BlockRegHandler.BURNT_QUARTZ_BRICK_SLAB)
                .wall(BlockRegHandler.BURNT_QUARTZ_BRICK_WALL);
        blockModelGenerators.createTrivialBlock(BlockRegHandler.CHISELED_BURNT_QUARTZ_BLOCK,
                TexturedModel.COLUMN
        );
        blockModelGenerators.createAxisAlignedPillarBlock(BlockRegHandler.BURNT_QUARTZ_PILLAR, TexturedModel.COLUMN);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ItemRegHandler.COAL_CHUNK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.CHARCOAL_CHUNK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.BUNDLED_STICKS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.PAPER_PILE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.RAW_REINFORCED_LEATHER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REINFORCED_LEATHER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.FIRED_BRICK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.QUARTZ_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.SMOKED_QUARTZ_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.BURNT_QUARTZ_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.SMOKED_QUARTZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.BURNT_QUARTZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.DIAMOND_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMERALD_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMPOWERED_NETHERITE_SCRAP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMPOWERED_NETHERITE, ModelTemplates.FLAT_ITEM);

        //Tool and Weapon Heads
        itemModelGenerators.generateFlatItem(ItemRegHandler.STONE_SWORD_BLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.STONE_SPEAR_TIP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.STONE_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.STONE_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.STONE_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.STONE_HOE_HEAD, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ItemRegHandler.COPPER_SWORD_BLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.COPPER_SPEAR_TIP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.COPPER_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.COPPER_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.COPPER_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.COPPER_HOE_HEAD, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ItemRegHandler.IRON_SWORD_BLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.IRON_SPEAR_TIP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.IRON_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.IRON_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.IRON_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.IRON_HOE_HEAD, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ItemRegHandler.GOLD_SWORD_BLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.GOLD_SPEAR_TIP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.GOLD_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.GOLD_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.GOLD_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.GOLD_HOE_HEAD, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ItemRegHandler.DIAMOND_SWORD_BLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.DIAMOND_SPEAR_TIP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.DIAMOND_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.DIAMOND_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.DIAMOND_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.DIAMOND_HOE_HEAD, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_SWORD_BLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_SPEAR_TIP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_HOE_HEAD, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ItemRegHandler.EMERALD_SWORD_BLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMERALD_SPEAR_TIP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMERALD_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMERALD_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMERALD_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMERALD_HOE_HEAD, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ItemRegHandler.QUARTZ_SWORD_BLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.QUARTZ_SPEAR_TIP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.QUARTZ_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.QUARTZ_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.QUARTZ_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.QUARTZ_HOE_HEAD, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ItemRegHandler.SMOKED_QUARTZ_SWORD_BLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.SMOKED_QUARTZ_SPEAR_TIP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.SMOKED_QUARTZ_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.SMOKED_QUARTZ_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.SMOKED_QUARTZ_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.SMOKED_QUARTZ_HOE_HEAD, ModelTemplates.FLAT_ITEM);

        //Tool Upgrade Template
        itemModelGenerators.generateFlatItem(ItemRegHandler.BASE_TEMPLATE, ModelTemplates.FLAT_ITEM);

        //Sword
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMERALD_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.LAPIS_LAZULI_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.QUARTZ_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.SMOKED_QUARTZ_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.BURNT_QUARTZ_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMPOWERED_NETHERITE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);

        //Shovel
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMERALD_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.LAPIS_LAZULI_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.QUARTZ_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.SMOKED_QUARTZ_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.BURNT_QUARTZ_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMPOWERED_NETHERITE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);

        //Pickaxe
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMERALD_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.LAPIS_LAZULI_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.QUARTZ_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.SMOKED_QUARTZ_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.BURNT_QUARTZ_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMPOWERED_NETHERITE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);

        //Axe
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMERALD_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.LAPIS_LAZULI_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.QUARTZ_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.SMOKED_QUARTZ_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.BURNT_QUARTZ_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMPOWERED_NETHERITE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);

        //Hoes
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMERALD_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.LAPIS_LAZULI_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.QUARTZ_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.SMOKED_QUARTZ_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.BURNT_QUARTZ_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.EMPOWERED_NETHERITE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);

        //Spears
        itemModelGenerators.generateSpear(ItemRegHandler.EMERALD_SPEAR);
        itemModelGenerators.generateSpear(ItemRegHandler.LAPIS_LAZULI_SPEAR);
        itemModelGenerators.generateSpear(ItemRegHandler.REDSTONE_SPEAR);
        itemModelGenerators.generateSpear(ItemRegHandler.QUARTZ_SPEAR);
        itemModelGenerators.generateSpear(ItemRegHandler.SMOKED_QUARTZ_SPEAR);
        itemModelGenerators.generateSpear(ItemRegHandler.BURNT_QUARTZ_SPEAR);
        itemModelGenerators.generateSpear(ItemRegHandler.EMPOWERED_NETHERITE_SPEAR);

        //Helmet
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMERALD_HELMET, ArmorMaterialBase.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.LAPIS_LAZULI_HELMET, ArmorMaterialBase.LAPIS_LAZULI_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.ARMADILLO_SCUTE_HELMET, ArmorMaterialBase.ARMADILLO_SCUTE_PLAYER_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMPOWERED_NETHERITE_HELMET, ArmorMaterialBase.EMPOWERED_NETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.REINFORCED_LEATHER_HELMET, ArmorMaterialBase.REINFORCED_LEATHER_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);

        //Chestplate
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMERALD_CHESTPLATE, ArmorMaterialBase.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.LAPIS_LAZULI_CHESTPLATE, ArmorMaterialBase.LAPIS_LAZULI_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.ARMADILLO_SCUTE_CHESTPLATE, ArmorMaterialBase.ARMADILLO_SCUTE_PLAYER_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMPOWERED_NETHERITE_CHESTPLATE, ArmorMaterialBase.EMPOWERED_NETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.REINFORCED_LEATHER_CHESTPLATE, ArmorMaterialBase.REINFORCED_LEATHER_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);

        //Leggings
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMERALD_LEGGINGS, ArmorMaterialBase.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.LAPIS_LAZULI_LEGGINGS, ArmorMaterialBase.LAPIS_LAZULI_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.ARMADILLO_SCUTE_LEGGINGS, ArmorMaterialBase.ARMADILLO_SCUTE_PLAYER_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMPOWERED_NETHERITE_LEGGINGS, ArmorMaterialBase.EMPOWERED_NETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.REINFORCED_LEATHER_LEGGINGS, ArmorMaterialBase.REINFORCED_LEATHER_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);

        //Boots
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMERALD_BOOTS, ArmorMaterialBase.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.LAPIS_LAZULI_BOOTS, ArmorMaterialBase.LAPIS_LAZULI_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.ARMADILLO_SCUTE_BOOTS, ArmorMaterialBase.ARMADILLO_SCUTE_PLAYER_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMPOWERED_NETHERITE_BOOTS, ArmorMaterialBase.EMPOWERED_NETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.REINFORCED_LEATHER_BOOTS, ArmorMaterialBase.REINFORCED_LEATHER_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
    }

    public void customWallModelGen (Block blockBase, Block blockResult, String textureSuffix, BlockModelGenerators blockModelGenerators){

        Material blockTexture = TextureMapping.getBlockTexture(blockBase, textureSuffix);

        TextureMapping wallTextures = new TextureMapping()
                .put(TextureSlot.WALL, blockTexture)
                .put(TextureSlot.PARTICLE, blockTexture);


        Identifier post = ModelTemplates.WALL_POST.create(blockResult, wallTextures, blockModelGenerators.modelOutput);
        Identifier low  = ModelTemplates.WALL_LOW_SIDE.create(blockResult, wallTextures, blockModelGenerators.modelOutput);
        Identifier tall = ModelTemplates.WALL_TALL_SIDE.create(blockResult, wallTextures, blockModelGenerators.modelOutput);

        blockModelGenerators.blockStateOutput.accept(
                BlockModelGenerators.createWall(
                        blockResult,
                        BlockModelGenerators.plainVariant(post),
                        BlockModelGenerators.plainVariant(low),
                        BlockModelGenerators.plainVariant(tall)
                )
        );

        ModelTemplates.WALL_INVENTORY.create(
                ModelLocationUtils.getModelLocation(blockResult),
                wallTextures,
                blockModelGenerators.modelOutput
        );
    }

    public void customStairsModelGen(Block blockBase, Block blockResult, String textureSuffix, BlockModelGenerators blockModelGenerators) {
        Material blockTexture = TextureMapping.getBlockTexture(blockBase, textureSuffix);

        TextureMapping stairTextures = new TextureMapping()
                .put(TextureSlot.BOTTOM, blockTexture)
                .put(TextureSlot.TOP, blockTexture)
                .put(TextureSlot.SIDE, blockTexture)
                .put(TextureSlot.PARTICLE, blockTexture);

        Identifier straight = ModelTemplates.STAIRS_STRAIGHT.create(blockResult, stairTextures, blockModelGenerators.modelOutput);
        Identifier inner    = ModelTemplates.STAIRS_INNER.create(blockResult, stairTextures, blockModelGenerators.modelOutput);
        Identifier outer    = ModelTemplates.STAIRS_OUTER.create(blockResult, stairTextures, blockModelGenerators.modelOutput);

        blockModelGenerators.blockStateOutput.accept(
                BlockModelGenerators.createStairs(
                        blockResult,
                        BlockModelGenerators.plainVariant(inner),
                        BlockModelGenerators.plainVariant(straight),
                        BlockModelGenerators.plainVariant(outer))
        );
    }

    public void customSlabModelGen(Block blockBase, Block blockResult, String textureSuffix, BlockModelGenerators blockModelGenerators) {
        Material blockTexture = TextureMapping.getBlockTexture(blockBase, textureSuffix);

        TextureMapping slabTextures = new TextureMapping()
                .put(TextureSlot.BOTTOM, blockTexture)
                .put(TextureSlot.TOP, blockTexture)
                .put(TextureSlot.SIDE, blockTexture)
                .put(TextureSlot.PARTICLE, blockTexture);

        Identifier bottom = ModelTemplates.SLAB_BOTTOM.create(blockResult, slabTextures, blockModelGenerators.modelOutput);
        Identifier top    = ModelTemplates.SLAB_TOP.create(blockResult, slabTextures, blockModelGenerators.modelOutput);

        Identifier doubleSlab = ModelLocationUtils.getModelLocation(blockBase);

        blockModelGenerators.blockStateOutput.accept(
                BlockModelGenerators.createSlab(
                        blockResult,
                        BlockModelGenerators.plainVariant(bottom),
                        BlockModelGenerators.plainVariant(top),
                        BlockModelGenerators.plainVariant(doubleSlab)
                )
        );
    }

    public void cropBarrelDataGen(Block blockResult, BlockModelGenerators blockModelGenerators){
        blockModelGenerators.createTrivialBlock(blockResult, TexturedModel.createDefault(
                block -> new TextureMapping()
                        .put(TextureSlot.TOP, TextureMapping.getBlockTexture(block, "_top"))
                        .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(Blocks.BARREL, "_bottom"))
                        .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(block, "_side")),
                ModelTemplates.CUBE_BOTTOM_TOP
        ));
    }

    public void customCutSandstoneStairsModelGen(Block blockSide, Block blockTop, Block blockBottom, Block blockResult, String topSuffix, String bottomSuffix, BlockModelGenerators blockModelGenerators) {
        Material blockTexture = TextureMapping.getBlockTexture(blockSide);
        Material topTexture = TextureMapping.getBlockTexture(blockTop, topSuffix);
        Material bottomTexture = TextureMapping.getBlockTexture(blockBottom, bottomSuffix);

        TextureMapping stairTextures = new TextureMapping()
                .put(TextureSlot.BOTTOM, bottomTexture)
                .put(TextureSlot.TOP, topTexture)
                .put(TextureSlot.SIDE, blockTexture)
                .put(TextureSlot.PARTICLE, blockTexture);

        Identifier straight = ModelTemplates.STAIRS_STRAIGHT.create(blockResult, stairTextures, blockModelGenerators.modelOutput);
        Identifier inner    = ModelTemplates.STAIRS_INNER.create(blockResult, stairTextures, blockModelGenerators.modelOutput);
        Identifier outer    = ModelTemplates.STAIRS_OUTER.create(blockResult, stairTextures, blockModelGenerators.modelOutput);

        blockModelGenerators.blockStateOutput.accept(
                BlockModelGenerators.createStairs(
                        blockResult,
                        BlockModelGenerators.plainVariant(inner),
                        BlockModelGenerators.plainVariant(straight),
                        BlockModelGenerators.plainVariant(outer))
        );
    }

}
