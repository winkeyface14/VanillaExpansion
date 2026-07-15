package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.winkeyface14.vanilla_expansion.util.FeatureEnabledCondition;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.world.item.Items.*;
import static net.winkeyface14.vanilla_expansion.block.BlockRegHandler.*;
import static net.winkeyface14.vanilla_expansion.item.ItemRegHandler.*;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NonNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider registries, @NonNull RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                RecipeOutput bundledSticksOutput = withConditions(output, new FeatureEnabledCondition("bundled_sticks"));
                RecipeOutput paperPileOutput = withConditions(output, new FeatureEnabledCondition("pile_of_paper"));
                RecipeOutput coalChunkOutput = withConditions(output, new FeatureEnabledCondition("coal_chunk"));
                RecipeOutput charcoalChunkOutput = withConditions(output, new FeatureEnabledCondition("charcoal_chunk"));
                RecipeOutput emeraldShardOutput = withConditions(output, new FeatureEnabledCondition("emerald_shard"));
                RecipeOutput diamondShardOutput = withConditions(output, new FeatureEnabledCondition("diamond_shard"));
                RecipeOutput quartzShardOutput = withConditions(output, new FeatureEnabledCondition("quartz_shard"));

                RecipeOutput smokedQuartzOutput = withConditions(output, new FeatureEnabledCondition("smoked_quartz"));
                RecipeOutput smokedQuartzShardOutput = withConditions(output, new FeatureEnabledCondition("smoked_quartz_shard"));

                RecipeOutput baseTemplateOutput = withConditions(output, new FeatureEnabledCondition("base_template"));
                RecipeOutput stoneHeadsOutput = withConditions(output, new FeatureEnabledCondition("stone_heads"));
                RecipeOutput copperHeadsOutput = withConditions(output, new FeatureEnabledCondition("copper_heads"));
                RecipeOutput ironHeadsOutput = withConditions(output, new FeatureEnabledCondition("iron_heads"));
                RecipeOutput goldenHeadsOutput = withConditions(output, new FeatureEnabledCondition("golden_heads"));
                RecipeOutput diamondHeadsOutput = withConditions(output, new FeatureEnabledCondition("diamond_heads"));
                RecipeOutput quartzHeadsOutput = withConditions(output, new FeatureEnabledCondition("quartz_heads"));
                RecipeOutput smokedQuartzHeadsOutput = withConditions(output, new FeatureEnabledCondition("smoked_quartz_heads"));

                RecipeOutput emeraldToolsOutput = withConditions(output, new FeatureEnabledCondition("emerald_tools"));
                RecipeOutput emeraldHeadsOutput = withConditions(output, new FeatureEnabledCondition("emerald_heads"));
                RecipeOutput emeraldArmorOutput = withConditions(output, new FeatureEnabledCondition("emerald_armor"));

                RecipeOutput lapisToolsOutput = withConditions(output, new FeatureEnabledCondition("lapis_lazuli_tools"));
                RecipeOutput lapisArmorOutput = withConditions(output, new FeatureEnabledCondition("lapis_lazuli_armor"));

                RecipeOutput redstoneToolsOutput = withConditions(output, new FeatureEnabledCondition("redstone_tools"));
                RecipeOutput redstoneHeadsOutput = withConditions(output, new FeatureEnabledCondition("redstone_heads"));

                RecipeOutput quartzToolsOutput = withConditions(output, new FeatureEnabledCondition("quartz_tools"));

                RecipeOutput smokedQuartzToolsOutput = withConditions(output, new FeatureEnabledCondition("smoked_quartz_tools"));

                RecipeOutput compactCropBlocksOutput = withConditions(output, new FeatureEnabledCondition("compact_crop_blocks"));
                RecipeOutput blockBundledSticksOutput = withConditions(output, new FeatureEnabledCondition("block_of_bundled_sticks"));
                RecipeOutput charcoalBlockOutput = withConditions(output, new FeatureEnabledCondition("charcoal_block"));
                RecipeOutput addQuartzBlockSetOutput = withConditions(output, new FeatureEnabledCondition("add_quartz_block_set"));
                RecipeOutput smokedQuartzBlockSetOutput = withConditions(output, new FeatureEnabledCondition("smoked_quartz_block_set"));

                List<ItemLike> REINFORCED_LEATHER_BLASTABLE = List.of(RAW_REINFORCED_LEATHER);
                List<ItemLike> BRICK_SMELTABLE = List.of(BRICK);
                List<ItemLike> BRICK_BLOCK_SMELTABLE = List.of(BRICKS);

                //Coal and Charcoal
                CustomNineBlockStorageRecipes(CHARCOAL, CHARCOAL_BLOCK.asItem(), charcoalBlockOutput, RecipeCategory.BUILDING_BLOCKS, RecipeCategory.MISC);

                this.shapeless(RecipeCategory.MISC, COAL_CHUNK, 8)
                        .requires(COAL)
                        .unlockedBy(getHasName(COAL), has(COAL))
                        .group("coal_chunk")
                        .save(coalChunkOutput);
                this.shapeless(RecipeCategory.MISC, CHARCOAL_CHUNK, 8)
                        .requires(CHARCOAL)
                        .unlockedBy(getHasName(CHARCOAL), has(CHARCOAL))
                        .group("charcoal_chunk")
                        .save(charcoalChunkOutput);
                this.shapeless(RecipeCategory.MISC, COAL)
                        .requires(COAL_CHUNK, 8)
                        .unlockedBy(getHasName(COAL_CHUNK), has(COAL_CHUNK))
                        .group("coal_from_chunk")
                        .save(coalChunkOutput);
                this.shapeless(RecipeCategory.MISC, CHARCOAL)
                        .requires(CHARCOAL_CHUNK, 8)
                        .unlockedBy(getHasName(CHARCOAL_CHUNK), has(CHARCOAL_CHUNK))
                        .group("charcoal")
                        .save(charcoalChunkOutput,"charcoal_from_chunk");

                //Reinforced Leather
                this.shaped(RecipeCategory.MISC, RAW_REINFORCED_LEATHER,4)
                        .pattern("xyx")
                        .pattern("yzy")
                        .pattern("xyx")
                        .define('x', IRON_NUGGET)
                        .define('y', LEATHER)
                        .define('z', STRING)
                        .unlockedBy(getHasName(IRON_INGOT), has(IRON_INGOT))
                        .save(output);
                this.oreBlasting(REINFORCED_LEATHER_BLASTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, REINFORCED_LEATHER, 0.7f, 100, "reinforced_leather");
                this.oreSmelting(REINFORCED_LEATHER_BLASTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, REINFORCED_LEATHER, 0.7f, 200, "reinforced_leather");

                //Stick Compacting
                CustomNineBlockStorageRecipes(STICK, BUNDLED_STICKS, bundledSticksOutput, RecipeCategory.MISC, RecipeCategory.MISC);
                CustomNineBlockStorageRecipes(BUNDLED_STICKS, BUNDLED_STICKS_BLOCK.asItem(), blockBundledSticksOutput, RecipeCategory.BUILDING_BLOCKS, RecipeCategory.MISC);

                //Paper Compacting
                CustomNineBlockStorageRecipes(PAPER, PAPER_PILE, paperPileOutput, RecipeCategory.MISC, RecipeCategory.MISC);
                //this.nineBlockStorageRecipes(RecipeCategory.MISC, PAPER, RecipeCategory.MISC, PAPER_PILE);

                //Crops Block
                CustomNineBlockStorageRecipes(APPLE, BARREL_OF_APPLES_BLOCK.asItem(), compactCropBlocksOutput, RecipeCategory.BUILDING_BLOCKS, RecipeCategory.FOOD);
                CustomNineBlockStorageRecipes(CARROT, BARREL_OF_CARROTS_BLOCK.asItem(), compactCropBlocksOutput, RecipeCategory.BUILDING_BLOCKS, RecipeCategory.FOOD);
                CustomNineBlockStorageRecipes(POTATO, BARREL_OF_POTATOES_BLOCK.asItem(), compactCropBlocksOutput, RecipeCategory.BUILDING_BLOCKS, RecipeCategory.FOOD);
                CustomNineBlockStorageRecipes(BEETROOT, BARREL_OF_BEETROOTS_BLOCK.asItem(), compactCropBlocksOutput, RecipeCategory.BUILDING_BLOCKS, RecipeCategory.FOOD);
                CustomNineBlockStorageRecipes(SWEET_BERRIES, BARREL_OF_SWEETBERRIES_BLOCK.asItem(), compactCropBlocksOutput, RecipeCategory.BUILDING_BLOCKS, RecipeCategory.FOOD);
                CustomNineBlockStorageRecipes(CHORUS_FRUIT, BARREL_OF_CHORUS_BLOCK.asItem(), compactCropBlocksOutput, RecipeCategory.BUILDING_BLOCKS, RecipeCategory.FOOD);

                //Quartz
                Custom2x2StorageRecipes(QUARTZ_SHARD,QUARTZ, quartzShardOutput, RecipeCategory.MISC, RecipeCategory.MISC);
                /*this.twoByTwoPacker(RecipeCategory.MISC, QUARTZ, QUARTZ_SHARD);
                this.shapeless(RecipeCategory.MISC, QUARTZ_SHARD, 4)
                        .requires(QUARTZ)
                        .unlockedBy(getHasName(QUARTZ), has(QUARTZ))
                        .group("quartz_shard")
                        .save(quartzShardOutput);*/

                registerBlockSetRecipes(
                        Blocks.QUARTZ_BLOCK.asItem(),
                        null,
                        null,
                        QUARTZ_WALL.asItem(),
                        null,
                        addQuartzBlockSetOutput);

                registerBlockSetRecipes(
                        Blocks.QUARTZ_BRICKS.asItem(),
                        QUARTZ_BRICK_SLAB.asItem(),
                        QUARTZ_BRICK_STAIRS.asItem(),
                        QUARTZ_BRICK_WALL.asItem(),
                        null,
                        addQuartzBlockSetOutput);

                registerBlockSetRecipes(
                        Blocks.SMOOTH_QUARTZ.asItem(),
                        null,
                        null,
                        SMOOTH_QUARTZ_WALL.asItem(),
                        null,
                        addQuartzBlockSetOutput);


                //Smoked Quartz
                Custom2x2StorageRecipes(SMOKED_QUARTZ_SHARD, SMOKED_QUARTZ, smokedQuartzShardOutput, RecipeCategory.MISC, RecipeCategory.MISC);

                SimpleCookingRecipeBuilder.smoking(Ingredient.of(QUARTZ), RecipeCategory.MISC, SMOKED_QUARTZ, 0.7f, 100)
                        .unlockedBy(getHasName(QUARTZ), has(QUARTZ))
                        .group("smoked_quartz")
                        .save(smokedQuartzOutput, "smoked_quartz_smoker");
                SimpleCookingRecipeBuilder.smoking(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.MISC, SMOKED_QUARTZ_BLOCK, 0.7f, 100)
                        .unlockedBy(getHasName(Blocks.QUARTZ_BLOCK), has(Blocks.QUARTZ_BLOCK))
                        .group("smoked_quartz_block")
                        .save(smokedQuartzBlockSetOutput, "smoked_quartz_block_smoker");

                Custom2x2PackingRecipes(SMOKED_QUARTZ, SMOKED_QUARTZ_BLOCK.asItem(), smokedQuartzBlockSetOutput, RecipeCategory.BUILDING_BLOCKS);

                //Base
                registerBlockSetRecipes(
                        SMOKED_QUARTZ_BLOCK.asItem(),
                        SMOKED_QUARTZ_SLAB.asItem(),
                        SMOKED_QUARTZ_STAIRS.asItem(),
                        SMOKED_QUARTZ_WALL.asItem(),
                        null,
                        smokedQuartzBlockSetOutput);

                //Smooth
                registerBlockSetRecipes(
                        SMOOTH_SMOKED_QUARTZ.asItem(),
                        SMOOTH_SMOKED_QUARTZ_SLAB.asItem(),
                        SMOOTH_SMOKED_QUARTZ_STAIRS.asItem(),
                        SMOOTH_SMOKED_QUARTZ_WALL.asItem(),
                        null,
                        smokedQuartzBlockSetOutput);

                //Bricks
                registerBlockSetRecipes(
                        SMOKED_QUARTZ_BRICKS.asItem(),
                        SMOKED_QUARTZ_BRICK_SLAB.asItem(),
                        SMOKED_QUARTZ_BRICK_STAIRS.asItem(),
                        SMOKED_QUARTZ_BRICK_WALL.asItem(),
                        null,
                        smokedQuartzBlockSetOutput);

                registerBlockVariantRecipes(
                        SMOKED_QUARTZ_BLOCK.asItem(),
                        SMOKED_QUARTZ_SLAB.asItem(),
                        SMOKED_QUARTZ_BRICKS.asItem(),
                        SMOKED_QUARTZ_PILLAR.asItem(),
                        CHISELED_SMOKED_QUARTZ_BLOCK.asItem(),
                        null,
                        smokedQuartzBlockSetOutput);

                //Burnt Quartz
                this.twoByTwoPacker(RecipeCategory.MISC, BURNT_QUARTZ, BURNT_QUARTZ_SHARD);
                this.shapeless(RecipeCategory.MISC, BURNT_QUARTZ_SHARD, 4)
                        .requires(BURNT_QUARTZ)
                        .unlockedBy(getHasName(BURNT_QUARTZ), has(BURNT_QUARTZ))
                        .group("burnt_quartz_shard")
                        .save(output);

                SimpleCookingRecipeBuilder.blasting(Ingredient.of(QUARTZ), RecipeCategory.MISC,CookingBookCategory.MISC, BURNT_QUARTZ, 0.7f, 100)
                        .unlockedBy(getHasName(QUARTZ), has(QUARTZ))
                        .group("burnt_quartz")
                        .save(output, "burnt_quartz_blasting");
                SimpleCookingRecipeBuilder.blasting(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.MISC,CookingBookCategory.MISC, BURNT_QUARTZ_BLOCK, 0.7f, 100)
                        .unlockedBy(getHasName(Blocks.QUARTZ_BLOCK), has(Blocks.QUARTZ_BLOCK))
                        .group("burnt_quartz_block")
                        .save(output, "burnt_quartz_block_blasting");

                this.twoByTwoPacker(RecipeCategory.MISC, BURNT_QUARTZ_BLOCK, BURNT_QUARTZ);

                //Base
                registerBlockSetRecipes(
                        BURNT_QUARTZ_BLOCK.asItem(),
                        BURNT_QUARTZ_SLAB.asItem(),
                        BURNT_QUARTZ_STAIRS.asItem(),
                        BURNT_QUARTZ_WALL.asItem(),
                        null,
                        output);

                //Smooth
                registerBlockSetRecipes(
                        SMOOTH_BURNT_QUARTZ.asItem(),
                        SMOOTH_BURNT_QUARTZ_SLAB.asItem(),
                        SMOOTH_BURNT_QUARTZ_STAIRS.asItem(),
                        SMOOTH_BURNT_QUARTZ_WALL.asItem(),
                        null,
                        output);

                //Bricks
                registerBlockSetRecipes(
                        BURNT_QUARTZ_BRICKS.asItem(),
                        BURNT_QUARTZ_BRICK_SLAB.asItem(),
                        BURNT_QUARTZ_BRICK_STAIRS.asItem(),
                        BURNT_QUARTZ_BRICK_WALL.asItem(),
                        null,
                        output);

                registerBlockVariantRecipes(
                        BURNT_QUARTZ_BLOCK.asItem(),
                        BURNT_QUARTZ_SLAB.asItem(),
                        BURNT_QUARTZ_BRICKS.asItem(),
                        BURNT_QUARTZ_PILLAR.asItem(),
                        CHISELED_BURNT_QUARTZ_BLOCK.asItem(),
                        null,
                        output);

                //Fired Bricks
                this.oreSmelting(BRICK_SMELTABLE,RecipeCategory.MISC, CookingBookCategory.MISC, FIRED_BRICK, 0.7f, 200,"fired_brick");
                this.oreSmelting(BRICK_BLOCK_SMELTABLE,RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, FIRED_BRICKS, 0.7f, 200,"fired_brick");

                this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, FIRED_BRICKS, FIRED_BRICK);

                registerBlockSetRecipes(
                        FIRED_BRICKS.asItem(),
                        FIRED_BRICK_SLAB.asItem(),
                        FIRED_BRICK_STAIRS.asItem(),
                        FIRED_BRICK_WALL.asItem(),
                        null,
                        output);

                //Smooth Stone
                registerBlockSetRecipes(
                        SMOOTH_STONE.asItem(),
                        null,
                        SMOOTH_STONE_STAIRS.asItem(),
                        SMOOTH_STONE_WALL.asItem(),
                        null,
                        output);

                //Smooth Sandstone
                registerBlockSetRecipes(
                        SMOOTH_SANDSTONE,
                        null,
                        null,
                        SMOOTH_SANDSTONE_WALL.asItem(),
                        null,
                        output);

                //Smooth Red Sandstone
                registerBlockSetRecipes(
                        SMOOTH_QUARTZ,
                        null,
                        null,
                        SMOOTH_RED_SANDSTONE_WALL.asItem(),
                        null,
                        output);

                //Cut Sandstone
                registerBlockSetRecipes(
                        CUT_SANDSTONE,
                        null,
                        CUT_SANDSTONE_STAIRS.asItem(),
                        CUT_SANDSTONE_WALL.asItem(),
                        null,
                        output);

                //Cut Red Sandstone
                registerBlockSetRecipes(
                        CUT_RED_SANDSTONE,
                        null,
                        CUT_RED_SANDSTONE_STAIRS.asItem(),
                        CUT_RED_SANDSTONE_WALL.asItem(),
                        null,
                        output);

                //Empowered Netherite
                this.shapeless(RecipeCategory.MISC, EMPOWERED_NETHERITE)
                        .requires(GOLD_INGOT, 4)
                        .requires(EMPOWERED_NETHERITE_SCRAP, 4)
                        .group("empowered_netherite")
                        .unlockedBy(getHasName(EMPOWERED_NETHERITE_SCRAP), has(EMPOWERED_NETHERITE_SCRAP))
                        .save(output, "empowered_netherite_ingot_from_scrap");
                this.shaped(RecipeCategory.MISC, EMPOWERED_NETHERITE_SCRAP,4)
                        .pattern("xyx")
                        .pattern("yxy")
                        .pattern("xyx")
                        .define('x', REDSTONE_BLOCK)
                        .define('y', NETHERITE_SCRAP)
                        .unlockedBy(getHasName(NETHERITE_SCRAP), has(NETHERITE_SCRAP))
                        .save(output);
                this.nineBlockStorageRecipes(RecipeCategory.MISC, EMPOWERED_NETHERITE, RecipeCategory.DECORATIONS, EMPOWERED_NETHERITE_BLOCK,"empowered_netherite_block","empowered_netherite_block","empowered_netherite_ingot","empowered_netherite_ingot");

                //Diamond
                CustomNineBlockStorageRecipes(DIAMOND, DIAMOND_SHARD, diamondShardOutput, RecipeCategory.MISC, RecipeCategory.MISC);
                //this.nineBlockStorageRecipes(RecipeCategory.MISC, DIAMOND_SHARD, RecipeCategory.MISC, DIAMOND);

                //Emerald Tools
                CustomNineBlockStorageRecipes(EMERALD, EMERALD_SHARD, emeraldShardOutput, RecipeCategory.MISC, RecipeCategory.MISC);
                //this.nineBlockStorageRecipes(RecipeCategory.MISC, EMERALD_SHARD, RecipeCategory.MISC, EMERALD);
                registerCustomToolSetRecipes(emeraldToolsOutput, EMERALD, EMERALD_SWORD, EMERALD_SHOVEL, EMERALD_PICKAXE, EMERALD_AXE, EMERALD_HOE, EMERALD_SPEAR);

                //Lapis Lazuli Tools
                registerCustomToolSetRecipes(lapisToolsOutput, LAPIS_LAZULI, LAPIS_LAZULI_SWORD, LAPIS_LAZULI_SHOVEL, LAPIS_LAZULI_PICKAXE, LAPIS_LAZULI_AXE, LAPIS_LAZULI_HOE, LAPIS_LAZULI_SPEAR);

                //Redstone Tools
                registerCustomToolSetRecipes(redstoneToolsOutput, REDSTONE_BLOCK, REDSTONE_SWORD, REDSTONE_SHOVEL, REDSTONE_PICKAXE, REDSTONE_AXE, REDSTONE_HOE, REDSTONE_SPEAR);

                //Quartz Tools
                registerCustomToolSetRecipes(quartzToolsOutput, QUARTZ, QUARTZ_SWORD, QUARTZ_SHOVEL, QUARTZ_PICKAXE, QUARTZ_AXE, QUARTZ_HOE, QUARTZ_SPEAR);

                //Smoked Quartz Tools
                registerCustomToolSetRecipes(smokedQuartzToolsOutput, SMOKED_QUARTZ, SMOKED_QUARTZ_SWORD, SMOKED_QUARTZ_SHOVEL, SMOKED_QUARTZ_PICKAXE, SMOKED_QUARTZ_AXE, SMOKED_QUARTZ_HOE, SMOKED_QUARTZ_SPEAR);

                //Burnt Quartz Tools
                registerCustomToolSetRecipes(output, BURNT_QUARTZ, BURNT_QUARTZ_SWORD, BURNT_QUARTZ_SHOVEL, BURNT_QUARTZ_PICKAXE, BURNT_QUARTZ_AXE, BURNT_QUARTZ_HOE, BURNT_QUARTZ_SPEAR);

                //Emerald Armor
                registerCustomArmorSetRecipes(emeraldArmorOutput, EMERALD, EMERALD_HELMET, EMERALD_CHESTPLATE, EMERALD_LEGGINGS, EMERALD_BOOTS);

                //Lapis Lazuli Armor
                registerCustomArmorSetRecipes(lapisArmorOutput, LAPIS_LAZULI, LAPIS_LAZULI_HELMET, LAPIS_LAZULI_CHESTPLATE, LAPIS_LAZULI_LEGGINGS, LAPIS_LAZULI_BOOTS);

                //Reinforced Leather Armor
                registerCustomArmorSetRecipes(output, REINFORCED_LEATHER, REINFORCED_LEATHER_HELMET, REINFORCED_LEATHER_CHESTPLATE, REINFORCED_LEATHER_LEGGINGS, REINFORCED_LEATHER_BOOTS);

                //Armadillo Scute Armor
                registerCustomArmorSetRecipes(output, ARMADILLO_SCUTE, ARMADILLO_SCUTE_HELMET, ARMADILLO_SCUTE_CHESTPLATE, ARMADILLO_SCUTE_LEGGINGS, ARMADILLO_SCUTE_BOOTS);

                //Template Recipes
                this.shaped(RecipeCategory.MISC, BASE_TEMPLATE, 8)
                        .pattern("xy")
                        .pattern("yx")
                        .define('x', ItemTags.PLANKS)
                        .define('y', FLINT)
                        .unlockedBy(getHasName(FLINT), has(FLINT))
                        .save(baseTemplateOutput);

                //Tool and Weapon Heads
                registerToolHeadsRecipe(ironHeadsOutput, IRON_INGOT, IRON_SWORD_BLADE,IRON_SPEAR_TIP, IRON_PICKAXE_HEAD, IRON_AXE_HEAD, IRON_SHOVEL_HEAD, IRON_HOE_HEAD);
                registerToolHeadsRecipe(copperHeadsOutput, COPPER_INGOT, COPPER_SWORD_BLADE,COPPER_SPEAR_TIP, COPPER_PICKAXE_HEAD, COPPER_AXE_HEAD, COPPER_SHOVEL_HEAD, COPPER_HOE_HEAD);
                registerToolHeadsRecipe(goldenHeadsOutput, GOLD_INGOT, GOLD_SWORD_BLADE,GOLD_SPEAR_TIP, GOLD_PICKAXE_HEAD, GOLD_AXE_HEAD, GOLD_SHOVEL_HEAD, GOLD_HOE_HEAD);
                registerToolHeadsRecipe(diamondHeadsOutput, DIAMOND, DIAMOND_SWORD_BLADE,DIAMOND_SPEAR_TIP, DIAMOND_PICKAXE_HEAD, DIAMOND_AXE_HEAD, DIAMOND_SHOVEL_HEAD, DIAMOND_HOE_HEAD);
                registerToolHeadsRecipe(emeraldHeadsOutput, EMERALD, EMERALD_SWORD_BLADE,EMERALD_SPEAR_TIP, EMERALD_PICKAXE_HEAD, EMERALD_AXE_HEAD, EMERALD_SHOVEL_HEAD, EMERALD_HOE_HEAD);
                registerToolHeadsRecipe(redstoneHeadsOutput, REDSTONE_BLOCK, REDSTONE_SWORD_BLADE,REDSTONE_SPEAR_TIP, REDSTONE_PICKAXE_HEAD, REDSTONE_AXE_HEAD, REDSTONE_SHOVEL_HEAD, REDSTONE_HOE_HEAD);
                //registerToolHeadsRecipe(LAPIS_LAZULI, LAPIS_LAZULI_SWORD_BLADE,LAPIS_LAZULI_SPEAR_TIP, LAPIS_LAZULI_PICKAXE_HEAD, LAPIS_LAZULI_AXE_HEAD, LAPIS_LAZULI_SHOVEL_HEAD, LAPIS_LAZULI_HOE_HEAD);
                registerToolHeadsRecipe(quartzHeadsOutput, QUARTZ, QUARTZ_SWORD_BLADE, QUARTZ_SPEAR_TIP, QUARTZ_PICKAXE_HEAD, QUARTZ_AXE_HEAD, QUARTZ_SHOVEL_HEAD, QUARTZ_HOE_HEAD);
                registerToolHeadsRecipe(smokedQuartzHeadsOutput, SMOKED_QUARTZ, SMOKED_QUARTZ_SWORD_BLADE, SMOKED_QUARTZ_SPEAR_TIP, SMOKED_QUARTZ_PICKAXE_HEAD, SMOKED_QUARTZ_AXE_HEAD, SMOKED_QUARTZ_SHOVEL_HEAD, SMOKED_QUARTZ_HOE_HEAD);


                //Blade Recipes
                Item base_template = BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC, STONE_SWORD_BLADE)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(stoneHeadsOutput);

                //Pickaxe Head Recipes
                this.shaped(RecipeCategory.MISC, STONE_PICKAXE_HEAD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(stoneHeadsOutput);

                //Axe Head Recipes
                this.shaped(RecipeCategory.MISC, STONE_AXE_HEAD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(stoneHeadsOutput);

                //Shovel Head Recipes
                this.shaped(RecipeCategory.MISC, STONE_SHOVEL_HEAD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(stoneHeadsOutput);

                //Hoe Head Recipes
                this.shaped(RecipeCategory.MISC, STONE_HOE_HEAD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(stoneHeadsOutput);

                //Spear Tip Recipes
                this.shaped(RecipeCategory.MISC, STONE_SPEAR_TIP)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(stoneHeadsOutput);


                //Smithing Recipes
                //Empowered Netherite Tool and Armor Set
                registerCustomNetheriteUpgrade(EMPOWERED_NETHERITE, DIAMOND_SWORD, EMPOWERED_NETHERITE_SWORD, RecipeCategory.COMBAT);
                registerCustomNetheriteUpgrade(EMPOWERED_NETHERITE, DIAMOND_SPEAR, EMPOWERED_NETHERITE_SPEAR, RecipeCategory.COMBAT);
                registerCustomNetheriteUpgrade(EMPOWERED_NETHERITE, DIAMOND_PICKAXE, EMPOWERED_NETHERITE_PICKAXE, RecipeCategory.TOOLS);
                registerCustomNetheriteUpgrade(EMPOWERED_NETHERITE, DIAMOND_AXE, EMPOWERED_NETHERITE_AXE, RecipeCategory.TOOLS);
                registerCustomNetheriteUpgrade(EMPOWERED_NETHERITE, DIAMOND_SHOVEL, EMPOWERED_NETHERITE_SHOVEL, RecipeCategory.TOOLS);
                registerCustomNetheriteUpgrade(EMPOWERED_NETHERITE, DIAMOND_HOE, EMPOWERED_NETHERITE_HOE, RecipeCategory.TOOLS);

                registerCustomNetheriteUpgrade(EMPOWERED_NETHERITE, DIAMOND_HELMET, EMPOWERED_NETHERITE_HELMET, RecipeCategory.COMBAT);
                registerCustomNetheriteUpgrade(EMPOWERED_NETHERITE, DIAMOND_CHESTPLATE, EMPOWERED_NETHERITE_CHESTPLATE, RecipeCategory.COMBAT);
                registerCustomNetheriteUpgrade(EMPOWERED_NETHERITE, DIAMOND_LEGGINGS, EMPOWERED_NETHERITE_LEGGINGS, RecipeCategory.COMBAT);
                registerCustomNetheriteUpgrade(EMPOWERED_NETHERITE, DIAMOND_BOOTS, EMPOWERED_NETHERITE_BOOTS, RecipeCategory.COMBAT);

                //Swords
                registerCustomToolUpgrade(stoneHeadsOutput, STONE_SWORD_BLADE, ItemTags.SWORDS, STONE_SWORD, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(copperHeadsOutput, COPPER_SWORD_BLADE, ItemTags.SWORDS, COPPER_SWORD, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(ironHeadsOutput, IRON_SWORD_BLADE, ItemTags.SWORDS, IRON_SWORD, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(redstoneHeadsOutput, REDSTONE_SWORD_BLADE, ItemTags.SWORDS, REDSTONE_SWORD, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(emeraldHeadsOutput, EMERALD_SWORD_BLADE, ItemTags.SWORDS, EMERALD_SWORD, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(goldenHeadsOutput, GOLD_SWORD_BLADE, ItemTags.SWORDS, GOLDEN_SWORD, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(diamondHeadsOutput, DIAMOND_SWORD_BLADE, ItemTags.SWORDS, DIAMOND_SWORD, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(quartzHeadsOutput, QUARTZ_SWORD_BLADE, ItemTags.SWORDS, QUARTZ_SWORD, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(smokedQuartzHeadsOutput, SMOKED_QUARTZ_SWORD_BLADE, ItemTags.SWORDS, SMOKED_QUARTZ_SWORD, RecipeCategory.COMBAT);

                //Pickaxes
                registerCustomToolUpgrade(stoneHeadsOutput, STONE_PICKAXE_HEAD, ItemTags.PICKAXES, STONE_PICKAXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(copperHeadsOutput, COPPER_PICKAXE_HEAD, ItemTags.PICKAXES, COPPER_PICKAXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(ironHeadsOutput, IRON_PICKAXE_HEAD, ItemTags.PICKAXES, IRON_PICKAXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(redstoneHeadsOutput, REDSTONE_PICKAXE_HEAD, ItemTags.PICKAXES, REDSTONE_PICKAXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(emeraldHeadsOutput, EMERALD_PICKAXE_HEAD, ItemTags.PICKAXES, EMERALD_PICKAXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(goldenHeadsOutput, GOLD_PICKAXE_HEAD, ItemTags.PICKAXES, GOLDEN_PICKAXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(diamondHeadsOutput, DIAMOND_PICKAXE_HEAD, ItemTags.PICKAXES, DIAMOND_PICKAXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(quartzHeadsOutput, QUARTZ_PICKAXE_HEAD, ItemTags.PICKAXES, QUARTZ_PICKAXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(smokedQuartzHeadsOutput, SMOKED_QUARTZ_PICKAXE_HEAD, ItemTags.PICKAXES, SMOKED_QUARTZ_PICKAXE, RecipeCategory.TOOLS);

                //Axes
                registerCustomToolUpgrade(stoneHeadsOutput, STONE_AXE_HEAD, ItemTags.AXES, STONE_AXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(copperHeadsOutput, COPPER_AXE_HEAD, ItemTags.AXES, COPPER_AXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(ironHeadsOutput, IRON_AXE_HEAD, ItemTags.AXES, IRON_AXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(redstoneHeadsOutput, REDSTONE_AXE_HEAD, ItemTags.AXES, REDSTONE_AXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(emeraldHeadsOutput, EMERALD_AXE_HEAD, ItemTags.AXES, EMERALD_AXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(goldenHeadsOutput, GOLD_AXE_HEAD, ItemTags.AXES, GOLDEN_AXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(diamondHeadsOutput, DIAMOND_AXE_HEAD, ItemTags.AXES, DIAMOND_AXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(quartzHeadsOutput, QUARTZ_AXE_HEAD, ItemTags.AXES, QUARTZ_AXE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(smokedQuartzHeadsOutput, SMOKED_QUARTZ_AXE_HEAD, ItemTags.AXES, SMOKED_QUARTZ_AXE, RecipeCategory.TOOLS);

                //Shovels
                registerCustomToolUpgrade(stoneHeadsOutput, STONE_SHOVEL_HEAD, ItemTags.SHOVELS, STONE_SHOVEL, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(copperHeadsOutput, COPPER_SHOVEL_HEAD, ItemTags.SHOVELS, COPPER_SHOVEL, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(ironHeadsOutput, IRON_SHOVEL_HEAD, ItemTags.SHOVELS, IRON_SHOVEL, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(redstoneHeadsOutput, REDSTONE_SHOVEL_HEAD, ItemTags.SHOVELS, REDSTONE_SHOVEL, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(emeraldHeadsOutput, EMERALD_SHOVEL_HEAD, ItemTags.SHOVELS, EMERALD_SHOVEL, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(goldenHeadsOutput, GOLD_SHOVEL_HEAD, ItemTags.SHOVELS, GOLDEN_SHOVEL, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(diamondHeadsOutput, DIAMOND_SHOVEL_HEAD, ItemTags.SHOVELS, DIAMOND_SHOVEL, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(quartzHeadsOutput, QUARTZ_SHOVEL_HEAD, ItemTags.SHOVELS, QUARTZ_SHOVEL, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(smokedQuartzHeadsOutput, SMOKED_QUARTZ_SHOVEL_HEAD, ItemTags.SHOVELS, SMOKED_QUARTZ_SHOVEL, RecipeCategory.TOOLS);

                //Hoes
                registerCustomToolUpgrade(stoneHeadsOutput, STONE_HOE_HEAD, ItemTags.SHOVELS, STONE_HOE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(copperHeadsOutput, COPPER_HOE_HEAD, ItemTags.SHOVELS, COPPER_HOE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(ironHeadsOutput, IRON_HOE_HEAD, ItemTags.SHOVELS, IRON_HOE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(redstoneHeadsOutput, REDSTONE_HOE_HEAD, ItemTags.SHOVELS, REDSTONE_HOE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(emeraldHeadsOutput, EMERALD_HOE_HEAD, ItemTags.SHOVELS, EMERALD_HOE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(goldenHeadsOutput, GOLD_HOE_HEAD, ItemTags.SHOVELS, GOLDEN_HOE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(diamondHeadsOutput, DIAMOND_HOE_HEAD, ItemTags.SHOVELS, DIAMOND_HOE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(quartzHeadsOutput, QUARTZ_HOE_HEAD, ItemTags.SHOVELS, QUARTZ_HOE, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(smokedQuartzHeadsOutput, SMOKED_QUARTZ_HOE_HEAD, ItemTags.SHOVELS, SMOKED_QUARTZ_HOE, RecipeCategory.TOOLS);

                //Spears
                registerCustomToolUpgrade(stoneHeadsOutput, STONE_SPEAR_TIP, ItemTags.SPEARS, STONE_SPEAR, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(copperHeadsOutput, COPPER_SPEAR_TIP, ItemTags.SPEARS, COPPER_SPEAR, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(ironHeadsOutput, IRON_SPEAR_TIP, ItemTags.SPEARS, IRON_SPEAR, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(redstoneHeadsOutput, REDSTONE_SPEAR_TIP, ItemTags.SPEARS, REDSTONE_SPEAR, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(emeraldHeadsOutput, EMERALD_SPEAR_TIP, ItemTags.SPEARS, EMERALD_SPEAR, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(goldenHeadsOutput, GOLD_SPEAR_TIP, ItemTags.SPEARS, GOLDEN_SPEAR, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(diamondHeadsOutput, DIAMOND_SPEAR_TIP, ItemTags.SPEARS, DIAMOND_SPEAR, RecipeCategory.COMBAT);
                registerCustomToolUpgrade(quartzHeadsOutput, QUARTZ_SPEAR_TIP, ItemTags.SPEARS, QUARTZ_SPEAR, RecipeCategory.TOOLS);
                registerCustomToolUpgrade(smokedQuartzHeadsOutput, SMOKED_QUARTZ_SPEAR_TIP, ItemTags.SPEARS, SMOKED_QUARTZ_SPEAR, RecipeCategory.TOOLS);
            }



            //Custom Methods
            private void registerCustomToolUpgrade(RecipeOutput outputType, Item template, TagKey<Item> baseItem, Item upgradedResult, RecipeCategory category) {
                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(template),
                                this.tag(baseItem),
                                Ingredient.of(FLINT),
                                category,
                                upgradedResult
                        )
                        .unlocks("has_" + getItemName(template), has(template))
                        .save(outputType, getItemName(upgradedResult) + "_from_smithing");
            }

            private void registerCustomNetheriteUpgrade(Item material, Item baseItem, Item upgradedResult, RecipeCategory category) {
                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(baseItem),
                                Ingredient.of(material),
                                category,
                                upgradedResult
                        )
                        .unlocks("has_" + getItemName(NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .save(output, getItemName(upgradedResult) + "_from_smithing_with_" + getItemName(baseItem));
            }

            private void registerCustomToolSetRecipes(RecipeOutput outputType, Item materialItem, Item resultSword, Item resultShovel, Item resultPickaxe, Item resultAxe, Item resultHoe, Item resultSpear) {
                this.shaped(RecipeCategory.COMBAT,resultSword)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', materialItem)
                        .define('y', STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(outputType);
                this.shaped(RecipeCategory.TOOLS,resultShovel)
                        .pattern("x")
                        .pattern("y")
                        .pattern("y")
                        .define('x', materialItem)
                        .define('y', STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(outputType);
                this.shaped(RecipeCategory.TOOLS,resultPickaxe)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern(" y ")
                        .define('x', materialItem)
                        .define('y', STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(outputType);
                this.shaped(RecipeCategory.TOOLS,resultAxe)
                        .pattern("xx")
                        .pattern("xy")
                        .pattern(" y")
                        .define('x', materialItem)
                        .define('y', STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(outputType);
                this.shaped(RecipeCategory.TOOLS,resultHoe)
                        .pattern("xx")
                        .pattern(" y")
                        .pattern(" y")
                        .define('x', materialItem)
                        .define('y', STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(outputType);
                this.shaped(RecipeCategory.COMBAT,resultSpear)
                        .pattern("  x")
                        .pattern(" y ")
                        .pattern("y  ")
                        .define('x', materialItem)
                        .define('y', STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(outputType);
            }

            private void registerCustomArmorSetRecipes(RecipeOutput outputType, Item materialItem, Item resultHelmet, Item resultChestplate, Item resultLeggings, Item resultBoots) {
                this.shaped(RecipeCategory.COMBAT,resultHelmet)
                        .pattern("xxx")
                        .pattern("x x")
                        .define('x', materialItem)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(outputType);
                this.shaped(RecipeCategory.COMBAT,resultChestplate)
                        .pattern("x x")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', materialItem)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(outputType);
                this.shaped(RecipeCategory.COMBAT,resultLeggings)
                        .pattern("xxx")
                        .pattern("x x")
                        .pattern("x x")
                        .define('x', materialItem)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(outputType);
                this.shaped(RecipeCategory.COMBAT,resultBoots)
                        .pattern("x x")
                        .pattern("x x")
                        .define('x', materialItem)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(outputType);
            }

            private void registerToolHeadsRecipe(RecipeOutput outputType,Item materialItem, Item resultSword, Item resultSpear, Item resultPickaxe, Item resultAxe, Item resultShovel, Item resultHoe) {
                registerCustomSwordBladeRecipe(materialItem, resultSword, outputType);
                registerCustomSpearTipRecipe(materialItem, resultSpear, outputType);
                registerCustomPickaxeHeadRecipe(materialItem, resultPickaxe, outputType);
                registerCustomAxeHeadRecipe(materialItem, resultAxe, outputType);
                registerCustomShovelHeadRecipe(materialItem, resultShovel, outputType);
                registerCustomHoeHeadRecipe(materialItem, resultHoe, outputType);
            }

            private void registerCustomSwordBladeRecipe(Item materialItem, Item resultItem, RecipeOutput outputType) {
                Item base_template = BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(outputType);
            }

            private void registerCustomPickaxeHeadRecipe(Item materialItem, Item resultItem, RecipeOutput outputType) {
                Item base_template = BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("xxx")
                        .pattern(" y ")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(outputType);
            }

            private void registerCustomAxeHeadRecipe(Item materialItem, Item resultItem, RecipeOutput outputType) {
                Item base_template = BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("xx")
                        .pattern("xy")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(outputType);
            }

            private void registerCustomShovelHeadRecipe(Item materialItem, Item resultItem, RecipeOutput outputType) {
                Item base_template = BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("x")
                        .pattern("y")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(outputType);
            }

            private void registerCustomHoeHeadRecipe(Item materialItem, Item resultItem, RecipeOutput outputType) {
                Item base_template = BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("xx")
                        .pattern(" y")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(outputType);
            }

            private void registerCustomSpearTipRecipe(Item materialItem, Item resultItem, RecipeOutput outputType) {
                Item base_template = BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern(" x")
                        .pattern("y ")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(outputType);
            }

            private void registerBlockSetRecipes(Item baseItem, Item resultSlab, Item resultStairs, Item resultWall, Item resultFence, RecipeOutput outputType) {
                RecipeCategory categoryBuilding = RecipeCategory.BUILDING_BLOCKS;

                ConditionalRecipeHelper helper = new ConditionalRecipeHelper(registries, outputType);

                //Slab
                if(resultSlab != null){
                    helper.stonecutterResultFromBase(categoryBuilding,resultSlab, baseItem, 2);
                    this.slabBuilder(categoryBuilding, resultSlab, Ingredient.of(baseItem))
                            .unlockedBy(getHasName(baseItem), has(baseItem))
                            .group(getItemName(resultSlab))
                            .save(outputType);
                }

                //Stairs
                if(resultStairs != null){
                    helper.stonecutterResultFromBase(categoryBuilding,resultStairs, baseItem, 1);
                    this.stairBuilder(resultStairs, Ingredient.of(baseItem))
                            .unlockedBy(getHasName(baseItem), has(baseItem))
                            .group(getItemName(resultStairs))
                            .save(outputType);
                }

                //Wall
                if(resultWall != null){
                    helper.stonecutterResultFromBase(categoryBuilding,resultWall, baseItem, 1);
                    this.wallBuilder(categoryBuilding, resultWall, Ingredient.of(baseItem))
                            .unlockedBy(getHasName(baseItem), has(baseItem))
                            .group(getItemName(resultWall))
                            .save(outputType);
                }

                //Fence
                if(resultFence != null){
                    helper.stonecutterResultFromBase(categoryBuilding,resultFence, baseItem, 1);
                    this.fenceBuilder(resultFence, Ingredient.of(baseItem))
                            .unlockedBy(getHasName(baseItem), has(baseItem))
                            .group(getItemName(resultFence))
                            .save(outputType);
                }
            }

            private void registerBlockVariantRecipes(Item baseItem, Item baseSlab, Item resultBricks, Item resultPillar, Item resultChiseled, Item resultPolished, RecipeOutput outputType) {
                RecipeCategory categoryBuilding = RecipeCategory.BUILDING_BLOCKS;

                ConditionalRecipeHelper helper = new ConditionalRecipeHelper(registries, outputType);

                //Bricks
                if(resultBricks != null){
                    helper.stonecutterResultFromBase(categoryBuilding,resultBricks, baseItem);
                    this.bricksBuilder(categoryBuilding, resultBricks, Ingredient.of(baseItem))
                            .unlockedBy(getHasName(baseItem), has(baseItem))
                            .group(getItemName(resultBricks))
                            .save(outputType);
                }

                //Pillar
                if(resultPillar != null){
                    helper.stonecutterResultFromBase(categoryBuilding, resultPillar, baseItem);
                    this.pillarBuilder(categoryBuilding, resultPillar, Ingredient.of(baseItem))
                            .unlockedBy(getHasName(baseItem), has(baseItem))
                            .group(getItemName(resultPillar))
                            .save(outputType);
                }

                //Chiseled
                if(resultChiseled != null){
                    helper.stonecutterResultFromBase(categoryBuilding,resultChiseled, baseItem);
                    this.chiseledBuilder(categoryBuilding, resultChiseled, Ingredient.of(baseItem))
                            .unlockedBy(getHasName(baseItem), has(baseItem))
                            .group(getItemName(resultChiseled))
                            .save(outputType);
                }

                //Polished
                if(resultPolished != null){
                    helper.stonecutterResultFromBase(categoryBuilding,resultPolished, baseItem);
                    this.polishedBuilder(categoryBuilding, resultPolished, Ingredient.of(baseItem))
                            .unlockedBy(getHasName(baseItem), has(baseItem))
                            .group(getItemName(resultPolished))
                            .save(outputType);
                }
            }

            private void CustomNineBlockStorageRecipes(Item baseItem, Item compactedItem, RecipeOutput outputType, RecipeCategory compressCategory, RecipeCategory decompressCategory){
                this.shapeless(compressCategory, compactedItem)
                        .requires(baseItem, 9)
                        .unlockedBy(getHasName(baseItem), has(baseItem))
                        .group("crop_blocks")
                        .save(outputType, getItemName(compactedItem) + "_from_" + getItemName(baseItem));
                this.shapeless(decompressCategory, baseItem, 9)
                        .requires(compactedItem, 1)
                        .unlockedBy(getHasName(compactedItem), has(compactedItem))
                        .group("crop_from_blocks")
                        .save(outputType, getItemName(baseItem) + "_from_" + getItemName(compactedItem));
            }

            private void Custom2x2StorageRecipes(Item baseItem, Item compactedItem, RecipeOutput outputType, RecipeCategory compressCategory, RecipeCategory decompressCategory){
                this.shapeless(compressCategory, compactedItem)
                        .requires(baseItem, 4)
                        .unlockedBy(getHasName(baseItem), has(baseItem))
                        .group("crop_blocks")
                        .save(outputType, getItemName(compactedItem) + "_from_" + getItemName(baseItem));
                this.shapeless(decompressCategory, baseItem, 4)
                        .requires(compactedItem, 1)
                        .unlockedBy(getHasName(compactedItem), has(compactedItem))
                        .group("crop_from_blocks")
                        .save(outputType, getItemName(baseItem) + "_from_" + getItemName(baseItem));
            }

            private void Custom2x2PackingRecipes(Item baseItem, Item packedItem, RecipeOutput outputType, RecipeCategory compressCategory){
                this.shaped(compressCategory, packedItem)
                        .pattern("xx")
                        .pattern("xx")
                        .define('x', baseItem)
                        .unlockedBy(getHasName(baseItem), has(baseItem))
                        .group("crop_blocks")
                        .save(outputType, getItemName(packedItem) + "_from_" + getItemName(baseItem));

            }
        };
    }

    @Override
    public @NonNull String getName() {
        return "The Vanilla Expansion Recipes";
    }

    private static class ConditionalRecipeHelper extends RecipeProvider {
        public ConditionalRecipeHelper(HolderLookup.Provider registries, RecipeOutput output) {
            super(registries, output);
        }

        @Override
        public void buildRecipes() {}

        public void stonecutter(RecipeCategory category, ItemLike result, ItemLike ingredient) {
            this.stonecutterResultFromBase(category, result, ingredient);
        }

        public void stonecutter(RecipeCategory category, ItemLike result, ItemLike ingredient, int count) {
            this.stonecutterResultFromBase(category, result, ingredient, count);
        }

        public void slab(RecipeCategory category, ItemLike slab, ItemLike material) {
            this.slab(category, slab, material);
        }

        public void wall(RecipeCategory category, ItemLike wall, ItemLike material) {
            this.wall(category, wall, material);
        }

        public void chiseled(RecipeCategory category, ItemLike chiseled, ItemLike material) {
            this.chiseled(category, chiseled, material);
        }

        public void polished(RecipeCategory category, ItemLike polished, ItemLike material) {
            this.polished(category, polished, material);
        }
    }
}
