package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.winkeyface14.vanilla_expansion.util.BlockRegHandler;
import net.winkeyface14.vanilla_expansion.util.ItemRegHandler;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(BlockRegHandler.CHARCOAL_BLOCK);
        blockModelGenerators.createTrivialCube(BlockRegHandler.BUNDLED_STICKS_BLOCK);
        blockModelGenerators.createTrivialCube(BlockRegHandler.BARREL_OF_APPLES_BLOCK);
        blockModelGenerators.createTrivialCube(BlockRegHandler.BARREL_OF_POTATOES_BLOCK);
        blockModelGenerators.createTrivialCube(BlockRegHandler.BARREL_OF_CARROTS_BLOCK);
        blockModelGenerators.createTrivialCube(BlockRegHandler.BARREL_OF_SWEETBERRY_BLOCK);
        blockModelGenerators.createTrivialCube(BlockRegHandler.BARREL_OF_CHORUS_BLOCK);
        blockModelGenerators.createTrivialCube(BlockRegHandler.EMPOWERED_NETHERITE_BLOCK);
        blockModelGenerators.createTrivialCube(BlockRegHandler.FIRED_BRICKS);
        blockModelGenerators.createTrivialCube(BlockRegHandler.FIRED_BRICKS_STAIRS);
        blockModelGenerators.createTrivialCube(BlockRegHandler.FIRED_BRICKS_SLAB);
        blockModelGenerators.createTrivialCube(BlockRegHandler.FIRED_BRICKS_WALL);
        blockModelGenerators.createTrivialCube(BlockRegHandler.QUARTZ_WALL);
        blockModelGenerators.createTrivialCube(BlockRegHandler.QUARTZ_BRICKS_WALL);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOKED_QUARTZ_BLOCK);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOOTH_SMOKED_QUARTZ);
        blockModelGenerators.createTrivialCube(BlockRegHandler.CHISELED_SMOKED_QUARTZ_BLOCK);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOKED_QUARTZ_BRICKS);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOKED_QUARTZ_PILLAR);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOKED_QUARTZ_STAIRS);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOKED_QUARTZ_BRICKS_STAIRS);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_STAIRS);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOKED_QUARTZ_SLAB);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOKED_QUARTZ_BRICKS_SLAB);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOOTH_SMOKED_QUARTZ_SLAB);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOKED_QUARTZ_WALL);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOKED_QUARTZ_BRICKS_WALL);
        blockModelGenerators.createTrivialCube(BlockRegHandler.BURNT_QUARTZ_BLOCK);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOOTH_BURNT_QUARTZ);
        blockModelGenerators.createTrivialCube(BlockRegHandler.CHISELED_BURNT_QUARTZ_BLOCK);
        blockModelGenerators.createTrivialCube(BlockRegHandler.BURNT_QUARTZ_BRICKS);
        blockModelGenerators.createTrivialCube(BlockRegHandler.BURNT_QUARTZ_PILLAR);
        blockModelGenerators.createTrivialCube(BlockRegHandler.BURNT_QUARTZ_STAIRS);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOOTH_BURNT_QUARTZ_STAIRS);
        blockModelGenerators.createTrivialCube(BlockRegHandler.BURNT_QUARTZ_SLAB);
        blockModelGenerators.createTrivialCube(BlockRegHandler.SMOOTH_BURNT_QUARTZ_SLAB);
        blockModelGenerators.createTrivialCube(BlockRegHandler.BURNT_QUARTZ_WALL);
        blockModelGenerators.createTrivialCube(BlockRegHandler.BURNT_QUARTZ_BRICKS_WALL);
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
    }
}
