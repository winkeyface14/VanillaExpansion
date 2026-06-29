package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
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

        blockModelGenerators.createTrivialCube(BlockRegHandler.EMPOWERED_NETHERITE_BLOCK);
        blockModelGenerators.createTrivialCube(BlockRegHandler.CHARCOAL_BLOCK);

        blockModelGenerators.createAxisAlignedPillarBlock(BlockRegHandler.BUNDLED_STICKS_BLOCK, TexturedModel.COLUMN);
        blockModelGenerators.createTrivialBlock(BlockRegHandler.BARREL_OF_APPLES_BLOCK,TexturedModel.CUBE_TOP_BOTTOM);
        blockModelGenerators.createTrivialBlock(BlockRegHandler.BARREL_OF_POTATOES_BLOCK,TexturedModel.CUBE_TOP_BOTTOM);
        blockModelGenerators.createTrivialBlock(BlockRegHandler.BARREL_OF_CARROTS_BLOCK,TexturedModel.CUBE_TOP_BOTTOM);
        blockModelGenerators.createTrivialBlock(BlockRegHandler.BARREL_OF_SWEETBERRY_BLOCK,TexturedModel.CUBE_TOP_BOTTOM);
        blockModelGenerators.createTrivialBlock(BlockRegHandler.BARREL_OF_CHORUS_BLOCK,TexturedModel.CUBE_TOP_BOTTOM);

        blockModelGenerators.family(BlockRegHandler.FIRED_BRICKS)
                .stairs(BlockRegHandler.FIRED_BRICKS_STAIRS)
                .slab(BlockRegHandler.FIRED_BRICKS_SLAB)
                .wall(BlockRegHandler.FIRED_BRICKS_WALL);

        //blockModelGenerators.family(Blocks.QUARTZ_BLOCK).wall(BlockRegHandler.QUARTZ_WALL);
        //blockModelGenerators.family(Blocks.QUARTZ_BRICKS).wall(BlockRegHandler.QUARTZ_BRICKS_WALL);

        /*TextureMapping regularQuartzMap = TextureMapping.cube(Blocks.QUARTZ_BLOCK)
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(Blocks.QUARTZ_BLOCK));

        Identifier regularPostId = ModelTemplates.WALL_POST.create(BlockRegHandler.QUARTZ_WALL, regularQuartzMap, blockModelGenerators.modelOutput);
        Identifier regularLowSideId = ModelTemplates.WALL_LOW_SIDE.create(BlockRegHandler.QUARTZ_WALL, regularQuartzMap, blockModelGenerators.modelOutput);
        Identifier regularTallSideId = ModelTemplates.WALL_TALL_SIDE.create(BlockRegHandler.QUARTZ_WALL, regularQuartzMap, blockModelGenerators.modelOutput);

        ModelTemplates.WALL_INVENTORY.create(BlockRegHandler.QUARTZ_WALL, regularQuartzMap, blockModelGenerators.modelOutput);

        MultiVariant regularPost = BlockModelGenerators.plainVariant(regularPostId);
        MultiVariant regularLowSide = BlockModelGenerators.plainVariant(regularLowSideId);
        MultiVariant regularTallSide = BlockModelGenerators.plainVariant(regularTallSideId);

        blockModelGenerators.blockStateOutput.accept(
                blockModelGenerators.createWall(BlockRegHandler.QUARTZ_WALL, regularPost, regularLowSide, regularTallSide)
        );

        TextureMapping quartzBricksMap = TextureMapping.cube(Blocks.QUARTZ_BRICKS)
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(Blocks.QUARTZ_BRICKS));

        Identifier bricksPostId = ModelTemplates.WALL_POST.create(BlockRegHandler.QUARTZ_BRICKS_WALL, quartzBricksMap, blockModelGenerators.modelOutput);
        Identifier bricksLowSideId = ModelTemplates.WALL_LOW_SIDE.create(BlockRegHandler.QUARTZ_BRICKS_WALL, quartzBricksMap, blockModelGenerators.modelOutput);
        Identifier bricksTallSideId = ModelTemplates.WALL_TALL_SIDE.create(BlockRegHandler.QUARTZ_BRICKS_WALL, quartzBricksMap, blockModelGenerators.modelOutput);

        ModelTemplates.WALL_INVENTORY.create(BlockRegHandler.QUARTZ_BRICKS_WALL, quartzBricksMap, blockModelGenerators.modelOutput);

        MultiVariant bricksPost = BlockModelGenerators.plainVariant(bricksPostId);
        MultiVariant bricksLowSide = BlockModelGenerators.plainVariant(bricksLowSideId);
        MultiVariant bricksTallSide = BlockModelGenerators.plainVariant(bricksTallSideId);

        blockModelGenerators.blockStateOutput.accept(
                blockModelGenerators.createWall(BlockRegHandler.QUARTZ_BRICKS_WALL, bricksPost, bricksLowSide, bricksTallSide)
        );*/

        blockModelGenerators.family(BlockRegHandler.SMOKED_QUARTZ_BLOCK)
                .stairs(BlockRegHandler.SMOKED_QUARTZ_STAIRS)
                .slab(BlockRegHandler.SMOKED_QUARTZ_SLAB)
                .wall(BlockRegHandler.SMOKED_QUARTZ_WALL);
        blockModelGenerators.family(BlockRegHandler.SMOOTH_SMOKED_QUARTZ)
                .stairs(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_STAIRS)
                .slab(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_SLAB);
        blockModelGenerators.family(BlockRegHandler.SMOKED_QUARTZ_BRICKS)
                .stairs(BlockRegHandler.SMOKED_QUARTZ_BRICKS_STAIRS)
                .slab(BlockRegHandler.SMOKED_QUARTZ_BRICKS_SLAB)
                .wall(BlockRegHandler.SMOKED_QUARTZ_BRICKS_WALL);
        blockModelGenerators.createTrivialBlock(BlockRegHandler.CHISELED_SMOKED_QUARTZ_BLOCK,TexturedModel.COLUMN);
        blockModelGenerators.createAxisAlignedPillarBlock(BlockRegHandler.SMOKED_QUARTZ_PILLAR, TexturedModel.COLUMN);

        blockModelGenerators.family(BlockRegHandler.BURNT_QUARTZ_BLOCK)
                .stairs(BlockRegHandler.BURNT_QUARTZ_STAIRS)
                .slab(BlockRegHandler.BURNT_QUARTZ_SLAB)
                .wall(BlockRegHandler.BURNT_QUARTZ_WALL);
        blockModelGenerators.family(BlockRegHandler.SMOOTH_BURNT_QUARTZ)
                .stairs(BlockRegHandler.SMOOTH_BURNT_QUARTZ_STAIRS)
                .slab(BlockRegHandler.SMOOTH_BURNT_QUARTZ_SLAB);
        blockModelGenerators.family(BlockRegHandler.BURNT_QUARTZ_BRICKS)
                .stairs(BlockRegHandler.BURNT_QUARTZ_BRICKS_STAIRS)
                .slab(BlockRegHandler.BURNT_QUARTZ_BRICKS_SLAB)
                .wall(BlockRegHandler.BURNT_QUARTZ_BRICKS_WALL);
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
        itemModelGenerators.generateFlatItem(ItemRegHandler.STONE_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.STONE_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.STONE_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.STONE_HOE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.IRON_SWORD_BLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.IRON_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.IRON_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.IRON_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.IRON_HOE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.GOLD_SWORD_BLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.GOLD_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.GOLD_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.GOLD_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.GOLD_HOE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.DIAMOND_SWORD_BLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.DIAMOND_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.DIAMOND_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.DIAMOND_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.DIAMOND_HOE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.NETHERITE_SWORD_BLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.NETHERITE_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.NETHERITE_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.NETHERITE_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.NETHERITE_HOE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_SWORD_BLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_SHOVEL_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_AXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ItemRegHandler.REDSTONE_HOE_HEAD, ModelTemplates.FLAT_ITEM);

        //Tool Upgrade Tempalte
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

        //Spears (To Be Added)

        //Helmet
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMERALD_HELMET, ArmorMaterialBase.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.LAPIS_LAZULI_HELMET, ArmorMaterialBase.LAPIS_LAZULI_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMPOWERED_NETHERITE_HELMET, ArmorMaterialBase.EMPOWERED_NETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.REINFORCED_LEATHER_HELMET, ArmorMaterialBase.REINFORCED_LEATHER_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);

        //Chestplate
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMERALD_CHESTPLATE, ArmorMaterialBase.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.LAPIS_LAZULI_CHESTPLATE, ArmorMaterialBase.LAPIS_LAZULI_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMPOWERED_NETHERITE_CHESTPLATE, ArmorMaterialBase.EMPOWERED_NETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.REINFORCED_LEATHER_CHESTPLATE, ArmorMaterialBase.REINFORCED_LEATHER_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);

        //Leggings
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMERALD_LEGGINGS, ArmorMaterialBase.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.LAPIS_LAZULI_LEGGINGS, ArmorMaterialBase.LAPIS_LAZULI_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMPOWERED_NETHERITE_LEGGINGS, ArmorMaterialBase.EMPOWERED_NETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.REINFORCED_LEATHER_LEGGINGS, ArmorMaterialBase.REINFORCED_LEATHER_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);

        //Boots
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMERALD_BOOTS, ArmorMaterialBase.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.LAPIS_LAZULI_BOOTS, ArmorMaterialBase.LAPIS_LAZULI_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.EMPOWERED_NETHERITE_BOOTS, ArmorMaterialBase.EMPOWERED_NETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerators.generateTrimmableItem(ItemRegHandler.REINFORCED_LEATHER_BOOTS, ArmorMaterialBase.REINFORCED_LEATHER_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
    }
}
