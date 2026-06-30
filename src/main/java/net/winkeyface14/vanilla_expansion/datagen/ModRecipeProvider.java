package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

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
                List<ItemLike> REINFORCED_LEATHER_BLASTABLE = List.of(RAW_REINFORCED_LEATHER);
                //List<ItemLike> QUARTZ_SMELTABLE = List.of(Items.QUARTZ);
                //List<ItemLike> QUARTZ_BLOCK_SMELTABLE = List.of(Items.QUARTZ_BLOCK);
                List<ItemLike> BRICK_SMELTABLE = List.of(Items.BRICK);
                List<ItemLike> BRICK_BLOCK_SMELTABLE = List.of(Items.BRICKS);

                //Coal and Charcoal
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.CHARCOAL,RecipeCategory.BUILDING_BLOCKS, CHARCOAL_BLOCK);
                this.shapeless(RecipeCategory.MISC, COAL_CHUNK, 8)
                        .requires(Items.COAL)
                        .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                        .group("coal_chunk")
                        .save(output);
                this.shapeless(RecipeCategory.MISC, CHARCOAL_CHUNK, 8)
                        .requires(Items.CHARCOAL)
                        .unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL))
                        .group("charcoal_chunk")
                        .save(output);
                this.shapeless(RecipeCategory.MISC, Items.COAL)
                        .requires(COAL_CHUNK, 8)
                        .unlockedBy(getHasName(COAL_CHUNK), has(COAL_CHUNK))
                        .group("coal")
                        .save(output);
                this.shapeless(RecipeCategory.MISC, Items.CHARCOAL)
                        .requires(CHARCOAL_CHUNK, 8)
                        .unlockedBy(getHasName(CHARCOAL_CHUNK), has(CHARCOAL_CHUNK))
                        .group("charcoal")
                        .save(output,"charcoal_from_chunk");

                //Reinforced Leather
                this.shaped(RecipeCategory.MISC, RAW_REINFORCED_LEATHER,4)
                        .pattern("xyx")
                        .pattern("yzy")
                        .pattern("xyx")
                        .define('x', Items.IRON_NUGGET)
                        .define('y', Items.LEATHER)
                        .define('z', Items.STRING)
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(output);
                this.oreBlasting(REINFORCED_LEATHER_BLASTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, REINFORCED_LEATHER, 0.7f, 100, "reinforced_leather");
                this.oreSmelting(REINFORCED_LEATHER_BLASTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, REINFORCED_LEATHER, 0.7f, 200, "reinforced_leather");

                //Stick Compacting
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.STICK, RecipeCategory.MISC, BUNDLED_STICKS);
                this.nineBlockStorageRecipesRecipesWithCustomUnpacking(RecipeCategory.MISC, BUNDLED_STICKS, RecipeCategory.DECORATIONS, BUNDLED_STICKS_BLOCK,"bundled_sticks_from_unpacking", "bundled_sticks");

                //Paper Compacting
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.PAPER, RecipeCategory.MISC, PAPER_PILE);

                //Crops Block
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.APPLE, RecipeCategory.DECORATIONS, BARREL_OF_APPLES_BLOCK);
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.CARROT, RecipeCategory.DECORATIONS, BARREL_OF_CARROTS_BLOCK);
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.POTATO, RecipeCategory.DECORATIONS, BARREL_OF_POTATOES_BLOCK);
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.CHORUS_FRUIT, RecipeCategory.DECORATIONS, BARREL_OF_CHORUS_BLOCK);
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.SWEET_BERRIES, RecipeCategory.DECORATIONS, BARREL_OF_SWEETBERRY_BLOCK);

                //Quartz
                this.twoByTwoPacker(RecipeCategory.MISC,Items.QUARTZ, QUARTZ_SHARD);
                this.shapeless(RecipeCategory.MISC, QUARTZ_SHARD, 4)
                        .requires(Items.QUARTZ)
                        .unlockedBy(getHasName(Items.QUARTZ), has(Items.QUARTZ))
                        .group("quartz_shard")
                        .save(output);
                this.wall(RecipeCategory.BUILDING_BLOCKS, QUARTZ_WALL, Items.QUARTZ_BLOCK);
                this.wall(RecipeCategory.BUILDING_BLOCKS, QUARTZ_BRICKS_WALL, Items.QUARTZ_BRICKS);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QUARTZ_WALL, Blocks.QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QUARTZ_BRICKS_WALL, Blocks.QUARTZ_BRICKS);


                //Smoked Quartz
                this.twoByTwoPacker(RecipeCategory.MISC, SMOKED_QUARTZ, SMOKED_QUARTZ_SHARD);
                this.shapeless(RecipeCategory.MISC, SMOKED_QUARTZ_SHARD, 4)
                        .requires(SMOKED_QUARTZ)
                        .unlockedBy(getHasName(SMOKED_QUARTZ), has(SMOKED_QUARTZ))
                        .group("smoked_quartz_shard")
                        .save(output);

                SimpleCookingRecipeBuilder.smoking(Ingredient.of(Items.QUARTZ), RecipeCategory.MISC, SMOKED_QUARTZ, 0.7f, 100)
                        .unlockedBy(getHasName(Items.QUARTZ), has(Items.QUARTZ))
                        .group("smoked_quartz")
                        .save(output, "smoked_quartz_smoker");
                SimpleCookingRecipeBuilder.smoking(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.MISC, SMOKED_QUARTZ_BLOCK, 0.7f, 100)
                        .unlockedBy(getHasName(Blocks.QUARTZ_BLOCK), has(Blocks.QUARTZ_BLOCK))
                        .group("smoked_quartz_block")
                        .save(output, "smoked_quartz_block_smoker");

                this.twoByTwoPacker(RecipeCategory.MISC, SMOKED_QUARTZ_BLOCK, SMOKED_QUARTZ);

                //Base
                registerBlockSetRecipes(
                        SMOKED_QUARTZ_BLOCK.asItem(),
                        SMOKED_QUARTZ_SLAB.asItem(),
                        SMOKED_QUARTZ_STAIRS.asItem(),
                        SMOKED_QUARTZ_WALL.asItem(),
                        null);

                //Smooth
                registerBlockSetRecipes(
                        SMOOTH_SMOKED_QUARTZ.asItem(),
                        SMOOTH_SMOKED_QUARTZ_SLAB.asItem(),
                        SMOOTH_SMOKED_QUARTZ_STAIRS.asItem(),
                        SMOOTH_SMOKED_QUARTZ_WALL.asItem(),
                        null);

                //Bricks
                registerBlockSetRecipes(
                        SMOKED_QUARTZ_BRICKS.asItem(),
                        SMOKED_QUARTZ_BRICKS_SLAB.asItem(),
                        SMOKED_QUARTZ_BRICKS_STAIRS.asItem(),
                        SMOKED_QUARTZ_BRICKS_WALL.asItem(),
                        null);

                registerBlockVariantRecipes(
                        SMOKED_QUARTZ_BLOCK.asItem(),
                        SMOKED_QUARTZ_BRICKS.asItem(),
                        SMOKED_QUARTZ_PILLAR.asItem(),
                        CHISELED_SMOKED_QUARTZ_BLOCK.asItem(),
                        null);

                //Burnt Quartz
                this.twoByTwoPacker(RecipeCategory.MISC, BURNT_QUARTZ, BURNT_QUARTZ_SHARD);
                this.shapeless(RecipeCategory.MISC, BURNT_QUARTZ_SHARD, 4)
                        .requires(BURNT_QUARTZ)
                        .unlockedBy(getHasName(BURNT_QUARTZ), has(BURNT_QUARTZ))
                        .group("burnt_quartz_shard")
                        .save(output);

                SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.QUARTZ), RecipeCategory.MISC,CookingBookCategory.MISC, BURNT_QUARTZ, 0.7f, 100)
                        .unlockedBy(getHasName(Items.QUARTZ), has(Items.QUARTZ))
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
                        null);

                //Smooth
                registerBlockSetRecipes(
                        SMOOTH_BURNT_QUARTZ.asItem(),
                        SMOOTH_BURNT_QUARTZ_SLAB.asItem(),
                        SMOOTH_BURNT_QUARTZ_STAIRS.asItem(),
                        SMOOTH_BURNT_QUARTZ_WALL.asItem(),
                        null);

                //Bricks
                registerBlockSetRecipes(
                        BURNT_QUARTZ_BRICKS.asItem(),
                        BURNT_QUARTZ_BRICKS_SLAB.asItem(),
                        BURNT_QUARTZ_BRICKS_STAIRS.asItem(),
                        BURNT_QUARTZ_BRICKS_WALL.asItem(),
                        null);

                registerBlockVariantRecipes(
                        BURNT_QUARTZ_BLOCK.asItem(),
                        BURNT_QUARTZ_BRICKS.asItem(),
                        BURNT_QUARTZ_PILLAR.asItem(),
                        CHISELED_BURNT_QUARTZ_BLOCK.asItem(),
                        null);

                //Fired Bricks
                this.oreSmelting(BRICK_SMELTABLE,RecipeCategory.MISC, CookingBookCategory.MISC, FIRED_BRICK, 0.7f, 200,"fired_brick");
                this.oreSmelting(BRICK_BLOCK_SMELTABLE,RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, FIRED_BRICKS, 0.7f, 200,"fired_brick");

                this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, FIRED_BRICKS, FIRED_BRICK);

                registerBlockSetRecipes(
                        FIRED_BRICKS.asItem(),
                        FIRED_BRICKS_SLAB.asItem(),
                        FIRED_BRICKS_STAIRS.asItem(),
                        FIRED_BRICKS_WALL.asItem(),
                        null);

                /*
                this.slab(RecipeCategory.BUILDING_BLOCKS, BlockRegHandler.FIRED_BRICKS_SLAB, BlockRegHandler.FIRED_BRICKS);
                this.wall(RecipeCategory.BUILDING_BLOCKS, BlockRegHandler.FIRED_BRICKS_WALL, BlockRegHandler.FIRED_BRICKS);
                this.stairBuilder(BlockRegHandler.FIRED_BRICKS_STAIRS, Ingredient.of(BlockRegHandler.FIRED_BRICKS))
                        .unlockedBy(getHasName(BlockRegHandler.FIRED_BRICKS), has(BlockRegHandler.FIRED_BRICKS))
                        .group("fired_brick")
                        .save(output);
                 */

                //Empowered Netherite
                this.shapeless(RecipeCategory.MISC, EMPOWERED_NETHERITE)
                        .requires(Items.GOLD_INGOT, 4)
                        .requires(EMPOWERED_NETHERITE_SCRAP, 4)
                        .group("empowered_netherite")
                        .unlockedBy(getHasName(EMPOWERED_NETHERITE_SCRAP), has(EMPOWERED_NETHERITE_SCRAP))
                        .save(output, "empowered_netherite_ingot_from_scrap");
                this.shaped(RecipeCategory.MISC, EMPOWERED_NETHERITE_SCRAP,4)
                        .pattern("xyx")
                        .pattern("yxy")
                        .pattern("xyx")
                        .define('x', Items.REDSTONE_BLOCK)
                        .define('y', Items.NETHERITE_SCRAP)
                        .unlockedBy(getHasName(Items.NETHERITE_SCRAP), has(Items.NETHERITE_SCRAP))
                        .save(output);
                this.nineBlockStorageRecipes(RecipeCategory.MISC, EMPOWERED_NETHERITE, RecipeCategory.DECORATIONS, EMPOWERED_NETHERITE_BLOCK,"empowered_netherite_block","empowered_netherite_block","empowered_netherite_ingot","empowered_netherite_ingot");

                //Diamond
                this.nineBlockStorageRecipes(RecipeCategory.MISC, DIAMOND_SHARD, RecipeCategory.MISC, Items.DIAMOND);

                //Emerald Tools
                this.nineBlockStorageRecipes(RecipeCategory.MISC, EMERALD_SHARD, RecipeCategory.MISC, Items.EMERALD);
                registerCustomToolSetRecipes(Items.EMERALD, EMERALD_SWORD, EMERALD_SHOVEL, EMERALD_PICKAXE, EMERALD_AXE, EMERALD_HOE, EMERALD_SPEAR);

                //Lapis Lazuli Tools
                registerCustomToolSetRecipes(Items.LAPIS_LAZULI, LAPIS_LAZULI_SWORD, LAPIS_LAZULI_SHOVEL, LAPIS_LAZULI_PICKAXE, LAPIS_LAZULI_AXE, LAPIS_LAZULI_HOE, LAPIS_LAZULI_SPEAR);

                //Redstone Tools
                registerCustomToolSetRecipes(Items.REDSTONE_BLOCK, REDSTONE_SWORD, REDSTONE_SHOVEL, REDSTONE_PICKAXE, REDSTONE_AXE, REDSTONE_HOE, REDSTONE_SPEAR);

                //Quartz Tools
                registerCustomToolSetRecipes(Items.QUARTZ, QUARTZ_SWORD, QUARTZ_SHOVEL, QUARTZ_PICKAXE, QUARTZ_AXE, QUARTZ_HOE, QUARTZ_SPEAR);

                //Smoked Quartz Tools
                registerCustomToolSetRecipes(SMOKED_QUARTZ, SMOKED_QUARTZ_SWORD, SMOKED_QUARTZ_SHOVEL, SMOKED_QUARTZ_PICKAXE, SMOKED_QUARTZ_AXE, SMOKED_QUARTZ_HOE, SMOKED_QUARTZ_SPEAR);

                //Burnt Quartz Tools
                registerCustomToolSetRecipes(BURNT_QUARTZ, BURNT_QUARTZ_SWORD, BURNT_QUARTZ_SHOVEL, BURNT_QUARTZ_PICKAXE, BURNT_QUARTZ_AXE, BURNT_QUARTZ_HOE, BURNT_QUARTZ_SPEAR);

                //Emerald Armor
                registerCustomArmorSetRecipes(Items.EMERALD, EMERALD_HELMET, EMERALD_CHESTPLATE, EMERALD_LEGGINGS, EMERALD_BOOTS);

                //Lapis Lazuli Armor
                registerCustomArmorSetRecipes(Items.LAPIS_LAZULI, LAPIS_LAZULI_HELMET, LAPIS_LAZULI_CHESTPLATE, LAPIS_LAZULI_LEGGINGS, LAPIS_LAZULI_BOOTS);

                //Reinforced Leather
                //registerCustomArmorSetRecipes(ItemRegHandler.REINFORCED_LEATHER, ItemRegHandler.REINFORCED_LEATHER_HELMET, ItemRegHandler.REINFORCED_LEATHER_CHESTPLATE, ItemRegHandler.REINFORCED_LEATHER_LEGGINGS, ItemRegHandler.REINFORCED_LEATHER_BOOTS);

                //Template Recipes
                this.shaped(RecipeCategory.MISC, BASE_TEMPLATE, 8)
                        .pattern("xy")
                        .define('x', ItemTags.PLANKS)
                        .define('y', Items.FLINT)
                        .unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
                        .save(output);

                //Blade Recipes
                Item base_template = BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC, STONE_SWORD_BLADE)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
                registerCustomSwordBladeRecipe(Items.IRON_INGOT, IRON_SWORD_BLADE);
                registerCustomSwordBladeRecipe(Items.COPPER_INGOT, COPPER_SWORD_BLADE);
                registerCustomSwordBladeRecipe(Items.GOLD_INGOT, GOLD_SWORD_BLADE);
                registerCustomSwordBladeRecipe(Items.REDSTONE_BLOCK, REDSTONE_SWORD_BLADE);
                registerCustomSwordBladeRecipe(Items.DIAMOND, DIAMOND_SWORD_BLADE);
                //registerCustomSwordBladeRecipe(Items.EMERALD, ItemRegHandler.EMERALD_SWORD_BLADE);

                //Pickaxe Head Recipes
                this.shaped(RecipeCategory.MISC, STONE_PICKAXE_HEAD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
                registerCustomPickaxeHeadRecipe(Items.IRON_INGOT, IRON_PICKAXE_HEAD);
                registerCustomPickaxeHeadRecipe(Items.COPPER_INGOT, COPPER_PICKAXE_HEAD);
                registerCustomPickaxeHeadRecipe(Items.GOLD_INGOT, GOLD_PICKAXE_HEAD);
                registerCustomPickaxeHeadRecipe(Items.REDSTONE_BLOCK, REDSTONE_PICKAXE_HEAD);
                registerCustomPickaxeHeadRecipe(Items.DIAMOND, DIAMOND_PICKAXE_HEAD);
                //registerCustomPickaxeHeadRecipe(Items.EMERALD, ItemRegHandler.EMERALD_PICKAXE_HEAD);

                //Axe Head Recipes
                this.shaped(RecipeCategory.MISC, STONE_AXE_HEAD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
                registerCustomAxeHeadRecipe(Items.IRON_INGOT, IRON_AXE_HEAD);
                registerCustomAxeHeadRecipe(Items.COPPER_INGOT, COPPER_AXE_HEAD);
                registerCustomAxeHeadRecipe(Items.GOLD_INGOT, GOLD_AXE_HEAD);
                registerCustomAxeHeadRecipe(Items.REDSTONE_BLOCK, REDSTONE_AXE_HEAD);
                registerCustomAxeHeadRecipe(Items.DIAMOND, DIAMOND_AXE_HEAD);
                //registerCustomAxeHeadRecipe(Items.EMERALD, ItemRegHandler.EMERALD_AXE_HEAD);

                //Shovel Head Recipes
                this.shaped(RecipeCategory.MISC, STONE_SHOVEL_HEAD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
                registerCustomShovelHeadRecipe(Items.IRON_INGOT, IRON_SHOVEL_HEAD);
                registerCustomShovelHeadRecipe(Items.COPPER_INGOT, COPPER_SHOVEL_HEAD);
                registerCustomShovelHeadRecipe(Items.GOLD_INGOT, GOLD_SHOVEL_HEAD);
                registerCustomShovelHeadRecipe(Items.REDSTONE_BLOCK, REDSTONE_SHOVEL_HEAD);
                registerCustomShovelHeadRecipe(Items.DIAMOND, DIAMOND_SHOVEL_HEAD);
                //registerCustomShovelHeadRecipe(Items.EMERALD, ItemRegHandler.EMERALD_SHOVEL_HEAD);

                //Hoe Head Recipes
                this.shaped(RecipeCategory.MISC, STONE_HOE_HEAD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
                registerCustomHoeHeadRecipe(Items.IRON_INGOT, IRON_HOE_HEAD);
                registerCustomHoeHeadRecipe(Items.COPPER_INGOT, COPPER_HOE_HEAD);
                registerCustomHoeHeadRecipe(Items.GOLD_INGOT, GOLD_HOE_HEAD);
                registerCustomHoeHeadRecipe(Items.REDSTONE_BLOCK, REDSTONE_HOE_HEAD);
                registerCustomHoeHeadRecipe(Items.DIAMOND, DIAMOND_HOE_HEAD);
                //registerCustomHoeHeadRecipe(Items.EMERALD, ItemRegHandler.EMERALD_HOE_HEAD);

                //Spear Tip Recipes

                this.shaped(RecipeCategory.MISC, STONE_SPEAR_TIP)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
                registerCustomSpearTipRecipe(Items.IRON_INGOT, IRON_SPEAR_TIP);
                registerCustomSpearTipRecipe(Items.COPPER_INGOT, COPPER_SPEAR_TIP);
                registerCustomSpearTipRecipe(Items.GOLD_INGOT, GOLD_SPEAR_TIP);
                registerCustomSpearTipRecipe(Items.REDSTONE_BLOCK, REDSTONE_SPEAR_TIP);
                registerCustomSpearTipRecipe(Items.DIAMOND, DIAMOND_SPEAR_TIP);
                //registerCustomSpearTipRecipe(Items.EMERALD, ItemRegHandler.EMERALD_SPEAR_TIP);


                //Smithing Recipes
                //Empowered Netherite Tool and Armor Set
                registerCustomUpgrade(EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_SWORD, EMPOWERED_NETHERITE_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_SPEAR, EMPOWERED_NETHERITE_SPEAR, RecipeCategory.COMBAT);
                registerCustomUpgrade(EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_PICKAXE, EMPOWERED_NETHERITE_PICKAXE, RecipeCategory.COMBAT);
                registerCustomUpgrade(EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_AXE, EMPOWERED_NETHERITE_AXE, RecipeCategory.COMBAT);
                registerCustomUpgrade(EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_SHOVEL, EMPOWERED_NETHERITE_SHOVEL, RecipeCategory.COMBAT);
                registerCustomUpgrade(EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_HOE, EMPOWERED_NETHERITE_HOE, RecipeCategory.COMBAT);

                registerCustomUpgrade(EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_HELMET, EMPOWERED_NETHERITE_HELMET, RecipeCategory.COMBAT);
                registerCustomUpgrade(EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_CHESTPLATE, EMPOWERED_NETHERITE_CHESTPLATE, RecipeCategory.COMBAT);
                registerCustomUpgrade(EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_LEGGINGS, EMPOWERED_NETHERITE_LEGGINGS, RecipeCategory.COMBAT);
                registerCustomUpgrade(EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_BOOTS, EMPOWERED_NETHERITE_BOOTS, RecipeCategory.COMBAT);

                //Swords
                registerCustomUpgrade(Items.FLINT, STONE_SWORD_BLADE, Items.WOODEN_SWORD, Items.STONE_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(Items.FLINT, COPPER_SWORD_BLADE, Items.STONE_SWORD, Items.COPPER_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(Items.FLINT, IRON_SWORD_BLADE, Items.STONE_SWORD, Items.IRON_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(Items.FLINT, REDSTONE_SWORD_BLADE, Items.STONE_SWORD, REDSTONE_SWORD, RecipeCategory.COMBAT);
                //registerCustomUpgrade(Items.FLINT, ItemRegHandler.EMERALD_SWORD_BLADE, Items.STONE_SWORD, ItemRegHandler.EMERALD_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(Items.FLINT, GOLD_SWORD_BLADE, Items.STONE_SWORD, Items.GOLDEN_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(Items.FLINT, DIAMOND_SWORD_BLADE, Items.IRON_SWORD, Items.DIAMOND_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(Items.FLINT, DIAMOND_SWORD_BLADE, Items.COPPER_SWORD, Items.DIAMOND_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(Items.FLINT, DIAMOND_SWORD_BLADE, Items.GOLDEN_SWORD, Items.DIAMOND_SWORD, RecipeCategory.COMBAT);

                //Pickaxes
                registerCustomUpgrade(Items.FLINT, STONE_PICKAXE_HEAD, Items.WOODEN_PICKAXE, Items.STONE_PICKAXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, COPPER_PICKAXE_HEAD, Items.STONE_PICKAXE, Items.COPPER_PICKAXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, IRON_PICKAXE_HEAD, Items.STONE_PICKAXE, Items.IRON_PICKAXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, REDSTONE_PICKAXE_HEAD, Items.STONE_PICKAXE, REDSTONE_PICKAXE, RecipeCategory.TOOLS);
                //registerCustomUpgrade(Items.FLINT, ItemRegHandler.EMERALD_PICKAXE_HEAD, Items.STONE_PICKAXE, ItemRegHandler.EMERALD_PICKAXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, GOLD_PICKAXE_HEAD, Items.STONE_PICKAXE, Items.GOLDEN_PICKAXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_PICKAXE_HEAD, Items.IRON_PICKAXE, Items.DIAMOND_PICKAXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_PICKAXE_HEAD, Items.COPPER_PICKAXE, Items.DIAMOND_PICKAXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_PICKAXE_HEAD, Items.GOLDEN_PICKAXE, Items.DIAMOND_PICKAXE, RecipeCategory.TOOLS);

                //Axes
                registerCustomUpgrade(Items.FLINT, STONE_AXE_HEAD, Items.WOODEN_AXE, Items.STONE_AXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, COPPER_AXE_HEAD, Items.STONE_AXE, Items.COPPER_AXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, IRON_AXE_HEAD, Items.STONE_AXE, Items.IRON_AXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, REDSTONE_AXE_HEAD, Items.STONE_AXE, REDSTONE_AXE, RecipeCategory.TOOLS);
                //registerCustomUpgrade(Items.FLINT, ItemRegHandler.EMERALD_AXE_HEAD, Items.STONE_AXE, ItemRegHandler.EMERALD_AXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, GOLD_AXE_HEAD, Items.STONE_AXE, Items.GOLDEN_AXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_AXE_HEAD, Items.IRON_AXE, Items.DIAMOND_AXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_AXE_HEAD, Items.COPPER_AXE, Items.DIAMOND_AXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_AXE_HEAD, Items.GOLDEN_AXE, Items.DIAMOND_AXE, RecipeCategory.TOOLS);

                //Shovels
                registerCustomUpgrade(Items.FLINT, STONE_SHOVEL_HEAD, Items.WOODEN_SHOVEL, Items.STONE_SHOVEL, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, COPPER_SHOVEL_HEAD, Items.STONE_SHOVEL, Items.COPPER_SHOVEL, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, IRON_SHOVEL_HEAD, Items.STONE_SHOVEL, Items.IRON_SHOVEL, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, REDSTONE_SHOVEL_HEAD, Items.STONE_SHOVEL, REDSTONE_SHOVEL, RecipeCategory.TOOLS);
                //registerCustomUpgrade(Items.FLINT, ItemRegHandler.EMERALD_SHOVEL_HEAD, Items.STONE_SHOVEL, ItemRegHandler.EMERALD_SHOVEL, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, GOLD_SHOVEL_HEAD, Items.STONE_SHOVEL, Items.GOLDEN_SHOVEL, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_SHOVEL_HEAD, Items.IRON_SHOVEL, Items.DIAMOND_SHOVEL, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_SHOVEL_HEAD, Items.COPPER_SHOVEL, Items.DIAMOND_SHOVEL, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_SHOVEL_HEAD, Items.GOLDEN_SHOVEL, Items.DIAMOND_SHOVEL, RecipeCategory.TOOLS);

                //Hoes
                registerCustomUpgrade(Items.FLINT, STONE_HOE_HEAD, Items.WOODEN_HOE, Items.STONE_HOE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, COPPER_HOE_HEAD, Items.STONE_HOE, Items.COPPER_HOE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, IRON_HOE_HEAD, Items.STONE_HOE, Items.IRON_HOE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, REDSTONE_HOE_HEAD, Items.STONE_HOE, REDSTONE_HOE, RecipeCategory.TOOLS);
                //registerCustomUpgrade(Items.FLINT, ItemRegHandler.EMERALD_HOE_HEAD, Items.STONE_HOE, ItemRegHandler.EMERALD_HOE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, GOLD_HOE_HEAD, Items.STONE_HOE, Items.GOLDEN_HOE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_HOE_HEAD, Items.IRON_HOE, Items.DIAMOND_HOE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_HOE_HEAD, Items.COPPER_HOE, Items.DIAMOND_HOE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_HOE_HEAD, Items.GOLDEN_HOE, Items.DIAMOND_HOE, RecipeCategory.TOOLS);

                //Spears
                registerCustomUpgrade(Items.FLINT, STONE_SPEAR_TIP, Items.WOODEN_SPEAR, Items.STONE_SPEAR, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, COPPER_SPEAR_TIP, Items.STONE_SPEAR, Items.COPPER_SPEAR, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, IRON_SPEAR_TIP, Items.STONE_SPEAR, Items.IRON_SPEAR, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, REDSTONE_SPEAR_TIP, Items.STONE_SPEAR, REDSTONE_SPEAR, RecipeCategory.TOOLS);
                //registerCustomUpgrade(Items.FLINT, ItemRegHandler.EMERALD_SPEAR_TIP, Items.STONE_SPEAR, ItemRegHandler.EMERALD_SPEAR, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, GOLD_SPEAR_TIP, Items.STONE_SPEAR, Items.GOLDEN_SPEAR, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_SPEAR_TIP, Items.IRON_SPEAR, Items.DIAMOND_SPEAR, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_SPEAR_TIP, Items.COPPER_SPEAR, Items.DIAMOND_SPEAR, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, DIAMOND_SPEAR_TIP, Items.GOLDEN_SPEAR, Items.DIAMOND_SPEAR, RecipeCategory.TOOLS);

            }

            private void registerCustomUpgrade(Item material, Item template, Item baseItem, Item upgradedResult, RecipeCategory category) {
                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(template),
                                Ingredient.of(baseItem),
                                Ingredient.of(material),
                                category,
                                upgradedResult
                        )
                        .unlocks("has_" + getItemName(template), has(template))
                        .save(output, getItemName(upgradedResult) + "_from_smithing_with_" + getItemName(baseItem));
            }

            private void registerCustomToolSetRecipes(Item materialItem, Item resultSword, Item resultShovel, Item resultPickaxe, Item resultAxe, Item resultHoe,Item resultSpear) {
                this.shaped(RecipeCategory.COMBAT,resultSword)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', materialItem)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,resultShovel)
                        .pattern("x")
                        .pattern("y")
                        .pattern("y")
                        .define('x', materialItem)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,resultPickaxe)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern(" y ")
                        .define('x', materialItem)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,resultAxe)
                        .pattern("xx")
                        .pattern("xy")
                        .pattern(" y")
                        .define('x', materialItem)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,resultHoe)
                        .pattern("xx")
                        .pattern(" y")
                        .pattern(" y")
                        .define('x', materialItem)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,resultSpear)
                        .pattern("  x")
                        .pattern(" y ")
                        .pattern("y  ")
                        .define('x', materialItem)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
            }

            private void registerCustomArmorSetRecipes(Item materialItem, Item resultHelmet, Item resultChestplate, Item resultLeggings, Item resultBoots) {
                this.shaped(RecipeCategory.COMBAT,resultHelmet)
                        .pattern("xxx")
                        .pattern("x x")
                        .define('x', materialItem)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,resultChestplate)
                        .pattern("x x")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', materialItem)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,resultLeggings)
                        .pattern("xxx")
                        .pattern("x x")
                        .pattern("x x")
                        .define('x', materialItem)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,resultBoots)
                        .pattern("x x")
                        .pattern("x x")
                        .define('x', materialItem)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
            }

            private void registerCustomSwordBladeRecipe(Item materialItem, Item resultItem) {
                Item base_template = BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
            }

            private void registerCustomPickaxeHeadRecipe(Item materialItem, Item resultItem) {
                Item base_template = BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("xxx")
                        .pattern(" y ")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
            }

            private void registerCustomAxeHeadRecipe(Item materialItem, Item resultItem) {
                Item base_template = BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("xx")
                        .pattern("xy")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
            }

            private void registerCustomShovelHeadRecipe(Item materialItem, Item resultItem) {
                Item base_template = BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("x")
                        .pattern("y")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
            }

            private void registerCustomHoeHeadRecipe(Item materialItem, Item resultItem) {
                Item base_template = BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("xx")
                        .pattern(" y")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
            }

            private void registerCustomSpearTipRecipe(Item materialItem, Item resultItem) {
                Item base_template = BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern(" x")
                        .pattern("y ")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
            }

            private void registerBlockSetRecipes(Item baseItem, Item resultSlab, Item resultStairs, Item resultWall, Item resultFence){
                RecipeCategory categoryBuilding = RecipeCategory.BUILDING_BLOCKS;

                //Slab
                if(resultSlab != null){
                    this.stonecutterResultFromBase(categoryBuilding,resultSlab, baseItem);
                    this.slab(categoryBuilding,resultSlab, baseItem);
                }

                //Stairs
                if(resultStairs != null){
                    this.stonecutterResultFromBase(categoryBuilding,resultStairs, baseItem);
                    this.stairBuilder(resultStairs, Ingredient.of(baseItem))
                            .unlockedBy(getHasName(baseItem), has(baseItem))
                            .group(getItemName(resultStairs))
                            .save(output);
                }

                //Wall
                if(resultWall != null){
                    this.stonecutterResultFromBase(categoryBuilding,resultWall, baseItem);
                    this.wall(categoryBuilding, resultWall, baseItem);
                }

                //Fence
                if(resultFence != null){
                    this.stonecutterResultFromBase(categoryBuilding,resultFence, baseItem);
                    this.fenceBuilder(resultFence, Ingredient.of(baseItem))
                            .unlockedBy(getHasName(baseItem), has(baseItem))
                            .group(getItemName(resultFence))
                            .save(output);
                }
            }

            private void registerBlockVariantRecipes(Item baseItem, Item resultBricks, Item resultPillar, Item resultChiseled, Item resultPolished){
                RecipeCategory categoryBuilding = RecipeCategory.BUILDING_BLOCKS;

                //Bricks
                if(resultBricks != null){
                    this.stonecutterResultFromBase(categoryBuilding,resultBricks, baseItem);
                    this.bricksBuilder(categoryBuilding, resultBricks, Ingredient.of(baseItem))
                            .unlockedBy(getHasName(baseItem), has(baseItem))
                            .group(getItemName(resultBricks))
                            .save(output);
                }

                //Pillar
                if(resultPillar != null){
                    this.stonecutterResultFromBase(categoryBuilding, resultPillar, baseItem);
                    this.shaped(RecipeCategory.MISC,resultPillar,2)
                            .pattern("x")
                            .pattern("x")
                            .define('x', baseItem)
                            .unlockedBy(getHasName(baseItem), has(baseItem))
                            .save(output);
                }

                //Chiseled
                if(resultChiseled != null){
                    this.stonecutterResultFromBase(categoryBuilding,resultChiseled, baseItem);
                    this.chiseled(categoryBuilding, resultChiseled, baseItem);
                }

                //Polished
                if(resultPolished != null){
                    this.stonecutterResultFromBase(categoryBuilding,resultPolished, baseItem);
                    this.polished(categoryBuilding, resultPolished, baseItem);
                }
            }
        };
    }

    @Override
    public @NonNull String getName() {
        return "The Vanilla Expansion Recipes";
    }
}
